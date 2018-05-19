import com.twitter.finagle.Http.Client
import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.param.Logger

object Main extends App {

  private val loggerFinagle = java.util.logging.Logger.getLogger("FinagleLogger")

  val client: Client = Http.client
    .configured(Logger(loggerFinagle))

}
