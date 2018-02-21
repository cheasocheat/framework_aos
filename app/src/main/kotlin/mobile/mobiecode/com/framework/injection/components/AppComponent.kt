package mobile.mobiecode.com.framework.injection.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import mobile.mobiecode.com.framework.AndroidApp
import mobile.mobiecode.com.framework.injection.module.ActivityBuilder
import mobile.mobiecode.com.framework.injection.module.AppModule

@Component(modules = arrayOf(
        AppModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: AndroidApp): Builder

        fun build(): AppComponent
    }

    fun inject(application: AndroidApp)
}