
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-swagger-ui/conf/routes
// @DATE:Fri Feb 24 14:53:18 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  APIHome_1: controllers.APIHome,
  // @LINE:5
  ApiHelpController_2: controllers.ApiHelpController,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    APIHome_1: controllers.APIHome,
    // @LINE:5
    ApiHelpController_2: controllers.ApiHelpController,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, APIHome_1, ApiHelpController_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, APIHome_1, ApiHelpController_2, Assets_0, prefix)
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
    APIHome_1.gotoApiHome,
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
    ApiHelpController_2.getResources,
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
    ApiHelpController_2.getResource(fakeValue[String]),
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

  // @LINE:8
  private[this] lazy val controllers_ApiHelpController_getResources3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("en/swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources3_invoker = createInvoker(
    ApiHelpController_2.getResources,
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

  // @LINE:9
  private[this] lazy val controllers_ApiHelpController_getResources4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ch/swagger.json")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources4_invoker = createInvoker(
    ApiHelpController_2.getResources,
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

  // @LINE:10
  private[this] lazy val controllers_ApiHelpController_getResources5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json?lang=en")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources5_invoker = createInvoker(
    ApiHelpController_2.getResources,
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

  // @LINE:11
  private[this] lazy val controllers_ApiHelpController_getResources6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json?lang=fr")))
  )
  private[this] lazy val controllers_ApiHelpController_getResources6_invoker = createInvoker(
    ApiHelpController_2.getResources,
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

  // @LINE:13
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/images/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_Assets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/lib/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Assets_at11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/lang/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/swagger/dist/fonts/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
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
        controllers_APIHome_gotoApiHome0_invoker.call(APIHome_1.gotoApiHome)
      }
  
    // @LINE:5
    case controllers_ApiHelpController_getResources1_route(params) =>
      call { 
        controllers_ApiHelpController_getResources1_invoker.call(ApiHelpController_2.getResources)
      }
  
    // @LINE:6
    case controllers_ApiHelpController_getResource2_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_ApiHelpController_getResource2_invoker.call(ApiHelpController_2.getResource(path))
      }
  
    // @LINE:8
    case controllers_ApiHelpController_getResources3_route(params) =>
      call { 
        controllers_ApiHelpController_getResources3_invoker.call(ApiHelpController_2.getResources)
      }
  
    // @LINE:9
    case controllers_ApiHelpController_getResources4_route(params) =>
      call { 
        controllers_ApiHelpController_getResources4_invoker.call(ApiHelpController_2.getResources)
      }
  
    // @LINE:10
    case controllers_ApiHelpController_getResources5_route(params) =>
      call { 
        controllers_ApiHelpController_getResources5_invoker.call(ApiHelpController_2.getResources)
      }
  
    // @LINE:11
    case controllers_ApiHelpController_getResources6_route(params) =>
      call { 
        controllers_ApiHelpController_getResources6_invoker.call(ApiHelpController_2.getResources)
      }
  
    // @LINE:13
    case controllers_Assets_at7_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:14
    case controllers_Assets_at8_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/images")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:15
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/css")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:16
    case controllers_Assets_at10_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/lib")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:17
    case controllers_Assets_at11_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/lang")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:18
    case controllers_Assets_at12_route(params) =>
      call(Param[String]("path", Right("/public/swagger/dist/fonts")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_0.at(path, file))
      }
  }
}
