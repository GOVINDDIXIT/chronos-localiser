package com.govinddixit.chronoslocaliser

import kotlin.collections.HashMap

object Locales {

    val languagesList = listOf(
        "Deutsch",
        "English",
        "Español",
        "Français",
        "Italiano",
        "Japanese",
        "Nederlands",
        "Português",
        "Chinese"
    )

    val languageMap: HashMap<String, String> = hashMapOf(
        "Deutsch" to "de",
        "English" to "en",
        "Español" to "es",
        "Français" to "fr",
        "Italiano" to "it",
        "Japanese" to "ja",
        "Nederlands" to "en",
        "Português" to "pt",
        "Chinese" to "zh"
    )
}