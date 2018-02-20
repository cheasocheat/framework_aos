package mobile.mobiecode.com.framework

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by cheasocheat on 2/19/18.
 */
class App : Application(), HasActivityInjector{

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
//        DaggerAppComponent.builder().application(this).build().inject(this)
        DaggerAppComponent.builder().create(this).inject(this)
    }

    override fun activityInjector() = activityInjector
}