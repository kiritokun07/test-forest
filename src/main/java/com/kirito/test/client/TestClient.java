package com.kirito.test.client;

import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Var;

/**
 * forest client
 */
public interface TestClient {

    @Post(value = "{url}")
    String doPost(@Var("url") String url);

}
