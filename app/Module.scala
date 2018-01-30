import com.google.inject.AbstractModule
import daos.{AtmDao, AtmDaoImpl}
import utils.DatabaseConnection

class Module extends AbstractModule {
  override def configure() = {
    bind(classOf[DatabaseConnection]).toInstance(new DatabaseConnection)
    bind(classOf[AtmDao]).to(classOf[AtmDaoImpl])
  }
}