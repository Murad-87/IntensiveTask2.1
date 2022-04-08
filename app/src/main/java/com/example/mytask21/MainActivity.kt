package com.example.mytask21

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mytask21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 0

        Log.d("MainActivity", "Hello Aston")
        Log.i("MainActivity", "MainActivity layout.xml is complete")
        Log.e("MainActivity", "Ошибок не найдено")
        Log.v("MainActivity", "Все идет по плану")
        Log.w("MainActivity", "Предупреждаем вы зашли далеко")



        binding.buttonToast.setOnClickListener {
            Toast.makeText(this, "Hello Constraint", Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            buttonCount.setOnClickListener {
                counter++
                if (counter != 0) {
                    buttonZero.background.setTint(R.color.colorAccent)
                }
                showCount.text = counter.toString()
            }

            with(binding) {
                buttonZero.setOnClickListener {
                    showCount.text = "0"

                }
            }
        }
    }
}