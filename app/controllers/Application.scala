package controllers

import javax.inject.Inject

import io.swagger.annotations.{Api, ApiParam, ApiResponse, ApiResponses}
import io.swagger.models.Path
import models.{ProjectRepo, TaskRepo}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc.{Action, Controller}
import play.api.i18n.{Messages}

@Api(value = "application123" ,hidden = false, produces ="application_produces/json")
class Application @Inject()( projectRepo: ProjectRepo, taskRepo: TaskRepo) extends Controller {

  def testFun():Unit ={
    //val title = Messages("home.title")

    //class MyController @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {
    // }
    //info.error=You aren''t logged in!
    //example.formatting=When using MessageFormat, '''{0}''' is replaced with the first parameter.
  }

  def addTaskToProject(color: String,
                       projectId: Long) = Action.async { implicit rs =>
    projectRepo.addTask(color, projectId).map{ _ =>  Redirect(routes.Application.projects(projectId)) }
  }

  def modifyTask(taskId: Long,
                 color: Option[String]) = Action.async { implicit rs =>
    taskRepo.partialUpdate(taskId, color, None).map(i =>
    Ok(s"Rows affected : $i"))
  }

  def createProject(name: String)= Action.async { implicit rs =>
    projectRepo.create(name).map(id => Ok(s"project $id created") )
  }

  @ApiResponses(Array(
    new ApiResponse(code = 200, message = "Good response to get projects"),
    new ApiResponse(code = 400, message = "Invalid Project ID supplied"),
    new ApiResponse(code = 404, message = "Project not found"))
  )
  def listProjects = Action.async { implicit rs =>
    projectRepo.all.map(projects => Ok(
        //views.html.projects(projects)
      views.html.swagger()
    ))
  }

  @ApiResponses(Array(
    new ApiResponse(code = 200, message = "Good response to get projects"),
    new ApiResponse(code = 400, message = "Invalid Project ID supplied"),
    new ApiResponse(code = 404, message = "Project not found"))
  )
  def projects(@ApiParam(value = "ID of the project to fetch")id: Long) = Action.async { implicit rs =>
    for {
      Some(project) <-  projectRepo.findById(id)
      tasks <- taskRepo.findByProjectId(id)
    } yield Ok(
      //views.html.project(project, tasks)
        views.html.swagger()
    )
  }

  @ApiResponses(Array(
    new ApiResponse(code = 400, message = "Invalid Project Name supplied"),
    new ApiResponse(code = 404, message = "Project not exist"))
  )
  def delete(@ApiParam(value = "Name of the project to delete")name: String) = Action.async { implicit rs =>
    projectRepo.delete(name).map(num => Ok(s"$num projects deleted"))
  }


}
