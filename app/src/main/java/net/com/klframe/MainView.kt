package net.com.klframe

import net.com.klframe.base.BaseView
import net.com.klframe.bean.LoginBean

/**
 * Created by Administrator on 2018/6/19 0019.
 */
interface MainView:BaseView {
    fun onLoginSuccess(loginBean: LoginBean)
}