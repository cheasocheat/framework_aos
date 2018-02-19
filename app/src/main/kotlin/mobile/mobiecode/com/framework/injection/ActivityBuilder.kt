package mobile.mobiecode.com.framework.injection

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mobile.mobiecode.com.framework.view.home.MainActivity
import mobile.mobiecode.com.framework.view.login.LoginActivity

/**
 * Created by cheasocheat on 2/19/18.
 */

@Module
abstract class ActivityBuilder{

    @ContributesAndroidInjector
    abstract fun bindLoginActivity():LoginActivity




}