package com.example.cataloglist

class CCatalog(code:String, name:String, price: Int, image:Int) {
    var code:String?=null
    var name:String?=null
    var price:Float?=null
    var image:Int?=null

    init {
        this.code=code
        this.name=name
        this.price=price.toFloat()
        this.image=image
    }

}