package mobile.mobiecode.com.framework.injection.modules

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Created by cheasocheat on 2/19/18.
 */
@Module
class AppModule() {
    //Provide what ever you want

    @Provides
    fun provideResource():String="Hello World"
}