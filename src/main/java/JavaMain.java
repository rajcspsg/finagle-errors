import com.twitter.finagle.Http;
import com.twitter.finagle.param.Logger;

public class JavaMain {
    public static void main(String[] args) {

        java.util.logging.Logger loggerFinagle = java.util.logging.Logger.getLogger("FinagleLogger");

        Http.client()
               .configured(new Logger(loggerFinagle));
    }
}
