# recfun

object Session {
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) {
      0
    } else if (c == r) {
      1
    } else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  pascal(1, 3)

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

  val list: List[Char] = (")()()()()()()()".toCharArray).toList

  balance(list)

  def countChange(money: Int, coins: List[Int]): Int = {
    //money coins denominations
    val currentCoinDenomination = coins.head;
    var index:Int = 1;
    while(currentCoinDenomination*index <= money) {

    }
    0
  }
}
