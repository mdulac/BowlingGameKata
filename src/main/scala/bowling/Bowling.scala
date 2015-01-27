package bowling

object Bowling {

  def main(args: Array[String]) {

    val game: BowlingGame = new BowlingGame((List fill 20)(0))
    val game2: BowlingGame = new BowlingGame((List fill 20)(1))
    val game3: BowlingGame = new BowlingGame((List fill 20)(2))
    val game4: BowlingGame = new BowlingGame((List fill 20)(5))
    val game5: BowlingGame = new BowlingGame(
      1 :: 0 :: // 1
        4 :: 2 :: // 7
        3 :: 4 :: // 14
        6 :: 4 :: // 24 (24 + 0)
        0 :: 1 :: // 25
        10 :: // 37 (27 + 1 + 1)
        1 :: 1 :: // 39
        2 :: 8 :: // 52 (49 + 3)
        3 :: 3 :: // 58
        3 :: 7 :: 5 :: // 73 !!
        Nil)

    println("Game 1 : " + game.score)
    println("Game 2 : " + game2.score)
    println("Game 3 : " + game3.score)
    println("Game 4 : " + game4.score)
    println("Game 5 : " + game5.score)

  }

}
