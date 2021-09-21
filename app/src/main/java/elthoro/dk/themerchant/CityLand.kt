package elthoro.dk.themerchant

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CityLand : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_land)
        var mediaPlayer = MediaPlayer.create(this, R.raw.medievalfantasycity)
        mediaPlayer?.start()
        val tv_click_me = findViewById(R.id.leavecity) as TextView

        tv_click_me.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
            mediaPlayer?.stop()
        }
    }
}