package pe.idat.g7.appclinicaec2grupo7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.Adapter
import android.widget.AdapterView
import pe.idat.g7.appclinicaec2grupo7.commom.AppMensaje
import pe.idat.g7.appclinicaec2grupo7.commom.TipoMensaje
import pe.idat.g7.appclinicaec2grupo7.databinding.ActivityFormularioBinding

class FormularioActivity : AppCompatActivity(), View.OnClickListener,
    AdapterView.OnItemSelectedListener{

    private lateinit var binding: ActivityFormularioBinding
    private val listasintomas = ArrayList<String>()
    private val listafiebre = ArrayList<String>()
    private val listacasa = ArrayList<String>()
    private val listaadulto = ArrayList<String>()
    private val listaservicios = ArrayList<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnresolver.setOnClickListener(this)
        binding.cbgusto.setOnClickListener(this)
        binding.cbtos.setOnClickListener(this)
        binding.cbdolor.setOnClickListener(this)
        binding.cbcongestion.setOnClickListener(this)
        binding.cbfiebre.setOnClickListener(this)
        binding.cbninguno.setOnClickListener(this)
        binding.rbfiebresi.setOnClickListener(this)
        binding.rbfiebreno.setOnClickListener(this)
        binding.rbcasasi.setOnClickListener(this)
        binding.rbcasano.setOnClickListener(this)
        binding.rbadultosi.setOnClickListener(this)
        binding.rbadultono.setOnClickListener(this)
        binding.cbluz.setOnClickListener(this)
        binding.cbagua.setOnClickListener(this)
        binding.cbinternet.setOnClickListener(this)
        binding.cbcable.setOnClickListener(this)

    }




    override fun onClick(view: View) {
        //R.id.btnresolver -> listaResolver()
    }

    private fun listaResolver(){
        if(validarFormulario()){
            var inforesolver = obtenerFiebre() + "" +
            //        obtenerCasa() "" +
                    obtenerAdulto()

        }

    }


    fun validarSintomas(): Boolean{
        var respuesta = false
        if (binding.cbgusto.isChecked || binding.cbtos.isChecked || binding.cbdolor.isChecked
            || binding.cbcongestion.isChecked || binding.cbfiebre.isChecked || binding.cbninguno.isChecked){
            respuesta = true
        }
        return respuesta
    }

    fun validarServicios(): Boolean{
        var respuesta = false
        if (binding.cbluz.isChecked || binding.cbagua.isChecked || binding.cbinternet.isChecked
            || binding.cbcable.isChecked){
            respuesta = true
        }
        return respuesta
    }

    fun validarFiebre(): Boolean {
        var respuesta = true
        if (binding.radioGroup.checkedRadioButtonId == -1) {
            respuesta = false
        }
        return respuesta
    }

    fun validarCasa(): Boolean {
        var respuesta = true
        if (binding.radioGroup.checkedRadioButtonId == -1) {
            respuesta = false
        }
        return respuesta
    }

    fun validarAdulto(): Boolean {
        var respuesta = true
        if (binding.radioGroup.checkedRadioButtonId == -1) {
            respuesta = false
        }
        return respuesta
    }

    private fun setearControler(){
        listasintomas.clear()
        listaservicios.clear()
        listaadulto.clear()
        listacasa.clear()
        listafiebre.clear()
        binding.cbgusto.isChecked = false
        binding.cbtos.isChecked = false
        binding.cbdolor.isChecked = false
        binding.cbcongestion.isChecked = false
        binding.cbfiebre.isChecked = false
        binding.cbninguno.isChecked = false
        binding.radioGroup.clearCheck()
        binding.cbluz.isChecked = false
        binding.cbagua.isChecked = false
        binding.cbinternet.isChecked = false
        binding.cbcable.isChecked = false
        binding.radioGroup2.clearCheck()
        binding.radioGroup3.clearCheck()
        binding.cbgusto.isFocusableInTouchMode = true
        binding.cbgusto.requestFocus()

    }

    fun obtenerFiebre(): String {
        var fiebre = ""
        when(binding.radioGroup.checkedRadioButtonId) {
            R.id.rbfiebresi -> fiebre = binding.rbfiebresi.text.toString()
            R.id.rbfiebreno -> fiebre = binding.rbfiebreno.text.toString()
        }
        return fiebre
    }

    fun obtenerCasa(): String {
        var casa = ""
        when(binding.radioGroup.checkedRadioButtonId) {
            R.id.rbcasasi -> casa = binding.rbcasasi.text.toString()
            R.id.rbcasano -> casa = binding.rbcasano.text.toString()
        }
        return casa
    }

    fun obtenerAdulto(): String {
        var adulto = ""
        when(binding.radioGroup.checkedRadioButtonId) {
            R.id.rbadultosi -> adulto = binding.rbadultosi.text.toString()
            R.id.rbadultono -> adulto = binding.rbadultono.text.toString()
        }
        return adulto
    }

    fun validarFormulario(): Boolean {
        var respuesta = false
        if (!validarSintomas()) {
            AppMensaje.enviarMensaje(
                binding.root,
                "Seleciones su Sintoma", TipoMensaje.ERROR
            )
        } else if (!validarFiebre()) {
            AppMensaje.enviarMensaje(
                binding.root,
                "Seleccione su grado de Fiebre", TipoMensaje.ERROR
            )
        } else if (!validarCasa()) {
            AppMensaje.enviarMensaje(
                binding.root,
                "Seleccione si vive solo o no", TipoMensaje.ERROR
            )
        } else if (!validarAdulto()) {
            AppMensaje.enviarMensaje(
                binding.root,
                "Seleccione si vie con un adulto", TipoMensaje.ERROR
            )
        }else if (!validarServicios()) {
            AppMensaje.enviarMensaje(
                binding.root,
                "Seleccione que servicios consume", TipoMensaje.ERROR
            )
        }else {
            respuesta = true
        }

        return respuesta
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}