package com.devstack.pos.dao.custom;

import com.devstack.pos.dto.Product;
import com.devstack.pos.entity.User;

import java.util.List;

public interface ProductDao {
    public boolean saveProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(int code);
    public Product findProduct(int code);
    public List<Product> findAllProducts();
}
