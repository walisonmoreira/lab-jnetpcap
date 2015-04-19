package lab.jnetpcap;

import static io.undertow.Handlers.path;
import static io.undertow.Handlers.resource;
import io.undertow.Undertow;
import io.undertow.io.Sender;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.resource.ClassPathResourceManager;
import io.undertow.server.handlers.resource.ResourceHandler;
import io.undertow.util.Headers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    Undertow server = Undertow.builder()
      .addHttpListener(8080, "localhost")
      .setHandler(path()
        .addPrefixPath("/run", runHandler())
        .addPrefixPath("/", rootHandler()))
      .build();
    server.start();
  }

  private HttpHandler runHandler() {
    return new HttpHandler() {
      public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        Sender sender = exchange.getResponseSender();

        Deque<String> p1Deque = exchange.getQueryParameters().get("p1");
        String p1 = p1Deque == null ? "" : p1Deque.getFirst();

        Deque<String> p2Deque = exchange.getQueryParameters().get("p2");
        String p2 = p2Deque == null ? "" : p2Deque.getFirst();

        sender.send(run(p1, p2).toString());
      }
    };
  }

  private ResourceHandler rootHandler() {
    return resource(new ClassPathResourceManager(Main.class.getClassLoader(), Main.class.getPackage()))
      .addWelcomeFiles("index.html");
  }

  private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");;

  private StringBuffer run(String p1, String p2) {
    StringBuffer res = new StringBuffer();

    if (p1.equals("teste1")) {
      res.append(teste1(p2));
    } else if (p1.equals("teste2")) {
      res.append(teste2(p2));
    } else {
      res.append("?");
    }

    res.append(" - " + sdf.format(new Date()));

    return res;
  }

  private StringBuffer teste1(String p2) {
    StringBuffer res = new StringBuffer();
    res.append(p2);
    return res;
  }

  private StringBuffer teste2(String p2) {
    StringBuffer res = new StringBuffer();
    res.append(p2);
    return res;
  }

}
