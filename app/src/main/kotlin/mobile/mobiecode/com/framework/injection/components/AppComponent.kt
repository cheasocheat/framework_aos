package mobile.mobiecode.com.framework.injection.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import mobile.mobiecode.com.framework.AndroidApp
import mobile.mobiecode.com.framework.injection.module.ActivityBuilder
import mobile.mobiecode.com.framework.injection.module.AppModule
import javax.inject.Singleton

/**
 * Created by cheasocheat on 2/20/18.
 */

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent //Must have
    }


    fun inject(app : AndroidApp)
}