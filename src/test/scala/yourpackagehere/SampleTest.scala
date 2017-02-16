package yourpackagehere

import org.scalatest.{FlatSpec, Matchers}


class SampleTest extends FlatSpec with Matchers {

  it should "be happy" in {
    println("I love tests")
  }
}