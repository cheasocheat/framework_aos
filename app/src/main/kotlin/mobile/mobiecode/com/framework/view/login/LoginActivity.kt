package mobile.mobiecode.com.framework.view.login

import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*
import mobile.mobiecode.com.framework.R
import mobile.mobiecode.com.framework.base.BaseActivity
import org.jetbrains.anko.toast

class LoginActivity : BaseActivity<LoginView, LoginPresenter>() , LoginView{

    private var username = ""
    private var password = ""

    override var presenter: LoginPresenter = LoginPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            onLoginButtonClicked()
        }
    }



    /***
     * Solved Login Button Clicked
     */
    fun onLoginButtonClicked(){
        username = edtUsername.text.toString()
        password = edtPassword.text.toString()

        Log.d("LoginActivity", username)
        Log.d("LoginActivity", password)
        presenter.validateCredentials(username, password)
    }

    /**
     * Override from view to display status of login
     */
    override fun showStatus(status: String) {
        tvStatus.setText(status)
        toast(status)
    }
}
