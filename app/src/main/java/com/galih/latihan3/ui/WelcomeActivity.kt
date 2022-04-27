package com.galih.latihan3.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galih.latihan3.IntentID.ID_EXTRA_MSG_EXIT
import com.galih.latihan3.databinding.ActivityWelcomeBinding

//27 April 2022
//10119175
//Mochamad Galih Prasetya
//IF5

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intentToLoginCode()
        allActivityFinish()
    }

    private fun allActivityFinish() {
        if (intent.getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish()
        }
    }

    private fun intentToLoginCode() {
        binding.apply {
            btnWalkthroughStart.setOnClickListener {
                val intent = Intent(this@WelcomeActivity, LoginCodeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}