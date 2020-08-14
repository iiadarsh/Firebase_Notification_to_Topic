package com.example.fcmnotification

data class PushNotification(
    val data: NotificationData,
    val to: String
)