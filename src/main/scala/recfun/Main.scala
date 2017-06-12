package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) {
      0
    } else if (c == r) {
      1
    } else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def loop(chars: List[Char], acc: Int): Int = {
      if (chars.isEmpty) return acc
      if (chars.head == '(') {
        loop(chars.tail, acc + 1)
      } else if (chars.head == ')') {
        if (acc > 0)
          loop(chars.tail, acc - 1)
        else
          -1
      } else
        loop(chars.tail, acc)
    }

    loop(chars, 0) == 0
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
