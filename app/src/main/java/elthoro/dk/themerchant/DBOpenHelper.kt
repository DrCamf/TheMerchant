package elthoro.dk.themerchant

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.jar.Attributes

class DBOpenHelper(context: Context,
                   factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME,
        factory, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {

        var CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                TABLE_Merchant + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_NAME
                + " TEXT" + ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
        CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                TABLE_Merchant + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_NAME
                + " TEXT" + ")")
        db.execSQL(CREATE_PRODUCTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_Merchant)
        onCreate(db)
    }

    fun addMerchant(merchant: Merchant) {
        val values = ContentValues()
        values.put(COLUMN_NAME, merchant.merchantName)
        values.put(COLUMN_MONEY, merchant.money)
        val db = this.writableDatabase
        db.insert(TABLE_Merchant, null, values)
        db.close()
    }
    /*fun getAllName(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM $TABLE_NAME", null)
    }*/
    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "MerchantDB.db"
        val TABLE_Merchant = "Merchant"
        val COLUMN_ID = "_id"
        val COLUMN_NAME = "merchantName"
        val COLUMN_MONEY = "money"

    }
}