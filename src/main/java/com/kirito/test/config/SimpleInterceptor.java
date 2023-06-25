package com.kirito.test.config;

import com.dtflys.forest.http.ForestRequest;
import com.dtflys.forest.interceptor.Interceptor;
import com.kirito.test.utils.AuthUtil;

public class SimpleInterceptor<T> implements Interceptor<T> {

    @Override
    public boolean beforeExecute(ForestRequest request) {
        request.addHeader(AuthUtil.getHeaders());
        return true;
    }


}
