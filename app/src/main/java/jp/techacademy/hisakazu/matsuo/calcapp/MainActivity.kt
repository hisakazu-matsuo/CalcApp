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


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)


        val num1 = Integer.parseInt(editText1.getText().toString())
        val num2 = Integer.parseInt(editText2.getText().toString())

        //val num1=editText.text.toString()
        //val num2=30
        intent.putExtra("VALUE1",num1)
        intent.putExtra("VALUE2", num2)
        startActivity(intent)

    }

 //   val toastButton:  Button= findViewById(R.id.show_toast_button1)
 //   toastButton.setOnClickListener {
 //       Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
 //   }

}