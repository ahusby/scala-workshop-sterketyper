package ahusby.scalasterketyper

import ahusby.scalasterketyper.DtoMapper.{etablererprove, kunnskapsprove}

object Ovingsoppgave {

  def enProveErAvlagtIOslo(dto: Dto): Boolean = {
    val kp: Kunnskapsprove = kunnskapsprove(dto)
    val ep: Etablererprove = etablererprove(dto)
    enErAvlagtIOslo(kp, ep)
  }

  private def enErAvlagtIOslo(kp: Kunnskapsprove, ep: Etablererprove): Boolean = {
    (kp, ep) match {
      case (Kunnskapsprove.AvlagtIOslo, _) => true
      case (_, Etablererprove.AvlagtIOslo) => true
      case _ => false
    }
  }


}
