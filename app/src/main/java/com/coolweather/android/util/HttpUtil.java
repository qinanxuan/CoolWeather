package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @version $
 * @Created by HTZ on 2020/3/17 21:14
 * @package_name com.coolweather.android.util
 * @des 发送http请求
 */
public class HttpUtil {
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
