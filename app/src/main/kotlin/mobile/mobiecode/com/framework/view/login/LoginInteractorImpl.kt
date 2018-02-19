package mobile.mobiecode.com.framework.view.login

/**
 * Created by cheasocheat on 2/19/18.
 */
class LoginInteractorImpl : LoginInteractor {
    override fun authenticate(username: String, password: String, callback: LoginInteractor.Callback) {
        if (!username.equals("reahoo")){
            callback.onUsernameError()
        }
        else if(!password.equals("123456")){
            callback.onPasswordError()
        }else{
            callback.onSuccess()
        }
    }
}