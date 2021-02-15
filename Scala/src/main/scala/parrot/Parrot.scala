package parrot

trait Parrot {
  def speed: Double = 12.0
  protected def loadFactor: Double = 9.0
}

class EuropeanParrot extends Parrot

class AfricanParrot(val numberOfCoconuts: Int) extends Parrot {
  override def speed: Double = Math.max(0, super.speed - loadFactor * numberOfCoconuts)
}
class NorwegianBlueParrot(voltage: Double, isNailed: Boolean) extends Parrot {
 override def speed: Double = 
    if (isNailed) 0
    else Math.min(24.0, voltage * super.speed)
}
