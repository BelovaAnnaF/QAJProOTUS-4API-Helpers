package mock;

import com.consol.citrus.context.TestContext;
import com.consol.citrus.testng.TestNGCitrusSupport;
import static com.consol.citrus.http.actions.HttpActionBuilder.http;

public class MockServer extends TestNGCitrusSupport {

  private TestContext context;

  public MockServer(TestContext context) {
    this.context = context;
  }

  public MockServer mockServerReceiveRequest() {
    $(http()
            .server("restServer")
            .receive()
            .get()
    );
    return this;
  }

  public MockServer mockServerResponseForUser() {
    $(http()
            .server("restServer")
            .send()
            .response()
            .message()
            .type("application/json").body("{\n" +
                    "\"name\":\"Ivanova Olga\",\n" +
                    "\"course\":\"QA Java\",\n" +
                    "\"email\":\"OlgaIvanova@Kmail.com\",\n" +
                    "\"age\": 23\n" +
                    "}")
    );
    return this;
  }

  public MockServer mockServerResponseForScore() {
    $(http()
            .server("restServer")
            .send()
            .response()
            .message()
            .type("application/json").body("{\n" +
                    "\"name\":\"Ivanova Olga\",\n" +
                    "\"score\": 78\n" +
                    "}")
    );
    return this;
  }

  public MockServer mockServerResponseForCourse() {
    $(http()
            .server("restServer")
            .send()
            .response()
            .message()
            .type("application/json").body("[\n" +
                    "{\n" +
                    "\"name\":\"QA Java\",\n" +
                    "\"price\": 15000\n" +
                    "},\n" +
                    "{\n" +
                    "\"name\":\"Java\",\n" +
                    "\"price\": 12000\n" +
                    "}\n" +
                    "]")
    );
    return this;
  }
}
