package elthoro.dk.themerchant

class City {

    var id: Int = 0
    var cityName: String? = null
    var cityPostion_X: String? = null
    var cityPostion_Y: String? = null

    constructor(name: String, positionX: String, positionY: String)  {
        this.cityName = name
        this.cityPostion_X = positionX
        this.cityPostion_Y = positionY
    }
}