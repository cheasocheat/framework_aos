package mobile.mobiecode.com.framework.injection.module

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import mobile.mobiecode.com.framework.injection.components.LoginActivitySubComponent

import mobile.mobiecode.com.framework.view.login.LoginActivity

/**
 * Created by cheasocheat on 2/20/18.
 */
@Module(subcomponents = arrayOf(LoginActivitySubComponent::class))
 abstract class ActivityBuilder {


    @Binds
    @IntoMap
    @ActivityKey(LoginActivity::class)
    internal abstract fun bindSelectRegionActivityInjectorFactory( build:LoginActivitySubComponent.Builder): AndroidInjector.Factory<out Activity>
    /* @ContributesAndroidInjector
    abstract fun bindLogin():LoginActivity*/
}