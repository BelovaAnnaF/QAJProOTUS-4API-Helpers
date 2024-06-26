package behaviors;

import com.consol.citrus.TestActionRunner;
import com.consol.citrus.TestBehavior;
import com.consol.citrus.context.TestContext;

import static com.consol.citrus.http.actions.HttpActionBuilder.http;

public class MockServerUserBehavior implements TestBehavior {

    private TestContext context;

    public MockServerUserBehavior(TestContext context) {
        this.context = context;
    }

    @Override
    public void apply(TestActionRunner testActionRunner) {
        testActionRunner.$(http()
                .server("restServer")
                .receive()
                .get()
        );

        testActionRunner.$(http()
                .server("restServer")
                .send()
                .response()
                .message()
                .type("application/json").body("[\n" +
                        "{\n" +
                        "\"id\":1,\n" +
                        "\"name\":\"Ivanova Olga\",\n" +
                        "\"course\":\"QA Java\",\n" +
                        "\"email\":\"OlgaIvanova@Kmail.com\",\n" +
                        "\"age\": 23\n" +
                        "},\n" +
                        "{\n" +
                        "\"id\":2,\n" +
                        "\"name\":\"Timofeev Serge\",\n" +
                        "\"course\":\"Java\",\n" +
                        "\"email\":\"STimofeev@Kmail.com\",\n" +
                        "\"age\": 26\n" +
                        "}\n" +
                        "]")
        );

    }
}
