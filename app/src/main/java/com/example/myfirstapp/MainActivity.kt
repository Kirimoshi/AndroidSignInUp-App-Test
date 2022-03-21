package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0
    private var launcher: ActivityResultLauncher<Intent>? = null
    private var c: String = "empty"


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                result: ActivityResult ->
                if (result.resultCode == RESULT_OK) {
                    val text = result.data?.getStringExtra("key1")
                }
            }
    }

        fun onClickSignUp(view: View){
            val intent = Intent()
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
            launcher?.launch(Intent(this, SignInUpAct::class.java))
        }



    fun onClickSignIn(view: View){
        val intent = Intent()
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
        launcher?.launch(Intent(this, SignInUpAct::class.java))
    }

    //bindingClass.imAvatar.visibility = View.GONE
    //bindingClass.tvInfo.visibility = View.GONE
}