An attempt to reproduce the working app.js with ScalaJS code in src/main/scala/tutorial/webapp.

Building on the concepts in https://github.com/bblfish/node.scalajs except that this
will be the server-side code running in Node itself vs. in the browser.

Definition:
    def createServer( fn: (Request, Response) => Unit ): Server = js.native

Implementation:
    var server = http.createServer( (req:Request, res:Response) => {
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

Result:
[info] Running tutorial.webapp.HttpServer
[error]
[error] events.js:130
[error]     throw TypeError('listener must be a function');
[error]           ^
[error] TypeError: listener must be a function
[error]     at TypeError (<anonymous>)
[error]     at Server.addListener (events.js:130:11)
[error]     at new Server (http.js:1873:10)
[error]     at Object.exports.createServer (http.js:1903:10)
[error]     at $c_Ltutorial_webapp_HttpServer$.main__V (/Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/node_scalajs-server-side-node-class-wrappers-fastopt.js:1544:36)
[error]     at $c_Ltutorial_webapp_HttpServer$.$$js$exported$meth$main__O (/Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/node_scalajs-server-side-node-class-wrappers-fastopt.js:1548:8)
[error]     at $c_Ltutorial_webapp_HttpServer$.main (/Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/node_scalajs-server-side-node-class-wrappers-fastopt.js:1551:15)
[error]     at [stdin]:27:94
[error]     at Object.<anonymous> ([stdin]-wrapper:6:22)
[error]     at Module._compile (module.js:456:26)
o