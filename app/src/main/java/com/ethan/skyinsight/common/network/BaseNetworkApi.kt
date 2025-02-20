package com.ethan.skyinsight.common.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * 网络请求构建器基类
 */
abstract class BaseNetworkApi {

    /**
     * 配置http
     */
    private val okHttpClient: OkHttpClient
        get() {
            val builder = OkHttpClient.Builder()
            return setOkHttpClientBuilder(builder).build()
        }

    fun <T> getApi(serviceClass: Class<T>, baseUrl: String): T {
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
        return setRetrofitBuilder(retrofitBuilder).build().create(serviceClass)
    }

    /**
     * 实现重写该方法，可以添加拦截器，对OkHttpClient.Builder做任意操作
     */
    abstract fun setOkHttpClientBuilder(builder: OkHttpClient.Builder): OkHttpClient.Builder

    /**
     * 实现重写该方法，可以添加GSON解析器，Protocol，对Retrofit.Builder做任意操作
     */
    abstract fun setRetrofitBuilder(builder: Retrofit.Builder): Retrofit.Builder
}