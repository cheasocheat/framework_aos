package mobile.mobiecode.com.framework.view.login

import android.util.Log

/**
 * Created by cheasocheat on 2/19/18.
 */
class LoginPresenterImpl(var view : LoginView) : LoginPresenter, LoginInteractor.Callback{

    private val loginInteractor : LoginInteractor = LoginInteractorImpl()

//    private lateinit var view : LoginView

    override fun attachView(view: LoginView) {
        //this.view = view
    }

    override fun detachView() {

    }

    override fun validateCredentials(username: String, password: String) {
        loginInteractor.authenticate(username, password, this)
    }

    override fun onPasswordError() {
        Log.d("ErrorD", "Password Error")
        view.showStatus("Password Error")
    }

    override fun onSuccess() {
        Log.d("SuccessD", "Login Success")
        view.showStatus("Login success")
    }

    override fun onUsernameError() {
        Log.d("ErrorD", "Username Error")
        view.showStatus("Username Error")
    }

}