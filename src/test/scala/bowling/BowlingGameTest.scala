package bowling

import org.scalatest.{FlatSpec, Matchers}

class BowlingGameTest extends FlatSpec with Matchers {

  it should "test scalatest" in {
    true should be(true)
  }

  "zeros" should "score 0" in {
    val bowlingGame = new BowlingGame((List fill 20)(0))
    bowlingGame.score should be(0)
  }

  "ones" should "score 20" in {
    val bowlingGame = new BowlingGame((List fill 20)(1))
    bowlingGame.score should be(20)
  }

  "fives" should "score 150" in {
    val bowlingGame = new BowlingGame((List fill 22)(5))
    bowlingGame.score should be(150)
  }

  "strikes" should "score 300" in {
    val bowlingGame = new BowlingGame((List fill 12)(10))
    bowlingGame.score should be(300)
  }

  "1 + gutters" should "score 1" in {
    val bowlingGame = new BowlingGame(1 :: (List fill 19)(0))
    bowlingGame.score should be(1)
  }

  "first spare" should "score 20" in {
    val bowlingGame = new BowlingGame(5 :: 5 :: 5 :: (List fill 17)(0))
    bowlingGame.score should be(20)
  }

  "first strike" should "score 30" in {
    val bowlingGame = new BowlingGame(10 :: 5 :: 5 :: (List fill 17)(0))
    bowlingGame.score should be(30)
  }

  "last spare" should "score 15" in {
    val bowlingGame = new BowlingGame((5 :: 5 :: 5 :: (List fill 18)(0)) reverse)
    bowlingGame.score should be(15)
  }

  "last strike" should "score 20" in {
    val bowlingGame = new BowlingGame((5 :: 5 :: 10 :: (List fill 18)(0)) reverse)
    bowlingGame.score should be(20)
  }

}
