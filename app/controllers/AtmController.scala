package controllers

import com.google.inject.Inject
import models.Cash
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{AbstractController, ControllerComponents, Request}
import formats.PlayJsonFormats._
import services.AtmService

class AtmController @Inject()(cc: ControllerComponents, atmService: AtmService) extends AbstractController(cc) {
  def withdrawal = Action(parse.json) { request: Request[JsValue] =>
    val cash: Cash = request.body.as[Cash]

    atmService.withdraw(cash) match {
      case Left(e) => InternalServerError(e.getMessage)
      case Right(reducedNotes) => Ok(Json.toJson(reducedNotes))
    }
  }
}