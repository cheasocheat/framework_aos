package mobile.mobiecode.com.framework.view.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by cheasocheat on 2/14/18.
 */
abstract class BaseActivity<in V : BaseView, P : BasePresenter<V>> : AppCompatActivity() , BaseView{

    protected abstract var presenter: P

    override fun getContext(): Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }


}