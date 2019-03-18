package xyz.discretezoo.web

import slick.lifted.TableQuery
import xyz.discretezoo.web.db.ZooDb

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import xyz.discretezoo.web.ZooPostgresProfile.api._
//importTablePackages

object Create {

  def main(args: Array[String]): Unit = {

    //tableObjects

    try {
      Await.result(ZooDb.db.run(DBIO.seq(
        //schemaCreateList
      )), Duration.Inf)
    }

  }

}
