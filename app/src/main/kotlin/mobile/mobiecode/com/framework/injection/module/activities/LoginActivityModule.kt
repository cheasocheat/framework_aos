package mobile.mobiecode.com.framework.injection.module.activities

import dagger.Module
import dagger.Provides
import mobile.mobiecode.com.framework.view.login.LoginActivity
import mobile.mobiecode.com.framework.view.login.LoginPresenterImpl
import mobile.mobiecode.com.framework.view.login.LoginView

/**
 * Created by cheasocheat on 2/20/18.
 */
@Module
class LoginActivityModule {

    @Provides
    fun provideLoginView(loginActivity: LoginActivity): LoginView = loginActivity

    @Provides
    fun providePresenter(loginView: LoginView): LoginPresenterImpl {
        return LoginPresenterImpl(loginView)
    }
}