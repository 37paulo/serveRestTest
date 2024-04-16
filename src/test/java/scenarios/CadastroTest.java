package scenarios;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CadastroTest {

    @Before
    public void setUp(){

        RestAssured.baseURI = "https://serverest.dev";
    }

    @Test
    public void testCadastro(){

        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/usuarios")
        .then()
            .log()
                .all();

    }
}
