package br.com.brunosalata.auth.controller;

import br.com.brunosalata.auth.domain.product.Product;
import br.com.brunosalata.auth.domain.product.ProductRequestDTO;
import br.com.brunosalata.auth.domain.product.ProductResponseDTO;
import br.com.brunosalata.auth.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity getAlProducts(){
        List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO::new).toList();
        return ResponseEntity.ok(productList);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity postProduct(@RequestBody /*@Valid*/ ProductRequestDTO body){
        Product newProduct = new Product(body);
        this.repository.save(newProduct);
        return ResponseEntity.ok().build();
    }
}
