package net.com.klframe.net

import net.com.klframe.common.Constance
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Administrator on 2018/6/19 0019.
 * Retrofit工程类
 */
class RetrofitFactory private constructor() {

    companion object {
        val retrofitFacyory: RetrofitFactory by lazy { RetrofitFactory() }
    }
    public val retrofit:Retrofit
    public val interceptor:Interceptor

    init {

        interceptor= Interceptor {
            chain -> val result=chain.request()
                .newBuilder()
                .addHeader("Content_Type","application/json")
                .addHeader("charset","UTF-8")
                .build()
            chain.proceed(result)
        }

      retrofit=Retrofit.Builder()
              .baseUrl(Constance.BASE_URL)
              .addConverterFactory(GsonConverterFactory.create())
              .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
              .client(initOkhttpClient())
              .build()

    }

    private fun initOkhttpClient(): OkHttpClient? {
        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(initInterceptor())
                .connectTimeout(1000,TimeUnit.SECONDS)
                .writeTimeout(1000,TimeUnit.SECONDS)
                .build()
    }

    private fun initInterceptor(): Interceptor? {
        val lonInterceptor=HttpLoggingInterceptor()
        lonInterceptor.level=HttpLoggingInterceptor.Level.BODY
        return lonInterceptor
    }

    fun <T>create(service:Class<T>):T{
        return retrofit.create(service)
    }
}