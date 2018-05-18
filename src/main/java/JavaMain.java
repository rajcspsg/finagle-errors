import com.twitter.finagle.Http;
import com.twitter.finagle.stats.StatsReceiver;
import com.twitter.finagle.tracing.Tracer;
import com.twitter.util.Duration;

public class JavaMain {
    public static void main(String[] args) {

        StatsReceiver statsReceiver  = null;
        Tracer tracer  = null;
        Duration requestTimeout  =null;
        Duration connectTimeout  = null;

//        Http.client()
//                .withLabel("clientname")
//                .withStatsReceiver(statsReceiver)
//                .withTracer(tracer)
//                .withRequestTimeout(requestTimeout)
//                .withTransport.connectTimeout(connectTimeout)
//                .withSessionQualifier.noFailureAccrual()
//                .withSessionQualifier.noFailFast()
//                .withSession.acquisitionTimeout(connectTimeout)
//                .withSessionPool.maxSize(1)
//                .newService("localhost:10000,localhost:10001");
    }
}
