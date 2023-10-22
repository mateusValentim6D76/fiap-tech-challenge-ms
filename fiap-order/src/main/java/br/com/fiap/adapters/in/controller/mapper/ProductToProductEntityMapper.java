package br.com.fiap.adapters.in.controller.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.out.repository.entity.ProductEntity;
import br.com.fiap.application.core.domain.Product;

@Component
public class ProductToProductEntityMapper {

    public ProductEntity mapper(Product product){
        var productEntity = new ProductEntity();
        BeanUtils.copyProperties(product, productEntity);
        return productEntity;
    }

}
