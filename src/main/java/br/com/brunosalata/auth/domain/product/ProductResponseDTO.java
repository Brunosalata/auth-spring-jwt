package br.com.brunosalata.auth.domain.product;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record ProductResponseDTO(String id, String name, String description, String image, Integer price) {
    public ProductResponseDTO(Product product){
        this(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getImage(),
                product.getPrice()
        );
    }
}
