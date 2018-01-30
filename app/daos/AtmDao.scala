package daos

import models.{Atm, ReducedNotes}

trait AtmDao {
  def remove(notes: ReducedNotes): Either[Exception, Atm]
}