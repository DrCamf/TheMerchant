package elthoro.dk.themerchant

class MarketWares {

    val MarketWaresID: Int = 0
    var MarketWaresVOLUME: Int = 0
    var MarketWaresBuyPrice: Int = 0
    var MarketWaresSellPrice: Int = 0
    var WaresID: Int = 0
    var MarketWaresVOLUMETYPEID: Int = 0
    var MarketID: Int = 0

    constructor(volume: Int, buy: Int, sell: Int, waresid: Int, volumetypeid: Int, marketid: Int) {
        this.MarketWaresVOLUME = volume
        this.MarketWaresBuyPrice = buy
        this.MarketWaresSellPrice = sell
        this.WaresID = waresid
        this.MarketWaresVOLUMETYPEID = volumetypeid
        this.MarketID = marketid
    }
}