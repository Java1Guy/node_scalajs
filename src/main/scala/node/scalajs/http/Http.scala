package node.scalajs.http

import scala.scalajs.js
import js.annotation.JSName

trait HttpStatic extends js.Object {
	def createServer( fn: (Request, Response) => Unit ): Server = js.native
}

trait Server extends js.Object {
	def listen(port:Int): Unit = js.native
}

trait Request extends js.Object {
	var method:String = js.native
	var url:String = js.native
	def on(event:String, cb: (String) => Unit): Unit = js.native
}

trait Response extends js.Object {
	def writeHead(returnCode:Int, msg:String, body:Dynamic): Unit = js.native
	def writeHead(data:Int): Unit = js.native
	def write(data:String): Unit = js.native
	def end(): Unit = js.native
}
