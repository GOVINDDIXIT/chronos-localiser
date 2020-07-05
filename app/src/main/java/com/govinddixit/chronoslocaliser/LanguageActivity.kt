package com.govinddixit.chronoslocaliser

import android.os.Bundle
import java.util.*

class LanguageActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_langauge)

        initUi()
    }

    private fun initUi() = supportFragmentManager.beginTransaction().let {
        it.add(R.id.rl_content, LanguageFragment.newInstance(), LanguageFragment.TAG)
        it.commit()
    }

    fun changeLanguage(lang: String){
        val locale = Locale(lang)
        updateLocale(locale)
        finish()
    }
}