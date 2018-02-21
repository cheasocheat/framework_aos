package mobile.mobiecode.com.framework.view.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_login.*
import mobile.mobiecode.com.framework.R
import mobile.mobiecode.com.framework.view.base.BaseActivity
import org.jetbrains.anko.toast
import javax.inject.Inject

class LoginActivity : AppCompatActivity(){

    private var username = ""
    private var password = ""


@Inject
lateinit var hello:String



    override fun onCreate(savedInstanceState: Bundle?) {
      AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            onLoginButtonClicked()
        }

       toast(hello)

    }



    /***
     * Solved Login Button Clicked
     */
    fun onLoginButtonClicked(){
        username = edtUsername.text.toString()
        password = edtPassword.text.toString()

        Log.d("LoginActivity", username)
        Log.d("LoginActivity", password)
        //presenter.validateCredentials(username, password)
    }

    /**
     * Override from view to display status of login
     */
//    override fun showStatus(status: String) {
//        tvStatus.setText(status)
//        toast(status)
//    }
}
