package com.example.cataloglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var catalogList:ArrayList<CCatalog>
        catalogList = ArrayList()

        catalogList.add(CCatalog("1","ХЛЕБ БОРОДИНСКИЙ 450Г ХЛЕБНИЦА",27,R.drawable.foto2))
        catalogList.add(CCatalog("2","ХЛЕБ ХАРРИС 470Г САНДВИЧНЫЙ ПШЕНИЧНЫЙ РЕЗ",83,R.drawable.foto3))
        catalogList.add(CCatalog("3","КОНФЕТЫ ТОФФИФЕ 125Г",159,R.drawable.foto4))
        catalogList.add(CCatalog("4","ВАФЛИ ЯШКИНСКИЕ 200Г ШОКОЛАДНЫЕ",35,R.drawable.foto5))
        catalogList.add(CCatalog("5","НАПИТОК СОКОСОДЕР ГОЛД КЛАССИК 1,93Л ЯБЛОКО",137,R.drawable.foto6))
        catalogList.add(CCatalog("6","ПЮРЕ МЯСНОЕ ТЕМА 100Г ГОВЯДИНА С 6 МЕС",84,R.drawable.foto7))

        var adapter:CAdapterCatalog
        adapter = CAdapterCatalog(this,catalogList)

        CatalogList.adapter = adapter

    }

}
