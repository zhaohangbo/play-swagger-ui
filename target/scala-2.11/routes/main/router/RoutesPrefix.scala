
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-swagger-ui/conf/routes
// @DATE:Fri Feb 24 14:53:18 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
