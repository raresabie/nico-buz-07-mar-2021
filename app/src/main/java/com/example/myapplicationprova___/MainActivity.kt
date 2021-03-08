package com.example.myapplicationprova___

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val mTAG  = "MYLOGS"

    lateinit var add1 : EditText
    lateinit var add2 : EditText

    lateinit var pluse : Button
    lateinit var minuse : Button
    lateinit var per : Button
    lateinit var divis : Button
    lateinit var result : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        add1 = findViewById(R.id.editTextNumber)
        add2 = findViewById(R.id.editTextNumber2)

        pluse = findViewById(R.id.button)
        minuse = findViewById(R.id.button2)
        per = findViewById(R.id.button3)
        divis = findViewById(R.id.button4)

        result = findViewById(R.id.resultTextView)


        val listener = object : View.OnClickListener{
            override fun onClick(v: View?) {
                val a = Integer.parseInt(add1.text.toString())
                val b = Integer.parseInt(add2.text.toString())
                var res = -1

                Log.d(mTAG, "${v?.id}")

                if(v != null){
                    if(v.id == R.id.button){
                        res = a+b
                    }
                    if (v.id == R.id.button2)
                         res= a-b
                    if (v.id == R.id.button3)
                        res = a*b
                    if (v.id == R.id.button4)
                        res = a/b
//                    when (v.id){
//                        R.id.button -> {
//                            res = a+b
//                        }
//
//                        else -> {
//                            res = -321
//
//                        }
//                    }
                }
                else {
                    res = -123

                }

                //val res = a + b


                val s = "\n1 : $a \n 2 : $b \n $res"
                result.setText(s)
                Log.d(mTAG, "shit clickked : "+ s)
            }
        }
        listener.onClick(null)


        result.setText("ciao testo cambiato")

        pluse.setOnClickListener(listener)
        minuse.setOnClickListener(listener)
        per.setOnClickListener(listener)
        divis.setOnClickListener(listener)



        Log.d(mTAG, "shit done")

    }


}