package mobile.mobiecode.com.framework.view.login

import mobile.mobiecode.com.framework.view.base.BasePresenter

/**
 * Created by cheasocheat on 2/19/18.
 */

interface LoginPresenter : BasePresenter<LoginView>{
    fun validateCredentials(username : String, password : String)
}