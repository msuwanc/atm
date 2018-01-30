package models

import utils.Constants

abstract class Note {
  def twenty: Long
  def fifty: Long
  def hundred: Long
  def five_hundred: Long
  def thousand: Long
}

case class Notes(twenty: Long, fifty: Long, hundred: Long, five_hundred: Long, thousand: Long) extends Note {
  require(twenty > 0, Constants.TwentyNoteInvalidMessage)
  require(fifty > 0, Constants.FiftyNoteInvalidMessage)
  require(hundred > 0, Constants.HundredNoteInvalidMessage)
  require(five_hundred > 0, Constants.FiveHundredNoteInvalidMessage)
  require(thousand > 0, Constants.ThousandNoteInvalidMessage)
}

case class ReducedNotes(twenty: Long, fifty: Long, hundred: Long, five_hundred: Long, thousand: Long) extends Note {
  require(twenty > -1, Constants.ReducedNoteInvalidMessage)
  require(fifty > -1, Constants.ReducedNoteInvalidMessage)
  require(hundred > -1, Constants.ReducedNoteInvalidMessage)
  require(five_hundred > -1, Constants.ReducedNoteInvalidMessage)
  require(thousand > -1, Constants.ReducedNoteInvalidMessage)
}