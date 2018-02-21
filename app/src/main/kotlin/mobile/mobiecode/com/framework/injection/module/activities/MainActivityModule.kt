package mobile.mobiecode.com.framework.injection.module.activities

import dagger.Module
import dagger.Provides
import mobile.mobiecode.com.framework.view.main.MainActivity
import mobile.mobiecode.com.framework.view.main.MainPresenterImpl
import mobile.mobiecode.com.framework.view.main.MainView

/**
 * Created by cheasocheat on 2/21/18.
 */
@Module
class MainActivityModule {
    @Provides
    fun provideView(mainActivity: MainActivity): MainView = mainActivity

    @Provides
    fun providePresenter(mainView: MainView): MainPresenterImpl {
        return MainPresenterImpl(mainView)
    }
}