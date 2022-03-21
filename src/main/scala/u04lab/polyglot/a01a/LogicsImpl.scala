package u04lab.polyglot.a01a
import Logics.*
import u04lab.polyglot.Pair

import scala.util.Random

/** solution and descriptions at https://bitbucket.org/mviroli/oop2019-esami/src/master/a01a/sol2/
 * description: https://bitbucket.org/mviroli/oop2019-esami/src/master/a01a/sol2/Test.java*/
class LogicsImpl(private val size: Int, private val boat: Int) extends Logics:
  private val FAILURES = 5
  private var failures = 0
  private val random = Random(42)
  private val boatRow = random.nextInt(size)
  private val boatLeftCol = random.nextInt(size-boat+1)
  private var hitedPosition: List[Tuple] = List()

  println(s"x=$boatLeftCol  y=$boatRow") //x=0 y=2

  def hit(row: Int, col: Int) =
    if row == boatRow && col >= boatLeftCol && col < boatLeftCol+boat then
      hitedPosition = hitedPosition.appended((row, col))
      if hitedPosition.length == boat then Result.WON else Result.HIT
    else
      failures = failures + 1
      if failures == FAILURES then Result.LOST else Result.MISS
