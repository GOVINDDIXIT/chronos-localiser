package com.govinddixit.chronoslocaliser

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.view.View
import java.util.*

class LocaleHelperActivityDelegateImpl : LocaleHelperActivityDelegate {
    override fun onCreate(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            activity.window.decorView.layoutDirection = View.LAYOUT_DIRECTION_LTR
        }
    }

    private var locale: Locale = Locale.getDefault()

    override fun setLocale(activity: Activity, newLocale: Locale) {
        LocaleHelper.setLocale(activity, newLocale)
        locale = newLocale
        activity.recreate()
    }

    override fun attachBaseContext(newBase: Context): Context = LocaleHelper.onAttach(newBase)

    override fun applyOverrideConfiguration(
        baseContext: Context, overrideConfiguration: Configuration?
    ): Configuration? {
        if (overrideConfiguration != null && Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            val uiMode = overrideConfiguration.uiMode
            overrideConfiguration.setTo(baseContext.resources.configuration)
            overrideConfiguration.uiMode = uiMode
        }
        return overrideConfiguration
    }

    override fun onPaused() {
        locale = Locale.getDefault()
    }

    override fun onResumed(activity: Activity) {
        if (locale == Locale.getDefault()) return

        activity.recreate()
    }
}

