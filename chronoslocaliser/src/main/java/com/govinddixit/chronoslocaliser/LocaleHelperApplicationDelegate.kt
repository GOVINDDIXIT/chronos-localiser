package com.govinddixit.chronoslocaliser

import android.content.Context

class LocaleHelperApplicationDelegate {
    fun attachBaseContext(base: Context): Context = LocaleHelper.onAttach(base)

    fun onConfigurationChanged(context: Context) {
        LocaleHelper.onAttach(context)
    }
}