package elthoro.dk.themerchant

class VolumeType {
    val volumeTypeID: Int = 0
    var volumeTypeNAME: String? = null

    constructor(name: String) {
        this.volumeTypeNAME = name
    }
}