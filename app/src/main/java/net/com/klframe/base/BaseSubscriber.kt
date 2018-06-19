package net.com.klframe.base

import rx.Observable
import rx.Subscriber

/**
 * Created by Administrator on 2018/6/19 0019.
 */
open class BaseSubscriber<T>(baseView:BaseView):Subscriber<T>(){
    var mBaseView=baseView


    override fun onError(e: Throwable?) {
        mBaseView.onError(e.toString())

    }

    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

}