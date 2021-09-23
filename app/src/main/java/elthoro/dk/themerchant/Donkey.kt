package elthoro.dk.themerchant

class Donkey {

    var id: Int = 0
    var donkeyName: String? = null
    var payload: String? = null

    constructor(name: String, load: String) {
        this.donkeyName = name
        this.payload = load

    }
}