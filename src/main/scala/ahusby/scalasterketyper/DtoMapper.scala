package ahusby.scalasterketyper

object DtoMapper {

  def kunnskapsprove(dto: Dto): Kunnskapsprove = {
    val erAvlagt = dto.kunnskapsproveErAvlagt.toBoolean
    val erAvlagtIOslo = dto.kunnskapsproveErAvlagtIOslo.toBoolean
    (erAvlagt, erAvlagtIOslo) match {
      case (true, true) => Kunnskapsprove.AvlagtIOslo
      case (true, false) => Kunnskapsprove.AvlagtUtenforOslo
      case (false, false) => Kunnskapsprove.IkkeAvlagt
      case (false, true) => throw new IllegalArgumentException()
    }
  }

  def etablererprove(dto: Dto): Etablererprove = {
    val erAvlagt = dto.etablererproveErAvlagt.toBoolean
    val erAvlagtIOslo = dto.etablererproveErAvlagtIOslo.toBoolean
    (erAvlagt, erAvlagtIOslo) match {
      case (true, true) => Etablererprove.AvlagtIOslo
      case (true, false) => Etablererprove.AvlagtUtenforOslo
      case (false, false) => Etablererprove.IkkeAvlagt
      case (false, true) => throw new IllegalArgumentException()
    }
  }

}
