package mobile.mobiecode.com.framework.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cheasocheat on 2/20/18.
 */
@Module
class AppModule {

    @Provides
    fun provideBaseURL() = "https://raw.githubusercontent.com/VisalGGEZ/udemy-forum/master/"
}