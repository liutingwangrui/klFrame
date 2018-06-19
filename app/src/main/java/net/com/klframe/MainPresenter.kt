package net.com.klframe

import net.com.klframe.base.BasePresenter
import net.com.klframe.base.BaseRsp
import net.com.klframe.base.BaseSubscriber
import net.com.klframe.bean.LoginBean
import net.com.klframe.common.excute
import net.com.klframe.net.api.ResultApi

/**
 * Created by Administrator on 2018/6/19 0019.
 * 具体页面的P层
 */
class MainPresenter: BasePresenter<MainView>() {
     var resultApi=ResultApi()
    /**
     * 业务逻辑的处理--以登录为例
     */
    fun login(userName:String,pwd:String){

        resultApi.loginApi(userName,pwd).excute(object : BaseSubscriber<BaseRsp<LoginBean>>() {
            override fun onNext(t: BaseRsp<LoginBean>) {
                if (t.statu==200){
                    mView.onLoginSuccess(t.data)
                }else{
                    mView.onError()
                }
            }
        })


    }

}