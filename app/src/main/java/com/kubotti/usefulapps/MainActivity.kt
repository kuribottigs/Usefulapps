package com.kubotti.usefulapps

import android.app.Dialog
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val homebutton = findViewById<ImageButton>(R.id.HomeButton)
        //homebutton.setOnTouchListener();
        //通知
        val notificationIntent = Intent(applicationContext,Markmessage::class.java)
        val contentIntent = PendingIntent.getActivity(this,0,notificationIntent,0)
        var builder = NotificationCompat.Builder(this/*, CHANNEL_ID*/,"baka")
                .setSmallIcon(R.drawable.masseage_icon_wahat)
                .setContentTitle("Hello")
                .setContentText("Hahahahahahahahahahahahahahaha")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(contentIntent)
        with(NotificationManagerCompat.from(this)) {
            // notificationId is a unique int for each notification that you must define
            notify(1, builder.build())
        }



        //val test = arrayOfNulls<ImageButton>(15)
        HomeButton.setOnTouchListener{view,event ->

            if(event.action == MotionEvent.ACTION_DOWN){
                //ボタンを押してるとき

            }
            else if(event.action== MotionEvent.ACTION_UP){
                //ボタンを離したとき

            }

            true
        }

        InternetButton.setOnTouchListener{view,event ->

            if(event.action == MotionEvent.ACTION_DOWN){
                //ボタンを押してるとき

            }
            else if(event.action== MotionEvent.ACTION_UP){
                //ボタンを離したとき
                val intent = Intent(applicationContext,Web_Browser::class.java)
                intent.putExtra(EXTRA_MESSAGE,"file:///android_asset/html/index.html")
                startActivity(intent)
            }

            true
        }

        InfomationButton.setOnTouchListener{view,event ->

            if(event.action == MotionEvent.ACTION_DOWN){
                //ボタンを押してるとき

            }
            else if(event.action== MotionEvent.ACTION_UP){
                //ボタンを離したとき
                //System.out.print("test")
                //val info: Dialog = infomation_dialog(this)
                val infoInt = Intent(applicationContext,Web_Browser::class.java)
                infoInt.putExtra(EXTRA_MESSAGE,"file:///android_asset/html/infomation.html")
                startActivity(infoInt)
            }

            true
        }

        CalculatorButton.setOnTouchListener{view,event ->

            if(event.action == MotionEvent.ACTION_DOWN){
                //ボタンを押してるとき

            }
            else if(event.action== MotionEvent.ACTION_UP){
                //ボタンを離したとき
                //System.out.print("test")
                //val info: Dialog = infomation_dialog(this)
                val calculatorItt = Intent(applicationContext,Calculator::class.java)

                startActivity(calculatorItt)
            }

            true
        }


    }
    companion object {
        const val EXTRA_MESSAGE ="com.kubotti.usefulapps.MESSAGE"
    }

}