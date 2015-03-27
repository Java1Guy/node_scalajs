package node.scalajs

import scala.scalajs.js

package object http extends js.GlobalScope {
  def http: HttpStatic = js.native
}