package com.example.cmaureir.notes

import android.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.LinearLayout
import kotlin.math.round


class MainActivity : AppCompatActivity() {

    public var members = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener{

            var tmpLayout = LinearLayout(this)
            tmpLayout.orientation = LinearLayout.HORIZONTAL

            var newText = TextView(this)
            newText.setId(1+members*2)
            newText.width = 800
            newText.height = 40
            newText.text = entryText.text

            var newButton = Button(this)
            newButton.text = "X"
            newButton.height = 40
            newButton.width = 40
            newButton.setId(2+members*2)
            newButton.setOnClickListener{
                println("lol")
            }
            tmpLayout.addView(newText)
            tmpLayout.addView(newButton)

            linearLayout.addView(tmpLayout)

        }
    }
}
