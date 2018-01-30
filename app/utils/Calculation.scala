package utils

import models.{Notes, ReducedNotes}

import scala.util.{Failure, Success, Try}

object Calculation {
  def calculateAvailableCash(notes: Notes): Long = {
    (notes.twenty*Constants.TwentyValue)+
      (notes.fifty*Constants.FiftyValue)+
      (notes.hundred*Constants.HundredValue)+
      (notes.fiveHundred*Constants.FiveHundredValue)+
      (notes.thousand*Constants.ThousandValue)
  }

  def calculateNotes(currentNotes: Notes, reducedNotes: ReducedNotes): Notes = {
    currentNotes.copy(
      currentNotes.twenty - reducedNotes.twenty,
      currentNotes.fifty - reducedNotes.fifty,
      currentNotes.hundred - reducedNotes.hundred,
      currentNotes.fiveHundred - reducedNotes.fiveHundred,
      currentNotes.thousand - reducedNotes.thousand
    )
  }
}