package dio.com.br.rafaelblomer.domain.repository;

import dio.com.br.rafaelblomer.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
