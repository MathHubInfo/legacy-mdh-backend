//package
import java.util.UUID
import slick.jdbc.GetResult
import xyz.discretezoo.web.PlainSQLSupport
import xyz.discretezoo.web.ZooPostgresProfile.api._

object %plainQueryObject% extends PlainSQLSupport[%caseClass%] {

  override val tableName: String = "%dbTableName%"
  override implicit val getResult: GetResult[%caseClass%] = GetResult(r =>
    %caseClass%(r.nextObject.asInstanceOf[UUID], %getResultParameters%)
  )

  val inCollection: Map[String, String] = Map(
    "%tableName%" -> "ID"
  )

}