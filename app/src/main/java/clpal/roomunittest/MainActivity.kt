package clpal.roomunittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import clpal.roomunittest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addSpend.setOnClickListener {
            val  amount=binding.amount.text
            val  description=binding.description.text
        }
    }
}