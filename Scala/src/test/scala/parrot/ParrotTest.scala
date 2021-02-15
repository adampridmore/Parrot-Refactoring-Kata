package parrot

import org.scalatest.matchers.should.Matchers
import org.scalatest.flatspec.AnyFlatSpec

class ParrotTest extends AnyFlatSpec with Matchers {

  it should "getSpeedOfEuropeanParrot" in {
    val parrot = new EuropeanParrot()
    parrot.speed shouldEqual 12.0
  }

  it should "getSpeedOfAfricanParrot_With_One_Coconut" in {
    val parrot = new AfricanParrot(1)
    parrot.speed shouldEqual 3.0
  }

  it should "getSpeedOfAfricanParrot_With_Two_Coconuts" in {
    val parrot = new AfricanParrot(2)
    parrot.speed shouldEqual 0.0
  }

  it should "getSpeedOfAfricanParrot_With_No_Coconuts" in {
    val parrot = new AfricanParrot(0)
    parrot.speed shouldEqual 12.0
  }

  it should "getSpeedNorwegianBlueParrot_nailed" in {
    val parrot = new NorwegianBlueParrot(1.5, true)
    parrot.speed shouldEqual 0.0;
  }

  it should "getSpeedNorwegianBlueParrot_not_nailed" in {
    val parrot = new NorwegianBlueParrot(1.5, false)
    parrot.speed shouldEqual 18.0
  }

  it should "getSpeedNorwegianBlueParrot_not_nailed_high_vvoltage" in {
    val parrot = new NorwegianBlueParrot(4, false)
    parrot.speed shouldEqual 24.0
  }
}
