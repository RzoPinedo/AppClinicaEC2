package pe.idat.g7.appclinicaec2grupo7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.idat.g7.appclinicaec2grupo7.databinding.ActivityRegistroBinding

class RegisterActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}