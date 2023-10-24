package br.com.fiap.adapters.in.controller.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.fiap.adapters.in.controller.request.ProductRequest;
import br.com.fiap.application.core.domain.Product;

@Component
public class ProductRequestToProductMapper {

	public Product productMapper(ProductRequest productRequest) {
		var product = new Product();
		BeanUtils.copyProperties(productRequest, product);
		return product;
	}

}
