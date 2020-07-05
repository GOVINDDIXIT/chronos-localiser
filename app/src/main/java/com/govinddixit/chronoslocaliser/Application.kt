package com.govinddixit.chronoslocaliser

import android.content.Context
import androidx.multidex.MultiDex


class Application : LocaleAwareApplication() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}