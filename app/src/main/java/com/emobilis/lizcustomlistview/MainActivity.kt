package com.emobilis.lizcustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var listview=findViewById<ListView>(R.id.listView)
        var mylist= mutableListOf<Model>()

        //lets add images,title and description
        mylist.add(Model("blue","This is wonderful",R.drawable.blue))
        mylist.add(Model("img2","This is exciting",R.drawable.img2))
        mylist.add(Model("img3","This is beautiful",R.drawable.img3))
        mylist.add(Model("img4","You are kind",R.drawable.img4))
        mylist.add(Model("img5","How jovial you are today",R.drawable.img5))
        mylist.add(Model("img6","The work was done well",R.drawable.img6))
        mylist.add(Model("purple1","You are handsome today",R.drawable.purple1))
        mylist.add(Model("purple2","She is more experienced",R.drawable.purple2))
        mylist.add(Model("purple3","They are intelligent",R.drawable.purple3))
        mylist.add(Model("emily","What wonderful children you raised up!",R.drawable.emily))

        listview.adapter=MyAdapter(this,R.layout.liz23,mylist)
    }
}