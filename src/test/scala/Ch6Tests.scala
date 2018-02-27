import org.scalatest._

class Ch6Ex1Test extends FunSuite {
  test("0 inches should be 0 centimeters") {
    val inches = 0
    assert(Conversions.inchesToCentimeters(inches) == 0)
  }

  test("0 gallons should be 0 liters") {
    val gallons = 0
    assert(Conversions.gallonsToLiters(gallons) == 0)
  }

  test("0 miles should be 0 kilometers") {
    val miles = 0
    assert(Conversions.milesToKilometers(miles) == 0)
  }

  test("1 inches should be 2.54 centimeters") {
    val inches = 1
    assert(Conversions.inchesToCentimeters(inches) == 2.54)
  }

  test("1 gallons should be 3.78541 liters") {
    val gallons = 1
    assert(Conversions.gallonsToLiters(gallons) == 3.78541)
  }

  test("1 miles should be 1.60934 kilometers") {
    val miles = 1
    assert(Conversions.milesToKilometers(miles) == 1.60934)
  }

  test("1.5 inches should be 3.81 centimeters") {
    val inches = 1.5
    assert(Conversions.inchesToCentimeters(inches) == 3.81)
  }

  test("1.5 gallons should be 5.67812 liters") {
    val gallons = 1.5
    assert(Conversions.gallonsToLiters(gallons) == 5.678115)
  }

  test("1.5 miles should be 2.41402 kilometers") {
    val miles = 1.5
    assert(Conversions.milesToKilometers(miles) == 2.41401)
  }
}
