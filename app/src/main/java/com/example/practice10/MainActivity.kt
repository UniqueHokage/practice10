package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linearlayout)
        setTitle("linearLayout")
}
    fun VisibilityButton1(view: View) {
    val button1: Button = findViewById(R.id.button1)
    val button2: Button = findViewById(R.id.button2)

        button1.setOnClickListener{
            button1.visibility = View.INVISIBLE
            button2.visibility = View.VISIBLE
        }
        button2.setOnClickListener{
            button1.visibility = View.VISIBLE
            button2.visibility = View.INVISIBLE
        }
    }

    fun orientgrav(view: View){
        val textView1: TextView = findViewById(R.id.textView2)
        val textView2: TextView = findViewById(R.id.textView8)

        val linear1: LinearLayout = findViewById(R.id.linear1)
        val linear2: LinearLayout = findViewById(R.id.linear2)
        val linear3: LinearLayout = findViewById(R.id.linear3)
    }
}