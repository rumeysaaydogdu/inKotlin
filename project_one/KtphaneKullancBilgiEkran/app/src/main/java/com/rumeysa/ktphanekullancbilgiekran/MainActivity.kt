package com.rumeysa.ktphanekullancbilgiekran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun kullaniciOlustur(view: View){

        val no = okulNo.text.toString().toIntOrNull()
        val adsoyad = adSoyad.text.toString()
        val yil = dogumYili.text.toString().toIntOrNull()



        if(no == null && yil == null){
            bilgi.text = "Doğru Bilgileri Giriniz"
        }
        else if(no == null){
            bilgi.text = "Okul Numaranızı Doğru Giriniz"
        }
        else if(yil == null){
            bilgi.text = "Doğum Yılınızı Doğru Giriniz"
        }
        else{
            val kullanici = kullanici(no, adsoyad, yil)
            bilgi.text = "Okul Numarası: ${kullanici.no} \nAd Soyad: ${kullanici.isim} \nDoğum Yılı: ${kullanici.yil}"
        }



    }
}