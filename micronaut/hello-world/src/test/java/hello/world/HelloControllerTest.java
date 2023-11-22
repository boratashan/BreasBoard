package hello.world;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class HelloControllerTest {

    @Inject
    EmbeddedServer server; // (1)

    @Inject
    @Client("/")
    HttpClient client; // (2)

    @BeforeEach
    void setUp() {
    }

    @Test
    void index() {
        String response = client.toBlocking() // (3)
                .retrieve(HttpRequest.GET("/hello"));
        assertEquals("Hello World", response); // (4)
    }
}