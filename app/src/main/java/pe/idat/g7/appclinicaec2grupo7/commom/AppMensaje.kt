package pe.idat.g7.appclinicaec2grupo7.commom

import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

object AppMensaje {

    fun enviarMensaje(vista: View, mensaje: String, tipo: TipoMensaje ){
        val snackbar = Snackbar.make(vista, mensaje, Snackbar.LENGTH_LONG)
        val snackbarView: View = snackbar.view
        if(tipo == TipoMensaje.ERROR){
            snackbarView.setBackgroundColor(
                ContextCompat.getColor(MiApp.instance)
            )
        }else{

        }
        snackbar.show()
    }
}