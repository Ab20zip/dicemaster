package com.altiran.dicemaster

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.VBox
import javafx.stage.Stage
import org.apache.commons.math3.random.MersenneTwister

class DicemasterApp : Application() {
    private val random = MersenneTwister()
    private val diceImages = arrayOf(
        Image("/dice1.png"),
        Image("/dice2.png"),
        Image("/dice3.png"),
        Image("/dice4.png"),
        Image("/dice5.png"),
        Image("/dice6.png")
    )

    override fun start(primaryStage: Stage) {
        val diceImageView = ImageView(diceImages[0])
        val rollButton = Button("Roll Dice")

        rollButton.setOnAction {
            rollDice(diceImageView)
        }

        val root = VBox(10.0, diceImageView, rollButton)
        val scene = Scene(root, 400.0, 400.0)

        primaryStage.apply {
            title = "Dicemaster"
            this.scene = scene
            show()
        }
    }

    private fun rollDice(diceImageView: ImageView) {
        val animationDuration = 1000.0 // in milliseconds
        val startTime = System.currentTimeMillis()
        val timer = object : AnimationTimer() {
            override fun handle(now: Long) {
                val elapsed = System.currentTimeMillis() - startTime
                if (elapsed < animationDuration) {
                    val index = (elapsed / (animationDuration / 6)).toInt() % 6
                    diceImageView.image = diceImages[index]
                } else {
                    stop()
                    diceImageView.image = diceImages[random.nextInt(6)]
                }
            }
        }
        timer.start()
    }
}

fun main() {
    Application.launch(DicemasterApp::class.java)
}
