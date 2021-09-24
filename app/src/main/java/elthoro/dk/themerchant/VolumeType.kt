package elthoro.dk.themerchant

class VolumeType {
    val volumeTypeID: Int = 0
    var volumeTypeNAME: String? = null
    var volumeTypeDescription: String? = null

    constructor(name: String, desctiption: String) {
        this.volumeTypeNAME = name
        this.volumeTypeDescription = desctiption
    }
}