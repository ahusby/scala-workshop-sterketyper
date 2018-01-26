package ahusby.scalasterketyper

sealed trait Kunnskapsprove

object Kunnskapsprove {

  final case object IkkeAvlagt extends Kunnskapsprove

  final case object AvlagtUtenforOslo extends Kunnskapsprove

  final case object AvlagtIOslo extends Kunnskapsprove

}