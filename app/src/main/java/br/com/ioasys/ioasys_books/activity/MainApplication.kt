package br.com.ioasys.ioasys_books.activity

import android.app.Application
import br.com.ioasys.ioasys_books.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                presentationModule,
                dataModule,
                dataRemoteModule,
                dataLocalModule,
                databaseModule,
                domainModule
            ).androidContext(applicationContext)
        }

    }
}