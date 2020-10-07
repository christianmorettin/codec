scalaVersion := "2.13.0"
libraryDependencies ++= Seq(
  "org.typelevel" %% "jawn-parser" % "0.14.2",
  "org.scalacheck" %% "scalacheck" % "1.14.2" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test
)

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
