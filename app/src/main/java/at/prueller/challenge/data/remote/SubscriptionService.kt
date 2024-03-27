package at.prueller.challenge.data.remote

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT

interface SubscriptionService {

    @GET("api/notification/events")
    suspend fun getSubscriptions(): List<NotificationSubscription>

    @PUT("api/notification/event")
    suspend fun updateSubscription(@Body subscription: NotificationSubscription): NotificationSubscription

}