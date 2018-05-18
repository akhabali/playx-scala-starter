package filters

import com.github.rmannibucau.playx.servlet.servlet.api.ServletFilter
import javax.enterprise.inject.spi.CDI
import javax.inject._
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class ExampleFilter @Inject()()(implicit ec: ExecutionContext) extends EssentialFilter {
  def delegate: ServletFilter = CDI.current().select(classOf[ServletFilter]).get()

  override def apply(next: EssentialAction) = EssentialAction {
    delegate.apply(next)
  }
}