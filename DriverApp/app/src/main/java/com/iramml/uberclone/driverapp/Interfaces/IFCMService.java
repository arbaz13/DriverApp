package com.iramml.uberclone.driverapp.Interfaces;

import com.iramml.uberclone.driverapp.Model.FCMResponse;
import com.iramml.uberclone.driverapp.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAhKEM7hM:APA91bEZE0olKV0evrjiD1Ush67PqUT-S7RGOGr1HhrjUNCl8JV0rJFKqQ3DrzSsm8Lh9x3Ym_brNgWNElIuoOt7OrUvOuiRr9nO2cCAY_N0Qe1hEXxeMkcG3kaEYUKvz5ZIXmmWRFn_"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
