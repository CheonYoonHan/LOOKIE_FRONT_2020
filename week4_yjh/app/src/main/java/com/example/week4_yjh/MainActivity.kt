package com.example.week4_yjh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val fragmentOne: fragment1 = fragment1()
            val fragmentManager: FragmentManager = supportFragmentManager

            val fragmentTransation = fragmentManager.beginTransaction()
            fragmentTransation.replace(R.id.container, fragmentOne)
            fragmentTransation.commit()
        }

        button2.setOnClickListener {
            val fragmentTwo: fragment2 = fragment2()
            val fragmentManager: FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentTwo)
            fragmentTransaction.commit()
        }

        button3.setOnClickListener {
            val fragmentThree: fragment3 = fragment3()
            val fragmentManager: FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentThree)
            fragmentTransaction.commit()
        }

        button4.setOnClickListener {
            val fragmentFour: fragment4 = fragment4()
            val fragmentManager: FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentFour)
            fragmentTransaction.commit()
        }



    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
