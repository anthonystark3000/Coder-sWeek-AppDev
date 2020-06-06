package com.example.login

import android.app.Activity
import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import com.google.firebase.auth.FirebaseUser as FirebaseUser1

public class MainActivity : AppCompatActivity() {
    lateinit var providers: List<AuthUI.IdpConfig>


    val MY_REQUEST_CODE:Int=77
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        providers = Arrays.asList<AuthUI.IdpConfig>(
             AuthUI.IdpConfig.EmailBuilder().build(),
             AuthUI.IdpConfig.PhoneBuilder().build()
        );
        show()
        out.setOnClickListener {
            AuthUI.getInstance().signOut(this).addOnCompleteListener( {
                out.isEnabled=false
                show()
            }).addOnFailureListener {
                Toast.makeText(this,"Logout attempt failed",Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun show() {
        TODO("Not yet implemented")
        startActivityForResult(
            AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).setTheme(R.style.Mine).build(),MY_REQUEST_CODE
        );
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode== MY_REQUEST_CODE.toInt())
        {
            val response=IdpResponse.fromResultIntent(data)
            if (resultCode== Activity.RESULT_OK)
            {

                val user= FirebaseAuth.getInstance().currentUser
                Toast.makeText(this,"Signed in as"+user!!.getEmail(),Toast.LENGTH_SHORT).show();
                out.isEnabled=true
            }
            else{
                Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
