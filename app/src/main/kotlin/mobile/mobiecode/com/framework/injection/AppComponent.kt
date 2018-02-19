package mobile.mobiecode.com.framework.injection

import android.content.res.Resources
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton
import dagger.android.support.AndroidSupportInjectionModule
/**
 * Created by cheasocheat on 2/19/18.
 */
@Singleton
@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: App):Builder

        fun build(): AppComponent
    }


    fun inject(app:App)
}