package com.example.multikotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class menu_utama : AppCompatActivity(), View.OnClickListener {

    var ator: RadioButton? = null
    var btod: RadioButton? = null
    var ctod: RadioButton? = null

    lateinit var go: Button

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.menu_utama)
        ator = findViewById<View>(R.id.ator) as RadioButton
        ator!!.isChecked = true
        btod = findViewById<View>(R.id.btod) as RadioButton
        btod = findViewById<View>(R.id.btod) as RadioButton
        go = findViewById<View>(R.id.go) as Button
        go.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (ator!!.isChecked) {
            convertToBola(view)
        }
        else if (btod!!.isChecked) {
            convertToKubus(view)
        }
        else{
            convertToBalok(view)
        }
    }

    fun convertToBola(view: View?) {
        val intent = Intent(this, bola::class.java).apply {
        }
        startActivity(intent)
    }

    fun convertToKubus(view: View?) {
        val intent = Intent(this, kubus::class.java).apply {
        }
        startActivity(intent)
    }

    fun convertToBalok(view: View?) {
        val intent = Intent(this, balok::class.java).apply {
        }
        startActivity(intent)
    }
}