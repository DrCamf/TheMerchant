package elthoro.dk.themerchant

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CityHarbour : AppCompatActivity() {
    lateinit var merchant: Merchant
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_harbour)

        var mediaPlayer = MediaPlayer.create(this, R.raw.harborsounds)
        mediaPlayer?.start()



        val city_me = findViewById(R.id.leavecity) as TextView

        city_me.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
            mediaPlayer?.stop()

        }
    }
}