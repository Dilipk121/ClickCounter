package com.mine.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycling
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

//    private lateinit var viewModel : CountViewModel
    private lateinit var liveViewModel: CountLiveViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     //   viewModel = ViewModelProvider(this).get(CountViewModel::class.java)

        liveViewModel = ViewModelProvider(this).get(CountLiveViewModel::class.java)

        val tvCount = findViewById<TextView>(R.id.tv_count)
        val btnClick = findViewById<Button>(R.id.btn_click)
        val btnReset = findViewById<Button>(R.id.btn_reset)


        liveViewModel.count.observe(this, Observer {
            tvCount.text = it.toString()
        })


     //   tvCount.text = viewModel.count.toString()

        btnClick.setOnClickListener{
     //       viewModel.countPlus()
     //       tvCount.text = viewModel.count.toString()
            liveViewModel.CountClisks()
        }


        btnReset.setOnClickListener{
//          viewModel.countZero()
//            tvCount.text = viewModel.count.toString()
            liveViewModel.CountZero()
        }


    }
}