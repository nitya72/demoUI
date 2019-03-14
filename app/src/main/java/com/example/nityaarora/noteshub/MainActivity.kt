package com.example.nityaarora.noteshub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var rvNotes:RecyclerView
    lateinit var rvQues:RecyclerView
    lateinit var rvPrac:RecyclerView
    lateinit var rvEbooks:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar=findViewById<Toolbar>(R.id.toolbar)
        var btnAdd:ImageView=toolbar.findViewById(R.id.btnAdd)

        rvNotes=findViewById(R.id.recyclerView)
        rvQues=findViewById(R.id.rvques)
        rvPrac=findViewById(R.id.rvprac)
        rvEbooks=findViewById(R.id.rvebooks)

        var arr= arrayListOf<List_item>()

        for (i in 1..40) {
            arr.add(List_item())
        }

        rvNotes.layoutManager=GridLayoutManager(this,1,LinearLayoutManager.HORIZONTAL,false)
        rvPrac.layoutManager=GridLayoutManager(this,1,LinearLayoutManager.HORIZONTAL,false)
        rvQues.layoutManager=GridLayoutManager(this,1,LinearLayoutManager.HORIZONTAL,false)
        rvEbooks.layoutManager=GridLayoutManager(this,1,LinearLayoutManager.HORIZONTAL,false)

        var adapter:RecyclerAdapter=RecyclerAdapter(arr)

        rvNotes.adapter=adapter
        rvPrac.adapter=adapter
        rvQues.adapter=adapter
        rvEbooks.adapter=adapter

        btnAdd.setOnClickListener(View.OnClickListener {
            var intent:Intent=Intent(this@MainActivity, SubjectsActivity::class.java)
            startActivity(intent)
        })

    }
}
