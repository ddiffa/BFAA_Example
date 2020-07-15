package dev.hellodiffa.dialogfragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), onOptionClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvName.setOnClickListener {
            val fragment = BlankFragment()
            fragment.show(supportFragmentManager.beginTransaction(),"BlankFragment")
        }
    }

    //ini fungsi yang di override dari interface, masnya kalau mau setting tinggal disini aja sesuai yang option click nanti
    override fun setName(name: String) {
        tvName.text = name
        Toast.makeText(baseContext, name, Toast.LENGTH_SHORT).show()
    }
}