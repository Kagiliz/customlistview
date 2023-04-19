package com.emobilis.lizcustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var myCntx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(myCntx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(myCntx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView=view.findViewById(R.id.image)
        val titletextview:TextView=view.findViewById(R.id.Tx_MainText)
        val descriptiontextview:TextView=view.findViewById(R.id.Tx_SubText)

        var myitem:Model=items[position]
        imageView.setImageDrawable(myCntx.resources.getDrawable(myitem.img))
        titletextview.text=myitem.title
        descriptiontextview.text=myitem.Description

        return view
    }
}