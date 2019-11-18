package br.com.rms.androidlibrarysample

import android.app.Application
import br.com.rms.servicelocatorsample.servicelocator.ServiceLocator.serviceLocatorPutNewInstance

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        addServices()
    }

    fun addServices() {
        serviceLocatorPutNewInstance(this@App)
        serviceLocatorPutNewInstance(User("Teste"))
    }
}