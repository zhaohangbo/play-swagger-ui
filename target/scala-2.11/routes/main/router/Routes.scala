
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-slick3-example/conf/routes
// @DATE:Wed Feb 22 18:59:25 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  APIHome_2: controllers.APIHome,
  // @LINE:5
  ApiHelpController_3: controllers.ApiHelpController,
  // @LINE:17
  Application_1: controllers.Application,
  // @LINE:26
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    APIHome_2: controllers.APIHome,
    // @LINE:5
    ApiHelpController_3: controllers.ApiHelpController,
    // @LINE:17
    Application_1: controllers.Application,
    // @LINE:26
    Assets_0: controllers.Assets
  ) = this(errorHandler, APIHome_2, ApiHelpController_3, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, APIHome_2, ApiHelpController_3, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.APIHome.gotoApiHome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """swagger.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/""" + "$" + """path<[^/]+>""", """controllers.ApiHelpController.getResource(path:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """en/swagger.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ch/swagger.json""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """swagger.json?lang=en""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """swagger.json?lang=fr""", """controllers.ApiHelpController.getResources"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application""", """controllers.Application.listProjects"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application/projects/""" + "$" + """name<[^/]+>""", """controllers.Application.createProject(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application/projects/list""", """controllers.Application.listProjects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application/projects/""" + "$" + """id<[^/]+>""", """controllers.Application.projects(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application/projects/""" + "$" + """id<[^/]+>/""" + "$" + """name<[^/]+>""", """controllers.Application.addTaskToProject(name:String, id:Long)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application/tasks/""" + "$" + """id<[^/]+>""", """controllers.Application.modifyTask(id:Long, color:Option[String] = None)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """application/projects/""" + "$" + """name<[^/]+>""", """controllers.Application.delete(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/swagger/dist/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger/dist", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/swagger/dist/images/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger/dist/images", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/swagger/dist/css/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger/dist/css", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/swagger/dist/lib/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger/dist/lib", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/swagger/dist/lang/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger/dist/lang", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/swagger/dist/fonts/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/swagger/dist/fonts", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_APIHome_gotoApiHome0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_APIHome_gotoApiHome0_invoker = createInvoker(
    APIHome_2.gotoApiHome,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.APIHome",
      "gotoApiHome",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ApiHelpController_getResources1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources1_invoker = createInvoker(
    ApiHelpController_3.getResources,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      """""",
      this.prefix + """swagger.json"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ApiHelpController_getResource2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/"), DynamicPart("path", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiHelpController_getResource2_invoker = createInvoker(
    ApiHelpController_3.getResource(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResource",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/""" + "$" + """path<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ApiHelpController_getResources3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("en/swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources3_invoker = createInvoker(
    ApiHelpController_3.getResources,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      """""",
      this.prefix + """en/swagger.json"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ApiHelpController_getResources4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ch/swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources4_invoker = createInvoker(
    ApiHelpController_3.getResources,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      """""",
      this.prefix + """ch/swagger.json"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ApiHelpController_getResources5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json?lang=en")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources5_invoker = createInvoker(
    ApiHelpController_3.getResources,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      """""",
      this.prefix + """swagger.json?lang=en"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ApiHelpController_getResources6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json?lang=fr")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources6_invoker = createInvoker(
    ApiHelpController_3.getResources,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiHelpController",
      "getResources",
      Nil,
      "GET",
      """""",
      this.prefix + """swagger.json?lang=fr"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_listProjects7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application")))
  )
  private[this] lazy val controllers_Application_listProjects7_invoker = createInvoker(
    Application_1.listProjects,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "listProjects",
      Nil,
      "GET",
      """""",
      this.prefix + """application"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_createProject8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_createProject8_invoker = createInvoker(
    Application_1.createProject(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createProject",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """application/projects/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_listProjects9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application/projects/list")))
  )
  private[this] lazy val controllers_Application_listProjects9_invoker = createInvoker(
    Application_1.listProjects,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "listProjects",
      Nil,
      "GET",
      """""",
      this.prefix + """application/projects/list"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_projects10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application/projects/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_projects10_invoker = createInvoker(
    Application_1.projects(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "projects",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """application/projects/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_addTaskToProject11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application/projects/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_addTaskToProject11_invoker = createInvoker(
    Application_1.addTaskToProject(fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addTaskToProject",
      Seq(classOf[String], classOf[Long]),
      "PUT",
      """""",
      this.prefix + """application/projects/""" + "$" + """id<[^/]+>/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_modifyTask12_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application/tasks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_modifyTask12_invoker = createInvoker(
    Application_1.modifyTask(fakeValue[Long], fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "modifyTask",
      Seq(classOf[Long], classOf[Option[String]]),
      "PATCH",
      """""",
      this.prefix + """application/tasks/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("application/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_delete13_invoker = createInvoker(
    Application_1.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """application/projects/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/swagger/dist/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_at15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/swagger/dist/images/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at16_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/swagger/dist/css/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/lib/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/swagger/dist/lib/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/lang/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/swagger/dist/lang/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_at19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/fonts/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """public/swagger/dist/fonts/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_APIHome_gotoApiHome0_route(params) =>
      call { 
        controllers_APIHome_gotoApiHome0_invoker.call(APIHome_2.gotoApiHome)
      }
  
    // @LINE:5
    case controllers_ApiHelpController_getResources1_route(params) =>
      call { 
        controllers_ApiHelpController_getResources1_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:6
    case controllers_ApiHelpController_getResource2_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_ApiHelpController_getResource2_invoker.call(ApiHelpController_3.getResource(path))
      }
  
    // @LINE:11
    case controllers_ApiHelpController_getResources3_route(params) =>
      call { 
        controllers_ApiHelpController_getResources3_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:12
    case controllers_ApiHelpController_getResources4_route(params) =>
      call { 
        controllers_ApiHelpController_getResources4_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:13
    case controllers_ApiHelpController_getResources5_route(params) =>
      call { 
        controllers_ApiHelpController_getResources5_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:14
    case controllers_ApiHelpController_getResources6_route(params) =>
      call { 
        controllers_ApiHelpController_getResources6_invoker.call(ApiHelpController_3.getResources)
      }
  
    // @LINE:17
    case controllers_Application_listProjects7_route(params) =>
      call { 
        controllers_Application_listProjects7_invoker.call(Application_1.listProjects)
      }
  
    // @LINE:18
    case controllers_Application_createProject8_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_createProject8_invoker.call(Application_1.createProject(name))
      }
  
    // @LINE:19
    case controllers_Application_listProjects9_route(params) =>
      call { 
        controllers_Application_listProjects9_invoker.call(Application_1.listProjects)
      }
  
    // @LINE:20
    case controllers_Application_projects10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_projects10_invoker.call(Application_1.projects(id))
      }
  
    // @LINE:21
    case controllers_Application_addTaskToProject11_route(params) =>
      call(params.fromPath[String]("name", None), params.fromPath[Long]("id", None)) { (name, id) =>
        controllers_Application_addTaskToProject11_invoker.call(Application_1.addTaskToProject(name, id))
      }
  
    // @LINE:22
    case controllers_Application_modifyTask12_route(params) =>
      call(params.fromPath[Long]("id", None), Param[Option[String]]("color", Right(None))) { (id, color) =>
        controllers_Application_modifyTask12_invoker.call(Application_1.modifyTask(id, color))
      }
  
    // @LINE:23
    case controllers_Application_delete13_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_delete13_invoker.call(Application_1.delete(name))
      }
  
    // @LINE:26
    case controllers_Assets_at14_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:27
    case controllers_Assets_at15_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/images")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:28
    case controllers_Assets_at16_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/css")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at16_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:29
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/lib")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:30
    case controllers_Assets_at18_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/lang")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:31
    case controllers_Assets_at19_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/fonts")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at19_invoker.call(Assets_0.at(path, file))
      }
  }
}
