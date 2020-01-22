package com.example.fragmentshowhide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_hide_show.*

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_hide_show)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.show(fragmentManager.findFragmentById(R.id.fragment1)!!)
        fragmentTransaction.hide(fragmentManager.findFragmentById(R.id.fragment2)!!)
        fragmentTransaction.commit()

        login.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.show(fragmentManager.findFragmentById(R.id.fragment1)!!)
            fragmentTransaction.hide(fragmentManager.findFragmentById(R.id.fragment2)!!)
            fragmentTransaction.setCustomAnimations(android.R.animator.fade_in,
                android.R.animator.fade_out);

            fragmentTransaction.commit()


        }
        signup.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.show(fragmentManager.findFragmentById(R.id.fragment2)!!)
            fragmentTransaction.hide(fragmentManager.findFragmentById(R.id.fragment1)!!)
            fragmentTransaction.setCustomAnimations(android.R.animator.fade_in,
                android.R.animator.fade_out);

            fragmentTransaction.commit()
        }
    }
}

