package mobile.mobiecode.com.framework.view.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import mobile.mobiecode.com.framework.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {



    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()


    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String


}
