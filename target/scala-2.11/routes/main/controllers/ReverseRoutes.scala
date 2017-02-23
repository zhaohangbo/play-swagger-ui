
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-swagger-ui/conf/routes
// @DATE:Thu Feb 23 14:10:00 CST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers {

  // @LINE:5
  class ReverseApiHelpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getResources(): Call = {
    
      () match {
      
        // @LINE:5
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "swagger.json")
      
      }
    
    }
  
    // @LINE:6
    def getResource(path:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/" + implicitly[PathBindable[String]].unbind("path", dynamicString(path)))
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:26
        case (path, file) if path == "/public/swagger/dist" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:27
        case (path, file) if path == "/public/swagger/dist/images" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/images")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/images/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:28
        case (path, file) if path == "/public/swagger/dist/css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/css")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/css/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:29
        case (path, file) if path == "/public/swagger/dist/lib" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/lib")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/lib/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:30
        case (path, file) if path == "/public/swagger/dist/lang" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/lang")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/lang/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:31
        case (path, file) if path == "/public/swagger/dist/fonts" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/fonts")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/fonts/" + implicitly[PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:3
  class ReverseAPIHome(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def gotoApiHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def addTaskToProject(name:String, id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "application/projects/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:23
    def delete(name:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "application/projects/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:22
    def modifyTask(id:Long): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("color", None)))
      Call("PATCH", _prefix + { _defaultPrefix } + "application/tasks/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:20
    def projects(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "application/projects/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def createProject(name:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "application/projects/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:17
    def listProjects(): Call = {
    
      () match {
      
        // @LINE:17
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "application")
      
      }
    
    }
  
  }


}
