
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projects_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class projects extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Projects")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
 """),format.raw/*4.2*/("""Projects:
	"""),_display_(/*5.3*/projects/*5.11*/.map/*5.15*/{project =>_display_(Seq[Any](format.raw/*5.26*/("""
		"""),_display_(/*6.4*/project/*6.11*/.name),format.raw/*6.16*/("""
		"""),format.raw/*7.3*/("""<a href=""""),_display_(/*7.13*/routes/*7.19*/.Application.projects(project.id)),format.raw/*7.52*/("""">details</a>
		<br>
	""")))}),format.raw/*9.3*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(projects:List[Project]): play.twirl.api.HtmlFormat.Appendable = apply(projects)

  def f:((List[Project]) => play.twirl.api.HtmlFormat.Appendable) = (projects) => apply(projects)

  def ref: this.type = this

}


}

/**/
object projects extends projects_Scope0.projects
              /*
                  -- GENERATED --
                  DATE: Fri Nov 25 15:37:19 CST 2016
                  SOURCE: /Users/hangbozhao/web/play/projects/play-slick3-example/app/views/projects.scala.html
                  HASH: 66e266a301e95870b610d6b2d11596ec0c4064c6
                  MATRIX: 540->1|660->26|690->31|714->47|753->49|782->52|820->65|836->73|848->77|896->88|926->93|941->100|966->105|996->109|1032->119|1046->125|1099->158|1153->183|1186->186
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|31->7|31->7|33->9|34->10
                  -- GENERATED --
              */
          