package elthoro.dk.themerchant

class Markets {
    val MarketsID: Int = 0
    var MarketsNAME: String? = null
    var cityID: Int = 0
    var MarketsPostion_X: String? = null
    var MarketsPostion_Y: String? = null

    constructor(name: String, cityid: Int, positionX: String, positionY: String) {
        this.MarketsNAME = name
        this.MarketsPostion_X = positionX
        this.MarketsPostion_Y = positionY
        this.cityID = cityid
    }
}