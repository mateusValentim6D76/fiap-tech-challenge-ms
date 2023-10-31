package br.com.fiap.adapters.in.controller.mapper;

import org.modelmapper.ModelMapper;

public class PaymentMapperService <T>{

    private final ModelMapper modelMapper;

    public PaymentMapperService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

   // public MercadoPagoPayment mapTo(Class<T> type, Object object){
    //return modelMapper.map(object, type);
    }

