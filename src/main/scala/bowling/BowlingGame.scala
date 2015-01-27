package bowling

import scala.annotation.tailrec

class BowlingGame(val pins: List[Int]) {

  def score = {

    @tailrec
    def _score(pins: List[Int], frame: Int, score: Int): Int = {

      if (frame > 10) {
        return score
      }

      pins match {
        case 10 :: x :: y :: xs => _score(x :: y :: xs, frame + 1, score + 10 + x + y)
        case x :: y :: z :: xs if x + y == 10 => _score(z :: xs, frame + 1, score + 10 + z)
        case x :: y :: xs => _score(xs, frame + 1, score + x + y)
        case _ => throw new IllegalStateException("ill-formed sequence of rolls")
      }

    }

    // Starts at frame 1 and score 0
    _score(pins, 1, 0)

  }

}
