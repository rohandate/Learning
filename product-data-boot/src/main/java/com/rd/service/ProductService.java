package com.rd.service;
import java.util.List;

import com.rd.dto.ProductDto;
import com.rd.entity.Product;

public interface ProductService {
	
	void save(ProductDto p);	
	
	 List<Product> list();
	 
	 Product getByCode(int code);
	 
	 void delete(int code);
	 
	 List <Product> listByCategory(String cat);
	 
	 List <Product> listByRange(double min, double max);
	 
	 List<Product> listByPriceLowToHigh();
	 
	 
}
