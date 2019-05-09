package xyz.discretezoo.web

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import slick.lifted.TableQuery
import xyz.discretezoo.web.db.ZooDb

import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success}
import xyz.discretezoo.web.ZooPostgresProfile.api._
//importTablePackages

object Create {

  def main(args: Array[String]): Unit = {

    implicit val system: ActorSystem = ActorSystem("ZooActors")
    implicit val materializer: ActorMaterializer = ActorMaterializer()
    implicit val executionContext: ExecutionContext = system.dispatcher

//tableObjects
//views

    ZooDb.db.run(DBIO.seq(
      //schemaCreateList
    )).onComplete({
      case Success(result)  => println("Tables existed before or were created.")
      case Failure(failure) => println("Failed to create tables.")
    })

    ZooDb.db.run(DBIO.seq(
      //viewCreateList
    )).onComplete({
      case Success(result)  => println("Created view.")
      case Failure(failure) => println("Failed to create view.")
    })

  }

}