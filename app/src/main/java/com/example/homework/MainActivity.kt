package com.example.homework

import android.os.Bundle
import com.example.homework.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    private val presenter: MainPresenter by moxyPresenter {
        MainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)
        val edit = vb?.edit
        vb?.button?.setOnClickListener {
            presenter.save(edit?.text.toString().toInt())
        }
    }

    override fun showNewNumber(number: Int) {
        vb?.textView?.text = number.toString()
    }
}