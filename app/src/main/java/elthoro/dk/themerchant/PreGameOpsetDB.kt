package elthoro.dk.themerchant

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.*

class PreGameOpsetDB(context: Context,
                     factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, PreGameOpsetDB.DATABASE_NAME,
        factory, PreGameOpsetDB.DATABASE_VERSION)
{

    override fun onCreate(p0: SQLiteDatabase) {
        var CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                PreGameOpsetDB.TABLE_CITY + "("
                + PreGameOpsetDB.COLUMN_CITY_ID + " INTEGER PRIMARY KEY," +
                PreGameOpsetDB.COLUMN_CITY_NAME + " TEXT" + PreGameOpsetDB.COLUMN_CITY_Postion_X +
                 " TEXT " + PreGameOpsetDB.COLUMN_CITY_Postion_Y + " TEXT " + " )")
        p0.execSQL(CREATE_PRODUCTS_TABLE)
        CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                PreGameOpsetDB.TABLE_MARKET + "("
                + PreGameOpsetDB.COLUMN_MARKET_ID + " INTEGER PRIMARY KEY," +
                PreGameOpsetDB.COLUMN_MARKET_NAME + " TEXT" + PreGameOpsetDB.COLUMN_MARKET_Postion_X +
                " TEXT " + PreGameOpsetDB.COLUMN_MARKET_Postion_Y + " TEXT " + " )")
        p0.execSQL(CREATE_PRODUCTS_TABLE)
        CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                PreGameOpsetDB.TABLE_VOLUMETYPE + "("
                + PreGameOpsetDB.COLUMN_VOLUMETYPE_ID + " INTEGER PRIMARY KEY," +
                PreGameOpsetDB.COLUMN_VOLUMETYPE_NAME + " TEXT" + " )")
        p0.execSQL(CREATE_PRODUCTS_TABLE)
        CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                PreGameOpsetDB.TABLE_WARES + "("
                + PreGameOpsetDB.COLUMN_WARES_ID + " INTEGER PRIMARY KEY," +
                PreGameOpsetDB.COLUMN_WARES_NAME + " TEXT" + " )")
        p0.execSQL(CREATE_PRODUCTS_TABLE)
        CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                PreGameOpsetDB.TABLE_MARKET_WARES + "("
                + PreGameOpsetDB.COLUMN_MARKET_WARES_ID + " INTEGER PRIMARY KEY," +
                PreGameOpsetDB.COLUMN_MARKET_WARES_VOLUME + " INTEGER" + PreGameOpsetDB.COLUMN_MARKET_WARES_SELL +
                " INTEGER " + PreGameOpsetDB.COLUMN_MARKET_WARES_BUY + " INTEGER "
                + PreGameOpsetDB.COLUMN_VOLUMETYPEID + " INTEGER " +  PreGameOpsetDB.COLUMN_WARESID
                + " INTEGER " + PreGameOpsetDB.COLUMN_MARKETID + " INTEGER " +" )")
        p0.execSQL(CREATE_PRODUCTS_TABLE)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun insertCity(cities: City) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_CITY_NAME, cities.cityName)
        contentValues.put(COLUMN_CITY_Postion_X, cities.cityPostion_X)
        contentValues.put(COLUMN_CITY_Postion_Y, cities.cityPostion_Y)
        db.insert( TABLE_CITY, null, contentValues)
    }
    fun insertMarket(markets: Markets) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_MARKET_NAME, markets.MarketsNAME)
        contentValues.put(COLUMN_MARKET_Postion_X, markets.MarketsPostion_X)
        contentValues.put(COLUMN_MARKET_Postion_Y, markets.MarketsPostion_Y)
        contentValues.put(COLUMN_MARKET_CITY_ID, markets.cityID)
        db.insert( TABLE_MARKET, null, contentValues)
    }
    fun insertWares(wares: Wares) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_WARES_NAME, wares.WaresNAME)
        db.insert( TABLE_WARES, null, contentValues)
    }
    fun insertMarketWares(marketWares: MarketWares) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_MARKET_WARES_VOLUME, marketWares.MarketWaresVOLUME)
        contentValues.put(COLUMN_MARKET_WARES_SELL, marketWares.MarketWaresSellPrice)
        contentValues.put(COLUMN_MARKET_WARES_BUY, marketWares.MarketWaresBuyPrice)
        contentValues.put(COLUMN_VOLUMETYPEID , marketWares.MarketWaresVOLUMETYPEID)
        contentValues.put(COLUMN_WARESID , marketWares.WaresID)
        contentValues.put(COLUMN_MARKETID , marketWares.MarketID)
        db.insert( TABLE_MARKET_WARES, null, contentValues)
    }
    fun insertVolumeType(volumeType: VolumeType) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_WARES_NAME, volumeType.volumeTypeNAME)
        db.insert( TABLE_VOLUMETYPE, null, contentValues)

    }

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "MerchantDB.db"
        val TABLE_CITY = "Cities"
        val COLUMN_CITY_ID = "_id"
        val COLUMN_CITY_NAME = "cityName"
        val COLUMN_CITY_Postion_X = "X postion"
        val COLUMN_CITY_Postion_Y = "Y postion"

        val TABLE_MARKET = "Markets"
        val COLUMN_MARKET_ID = "_id"
        val COLUMN_MARKET_NAME = "marketName"
        val COLUMN_MARKET_CITY_ID = "city_id"
        val COLUMN_MARKET_Postion_X = "X postion"
        val COLUMN_MARKET_Postion_Y = "Y postion"

        val TABLE_WARES = "Wares"
        val COLUMN_WARES_ID = "_id"
        val COLUMN_WARES_NAME = "waresName"

        val TABLE_MARKET_WARES = "MarketWares"
        val COLUMN_MARKET_WARES_ID = "_id"
        val COLUMN_MARKET_WARES_VOLUME = "volume"
        val COLUMN_MARKET_WARES_SELL = "SellPrice"
        val COLUMN_MARKET_WARES_BUY = "BuyPrice"
        val COLUMN_VOLUMETYPEID = "volumeType_id"
        val COLUMN_MARKETID = "market_id"
        val COLUMN_WARESID = "market_id"
        val TABLE_VOLUMETYPE = "VolumeType"
        val COLUMN_VOLUMETYPE_ID = "_id"
        val COLUMN_VOLUMETYPE_NAME = "volumeType"
    }
}