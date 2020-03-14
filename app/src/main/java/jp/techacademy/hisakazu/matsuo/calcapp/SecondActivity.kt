package jp.techacademy.hisakazu.matsuo.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jp.techacademy.hisakazu.matsuo.calcapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val result = intent.getDoubleExtra("RESULT", 0.0)
        textView.text = result.toString()
       }

    }

