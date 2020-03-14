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

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)

        fun onClick(v: View) {
              if (v.id == R.id.button1) {
                  textView.text = "${value1 + value2}"
              }
               if (v.id == R.id.button2) {
                   textView.text = "${value1 - value2}"
               }
              if (v.id == R.id.button3) {
                  textView.text = "${value1 * value2}"
              }
              if (v.id == R.id.button4) {
                  textView.text = "${value1 / value2}"
              }
        }

       }

    }

