package com.miempresa.tarea_usocontrolesv4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgView = findViewById<View>(R.id.img) as ImageView
        btnCalcular.setOnClickListener(){
            var labs:Double = txtLabs.text.toString().toDouble()
            var pc1:Double = txtPC1.text.toString().toDouble()
            var pc2:Double = txtPC2.text.toString().toDouble()
            var pc3:Double = txtPC3.text.toString().toDouble()
            var pc4:Double = txtPC4.text.toString().toDouble()
            var practicas = ((pc1+pc2+pc3+pc4)/4)*0.3
            var laboratorios = labs*0.7
            var resultado = practicas + laboratorios
            txtResultado.setText("El promedio final es: "+resultado)
            if (resultado<13){
                imgView.setImageResource(R.drawable.triste)
            }else{
                imgView.setImageResource(R.drawable.feliz)
            }

        }

    }
}