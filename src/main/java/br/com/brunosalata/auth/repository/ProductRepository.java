package br.com.brunosalata.auth.repository;

import br.com.brunosalata.auth.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public interface ProductRepository extends JpaRepository<Product, String> {
}
