package mobile.mobiecode.com.framework.view.login

/**
 * Created by cheasocheat on 2/19/18.
 */

/**
 * Solved Business Logic
 */
interface LoginInteractor {
    interface Callback {
        fun onSuccess()
        fun onUsernameError()
        fun onPasswordError()
    }

    fun authenticate(username: String, password : String, callback : Callback)
}