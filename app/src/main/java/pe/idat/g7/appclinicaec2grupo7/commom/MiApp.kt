package pe.idat.g7.appclinicaec2grupo7.commom

import android.app.Application

class MiApp : Application() {

    companion object{
        lateinit var instance: MiApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}