package node.scalajs

import scala.scalajs.js.annotation.JSName
import scala.scalajs.js
import node.scalajs.http

object HttpServer extends js.JSApp {
  def main(): Unit = {
  	// var http = js.eval("require(\"http\")").asInstanceOf(Http)
    var server = http.createServer( (req, res) => {
	    if (req.method == "POST") {
	        var body = ""

	        req.on("data", (chunk:String) => {
	            body += chunk;
	        })

	        req.on("end", (_) => {
	            if (req.url == "/") {
	                System.out.println(body);
	            } else {
	                res.writeHead(404, "Not Found", js.Dynamic.literal("Content-Type"->"text/plain"))

	                res.end()
	            }
	        })
	    } else {
	        res.writeHead(200)
	        res.write("<h1>Sorry, post only</h1>")
	        res.end()
	    }
	})

	// Listen on port 3000, IP defaults to 127.0.0.1
	server.listen(3000)

  }
}
