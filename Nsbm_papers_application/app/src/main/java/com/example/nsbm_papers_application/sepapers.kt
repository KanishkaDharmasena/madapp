package com.example.nsbm_papers_application

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class sepapers : AppCompatActivity() {
    var mydownloadid:Long=0
    private lateinit var button1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sepapers)

        button1=findViewById(R.id.imageButton1)
        button1.setOnClickListener {



            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%20papers%2Findex.png?alt=media&token=2db0d521-f7c1-4ecc-8024-3b4a665841db"))
                .setTitle("loveStory")
                .setDescription("new lovers")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)
            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        var br =object: BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                var id :Long? =p1?.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)
                if (id==mydownloadid){
                    Toast.makeText(applicationContext, "Download completed", Toast.LENGTH_SHORT).show()
                }
            }
        }
        registerReceiver(br, IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE))

    }
}