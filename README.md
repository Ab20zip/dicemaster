# Dicemaster

Dicemaster is a sophisticated and visually appealing dice rolling application built with Kotlin and JavaFX. It offers a
smooth animation and utilizes a complex algorithm to ensure completely unbiased dice rolls.

## Features

- **Unbiased Dice Rolls**: Uses the Mersenne Twister algorithm for random number generation, ensuring true randomness.
- **Smooth Animation**: Provides a visually pleasing rolling animation before displaying the final result.
- **User-Friendly Interface**: Simple and intuitive design, making it easy for users of all ages to enjoy.
- **Cross-Platform**: Works seamlessly on Windows, macOS, and Linux.

## Getting Started

### Prerequisites

- JDK 17
- Gradle 8.8

### Installation

1. **Clone the repository:**

```sh
git clone https://github.com/Ab20zip/dicemaster.git
cd dicemaster
```

2. **Build the project:**

```sh
./gradlew build
```

3. **Run the application:**

```sh
./gradlew run
```

## Screenshot

![Dicemaster Screenshot](https://raw.githubusercontent.com/Ab20zip/dicemaster/main/screenshots/dicemaster.png)

## Project Structure

```
Dicemaster
├── src
│   ├── main
│   │   ├── kotlin
│   │   │   └── com
│   │   │       └── altiran
│   │   │           └── dicemaster
│   │   │               └── DicemasterApp.kt
│   │   └── resources
│   │       └── dice1.png
│   │       └── dice2.png
│   │       └── dice3.png
│   │       └── dice4.png
│   │       └── dice5.png
│   │       └── dice6.png
│   └── test
│       └── kotlin
│           └── com
│               └── altiran
│                   └── dicemaster
│                       └── DiceRollTest.kt
├── build.gradle.kts
├── README.md
└── LICENSE.md
```

## Detailed Description

### Dice Rolling Algorithm

Dicemaster uses the Mersenne Twister algorithm, which is renowned for its high-quality random number generation. This
ensures that each dice roll is completely unbiased, providing a fair experience for all users.

### Animation

The dice rolling animation lasts for 1 second, during which the dice images cycle rapidly, mimicking the experience of a
real dice roll. This not only adds a layer of excitement but also enhances the overall user experience.

### User Interface

The interface consists of:

1. **Dice ImageView**: Displays the current face of the dice.

2. **Roll Button**: When clicked, initiates the dice roll animation and updates the dice face to a random number between
   1 and 6.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License

This project, "Dicemaster" is licensed under the MIT License.
See [LICENSE.md](https://raw.githubusercontent.com/Ab20zip/dicemaster/main/LICENSE.md) for details.

### Dice Images License

The six dice images used in this project are owned by Delapouite and are licensed under the Creative Commons Attribution
3.0 Unported License (CC BY 3.0).

- Dice images sourced
  from: [Delapouite on Game-icons.net](https://game-icons.net/1x1/delapouite/dice-six-faces-one.html).

#### Attribution

- Dice images by [Delapouite](https://game-icons.net/1x1/delapouite.html)
- License: [CC BY 3.0](https://creativecommons.org/licenses/by/3.0/)

---

Enjoy using Dicemaster for your gaming sessions or random number generation needs! 🎲

<!-- MADE WITH ❤️ BY Ab20zip -->
