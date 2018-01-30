package formats

import models.{Cash, ReducedNotes}
import play.api.libs.json.{Format, Json}

object PlayJsonFormats {
  implicit val cashFormat: Format[Cash] = Json.format[Cash]
  implicit val reducedNotesFormat: Format[ReducedNotes] = Json.format[ReducedNotes]
}