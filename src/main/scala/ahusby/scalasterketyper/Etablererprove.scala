package ahusby.scalasterketyper

sealed trait Etablererprove

object Etablererprove {

  final case object IkkeAvlagt extends Etablererprove

  final case object AvlagtUtenforOslo extends Etablererprove

  final case object AvlagtIOslo extends Etablererprove

}
