package com.rudolfhladik.popkorntest.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import cc.popkorn.inject
import com.rudolfhladik.popkorntest.shared.ControllerA
import com.rudolfhladik.popkorntest.shared.ControllerB

class MainActivity : AppCompatActivity() {

    val ca: ControllerA by lazy { inject()}
    val cb: ControllerB by lazy { inject()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = ca.produceOutput("some")
        val s = cb.produceOutput(i)
        val tv: TextView = findViewById(R.id.text_view)
        tv.text = s
    }
}
