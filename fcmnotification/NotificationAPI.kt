package com.example.fcmnotification

import com.example.fcmnotification.Constants.Companion.CONTENT_TYPE
import com.example.fcmnotification.Constants.Companion.SERVER_KEY
import okhttp3.ResponseBody


import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationAPI {

    @Headers("Authorization: key=$SERVER_KEY", "Content-Type:$CONTENT_TYPE")
    @POST("fcm/send")   // will be attached to base url at the end and request will be posted to that url
    suspend fun postNotification(
        @Body notification: PushNotification
    ): Response<ResponseBody>
}