package mobile.mobiecode.com.framework.injection.module

import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import mobile.mobiecode.com.framework.injection.components.activities.LoginActivityComponent
import mobile.mobiecode.com.framework.view.login.LoginActivity

/**
 * Created by cheasocheat on 2/20/18.
 */
@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(LoginActivity::class)
//    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    //abstract fun bindLoginActivity(builder : LoginActivityComponent.Builer) : AndroidInjector.Factory<LoginActivity>
    abstract fun bindLoginActivity(builder : LoginActivityComponent.Builer)
}