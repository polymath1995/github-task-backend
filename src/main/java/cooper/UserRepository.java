package cooper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cooper.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUsername(String username);

}