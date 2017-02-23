package controllers

import java.io.File
import javax.inject.Inject

import io.swagger.annotations.{Api, ApiParam, ApiResponse, ApiResponses}
import models.{ProjectRepo, TaskRepo}
import play.api.mvc.{Action, Controller}
import play.routes.compiler.{InjectedRoutesGenerator, Rule, StaticRoutesGenerator}
import play.routes.compiler.RoutesCompiler.RoutesCompilerTask

@Api(value = "APIHome", hidden = true)
class APIHome @Inject() extends Controller {

  @ApiResponses(Array(
    new ApiResponse(code = 200, message = "Successfully Get API HomePage"),
    new ApiResponse(code = 400, message = "Failed to Get API HomePage"),
    new ApiResponse(code = 404, message = "Can't get API HomePage"))
  )
  def gotoApiHome = Action { implicit request =>
    Ok(views.html.swagger())
  }


  def test() =Action{ implicit req =>
    val file = new File("")
  val task = RoutesCompilerTask(file, Seq.empty[String], forwardsRouter= true, reverseRouter =false, namespaceReverseRouter = false )

    //def generate(task: RoutesCompilerTask, namespace: Option[String], rules: List[Rule]): Seq[(String, String)] = {
  StaticRoutesGenerator.generate(task, namespace = None, rules = List.empty[Rule])
    Ok(views.html.swagger())
  }

}
