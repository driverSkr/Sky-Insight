package com.ethan.skyinsight.common.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * 网络基础服务配置
 */
object ServiceCreator {

    val httpClient= OkHttpClient.Builder()

    private val builder = Retrofit.Builder()

}