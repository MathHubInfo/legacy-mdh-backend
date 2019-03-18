package xyz.discretezoo.web

import com.github.tminglei.slickpg._

trait ZooPostgresProfile extends ExPostgresProfile with PgArraySupport {

  override val api: API = new API {}

  trait API extends super.API
    with ArrayImplicits
    with SimpleArrayPlainImplicits {

    implicit val intintWitness: ElemWitness[List[Int]] = ElemWitness.AnyWitness.asInstanceOf[ElemWitness[List[Int]]]

    implicit val simpleIntIntListTypeMapper: DriverJdbcType[List[List[Int]]] = {
      new SimpleArrayJdbcType[List[Int]]("int4[]").to(_.asInstanceOf[Seq[Array[Any]]]
        .toList.map(_.toList.asInstanceOf[List[Int]]))
    }

  }
}

object ZooPostgresProfile extends ZooPostgresProfile