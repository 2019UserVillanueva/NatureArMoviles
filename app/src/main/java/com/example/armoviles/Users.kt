package com.example.armoviles

class Users {

    //modelo para los usurios en la base de datos

    var name : String? = null
    var image : String? = null
    var status : String? = null

    constructor(){

    }

    constructor(name: String?, image: String?, status: String?) {
        this.name = name
        this.image = image
        this.status = status
    }
}