package org.hse.template.client.rest.model

data class Match(
    val matchId: Long,
    val playerSlot: Int,
    val radiantWin: Boolean,
    val duration: Int,
    val gameMode: Int,
    val lobbyType: Int,
    val heroId: Int,
    val startTime: Int,
    val version: Int?,
    val kills: Int,
    val deaths: Int,
    val assists: Int,
    val averageRank: Int,
    val leaverStatus: Int,
    val partySize: Int?
)