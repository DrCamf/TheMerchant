package elthoro.dk.themerchant

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "The Merchant"

        //Cities
        val coldwater_me = findViewById(R.id.citycoldwater) as TextView
        val silvercrest_me = findViewById(R.id.citysilvercrest) as TextView
        val cliffsedge_me = findViewById(R.id.citycliffsedge) as TextView
        val arlansway_me = findViewById(R.id.cityarlansway) as TextView
        val dimbar_me = findViewById(R.id.citydimbar) as TextView
        val marlburg_me = findViewById(R.id.citymarlburg) as TextView
        val duskendale_me = findViewById(R.id.cityduskendale) as TextView
        val easthaven_me = findViewById(R.id.cityeasthaven) as TextView
        val elbright_me = findViewById(R.id.cityelbright) as TextView
        val ironforge_me = findViewById(R.id.cityironforge) as TextView
        val karasvale_me = findViewById(R.id.citykarasvale) as TextView
        val lastlock_me = findViewById(R.id.citylastlock) as TextView

        //The donkey
        val donkey = findViewById(R.id.thedonkey) as ImageView

        //Menu
        val close_me = findViewById(R.id.close) as TextView
        val newgame_me = findViewById(R.id.newgame) as TextView
        val loadgame_me = findViewById(R.id.loadgame) as TextView

        // Horisontal scroll
        val scroll_start = findViewById(R.id.HorisontScroll) as HorizontalScrollView
        val map_me = findViewById(R.id.maplayout) as RelativeLayout

        //Sound
        var mediaPlayer = MediaPlayer.create(this, R.raw.horseandcart)
        mediaPlayer?.start()
    }
}