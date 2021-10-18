sealed trait Vehicule{
  val model : String}
case class Car(registration:String,model:String) extends Vehicule
case class Motorcycle(registration:String,,model:String) extends Vehicule
case class Boat(registration:String,model:String) extends Vehicule
