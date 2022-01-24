package br.com.ioasys.ioasys_books

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import br.com.ioasys.ioasys_books.adapter.BookListAdapter
import br.com.ioasys.ioasys_books.model.Book

class BookListActivity : AppCompatActivity() {

    private lateinit var bookListAdapter: BookListAdapter

    private val rvBooks: RecyclerView by lazy {
        findViewById(R.id.rvBooks)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        setBookLitData()
    }

    private fun setBookLitData(){
        bookListAdapter = BookListAdapter()
        rvBooks.adapter = bookListAdapter

        bookListAdapter.submitList(Book.getMockList())

    }




}