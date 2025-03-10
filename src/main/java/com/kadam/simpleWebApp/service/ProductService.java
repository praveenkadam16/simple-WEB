package com.kadam.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadam.simpleWebApp.model.Product;
import com.kadam.simpleWebApp.repository.ProductRepo;
@Service
public class ProductService {
		@Autowired	
		ProductRepo repo;
	
		/*
		 * List<Product> products= new ArrayList<>(Arrays.asList( new
		 * Product(101,"Iphone",80000), new Product(102,"Laptop",40000), new
		 * Product(103,"Macbook",120000)));
		 */
		public List<Product> getProducts(){
			return repo.findAll();
		}
		public Product getProductById(int prodId) {
			return repo.findById(prodId).orElse(new Product());
			/*
			 * return products.stream() .filter(p->p.getProdId()==prodId)
			 * .findFirst().orElse(new Product(100,"No Item",0));
			 */
		}
		public void addProduct(Product prod) {
			repo.save(prod);
		}
		public void updateProduct(Product prod) {
			/*
			 * int index=0; for(int i=0;i<products.size();i++)
			 * if(products.get(i).getProdId()==prod.getProdId()) index=i;
			 * products.set(index, prod);
			 */
			repo.save(prod);
		}
		
		public void deleteProduct(int prodId) {
			repo.deleteById(prodId);
			/*
			 * int index=0; for(int i=0;i<products.size();i++)
			 * if(products.get(i).getProdId()== prodId) index=i; products.remove(index);
			 */
		}
		}
