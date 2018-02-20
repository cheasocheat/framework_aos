package mobile.mobiecode.com.framework.injection.components.activities

import dagger.Subcomponent
import dagger.android.AndroidInjector
import mobile.mobiecode.com.framework.injection.module.activities.LoginActivityModule
import mobile.mobiecode.com.framework.view.login.LoginActivity

/**
 * Created by cheasocheat on 2/20/18.
 */
@Subcomponent(modules = [(LoginActivityModule::class)])
interface LoginActivityComponent : AndroidInjector<LoginActivity>{

    @Subcomponent.Builder
    abstract class Builer : AndroidInjector.Builder<LoginActivity>()
}