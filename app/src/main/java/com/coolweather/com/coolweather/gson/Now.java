package com.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cwd5518234 on 2017-06-28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
