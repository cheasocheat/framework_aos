package mobile.mobiecode.com.framework.injection.components

import dagger.Component
import dagger.android.AndroidInjector
import mobile.mobiecode.com.framework.App
import mobile.mobiecode.com.framework.injection.modules.AppModule
import javax.inject.Singleton

/**
 * Created by cheasocheat on 2/19/18.
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

   /* @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
    */
   @Component.Builder
   abstract class Builder : AndroidInjector.Builder<App>()

}