package com.rumeysa.theoffice

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var officeCalisanlari = ArrayList<String>()
        officeCalisanlari.add("Michael Scott")
        officeCalisanlari.add("Dwight Schrute")
        officeCalisanlari.add("Pam Beesly")
        officeCalisanlari.add("Jim Halpert")

        var michaelBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.michael)
        var dwightBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.dwight)
        var pamBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pam)
        var jimBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.jim)

        var officeGorselleri = ArrayList<Bitmap>()
        officeGorselleri.add(michaelBitmap)
        officeGorselleri.add(dwightBitmap)
        officeGorselleri.add(pamBitmap)
        officeGorselleri.add(jimBitmap)

        var layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(officeCalisanlari, officeGorselleri)

        recyclerView.adapter =adapter
    }

}