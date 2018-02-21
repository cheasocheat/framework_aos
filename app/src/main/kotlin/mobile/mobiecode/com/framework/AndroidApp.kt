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
    override fun activityInjector()=activityInjector

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

DaggerAppComponent.builder().application(this).build().inject(this)


    }



}