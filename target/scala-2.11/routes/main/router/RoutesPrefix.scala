
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-slick3-example/conf/routes
// @DATE:Wed Feb 22 18:59:25 CST 2017


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
