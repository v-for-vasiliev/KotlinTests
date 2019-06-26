package ru.cats.tests

import ru.cats.tests.incapsulation.Animal
import ru.cats.tests.incapsulation.Cat
import ru.cats.tests.incapsulation.Wolf
import ru.cats.tests.inheritance.Spotify
import ru.cats.tests.inheritance.SpotifyPremium
import ru.cats.tests.polymorphism.Shape
import ru.cats.tests.polymorphism.Triangle

fun main(args: Array<String>) {
    incapsulationTest()
    inheritanceTest()
    polymorphismTest()
}

fun incapsulationTest() {
    val cat: Animal = Cat()
    val wolf: Animal = Wolf()

    triggerAnimal(cat)
    triggerAnimal(wolf)
}

fun triggerAnimal(animal: Animal) {
    animal.say()
}

fun inheritanceTest() {
    val spotify: Spotify = Spotify()
    val spotifyPremium: SpotifyPremium = SpotifyPremium()

    spotify.playShuffle()
    spotifyPremium.playShuffle()
    spotifyPremium.playQueued()
}

fun polymorphismTest() {
    val shape: Shape = Shape()
    val triangle: Triangle = Triangle()

    println(shape.getName())
    println(triangle.getName())
}