
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hangbozhao/web/play/projects/play-swagger-ui/conf/routes
// @DATE:Fri Feb 24 14:53:18 CST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApiHelpController ApiHelpController = new controllers.ReverseApiHelpController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAPIHome APIHome = new controllers.ReverseAPIHome(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApiHelpController ApiHelpController = new controllers.javascript.ReverseApiHelpController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAPIHome APIHome = new controllers.javascript.ReverseAPIHome(RoutesPrefix.byNamePrefix());
  }

}
