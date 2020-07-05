package com.govinddixit.chronoslocaliser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_langauge.*

class LanguageFragment : Fragment(), View.OnClickListener {

    companion object {
        val TAG = "LanguageFragment"
        fun newInstance(): Fragment {
            return LanguageFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_langauge, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_chinese.setOnClickListener(this)
        btn_deutsch.setOnClickListener(this)
        btn_english.setOnClickListener(this)
        btn_espanol.setOnClickListener(this)
        btn_francais.setOnClickListener(this)
        btn_japanese.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        var lang = "en"
        when (view.id) {
            R.id.btn_chinese -> {
                lang = "zh"
            }
            R.id.btn_deutsch -> {
                lang = "de"
            }
            R.id.btn_english -> {
                lang = "en"
            }
            R.id.btn_espanol -> {
                lang = "es"
            }
            R.id.btn_francais -> {
                lang = "fr"
            }
            R.id.btn_japanese -> {
                lang = "ja"
            }
        }
        val activity = activity as LanguageActivity
        activity.changeLanguage(lang)
    }
}
