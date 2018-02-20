package mobile.mobiecode.com.framework.view.base

/**
 * Created by cheasocheat on 2/14/18.
 */
interface BasePresenter<in V : BaseView> {
    fun attachView(view: V)

    fun detachView()
}