package com.example.android.funfacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.funfacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun setUpFact(){
        adapter = FactAdapter(this, DummyData.facts)
        binding?.factsListView?.adapter = adapter
    }
}