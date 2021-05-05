package com.example.android.funfacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FactAdapter(context: Context, facts: List<FactModel>) : ArrayAdapter<FactModel>(context, 0, facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        var fact = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.fact_item, parent, false)
        }

        val factLogo = view?.findViewById<ImageView>(R.id.fact_logo)
        val factName = view?.findViewById<TextView>(R.id.fact_name)

        fact?.logo?.let {
            factLogo?.setImageResource(fact.logo)
        }
        factName?.text = fact?.name

        view?.setOnClickListener{
            val intent = Intent(parent.context, DetailsActivity::class.java)
            intent.putExtra(LOGO_EXTRA, fact?.logo)
            intent.putExtra(NAME_EXTRA, fact?.name)
            intent.putExtra(FACT_EXTRA, fact?.fact)
            parent.context.startActivity(intent)
        }

        return view!!
    }

    companion object{
        val LOGO_EXTRA = "logo extra"
        val NAME_EXTRA = "name extra"
        val FACT_EXTRA = "fact extra"
    }
}