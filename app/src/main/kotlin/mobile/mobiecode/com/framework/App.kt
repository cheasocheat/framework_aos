package mobile.mobiecode.com.framework

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import mobile.mobiecode.com.framework.injection.components.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by cheasocheat on 2/19/18.
 */
class App : Application(), HasActivityInjector{

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }

    override fun activityInjector() = activityInjector
}