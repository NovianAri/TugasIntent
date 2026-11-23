package com.novian.tugasintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        val teks = intent.getStringExtra(MainActivity.EXTRA_TEKS)
        tvHasil.text = teks ?: "Tidak ada data"
    }
}