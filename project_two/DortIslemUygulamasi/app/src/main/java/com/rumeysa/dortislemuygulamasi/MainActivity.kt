package com.rumeysa.dortislemuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ilksayi : Double? = null
    var ikincisayi : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun topla(view : View){
        ilksayi = ilkSayi.text.toString().toDoubleOrNull()
        ikincisayi = ikinciSayi.text.toString().toDoubleOrNull()

        if(ilksayi == null || ikincisayi == null){
            sonucText.text = "Sayıları doğru giriniz"
        }
        else{
            sonuc = ilksayi!! + ikincisayi!!
            sonucText.text = "${ilksayi} + ${ikincisayi}: ${sonuc}"
        }
    }

    fun cikar(view : View){
        ilksayi = ilkSayi.text.toString().toDoubleOrNull()
        ikincisayi = ikinciSayi.text.toString().toDoubleOrNull()

        if(ilksayi == null || ikincisayi == null){
            sonucText.text = "Sayıları doğru giriniz"
        }
        else{
            sonuc = ilksayi!! - ikincisayi!!
            sonucText.text = "${ilksayi}  -  ${ikincisayi}  =  ${sonuc}"
        }
    }

    fun bol(view : View){
        ilksayi = ilkSayi.text.toString().toDoubleOrNull()
        ikincisayi = ikinciSayi.text.toString().toDoubleOrNull()

        if(ilksayi == null || ikincisayi == null){
            sonucText.text = "Sayıları doğru giriniz"
        }
        else{
            sonuc = ilksayi!! / ikincisayi!!
            sonucText.text = "${ilksayi}  /  ${ikincisayi}  =  ${sonuc}"
        }
    }

    fun carp(view : View){
        ilksayi = ilkSayi.text.toString().toDoubleOrNull()
        ikincisayi = ikinciSayi.text.toString().toDoubleOrNull()

        if(ilksayi == null || ikincisayi == null){
            sonucText.text = "Sayıları doğru giriniz"
        }
        else{
            sonuc = ilksayi!! * ikincisayi!!
            sonucText.text = "${ilksayi}  *  ${ikincisayi}  =  ${sonuc}"
        }
    }

}