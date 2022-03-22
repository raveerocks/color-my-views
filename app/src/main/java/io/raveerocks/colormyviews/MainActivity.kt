package io.raveerocks.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableValues: List<View> = listOf(
            findViewById(R.id.box_one_text),
            findViewById(R.id.box_two_text),
            findViewById(R.id.box_three_text),
            findViewById(R.id.box_four_text),
            findViewById(R.id.box_five_text),
            findViewById(R.id.constraint_layout),
            findViewById(R.id.green_button),
            findViewById(R.id.yellow_button),
            findViewById(R.id.red_button)
        )
        for (item in clickableValues) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val red = Random().nextInt(255)
        val green = Random().nextInt(255)
        val blue = Random().nextInt(255)
        val color = Color.rgb(red,green,blue)
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(color)
            R.id.box_two_text -> view.setBackgroundColor(color)
            R.id.box_three_text -> view.setBackgroundColor(color)
            R.id.box_four_text -> view.setBackgroundColor(color)
            R.id.box_five_text -> view.setBackgroundColor(color)
            R.id.green_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundColor(color)
            R.id.yellow_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundColor(color)
            R.id.red_button -> findViewById<TextView>(R.id.box_five_text).setBackgroundColor(color)
            else -> view.setBackgroundColor(color)
        }
    }
}