package elthoro.dk.themerchant

class Merchant {

    var id: Int = 0
    var merchantName: String? = null
    var money: Int = 0

    constructor(id: Int, merchantName: String, money: Int) {
        this.id = id
        this.merchantName = merchantName
        this.money = money
    }

    constructor(merchantName: String) {
        this.merchantName = merchantName
    }
}