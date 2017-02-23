
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object swagger_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object swagger_Scope1 {
import play.api.Play.current
import play.api.i18n.{I18nSupport, Messages}

class swagger extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Swagger UI</title>
  <link rel="icon" type="image/png" href='"""),_display_(/*9.44*/routes/*9.50*/.Assets.at("/public/swagger/dist/images","favicon-32x32.png")),format.raw/*9.111*/("""' sizes="32x32" />
  <link rel="icon" type="image/png" href='"""),_display_(/*10.44*/routes/*10.50*/.Assets.at("/public/swagger/dist/images","favicon-16x16.png")),format.raw/*10.111*/("""' sizes="16x16" />
  <link href='"""),_display_(/*11.16*/routes/*11.22*/.Assets.at("/public/swagger/dist/css", "typography.css")),format.raw/*11.78*/("""' media='screen' rel='stylesheet' type='text/css'/>
  <link href='"""),_display_(/*12.16*/routes/*12.22*/.Assets.at("/public/swagger/dist/css", "reset.css")),format.raw/*12.73*/("""' media='screen' rel='stylesheet' type='text/css'/>
  <link href='"""),_display_(/*13.16*/routes/*13.22*/.Assets.at("/public/swagger/dist/css", "screen.css")),format.raw/*13.74*/("""' media='screen' rel='stylesheet' type='text/css'/>
  <link href='"""),_display_(/*14.16*/routes/*14.22*/.Assets.at("/public/swagger/dist/css", "reset.css")),format.raw/*14.73*/("""' media='print' rel='stylesheet' type='text/css'/>
  <link href='"""),_display_(/*15.16*/routes/*15.22*/.Assets.at("/public/swagger/dist/css", "print.css")),format.raw/*15.73*/("""' media='print' rel='stylesheet' type='text/css'/>

  <script src='"""),_display_(/*17.17*/routes/*17.23*/.Assets.at("/public/swagger/dist/lib", "object-assign-pollyfill.js")),format.raw/*17.91*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*18.17*/routes/*18.23*/.Assets.at("/public/swagger/dist/lib", "jquery-1.8.0.min.js")),format.raw/*18.84*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*19.17*/routes/*19.23*/.Assets.at("/public/swagger/dist/lib", "jquery.slideto.min.js")),format.raw/*19.86*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*20.17*/routes/*20.23*/.Assets.at("/public/swagger/dist/lib", "jquery.wiggle.min.js")),format.raw/*20.85*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*21.17*/routes/*21.23*/.Assets.at("/public/swagger/dist/lib", "jquery.ba-bbq.min.js")),format.raw/*21.85*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*22.17*/routes/*22.23*/.Assets.at("/public/swagger/dist/lib", "handlebars-4.0.5.js")),format.raw/*22.84*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*23.17*/routes/*23.23*/.Assets.at("/public/swagger/dist/lib", "lodash.min.js")),format.raw/*23.78*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*24.17*/routes/*24.23*/.Assets.at("/public/swagger/dist/lib", "backbone-min.js")),format.raw/*24.80*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*25.17*/routes/*25.23*/.Assets.at("/public/swagger/dist","swagger-ui.js")),format.raw/*25.73*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*26.17*/routes/*26.23*/.Assets.at("/public/swagger/dist/lib", "highlight.9.1.0.pack.js")),format.raw/*26.88*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*27.17*/routes/*27.23*/.Assets.at("/public/swagger/dist/lib", "highlight.9.1.0.pack_extended.js")),format.raw/*27.97*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*28.17*/routes/*28.23*/.Assets.at("/public/swagger/dist/lib", "jsoneditor.min.js")),format.raw/*28.82*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*29.17*/routes/*29.23*/.Assets.at("/public/swagger/dist/lib", "marked.js")),format.raw/*29.74*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*30.17*/routes/*30.23*/.Assets.at("/public/swagger/dist/lib", "swagger-oauth.js")),format.raw/*30.81*/("""' type='text/javascript'></script>

  <!-- Some basic translations -->
  <script src='"""),_display_(/*33.17*/routes/*33.23*/.Assets.at("/public/swagger/dist/lang", "translator.js")),format.raw/*33.79*/("""' type='text/javascript'></script>
  <script src='"""),_display_(/*34.17*/routes/*34.23*/.Assets.at("/public/swagger/dist/lang", "zh-cn.js")),format.raw/*34.74*/("""' type='text/javascript'></script>
  <!-- <script src='lang/en.js")' type='text/javascript'></script> -->
  <!-- url = "http://petstore.swagger.io/v2/swagger.json"; -->
  <!-- url = "/swagger.json"; -->

  <script type="text/javascript">
    $(function () """),format.raw/*40.19*/("""{"""),format.raw/*40.20*/("""
      """),format.raw/*41.7*/("""var url = window.location.search.match(/url=([^&]+)/);
      if (url && url.length > 1) """),format.raw/*42.34*/("""{"""),format.raw/*42.35*/("""
        """),format.raw/*43.9*/("""url = decodeURIComponent(url[1]);
      """),format.raw/*44.7*/("""}"""),format.raw/*44.8*/("""
      """),format.raw/*45.7*/("""else """),format.raw/*45.12*/("""{"""),format.raw/*45.13*/("""
        """),format.raw/*46.9*/("""url = "http://127.0.0.1:8080/?act=get_resources";
      """),format.raw/*47.7*/("""}"""),format.raw/*47.8*/("""

      """),format.raw/*49.7*/("""hljs.configure("""),format.raw/*49.22*/("""{"""),format.raw/*49.23*/("""
        """),format.raw/*50.9*/("""highlightSizeThreshold: 5000
      """),format.raw/*51.7*/("""}"""),format.raw/*51.8*/(""");

      // Pre load translate...
      if(window.SwaggerTranslator) """),format.raw/*54.36*/("""{"""),format.raw/*54.37*/("""
        """),format.raw/*55.9*/("""window.SwaggerTranslator.translate();
      """),format.raw/*56.7*/("""}"""),format.raw/*56.8*/("""

      """),format.raw/*58.7*/("""window.swaggerUi = new SwaggerUi("""),format.raw/*58.40*/("""{"""),format.raw/*58.41*/("""
        """),format.raw/*59.9*/("""url: url,
        dom_id: "swagger-ui-container",
        supportedSubmitMethods: ['get', 'post', 'put', 'delete', 'patch'],
        onComplete: function(swaggerApi, swaggerUi)"""),format.raw/*62.52*/("""{"""),format.raw/*62.53*/("""
          """),format.raw/*63.11*/("""if(typeof initOAuth == "function") """),format.raw/*63.46*/("""{"""),format.raw/*63.47*/("""
            """),format.raw/*64.13*/("""initOAuth("""),format.raw/*64.23*/("""{"""),format.raw/*64.24*/("""
              """),format.raw/*65.15*/("""clientId: "your-client-id",
              clientSecret: "your-client-secret-if-required",
              realm: "your-realms",
              appName: "your-app-name",
              scopeSeparator: " ",
              additionalQueryStringParams: """),format.raw/*70.44*/("""{"""),format.raw/*70.45*/("""}"""),format.raw/*70.46*/("""
            """),format.raw/*71.13*/("""}"""),format.raw/*71.14*/(""");
          """),format.raw/*72.11*/("""}"""),format.raw/*72.12*/("""

          """),format.raw/*74.11*/("""if(window.SwaggerTranslator) """),format.raw/*74.40*/("""{"""),format.raw/*74.41*/("""
            """),format.raw/*75.13*/("""window.SwaggerTranslator.translate();
          """),format.raw/*76.11*/("""}"""),format.raw/*76.12*/("""
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""",
        onFailure: function(data) """),format.raw/*78.35*/("""{"""),format.raw/*78.36*/("""
          """),format.raw/*79.11*/("""log("Unable to Load SwaggerUI");
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""",
        docExpansion: "none",
        jsonEditor: false,
        defaultModelRendering: 'schema',
        showRequestHeaders: false
      """),format.raw/*85.7*/("""}"""),format.raw/*85.8*/(""");

      window.swaggerUi.load();

      function log() """),format.raw/*89.22*/("""{"""),format.raw/*89.23*/("""
        """),format.raw/*90.9*/("""if ('console' in window) """),format.raw/*90.34*/("""{"""),format.raw/*90.35*/("""
          """),format.raw/*91.11*/("""console.log.apply(console, arguments);
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/("""
      """),format.raw/*93.7*/("""}"""),format.raw/*93.8*/("""
  """),format.raw/*94.3*/("""}"""),format.raw/*94.4*/(""");
  </script>
</head>

<body class="swagger-section">
<div id='header'>
  <div class="swagger-ui-wrap">

    <a id="logo" href="http://swagger.io">
      <img class="logo__img" alt="swagger" height="30" width="30" src='"""),_display_(/*103.73*/routes/*103.79*/.Assets.at("/public/swagger/dist/images","logo_small.png")),format.raw/*103.137*/("""'/>
      <span class="logo__title">日志易通用API接口</span>
    </a>

    <form id='api_selector'>
      <div class='input'>
        <input placeholder="http://example.com/api" id="input_baseUrl" name="baseUrl" type="text"/>
      </div>

      <div id='auth_container'>
        日志易接口
      </div>

      <div class='input'>
        <a id="explore" class="header__btn" href="#" data-sw-translate>体验</a>
      </div>
    </form>

  </div>
</div>

<div id="message-bar" class="swagger-ui-wrap" data-sw-translate>
  YottaApi: Message Bar
  &nbsp;
</div>

<div id="swagger-ui-container" class="swagger-ui-wrap" >
    YottaApi: UI Container
</div>

</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object swagger extends swagger_Scope0.swagger_Scope1.swagger
              /*
                  -- GENERATED --
                  DATE: Tue Dec 20 14:07:34 CST 2016
                  SOURCE: /Users/hangbozhao/web/play/projects/play-slick3-example/app/views/swagger.scala.html
                  HASH: c0294ef44e967d0dec5d1c88b36167edad8a20c7
                  MATRIX: 717->77|869->203|883->209|965->270|1054->332|1069->338|1152->399|1213->433|1228->439|1305->495|1399->562|1414->568|1486->619|1580->686|1595->692|1668->744|1762->811|1777->817|1849->868|1942->934|1957->940|2029->991|2124->1059|2139->1065|2228->1133|2306->1184|2321->1190|2403->1251|2481->1302|2496->1308|2580->1371|2658->1422|2673->1428|2756->1490|2834->1541|2849->1547|2932->1609|3010->1660|3025->1666|3107->1727|3185->1778|3200->1784|3276->1839|3354->1890|3369->1896|3447->1953|3525->2004|3540->2010|3611->2060|3689->2111|3704->2117|3790->2182|3868->2233|3883->2239|3978->2313|4056->2364|4071->2370|4151->2429|4229->2480|4244->2486|4316->2537|4394->2588|4409->2594|4488->2652|4602->2739|4617->2745|4694->2801|4772->2852|4787->2858|4859->2909|5143->3165|5172->3166|5206->3173|5322->3261|5351->3262|5387->3271|5454->3311|5482->3312|5516->3319|5549->3324|5578->3325|5614->3334|5697->3390|5725->3391|5760->3399|5803->3414|5832->3415|5868->3424|5930->3459|5958->3460|6056->3530|6085->3531|6121->3540|6192->3584|6220->3585|6255->3593|6316->3626|6345->3627|6381->3636|6585->3812|6614->3813|6653->3824|6716->3859|6745->3860|6786->3873|6824->3883|6853->3884|6896->3899|7168->4143|7197->4144|7226->4145|7267->4158|7296->4159|7337->4172|7366->4173|7406->4185|7463->4214|7492->4215|7533->4228|7609->4276|7638->4277|7674->4286|7703->4287|7767->4323|7796->4324|7835->4335|7903->4376|7932->4377|8099->4517|8127->4518|8212->4575|8241->4576|8277->4585|8330->4610|8359->4611|8398->4622|8472->4669|8501->4670|8535->4677|8563->4678|8593->4681|8621->4682|8870->4903|8886->4909|8967->4967
                  LINES: 29->4|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|42->17|42->17|42->17|43->18|43->18|43->18|44->19|44->19|44->19|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|58->33|58->33|58->33|59->34|59->34|59->34|65->40|65->40|66->41|67->42|67->42|68->43|69->44|69->44|70->45|70->45|70->45|71->46|72->47|72->47|74->49|74->49|74->49|75->50|76->51|76->51|79->54|79->54|80->55|81->56|81->56|83->58|83->58|83->58|84->59|87->62|87->62|88->63|88->63|88->63|89->64|89->64|89->64|90->65|95->70|95->70|95->70|96->71|96->71|97->72|97->72|99->74|99->74|99->74|100->75|101->76|101->76|102->77|102->77|103->78|103->78|104->79|105->80|105->80|110->85|110->85|114->89|114->89|115->90|115->90|115->90|116->91|117->92|117->92|118->93|118->93|119->94|119->94|128->103|128->103|128->103
                  -- GENERATED --
              */
          