package jp.techacademy.hisakazu.matsuo.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import android.widget.Button
import android.widget.Toast
import jp.techacademy.hisakazu.matsuo.calcapp.R
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View){
        val intent = Intent(this, SecondActivity::class.java)


        val num1 = editText1.getText().toString().toDouble()
        val num2 = editText2.getText().toString().toDouble()
        Log. d("test", "${num1}")


            if (v.id == R.id.button1) {
                val result = num1 + num2
                intent.putExtra("RESULT" , result)
                Log. d("test", "result=${result}")
            }

            if (v.id == R.id.button2) {
                val result = num1 - num2
                intent.putExtra("RESULT" , result)
            }

            if (v.id == R.id.button3) {
                val result = num1 * num2
                intent.putExtra("RESULT" , result)
            }

            if (v.id == R.id.button4) {
                val result = num1 / num2
                intent.putExtra("RESULT" , result)
            }

        startActivity(intent)

    }






 //   val toastButton:  Button= findViewById(R.id.show_toast_button1)
 //   toastButton.setOnClickListener {
 //       Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
 //   }

}