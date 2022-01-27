package br.com.ioasys.ioasys_books.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import br.com.ioasys.ioasys_books.adapter.BookClickListener
import br.com.ioasys.ioasys_books.adapter.BookListAdapter
import br.com.ioasys.ioasys_books.databinding.FragmentBookListBinding
import br.com.ioasys.ioasys_books.model.Book

class BookListFragment : Fragment(), BookClickListener {

    private val args: BookListFragmentArgs by navArgs()
    private lateinit var bookListAdapter: BookListAdapter
    private var _binding: FragmentBookListBinding? = null
    private val binding: FragmentBookListBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentBookListBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setBookLitData()

    }

    private fun setBookLitData(){
        bookListAdapter = BookListAdapter(this)
        binding.rvBooks.adapter = bookListAdapter
        bookListAdapter.submitList(
            Book.getMockListCount(
                args.itemCount
            )
        )

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onBooklickListener(book: Book) {
        BookDetailsBottomSheet.newInstance(book).show(childFragmentManager, "book")
    }

}