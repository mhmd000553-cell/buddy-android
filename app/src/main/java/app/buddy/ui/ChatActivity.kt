package app.buddy.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import app.buddy.R

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Buddy — MVP chat / bubble stub"
        val btn = Button(this)
        btn.text = "Open Bubble (stub)"
        btn.setOnClickListener {
            // In a full build: show overlay bubble
        }
        setContentView(tv)
    }
}
