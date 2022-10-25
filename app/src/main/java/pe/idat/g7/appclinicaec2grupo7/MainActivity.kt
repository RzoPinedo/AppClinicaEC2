package pe.idat.g7.appclinicaec2grupo7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.idat.g7.appclinicaec2grupo7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


    override fun onClick(p0: View?) {




    }

    public fun Registrar(view: View){
        val intentRegistrar= Intent(
            this,RegisterActivity::class.java
        )

        startActivity(intentRegistrar)

    }

    public fun Formulario(view: View){
        val intentFormulario= Intent(
            this,FormularioActivity::class.java
        )

        startActivity(intentFormulario)

    }
    public fun Listar (view: View){
        val intentLista= Intent(
            this,ListaActivity::class.java
        )

        startActivity(intentLista)

    }



}