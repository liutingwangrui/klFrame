package net.com.klframe.net.api

import net.com.klframe.base.BaseRsp
import net.com.klframe.bean.LoginBean
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import rx.Observable

/**
 * Created by Administrator on 2018/6/19 0019.
 * 定义接口的api
 */
interface Api {

    //登录
    @FormUrlEncoded
//    @POST("app/login")
    @POST("Api/AppCrmServer/login")
    fun login(@FieldMap hashMap: HashMap<String,String>):Observable<BaseRsp<LoginBean>>
}