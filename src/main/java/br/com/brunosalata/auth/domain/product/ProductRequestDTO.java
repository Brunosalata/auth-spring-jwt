package br.com.brunosalata.auth.domain.product;



/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public record ProductRequestDTO (
//        @NotBlank
        String name,

        String description,

        String image,

//        @NotNull
        Integer price
){
}
