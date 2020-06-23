package com.example.cataloglist

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CAdapterCatalog(context:Context,catalog:ArrayList<CCatalog>):BaseAdapter() {

    var catalogList:ArrayList<CCatalog> ?= null
    var inflator:LayoutInflater ?= null

    init {
        catalogList = catalog
        inflator = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View ?= null
        view = inflator?.inflate(R.layout.catalog_row,parent,false)

        var txtCode:TextView
        var txtName:TextView
        var txtPrice: TextView
        var image:ImageView
        var imageCorzina:ImageView

        txtCode = view?.findViewById(R.id.txtCode) as TextView
        txtName = view?.findViewById(R.id.txtName) as TextView
        txtPrice = view?.findViewById(R.id.txtPrice) as TextView
        image = view?.findViewById(R.id.imageCatalog) as ImageView
        imageCorzina = view?.findViewById(R.id.imageCorzina) as ImageView

        var catalog:CCatalog
        catalog = getItem(position)!!

        txtCode.setText(catalog.code)
        txtName.setText(catalog.name)
        txtPrice.setText(catalog.price.toString()+" руб.")
        image.setImageResource(catalog.image!!)

        image!!.setOnClickListener {
            Log.w("Click image", catalog!!.name)
        }

        imageCorzina!!.setOnClickListener {
            Log.w("Click Corzina",catalog.code)
        }

        return view!!
    }

    override fun getItem(position: Int): CCatalog? {
        return catalogList?.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return catalogList!!.size
    }

}