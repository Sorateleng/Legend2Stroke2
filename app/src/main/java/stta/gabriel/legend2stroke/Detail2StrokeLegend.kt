package stta.gabriel.legend2stroke

import android.os.Bundle
import android.view.MenuItem
import android.content.Intent
import android.view.Menu
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class Detail2StrokeLegend : AppCompatActivity() {

    private lateinit var namebike: TextView
    private lateinit var detailbike: TextView
    private lateinit var merkbike: TextView
    private lateinit var tipebike: TextView
    private lateinit var bikeyear: TextView
    private lateinit var bikekubik: TextView
    private lateinit var bikeprice: TextView
    private lateinit var photobike: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2_stroke_legend)
        supportActionBar?.title = "Detail"

        val name = intent.getStringExtra("nama")
        namebike = findViewById(R.id.namebike)
        namebike.text = name

        val merk = intent.getStringExtra("merk")
        merkbike = findViewById(R.id.mrkmtr)
        merkbike.text = merk

        val tipe = intent.getStringExtra("Tipe Motor")
        tipebike = findViewById(R.id.tv_jnsmtr)
        tipebike.text = tipe

        val year = intent.getStringExtra("Tahun Pembuatan")
        bikeyear = findViewById(R.id.tahun)
        bikeyear.text = year

        val cubic = intent.getStringExtra("Kubikasi")
        bikekubik = findViewById(R.id.kyubi)
        bikekubik.text = cubic

        val harga = intent.getStringExtra("Harga")
        bikeprice = findViewById(R.id.harga)
        bikeprice.text = harga

        val detail = intent.getStringExtra("detail")
        detailbike = findViewById(R.id.dtl)
        detailbike.text = detail

        val photo = intent.getIntExtra("photo",0)
        photobike = findViewById(R.id.imgbike)


        Glide.with(this)
            .load(photo)
            .into(photobike)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.back2,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveIntent = Intent(this@Detail2StrokeLegend,MainActivity::class.java)
        startActivity(moveIntent)
        return super.onOptionsItemSelected(item)
    }
    }
