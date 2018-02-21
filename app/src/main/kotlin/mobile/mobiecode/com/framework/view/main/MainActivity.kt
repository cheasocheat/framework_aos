package mobile.mobiecode.com.framework.view.main

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mobile.mobiecode.com.framework.R
import mobile.mobiecode.com.framework.view.base.BaseActivity

class MainActivity : BaseActivity<MainView, MainPresenter>() , MainView {

//    @Inject
//    lateinit var welcomeMsg : String

   /* companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }*/
   override var presenter: MainPresenter = MainPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
       // sample_text.text = stringFromJNI()
        sample_text.text = "Hellos"

    }



}
