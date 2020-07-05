package com.govinddixit.chronoslocaliser

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import java.util.*

interface LocaleHelperActivityDelegate {
    fun setLocale(activity: Activity, newLocale: Locale)

    fun attachBaseContext(newBase: Context): Context

    fun applyOverrideConfiguration(
        baseContext: Context,
        overrideConfiguration: Configuration?
    ): Configuration?

    fun onPaused()

    fun onResumed(activity: Activity)

    fun onCreate(activity: Activity)
}