package com.rd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.dto.ProductDto;
import com.rd.entity.Product;
import com.rd.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo repo;
	
	@Override
	public void save(ProductDto p) {
	    Product prod = new Product();
	    prod.setCode(p.getCode());
	    prod.setName(p.getName());
	    prod.setPrice(p.getPrice());
	    prod.setCategory(p.getCategory());
	    repo.save(prod);
	}

	@Override
	public List<Product> list() {
		return repo.findAll();
	}

	@Override
	public Product getByCode(int code) {
		return repo.findById(code).get();
	}

	@Override
	public void delete(int code) {
		repo.deleteById(code);
	}

	@Override
	public List<Product> listByCategory(String cat) {
		return repo.listByCategory(cat);
	}

	@Override
	public List<Product> listByRange(double min, double max) {
		return repo.listByRange(min, max);
	}

	@Override
	public List<Product> listByPriceLowToHigh() {
		return repo.listByPriceLowToHigh();
	}

}
