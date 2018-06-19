package net.com.klframe.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Administrator on 2018/6/19 0019.
 * 基类
 */
abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())
        init()
    }

    abstract fun init()

    abstract fun getLayoutID(): Int
}