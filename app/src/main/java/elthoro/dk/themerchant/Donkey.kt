package elthoro.dk.themerchant

// The class for the players trusty sidekick
class Donkey {

    var id: Int = 0
    var donkeyName: String? = null
    var merchantId: Int = 0

    constructor(name: String, merchantid: Int) {
        this.donkeyName = name
        this.merchantId = merchantid
     }
}