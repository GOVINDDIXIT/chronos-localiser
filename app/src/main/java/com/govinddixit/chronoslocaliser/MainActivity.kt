package com.govinddixit.chronoslocaliser

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_change_langauge.setOnClickListener {
            startActivity(Intent(this, LanguageActivity::class.java))
        }
    }
}
