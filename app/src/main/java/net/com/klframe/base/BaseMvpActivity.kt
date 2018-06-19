package net.com.klframe.base

import android.widget.Toast

/**
 * Created by Administrator on 2018/6/19 0019.
 * 基类MVP  Activity
 */
abstract class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError(s:String) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()

    }

}