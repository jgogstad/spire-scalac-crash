# spire-scalac-crash

```bash
❯ sbt new scala/hello-world.g8
❯ # add spire dependency and src/main/scala/SpireExtensions.scala
❯ sbt compile
[info] welcome to sbt 1.9.7 (Azul Systems, Inc. Java 11.0.10)
[info] loading project definition from /Users/josteingogstad/source-code/github.com/jgogstad/spire-scalac-crash/project
[info] loading settings for project spire-scalac-crash from build.sbt ...
[info] set current project to hello-world (in build file:/Users/josteingogstad/source-code/github.com/jgogstad/spire-scalac-crash/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 2 Scala sources to /Users/josteingogstad/source-code/github.com/jgogstad/spire-scalac-crash/target/scala-3.4.0-RC1-bin-20231219-eae8831-NIGHTLY/classes ...
[error] -- [E172] Type Error: /Users/josteingogstad/source-code/github.com/jgogstad/spire-scalac-crash/src/main/scala/SpireExtensions.scala:5:47 
[error] 5 |  def coerce: Long = implicitly[IntegralOps[A]].coerce(a)
[error]   |                                               ^
[error]   |No given instance of type spire.math.IntegralOps[A] was found for parameter e of method implicitly in object Predef
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 8 s, completed Dec 21, 2023, 12:30:51 PM
```