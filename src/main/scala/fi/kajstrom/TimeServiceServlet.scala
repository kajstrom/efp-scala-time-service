package fi.kajstrom

import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.scalatra._
import play.api.libs.json._

class TimeServiceServlet extends EfpScalaTimeServiceStack {
  //http://scalatra.org/getting-started/first-project.html
  get("/") {
    response.setHeader("Content-Type", "application/json")
    Ok(Json.toJson(Map("currentTime" -> ISODateTimeFormat.dateTime().print(DateTime.now))))
  }

}
