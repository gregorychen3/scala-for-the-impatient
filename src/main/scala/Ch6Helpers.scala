object Conversions {
  private val CENTIMETERS_PER_INCH = 2.54
  private val LITERS_PER_GALLON = 3.78541
  private val KILOMETERS_PER_MILE = 1.60934

  def inchesToCentimeters(inches: Double) = inches * CENTIMETERS_PER_INCH

  def gallonsToLiters(gallons: Double) = gallons * LITERS_PER_GALLON

  def milesToKilometers(miles: Double) = miles * KILOMETERS_PER_MILE
}

abstract class UnitConversion(val conversionFactor: Double) {
  def apply(toConvert: Double) = toConvert * conversionFactor
}

object InchesToCentimeters extends UnitConversion(2.54)

object GallonsToLiters extends UnitConversion(3.78541)

object MilesToKilometers extends UnitConversion(1.60934)

class Point(val x: Double, val y: Double) {}

object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
}
