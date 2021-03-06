package org.pfcoperez.scalawk.transitions

import org.pfcoperez.scalawk.AwkCommand
import org.pfcoperez.scalawk.entities.AwkExpression
import org.pfcoperez.scalawk.states.SolidCommand

object ToSolidCommand {
  implicit def toSolidCommand(x: AwkCommand with ToSolidCommand): SolidCommand = new SolidCommand(x)
}

trait ToSolidCommand {
  self: AwkCommand =>

  def arePresentedAs(printElements: AwkExpression*): SolidCommand =
    new SolidCommand(printElements, self)

}
