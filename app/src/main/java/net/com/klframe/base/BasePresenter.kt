package net.com.klframe.base

/**
 * Created by Administrator on 2018/6/19 0019.
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}