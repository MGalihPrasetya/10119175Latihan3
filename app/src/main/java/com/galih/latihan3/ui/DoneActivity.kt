package com.galih.latihan3.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.galih.latihan3.IntentID.ID_EXTRA_MSG
import com.galih.latihan3.IntentID.ID_EXTRA_MSG_EXIT
import com.galih.latihan3.R
import com.galih.latihan3.data.User
import com.galih.latihan3.databinding.ActivityDoneBinding

//27 April 2022
//10119175
//Mochamad Galih Prasetya
//IF5

class DoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setName()
    }

    @SuppressLint("SetTextI18n")
    private fun setName() {
        binding.apply {
            val dataUser = intent.getParcelableExtra<User>(ID_EXTRA_MSG)
            val name = "" + dataUser?.name + ""
            val done = getString(R.string.activation_done)
            val ableTo = getString(R.string.activation_able_to)
            val each = getString(R.string.activation_each)
            val make = getString(R.string.activation_make)

            txtDoneTitle.text = "$done $name $ableTo $name $each $name $make"

            btnDoneNext.setOnClickListener {
                val intent = Intent(this@DoneActivity, WelcomeActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                intent.putExtra(ID_EXTRA_MSG_EXIT, true)
                startActivity(intent)
            }
        }
    }
}