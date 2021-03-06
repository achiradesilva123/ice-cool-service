package com.tetranyde.icecool.service.controller;


import com.tetranyde.icecool.service.constant.ResponseCode;
import com.tetranyde.icecool.service.dto.request.OrderRequestDTO;
import com.tetranyde.icecool.service.dto.response.SuccessResponseDto;
import com.tetranyde.icecool.service.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.tetranyde.icecool.service.constant.ResponseCode.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private Service service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveItem(@RequestBody OrderRequestDTO requestDTO){
      return service.placeOrderAndCalculate(requestDTO);
    }

    @GetMapping
    public ResponseEntity Test(){
      return new ResponseEntity<>((new SuccessResponseDto(OPERATION_SUCCESS,"Testing..!",true)), HttpStatus.OK);
    }

}

