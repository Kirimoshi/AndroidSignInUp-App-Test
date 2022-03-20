package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.constance.Variables
import com.example.myfirstapp.databinding.ActivityMainBinding
import com.example.myfirstapp.databinding.ActivitySignInUpBinding

class SignInUpAct : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignInUpBinding
    private var signState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignInUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE).toString()
        //if (signState == Constance.SIGN_IN_STATE) {
        //bindingClass.imAvatar2.visibility = View.GONE
        //bindingClass.bAvatar.visibility = View.GONE
        //bindingClass.edName1.visibility = View.GONE
        //bindingClass.edName2.visibility = View.GONE
        //bindingClass.edName3.visibility = View.GONE
        //}


        fun onClickDone(view: View) {
            //if (signState == Constance.SIGN_IN_STATE) {
            //Variables.LOGIN = bindingClass.edLogin.text.toString()
            //Variables.PASS = bindingClass.edPassword.text.toString()
            //}
            val i = Intent()
            i.putExtra("key1", "Done")
            setResult(RESULT_OK, i)
            finish()
        }

        fun onClickAvatar(view: View) {
            bindingClass.imAvatar2.visibility = View.VISIBLE
        }
    }

}