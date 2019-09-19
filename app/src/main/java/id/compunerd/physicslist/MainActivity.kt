package id.compunerd.physicslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Sains> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rvPhysicsList)
        rvHeroes.setHasFixedSize(true)

        list.addAll(SainsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listSainsAdapter = ListSainsAdapter(list)
        rvHeroes.adapter = listSainsAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_me, menu)
        return true
    }

    private fun selectedItem(sains: Sains) {
        Toast.makeText(this, "You Choice " + sains.name, Toast.LENGTH_SHORT).show()
    }
}
