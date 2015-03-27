with:
js.Dynamic.global.require("http")

[info] Fast optimizing /Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/node_scalajs-server-side-node-class-wrappers-fastopt.js
[info] Running tutorial.webapp.HttpServer
TypeError: Cannot call method 'createServer' of undefined
    at [object Object].$c_Ltutorial_webapp_HttpServer$.main__V (/Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/file:/Users/mchance/Projects/Misc/node-scalajs/src/main/scala/tutorial/webapp/HttpServer.scala:12:35)
    at [object Object].$c_Ltutorial_webapp_HttpServer$.$$js$exported$meth$main__O (/Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/https:/raw.githubusercontent.com/scala-js/scala-js/v0.6.2/library/src/main/scala/scala/scalajs/js/JSApp.scala:18:4)
    at [object Object].$c_Ltutorial_webapp_HttpServer$.main (/Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/file:/Users/mchance/Projects/Misc/node-scalajs/src/main/scala/tutorial/webapp/HttpServer.scala:7:8)
    at [stdin]:27:94
    at Object.<anonymous> ([stdin]-wrapper:6:22)
    at Module._compile (module.js:456:26)
    at evalScript (node.js:536:25)
    at Socket.<anonymous> (node.js:154:11)
    at Socket.emit (events.js:117:20)
    at _stream_readable.js:943:16
[error]
[error] /Users/mchance/Projects/Misc/node-scalajs/target/scala-2.11/node_scalajs-server-side-node-class-wrappers-fastopt.js:1544
[error]   var server = $g["http"]["createServer"](new $c_Ltutorial_webapp_HttpServer$$
[error]                                          ^
org.scalajs.jsenv.ExternalJSEnv$NonZeroExitException: node.js exited with code 1
	at org.scalajs.jsenv.ExternalJSEnv$AbstractExtRunner.waitForVM(ExternalJSEnv.scala:89)
	at org.scalajs.jsenv.ExternalJSEnv$ExtRunner.run(ExternalJSEnv.scala:136)
	at org.scalajs.sbtplugin.ScalaJSPluginInternal$.org$scalajs$sbtplugin$ScalaJSPluginInternal$$jsRun(ScalaJSPluginInternal.scala:360)
	at org.scalajs.sbtplugin.ScalaJSPluginInternal$$anonfun$37$$anonfun$apply$23$$anonfun$apply$24.apply(ScalaJSPluginInternal.scala:420)
	at org.scalajs.sbtplugin.ScalaJSPluginInternal$$anonfun$37$$anonfun$apply$23$$anonfun$apply$24.apply(ScalaJSPluginInternal.scala:414)
	at scala.Function1$$anonfun$compose$1.apply(Function1.scala:47)
[trace] Stack trace suppressed: run last compile:run for the full output.
[error] (compile:run) org.scalajs.jsenv.ExternalJSEnv$NonZeroExitException: node.js exited with code 1
[error] Total time: 1 s, completed Mar 27, 2015 9:46:04 AM