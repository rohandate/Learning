package com.rd.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rd.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	 @Query("FROM Product where :cat=category")
	 List <Product> listByCategory(String cat);
	 
	 @Query("FROM Product WHERE price between :min and :max")
	 List <Product> listByRange(double min, double max);
	 
	 @Query("FROM Product ORDER BY price")
	 List<Product> listByPriceLowToHigh();
	
}
