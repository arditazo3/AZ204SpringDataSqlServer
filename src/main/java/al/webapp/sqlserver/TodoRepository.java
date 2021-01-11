package al.webapp.sqlserver;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ardit
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
