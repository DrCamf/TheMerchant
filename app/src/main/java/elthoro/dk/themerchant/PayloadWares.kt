package elthoro.dk.themerchant

class PayloadWares {
    val id: Int = 0
    var waresId: Int = 0
    var volumetypeId: Int = 0
    var volume: Int = 0
    var donkeyId: Int = 0

    constructor(waresid: Int, volumetypeid: Int, volume: Int, donkeyid: Int) {
        this.waresId = waresid
        this.volumetypeId = volumetypeid
        this.volume = volume
        this.donkeyId = donkeyid
    }

}