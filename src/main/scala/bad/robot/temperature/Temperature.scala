package bad.robot.temperature

case class Temperature(celsius: Double) {
  def fahrenheit: Double = celsius * 9 / 5 + 32
}
