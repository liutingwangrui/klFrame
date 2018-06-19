package net.com.klframe.base

/**
 * Created by Administrator on 2018/6/19 0019.
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(s:String)
}