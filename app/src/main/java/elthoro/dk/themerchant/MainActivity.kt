package elthoro.dk.themerchant

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mediaPlayer: MediaPlayer




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "The Merchant"

        //****************** Cities *********************************************
        //Harbours
        val coldwater_me = findViewById(R.id.citycoldwater) as TextView
        val silvercrest_me = findViewById(R.id.citysilvercrest) as TextView
        val cliffsedge_me = findViewById(R.id.citycliffsedge) as TextView
        val marlburg_me = findViewById(R.id.citymarlburg) as TextView
        val easthaven_me = findViewById(R.id.cityeasthaven) as TextView
        val elbright_me = findViewById(R.id.cityelbright) as TextView
        val karasvale_me = findViewById(R.id.citykarasvale) as TextView
        val lastlock_me = findViewById(R.id.citylastlock) as TextView
        val leeside_me = findViewById(R.id.cityleeside) as TextView
        val mahalaga_me = findViewById(R.id.citymahalaga) as TextView
        val marrenseve_me = findViewById(R.id.citymarrenseve) as TextView
        val moonbright_me = findViewById(R.id.citymoonbright) as TextView
        val orrinshire_me = findViewById(R.id.cityorrinshire) as TextView
        val ramshorn_me = findViewById(R.id.cityramshorn) as TextView
        val northpass_me = findViewById(R.id.citynorthpass) as TextView
        val redhawk_me = findViewById(R.id.cityredhawk) as TextView
        val seameet_me = findViewById(R.id.cityseameet) as TextView

        //At a lake
        val lakestown_me = findViewById(R.id.citylakestown) as TextView

        //In land
        val duskendale_me = findViewById(R.id.cityduskendale) as TextView
        val irragin_me = findViewById(R.id.cityirragin) as TextView
        val nargorthon_me = findViewById(R.id.citynargorthon) as TextView
        val pinnellapass_me = findViewById(R.id.citypinnellapass) as TextView
        val snakessanyon_me = findViewById(R.id.citysnakescanyon) as TextView
        val quelenesti_me = findViewById(R.id.cityquelenesti) as TextView

        //Mountain or hill
        val arlansway_me = findViewById(R.id.cityarlansway) as TextView
        val dimbar_me = findViewById(R.id.citydimbar) as TextView
        val ironforge_me = findViewById(R.id.cityironforge) as TextView
        val hillfar_me = findViewById(R.id.cityhillfar) as TextView

        //City click listener
        coldwater_me.setOnClickListener(this)
        silvercrest_me.setOnClickListener(this)
        cliffsedge_me.setOnClickListener(this)
        marlburg_me.setOnClickListener(this)
        easthaven_me.setOnClickListener(this)
        elbright_me.setOnClickListener(this)
        karasvale_me.setOnClickListener(this)
        lastlock_me.setOnClickListener(this)
        leeside_me.setOnClickListener(this)
        mahalaga_me.setOnClickListener(this)
        marrenseve_me.setOnClickListener(this)
        moonbright_me.setOnClickListener(this)
        orrinshire_me.setOnClickListener(this)
        ramshorn_me.setOnClickListener(this)
        northpass_me.setOnClickListener(this)
        redhawk_me.setOnClickListener(this)
        seameet_me.setOnClickListener(this)
        lakestown_me.setOnClickListener(this)
        duskendale_me.setOnClickListener(this)
        irragin_me.setOnClickListener(this)
        nargorthon_me.setOnClickListener(this)
        pinnellapass_me.setOnClickListener(this)
        snakessanyon_me.setOnClickListener(this)
        quelenesti_me.setOnClickListener(this)
        arlansway_me.setOnClickListener(this)
        dimbar_me.setOnClickListener(this)
        ironforge_me.setOnClickListener(this)
        hillfar_me.setOnClickListener(this)


       //The donkey

        val donkey = findViewById(R.id.thedonkey) as ImageView


        //Menu
        val close_me = findViewById(R.id.close) as TextView
        val newgame_me = findViewById(R.id.newgame) as TextView
        val savegame_me = findViewById(R.id.savegame) as TextView
        val loadgame_me = findViewById(R.id.loadgame) as TextView

        // Horisontal scroll
        val scroll_start = findViewById(R.id.HorisontScroll) as HorizontalScrollView
        val map_me = findViewById(R.id.maplayout) as RelativeLayout

        //Sound
        mediaPlayer = MediaPlayer.create(this, R.raw.peaceonthewater)
        mediaPlayer?.start()

        //Menu listeners and new game function
        savegame_me.setOnClickListener(this)
        loadgame_me.setOnClickListener(this)
        close_me.setOnClickListener(this)
        newgame_me.setOnClickListener() {
            scroll_start.scrollTo(1080,430)
            val imgResId = R.drawable.donkey
            var resId = imgResId
            donkey.setImageResource(resId)
        }






    }

    //Function to collect the onlick functions
    override fun onClick(v: View?) {
        when (v?.getId()) {
            R.id.citycoldwater,
            R.id.citycliffsedge,
            R.id.citysilvercrest,
            R.id.citymarlburg,
            R.id.cityeasthaven,
            R.id.cityelbright,
            R.id.citykarasvale,
            R.id.citylastlock,
            R.id.cityleeside,
            R.id.citymahalaga,
            R.id.citymarrenseve,
            R.id.citymoonbright,
            R.id.cityorrinshire,
            R.id.cityramshorn,
            R.id.citynorthpass,
            R.id.cityredhawk,
            R.id.cityseameet -> loadCityHarbour()
            R.id.cityduskendale,
            R.id.cityirragin,
            R.id.citynargorthon,
            R.id.citypinnellapass,
            R.id.citysnakescanyon,
            R.id.cityquelenesti -> loadCityLand()
            R.id.cityarlansway,
            R.id.citydimbar,
            R.id.cityironforge,
            R.id.cityhillfar -> loadCityHill()
            R.id.citylakestown ->loadCityLake()
            R.id.close ->loadCityLake()
            R.id.loadgame ->loadCityLake()
        }
    }


    // function to close the App
    private fun closeGame() {
        mediaPlayer?.stop()
        finishAffinity()
    }

    //Function that loads a city on land
    private fun loadCityLand() {
        val intent = Intent(this, CityLand::class.java)
        // start your next activity
        startActivity(intent)
        mediaPlayer?.stop()
    }

    //Function that loads a city with a harbour
    private fun loadCityHarbour() {
        val intent = Intent(this, CityHarbour::class.java)
        // start your next activity
        startActivity(intent)
        mediaPlayer?.stop()
    }

    //Function that loads a city on high ground
    private fun loadCityHill() {
        val intent = Intent(this, CityHill::class.java)
        // start your next activity
        startActivity(intent)
        mediaPlayer?.stop()
    }

    //Function that loads a city on a lake
    private fun loadCityLake() {
        val intent = Intent(this, CityLand::class.java)
        // start your next activity
        startActivity(intent)
        mediaPlayer?.stop()
    }
}