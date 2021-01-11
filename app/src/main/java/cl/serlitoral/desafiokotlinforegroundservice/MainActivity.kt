package cl.serlitoral.desafiokotlinforegroundservice

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import cl.serlitoral.desafiokotlinforegroundservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStart.setOnClickListener(View.OnClickListener {
            ForegroundService.startService(this, "Servicio en ejecución...")
        })

        binding.buttonStop.setOnClickListener(View.OnClickListener {
            ForegroundService.stopService(this)
        })
    }
}