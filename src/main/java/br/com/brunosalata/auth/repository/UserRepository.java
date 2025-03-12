package br.com.brunosalata.auth.repository;

import br.com.brunosalata.auth.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
