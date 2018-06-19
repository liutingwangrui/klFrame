package net.com.klframe

import net.com.klframe.base.BaseMvpActivity
import net.com.klframe.bean.LoginBean

class MainActivity : BaseMvpActivity<MainPresenter>(),MainView {
   var mainPresenter=MainPresenter()
    override fun onLoginSuccess(loginBean: LoginBean) {
        //登录陈宫之后回调的处理
    }

    override fun getLayoutID():Int= R.layout.activity_main

    override fun init() {
        mainPresenter.mView=this
        mainPresenter.login("crm456","crm123")

    }


}
