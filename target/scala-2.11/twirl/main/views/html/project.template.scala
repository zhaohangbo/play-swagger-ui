
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object project_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class project extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Project,List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: Project
, tasks: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""

"""),_display_(/*4.2*/main(project.name)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
 """),format.raw/*5.2*/("""projectId: """),_display_(/*5.14*/project/*5.21*/.id),format.raw/*5.24*/(""" """),_display_(/*5.26*/project/*5.33*/.name),format.raw/*5.38*/("""
"""),format.raw/*6.1*/("""<br>
	"""),_display_(/*7.3*/tasks/*7.8*/.map/*7.12*/{task =>_display_(Seq[Any](format.raw/*7.20*/("""
    """),format.raw/*8.5*/("""taskId: """),_display_(/*8.14*/task/*8.18*/.id),format.raw/*8.21*/(""" """),format.raw/*8.22*/("""color: """),_display_(/*8.30*/task/*8.34*/.color),format.raw/*8.40*/(""";
        <br>
	""")))}),format.raw/*10.3*/("""
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(project:Project,tasks:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(project,tasks)

  def f:((Project,List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (project,tasks) => apply(project,tasks)

  def ref: this.type = this

}


}

/**/
object project extends project_Scope0.project
              /*
                  -- GENERATED --
                  DATE: Fri Nov 25 15:37:19 CST 2016
                  SOURCE: /Users/hangbozhao/web/play/projects/play-slick3-example/app/views/project.scala.html
                  HASH: c578aaa37a9792f3e59d5f15e296f4c9936a0aec
                  MATRIX: 543->1|677->40|707->45|733->63|772->65|801->68|839->80|854->87|877->90|905->92|920->99|945->104|973->106|1006->114|1018->119|1030->123|1075->131|1107->137|1142->146|1154->150|1177->153|1205->154|1239->162|1251->166|1277->172|1326->191|1359->194
                  LINES: 20->1|26->2|28->4|28->4|28->4|29->5|29->5|29->5|29->5|29->5|29->5|29->5|30->6|31->7|31->7|31->7|31->7|32->8|32->8|32->8|32->8|32->8|32->8|32->8|32->8|34->10|35->11
                  -- GENERATED --
              */
          