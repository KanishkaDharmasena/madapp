package com.example.nsbm_papers_application

import android.app.AlertDialog
import android.app.DownloadManager
import android.content.*
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

private lateinit var  cbutton:Button
private lateinit var ebutton:Button
    private lateinit var mbutton:Button
    private lateinit var button4:Button
    private lateinit var button5:Button
    private lateinit var button20:Button
    private lateinit var button7:Button
    private lateinit var button6:Button
    private lateinit var im12:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        im12=findViewById(R.id.im12)
        im12.setOnClickListener {

            // build alert dialog
            val dialogBuilder = AlertDialog.Builder(this)

            // set message of alert dialog
            dialogBuilder.setMessage("Do you want to Logout from your account?")
                // if the dialog is cancelable
                .setCancelable(false)
                // positive button text and action
                .setPositiveButton("Ok", DialogInterface.OnClickListener {

                        dialog, id ->
                    val intent =Intent(this@MainActivity, login::class.java) //this @classname
                    startActivity(intent)
                })
                // negative button text and action
                .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("warning!")
            // show alert dialog
            alert.show()
        }
        button7=findViewById(R.id.button7)
        button7.setOnClickListener {

            val intent = Intent(this@MainActivity, nsbmclub::class.java) //this @classname

            startActivity(intent)

        }

        button6=findViewById(R.id.button6)
        button6.setOnClickListener {

            val intent = Intent(this@MainActivity, email::class.java) //this @classname

            startActivity(intent)

        }
        button20=findViewById(R.id.button20)
        button20.setOnClickListener {

            val intent = Intent(this@MainActivity, updateActivity::class.java) //this @classname

            startActivity(intent)

        }

        button4=findViewById(R.id.button4)
        button4.setOnClickListener {

            val intent = Intent(this@MainActivity, nlearn::class.java) //this @classname

            startActivity(intent)

        }
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {

            val intent = Intent(this@MainActivity, selector::class.java) //this @classname

            startActivity(intent)
        }

cbutton=findViewById(R.id.button)
        cbutton.setOnClickListener {

            val intent = Intent(this@MainActivity, computeruniversity::class.java) //this @classname

            startActivity(intent)
        }
        ebutton=findViewById(R.id.button3)
        ebutton.setOnClickListener {

            val intent = Intent(this@MainActivity, engineeruniversity::class.java) //this @classname

            startActivity(intent)
        }
        mbutton=findViewById(R.id.button2)
        mbutton.setOnClickListener {

            val intent = Intent(this@MainActivity, bisnussuniversity::class.java) //this @classname

            startActivity(intent)
        }

    }
}
