package com.tetranyde.icecool.service.controller;


import com.tetranyde.icecool.service.dto.request.OrderRequestDTO;
import com.tetranyde.icecool.service.dto.response.SuccessResponseDto;
import com.tetranyde.icecool.service.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("ap1/v1/order")
public class OrderController {
    @Autowired
    private Service service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveItem(@RequestBody OrderRequestDTO requestDTO){
      return service.placeOrderAndCalculate(requestDTO);
    }

    @GetMapping
    public ResponseEntity Test(){
      return new ResponseEntity<>((new SuccessResponseDto(0,"Cannot Save Data Due To Missing Fields !!!",true)), HttpStatus.OK);
    }

}

