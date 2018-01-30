package services

import models.{Cash, ReducedNotes}

trait AtmService {
  def withdraw(cash: Cash): Either[Exception, ReducedNotes]
}