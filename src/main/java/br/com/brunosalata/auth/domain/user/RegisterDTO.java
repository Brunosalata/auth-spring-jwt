package br.com.brunosalata.auth.domain.user;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record RegisterDTO( String login, String password, UserRole role) {
}
