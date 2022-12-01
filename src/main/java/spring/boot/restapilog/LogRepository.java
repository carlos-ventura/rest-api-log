package spring.boot.restapilog;
import org.springframework.data.jpa.repository.JpaRepository;

interface LogRepository extends JpaRepository<Log, Long> {
}
