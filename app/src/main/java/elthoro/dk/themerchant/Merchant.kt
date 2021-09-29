package elthoro.dk.themerchant

// The player class that creates the info for the player
class Merchant {

    var id: Int = 0
    var merchantName: String? = null
    var money: Int = 0
    var lastPostionX: String? = null
    var lastPostionY: String? = null
    var lastVisited: String? = null

    constructor(id: Int, merchantName: String, money: Int, positionX: String, positionY: String, lastvisted: String) {
        this.id = id
        this.merchantName = merchantName
        this.money = money
        this.lastPostionX = positionX
        this.lastPostionY = positionY
        this.lastVisited = lastvisted
    }

    constructor(merchantName: String) {
        this.merchantName = merchantName
    }
    constructor() {}
}