package com.govinddixit.chronoslocaliser

import android.app.Application
import android.content.Context
import android.content.res.Configuration

open class LocaleAwareApplication : Application() {
    private val localeAppDelegate = LocaleHelperApplicationDelegate()

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(localeAppDelegate.attachBaseContext(base))
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        localeAppDelegate.onConfigurationChanged(this)
    }
}