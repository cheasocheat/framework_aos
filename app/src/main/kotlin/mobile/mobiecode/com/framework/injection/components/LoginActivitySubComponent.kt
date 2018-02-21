package mobile.mobiecode.com.framework.injection.components

import dagger.Subcomponent
import dagger.android.AndroidInjector
import mobile.mobiecode.com.framework.view.login.LoginActivity

/**
 * Created by Chivorn on 7/6/2017.
 */

@Subcomponent
interface LoginActivitySubComponent : AndroidInjector<LoginActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<LoginActivity>()
}
