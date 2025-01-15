// CalculatorTest.scala
import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite {
  test("Addition should work correctly") {
    val calculator = new Calculator()
    assert(calculator.add(2, 3) == 5)
  }

  test("Multiplication should work correctly") {
    val calculator = new Calculator()
    assert(calculator.multiply(4, 5) == 20)
  }
}
