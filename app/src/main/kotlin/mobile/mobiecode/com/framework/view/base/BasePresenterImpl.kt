package mobile.glf.com.core.base.impl

import mobile.mobiecode.com.framework.view.base.BasePresenter
import mobile.mobiecode.com.framework.view.base.BaseView

/**
 * Created by cheasocheat on 2/13/18.
 */
open class BasePresenterImpl<V : BaseView> : BasePresenter<V> {

    protected var mView: V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}