package elthoro.dk.themerchant

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mediaPlayer: MediaPlayer
    lateinit var merchant: Merchant
    lateinit var game: Game
    lateinit var idfrom: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "The Merchant"


        //Sound
        mediaPlayer = MediaPlayer.create(this, R.raw.peaceonthewater)
        mediaPlayer?.start()

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

        //Menu listeners and new game function
        savegame_me.setOnClickListener(this)
        loadgame_me.setOnClickListener(this)
        close_me.setOnClickListener(this)
        newgame_me.setOnClickListener() {
            scroll_start.scrollTo(1080,430)
            val imgResId = R.drawable.donkey
            var resId = imgResId
            donkey.setImageResource(resId)
            startGame()
        }
        //On map other listeners
        donkey.setOnClickListener(this)
    }

    //Function to collect the onlick functions
    override fun onClick(v: View?) {
        idfrom = v?.getId().toString()
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
            R.id.close ->closeGame()
            R.id.loadgame ->loadCityLake()
            R.id.thedonkey -> donkeyClick()
        }
    }

    // Function that return if player mey visit city
    private fun mayVisit(): Boolean{
        return game.mayVisit(merchant.lastVisited.toString())
    }

    // function to close the App
    private fun closeGame() {
        mediaPlayer?.stop()
        finishAffinity()
    }

    // Function to open what a view that shows what donkey is carring
    private fun donkeyClick() {
        val dialogBuilder = AlertDialog.Builder(this)
        val inflater = this.layoutInflater
        val dialogView = inflater.inflate(R.layout.dialogboxstyle, null)
        dialogBuilder.setView(dialogView)

            // if the dialog is cancelable
            .setCancelable(true)
            // positive button text and action
            // positive button text and action
            .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                    dialog, id -> loadCityLand()
            })
            // negative button text and action
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
        // create dialog box
        val alert = dialogBuilder.create()
        alert.show()
    }

    //Function that loads a city on land
    private fun loadCityLand() {
        Toast.makeText(this, idfrom, Toast.LENGTH_SHORT).show()
        /*if(mayVisit()) {
            val intent = Intent(this, CityLand::class.java)
            // start your next activity
            startActivity(intent)
            mediaPlayer?.stop()
        } else {
            mayNotMessage()
        }*/

    }

    // Does what is says on the tin
    private fun startGame() {
        val intent = Intent(this, CityHarbour::class.java)
        // start your next activity
        startActivity(intent)
        mediaPlayer?.stop()
    }

    //Function that loads a city with a harbour
    private fun loadCityHarbour() {
        Toast.makeText(this, idfrom, Toast.LENGTH_SHORT).show()
        //merchant.lastVisited =
       /* Toast.makeText(this, idfrom, Toast.LENGTH_SHORT).show()
        if(mayVisit()) {
            val intent = Intent(this, CityHarbour::class.java)
            // start your next activity
            startActivity(intent)
            mediaPlayer?.stop()
        }else {
            mayNotMessage()
        }*/
    }

    //Function that loads a city on high ground
    private fun loadCityHill() {
        Toast.makeText(this, idfrom, Toast.LENGTH_SHORT).show()
       /* if(mayVisit()) {
            val intent = Intent(this, CityHill::class.java)
            // start your next activity
            startActivity(intent)
            mediaPlayer?.stop()
        }else {
            mayNotMessage()
        }*/
    }

    //Function that loads a city on a lake
    private fun loadCityLake() {
        if(mayVisit()) {
            val intent = Intent(this, CityLand::class.java)
            // start your next activity
            startActivity(intent)
            mediaPlayer?.stop()
        } else {
            mayNotMessage()
        }
    }

    // Standard message if player may not go to city
    private fun mayNotMessage() {
        Toast.makeText(this, "Is not connected to the city you are in", Toast.LENGTH_SHORT).show()
    }

    // Eksperimental dialog
    class TravelDialogFragment : DialogFragment() {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                // Use the Builder class for convenient dialog construction
                val builder = AlertDialog.Builder(it)
                builder.setMessage(R.string.travel)
                    .setPositiveButton(R.string.pos,
                        DialogInterface.OnClickListener { dialog, id ->
                            // Do stuff
                        })
                    .setNegativeButton(R.string.neg,
                        DialogInterface.OnClickListener { dialog, id ->
                            // User cancelled the dialog
                        })
                // Create the AlertDialog object and return it
                builder.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
    }
}