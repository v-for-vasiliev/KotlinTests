package ru.cats.tests.inheritance

class SpotifyPremium() : Spotify() {
    fun playQueued() {
        println("Queued play")
    }
}