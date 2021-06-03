package stta.gabriel.legend2stroke

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private var list: ArrayList<Motor> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "2 Stroke Legend"

        rvMotor = findViewById(R.id.rv_motor)
        rvMotor.setHasFixedSize(true)

        list.addAll(DataMotor.listData)
        showRecyclerlist()
    }

    private fun showRecyclerlist() {
        rvMotor.layoutManager = LinearLayoutManager(this)
        val list2StrokeAdapter = List2StrokeAdapter(list)
        rvMotor.adapter = list2StrokeAdapter

        list2StrokeAdapter.setOnItemClickCallback(object : List2StrokeAdapter.onItemCallback {
            override fun onItemClicked(data: Motor) {
                val moveIntent = Intent(this@MainActivity, Detail2StrokeLegend::class.java)

                moveIntent.putExtra("nama", data.name)
                moveIntent.putExtra("detail", data.detail)
                moveIntent.putExtra("photo", data.photo)
                moveIntent.putExtra("Harga", data.price)
                moveIntent.putExtra("merk", data.merk)
                moveIntent.putExtra("Tipe Motor", data.tipemotor)
                moveIntent.putExtra("Tahun Pembuatan", data.tahun)
                moveIntent.putExtra("Kubikasi", data.kubik)


                startActivity(moveIntent)
            }

        })
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_list) {

                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(moveIntent)
            }
        return super.onOptionsItemSelected(item)
    }
}
