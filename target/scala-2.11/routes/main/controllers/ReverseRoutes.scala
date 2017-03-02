
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-swagger-ui/conf/routes
// @DATE:Fri Feb 24 14:53:18 CST 2017

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

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:13
        case (path, file) if path == "/public/swagger/dist" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:14
        case (path, file) if path == "/public/swagger/dist/images" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/images")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/images/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:15
        case (path, file) if path == "/public/swagger/dist/css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/css")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/css/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:16
        case (path, file) if path == "/public/swagger/dist/lib" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/lib")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/lib/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:17
        case (path, file) if path == "/public/swagger/dist/lang" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger/dist/lang")))
          Call("GET", _prefix + { _defaultPrefix } + "public/swagger/dist/lang/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:18
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


}
