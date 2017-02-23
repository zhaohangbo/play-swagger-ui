
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
    </head>
    <body>
	   	<div >
	        """),_display_(/*10.11*/content),format.raw/*10.18*/("""	        
	    """),format.raw/*11.6*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Nov 25 15:37:19 CST 2016
                  SOURCE: /Users/hangbozhao/web/play/projects/play-slick3-example/app/views/main.scala.html
                  HASH: 02ef4488310c5ab7c6a2855e926095d8fc219229
                  MATRIX: 530->1|655->31|682->32|759->83|784->88|865->142|893->149|935->164
                  LINES: 20->1|25->1|26->2|30->6|30->6|34->10|34->10|35->11
                  -- GENERATED --
              */
          