package com.example.text1;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Myservice {
    String geturl="http://yun918.cn/ks/";
    //http://yun918.cn/ks/jiekou.json
    //http://yun918.cn/ks/jiekou.json
    @GET("jiekou.json")
    Observable<PicBean> getPic();
}
