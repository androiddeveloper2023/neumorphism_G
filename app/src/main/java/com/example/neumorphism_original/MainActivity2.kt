package com.example.neumorphism_original


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.neumorphism_original.databinding.ActivityMain2Binding

import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.batterry.setOnClickListener {


            val shapetape=binding.batterry.getShapeType()
            if (shapetape==ShapeType.PRESSED){


                binding.batterry.setShapeType(ShapeType.FLAT)
                binding.batterry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)



            }else{
                binding.batterry.setShapeType(ShapeType.PRESSED)
                binding.batterry.setColorFilter(ContextCompat.getColor(this,R.color.blue_light),android.graphics.PorterDuff.Mode.SRC_IN )

                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgramm.setShapeType(ShapeType.FLAT)

                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnProgramm.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)

            }



        }

        binding.btnDry.setOnClickListener {

            val shapetype=binding.btnDry.getShapeType()
            if (shapetype==ShapeType.PRESSED){

                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)





            }else{

                binding.btnDry.setShapeType(ShapeType.PRESSED)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.blue_light),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgramm.setShapeType(ShapeType.FLAT)
                binding.batterry.setShapeType(ShapeType.FLAT)

                binding.batterry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)



                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)


                binding.btnProgramm.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
            }




        }

        binding.btnRange.setOnClickListener {

            val shapetype=binding.btnRange.getShapeType()
            if (shapetype==ShapeType.PRESSED){
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)

            }else{
                binding.btnRange.setShapeType(ShapeType.PRESSED)
                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.blue_light),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnProgramm.setShapeType(ShapeType.FLAT)
                binding.batterry.setShapeType(ShapeType.FLAT)
                binding.btnDry.setShapeType(ShapeType.FLAT)

                binding.batterry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnProgramm.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)


            }

        }







        binding.btnProgramm.setOnClickListener {

            val shapetype=binding.btnProgramm.getShapeType()
            if (shapetype==ShapeType.PRESSED){
                binding.btnProgramm.setShapeType(ShapeType.FLAT)
                binding.btnProgramm.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)

            }else{
                binding.btnProgramm.setShapeType(ShapeType.PRESSED)
                binding.btnProgramm.setColorFilter(ContextCompat.getColor(this,R.color.blue_light),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.batterry.setShapeType(ShapeType.FLAT)
                binding.btnDry.setShapeType(ShapeType.FLAT)

                binding.batterry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray),android.graphics.PorterDuff.Mode.SRC_IN)


            }

        }




    }
}