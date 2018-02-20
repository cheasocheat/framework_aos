package mobile.mobiecode.com.framework

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import mobile.mobiecode.com.framework.injection.components.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by cheasocheat on 2/20/18.
 */

class AndroidApp : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }


    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector
}