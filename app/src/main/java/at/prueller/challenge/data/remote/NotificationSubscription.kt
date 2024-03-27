package at.prueller.challenge.data.remote

import kotlinx.serialization.SerialName

data class NotificationSubscription(
    @SerialName("id") val id: String,
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("enabled") val enabled: Boolean,
    @SerialName("channels") val channels: List<String>,
)