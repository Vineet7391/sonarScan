package com.sonar
import sbt._
import sbt.Keys._
import sbt.AutoPlugin

object HelloText extends AutoPlugin with App {
  override def trigger = allRequirements

  override def projectSettings: Seq[Def.Setting[_]] = Seq(
    helloTask := {
      val log = streams.value.log
      val targetFile = target.value / "hello.txt"
      IO.write(targetFile, "Hello, World!")
      log.info(s"Generated: $targetFile")
    }
  )

  lazy val helloTask = taskKey[Unit]("Creates a hello.txt file with 'Hello, World!' content.")
}
