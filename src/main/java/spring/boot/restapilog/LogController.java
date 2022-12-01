package spring.boot.restapilog;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LogController {

    private final LogRepository repository;

    LogController(LogRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/logs")
    List<Log> allLogs() {
        return repository.findAll();
    }

    @PostMapping("/log")
    Log addLog(@RequestBody Log newLog) {
        return repository.save(newLog);
    }
}
