package com.basemoudle.sample.api;



import com.basemoudle.sample.bean.User;
import com.xusangbo.basemoudle.base.BaseRespose;

import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by boxu on 2017/4/4.
 */

public interface ApiService {
    @POST("Home/User/login")
    Observable<BaseRespose<User>> postData();
}
