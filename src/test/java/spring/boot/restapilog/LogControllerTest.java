package spring.boot.restapilog;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class LogControllerTest {

    @Autowired
    private MockMvc mvc;

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void allLogs() throws Exception {
        mvc.perform(get("/logs"))
            .andExpect(status()
            .is(200));
    }

    @Test
    void addLog() throws Exception {
        Log log = new Log (213456789, "High Severity", "00:00:00", "This is a test message");

        mvc.perform(post("/log")
            .contentType("application/json")
            .content(mapper.writeValueAsString(log)))
            .andExpect(status().is(200));
    }
}