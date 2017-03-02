
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-swagger-ui/conf/routes
// @DATE:Fri Feb 24 14:53:18 CST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:5
  class ReverseApiHelpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getResources: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiHelpController.getResources",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "swagger.json"})
          }
        
        }
      """
    )
  
    // @LINE:6
    def getResource: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiHelpController.getResource",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", encodeURIComponent(path0))})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(path0,file1) {
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/swagger/dist") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/swagger/dist/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/swagger/dist/images") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/swagger/dist/images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/swagger/dist/css") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/swagger/dist/css/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/swagger/dist/lib") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/swagger/dist/lib/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/swagger/dist/lang") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/swagger/dist/lang/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/swagger/dist/fonts") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/swagger/dist/fonts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }

  // @LINE:3
  class ReverseAPIHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def gotoApiHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.APIHome.gotoApiHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
