package elthoro.dk.themerchant

class Merchant {

    var id: Int = 0
    var merchantName: String? = null
    var money: Int = 0
    var lastPostionX: String? = null
    var lastPostionY: String? = null

    constructor(id: Int, merchantName: String, money: Int, positionX: String, positionY: String) {
        this.id = id
        this.merchantName = merchantName
        this.money = money
        this.lastPostionX = positionX
        this.lastPostionY = positionY
    }

    constructor(merchantName: String) {
        this.merchantName = merchantName
    }
}