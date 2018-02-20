package mobile.mobiecode.com.framework.injection.modules

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import mobile.mobiecode.com.framework.App
import mobile.mobiecode.com.framework.injection.scope.PerActivity
import mobile.mobiecode.com.framework.view.login.LoginActivity
import javax.inject.Singleton

/**
 * Created by cheasocheat on 2/19/18.
 * Provides application-wide dependencies.
 */
@Module(includes = [AndroidSupportInjectionModule::class])
abstract class AppModule() {

    @Binds
    @Singleton
    abstract fun application(app : App) : Application

    @PerActivity
    @ContributesAndroidInjector()
    abstract fun loginActivityInjector() : LoginActivity
}