import org.scalajs.dom.raw.{MessageEvent, WebSocket}

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.jquery._

import scala.scalajs.js.JSON

object Main extends js.JSApp {
  case class Values(m: String)

  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "hello!"
    dom.document.getElementById("playground").appendChild(paragraph)
    jQuery("body").append("<p>jquery works too!</p>")
    //val stream = new WebSocket("wss://api.pizza.moe/stream/sovereignty/campaigns/")
    //stream.onmessage = { (m: MessageEvent) =>
    //  jQuery("body").append("<p>%s</p>".format(JSON.stringify(m)))
    // }

  }

}
