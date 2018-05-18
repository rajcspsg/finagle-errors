import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.param.Logger
import com.twitter.finagle.stats.StatsReceiver
import com.twitter.finagle.tracing.Tracer
import com.twitter.util.Duration

object Main extends App {

  private val loggerFinagle = java.util.logging.Logger.getLogger("FinagleLogger")

  val statsReceiver: StatsReceiver = ???
  val tracer: Tracer = ???
  val requestTimeout: Duration = ???
  val connectTimeout: Duration = ???

  val client: Service[Request, Response] = Http.client
    .withLabel("clientname")
    .withStatsReceiver(statsReceiver)
    .withTracer(tracer)
    .withRequestTimeout(requestTimeout)
    .withTransport.connectTimeout(???)
    .withSessionQualifier.noFailureAccrual
    .withSessionQualifier.noFailFast
    .withSession.acquisitionTimeout(connectTimeout)
    .withSessionPool.maxSize(1)
    .configured(new Logger(loggerFinagle))
    .newService("localhost:10000,localhost:10001")

}
