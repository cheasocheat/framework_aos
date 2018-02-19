package mobile.mobiecode.com.framework.injection.components

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import dagger.android.support.AndroidSupportInjectionModule
import mobile.mobiecode.com.framework.App
import mobile.mobiecode.com.framework.injection.ActivityBuilder
import mobile.mobiecode.com.framework.injection.modules.AppModule

/**
 * Created by cheasocheat on 2/19/18.
 */
@Singleton
@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }


    fun inject(app: App)
}