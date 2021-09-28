package elthoro.dk.themerchant

class City {

    var id: Int = 0
    var cityName: String? = null
    var cityPostion_X: String? = null
    var cityPostion_Y: String? = null

    var  neighbours: MutableList<String> = mutableListOf()

    constructor(name: String, positionX: String, positionY: String)  {
        this.cityName = name
        this.cityPostion_X = positionX
        this.cityPostion_Y = positionY
    }

    constructor(name: String){
        this.cityName = name

    }





}