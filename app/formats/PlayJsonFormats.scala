package formats

import models.{Cash, Notes}
import play.api.libs.json.{Format, Json}

object PlayJsonFormats {
  implicit val cashFormat: Format[Cash] = Json.format[Cash]
  implicit val reducedNotesFormat: Format[Notes] = Json.format[Notes]
}