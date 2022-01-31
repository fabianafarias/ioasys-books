package br.com.ioasys.ioasys_books.activity

import android.app.Application
import br.com.ioasys.ioasys_books.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                presentationModule
            ).androidContext(applicationContext)
        }

    }
}