package mobile.mobiecode.com.framework.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mobile.mobiecode.com.framework.view.login.LoginActivity

/**
 * Created by cheasocheat on 2/20/18.
 */
//@Module(subcomponents = [LoginActivityComponent::class])
@Module
abstract class ActivityBuilder {

//    @Binds
//    @IntoMap
//    @ActivityKey(LoginActivity::class)
    @ContributesAndroidInjector
//    abstract fun bindLoginActivity(builder : LoginActivityComponent.Builer) : AndroidInjector.Factory<LoginActivity>
    abstract fun bindLoginActivity() : LoginActivity
}