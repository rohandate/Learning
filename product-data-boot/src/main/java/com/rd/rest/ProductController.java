package com.rd.rest;

import com.rd.dto.ProductDto;
import com.rd.entity.Product;
import com.rd.service.ProductService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping(value="/add", consumes="application/json")
    public ResponseEntity<String> add(@RequestBody @Valid ProductDto p) {
        service.save(p);
        return new ResponseEntity<>("Product added", HttpStatus.OK);
    }

    @GetMapping(value="/list", produces = "application/json")
    public ResponseEntity<List<Product>> list() {
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @GetMapping(value="/{code}")
    public ResponseEntity<List<Product>> find(@PathVariable int code) {
        return new ResponseEntity<List<Product>>(service.list(), HttpStatus.OK);
    }

    @DeleteMapping(value="/{code}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int code) {
        service.delete(code);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/category/{cat}")
    public ResponseEntity<List<Product>> find(@PathVariable String cat) {
        return new ResponseEntity<>(service.listByCategory(cat), HttpStatus.OK);
    }

    @GetMapping("/price-range")
    public ResponseEntity<List<Product>> getProductsByPriceRange(@RequestParam double min, @RequestParam double max) {
        return new ResponseEntity<>(service.listByRange(min, max), HttpStatus.OK);
    }

    @GetMapping("/price-low-to-high")
    public ResponseEntity<List<Product>> getProductsByPriceLowToHigh() {
        return new ResponseEntity<>(service.listByPriceLowToHigh(), HttpStatus.OK);
    }
}
