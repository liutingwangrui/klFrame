package net.com.klframe.net.api

import net.com.klframe.base.BaseRsp
import net.com.klframe.bean.LoginBean
import net.com.klframe.net.RetrofitFactory
import rx.Observable

/**
 * Created by Administrator on 2018/6/19 0019.
 * 调用接口的api
 */
class ResultApi {

    //登录
    fun loginApi(userName: String, pwd: String): Observable<BaseRsp<LoginBean>> {
        val hashMap = HashMap<String, String>()
//        hashMap.put("user_name", userName)
        hashMap.put("username", userName)
        hashMap.put("password", pwd)
        return RetrofitFactory.retrofitFacyory.create(Api::class.java).login(hashMap)
    }
}