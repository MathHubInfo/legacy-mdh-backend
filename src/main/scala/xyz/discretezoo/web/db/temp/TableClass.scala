//package

import java.util.UUID
import slick.collection.heterogeneous.HNil
import slick.lifted.{ProvenShape, Rep}
import xyz.discretezoo.web.DynamicSupport.ColumnSelector
import xyz.discretezoo.web.ZooPostgresProfile.api._
//joinImports

final class %tableClass%(tag: Tag) extends Table[%caseClass%](tag, "%dbTableName%") with ColumnSelector {

  //joinQueries

  def ID: Rep[UUID] = column[UUID]("ID", O.PrimaryKey)
//accessorMethods

  def * : ProvenShape[%caseClass%] = (
    ID ::
//caseClassMapParameters ::
      HNil
    ).mapTo[%caseClass%]

  val select: Map[String, Rep[_]] = Map(
//selectMap
  )

  val inCollection: Map[String, Rep[Boolean]] = Map(
    "ID" -> true
  )

}