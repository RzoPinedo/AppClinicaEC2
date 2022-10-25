package pe.idat.g7.appclinicaec2grupo7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.idat.g7.appclinicaec2grupo7.databinding.ActivityMainBinding

class RegisterActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: RegisterActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}