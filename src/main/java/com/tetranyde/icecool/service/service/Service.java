package com.tetranyde.icecool.service.service;

import com.tetranyde.icecool.service.dto.request.OrderRequestDTO;
import org.springframework.http.ResponseEntity;

public interface Service {

    ResponseEntity placeOrderAndCalculate(OrderRequestDTO requestDTO);

}
