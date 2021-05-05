package com.example.android.funfacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.funfacts.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private var binding: ActivityDetailsBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val logo = intent.getIntExtra(FactAdapter.LOGO_EXTRA, 0)
        val name = intent.getStringExtra(FactAdapter.NAME_EXTRA)
        val detail = intent.getStringExtra(FactAdapter.FACT_EXTRA)

        setUpDetail(logo, name, detail)
    }

    private fun setUpDetail(logo: Int, name: String?, detail: String?) {

        binding?.logoIv?.setImageResource(logo)
        binding?.detailstv?.text = detail
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}