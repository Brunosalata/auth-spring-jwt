package br.com.brunosalata.auth.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */

@Table(name = "products")
@Entity(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String description;

    private String image;

    private Integer price;

    public Product(ProductRequestDTO product){
        this.name = product.name();
        this.description = product.description();
        this.image = product.image();
        this.price = product.price();
    }
}
