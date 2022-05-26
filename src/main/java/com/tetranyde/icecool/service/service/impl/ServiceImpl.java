package com.tetranyde.icecool.service.service.impl;

import com.tetranyde.icecool.service.dto.request.OrderRequestDTO;
import com.tetranyde.icecool.service.dto.response.FailedResponseDto;
import com.tetranyde.icecool.service.dto.response.OrderResponseDto;
import com.tetranyde.icecool.service.dto.response.SuccessResponseDto;
import com.tetranyde.icecool.service.enums.FillingType;
import com.tetranyde.icecool.service.enums.FlavorsType;
import com.tetranyde.icecool.service.exception.CustomException;
import com.tetranyde.icecool.service.exception.CustomServiceException;
import com.tetranyde.icecool.service.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static com.tetranyde.icecool.service.constant.ResponseCode.OPERATION_SUCCESS;
import static com.tetranyde.icecool.service.enums.FillingType.*;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Override
    public ResponseEntity placeOrderAndCalculate(OrderRequestDTO requestDTO) {
       try{
            if(requestDTO.getFlavorsType() != null && requestDTO.getConeType() != null){

                if(requestDTO.getFillingType() != null){

                   return calculatePrice(requestDTO);

                }else{
                    OrderResponseDto orderResponseDto = new OrderResponseDto(requestDTO.getFlavorsType().getValue(),requestDTO.getConeType().getPrice());
                    orderResponseDto.setTotal((requestDTO.getFlavorsType().getValue()+requestDTO.getConeType().getPrice()));
                    return new ResponseEntity<>((new SuccessResponseDto(OPERATION_SUCCESS,orderResponseDto,true)), HttpStatus.OK);
                }

            }else return new ResponseEntity<>((new FailedResponseDto(false,"200","Invalid Order!!")), HttpStatus.OK);


       }catch (Exception e){
           throw  e;
       }
    }

    private ResponseEntity calculatePrice(OrderRequestDTO requestDTO){

        List<String> availability = new ArrayList<>();
        Double fillingPrice = 0.00;

        switch (requestDTO.getFillingType()){
            case "Sprinkles":
                fillingPrice = Sprinkles.Sprinkles.getValue();
                availability = Sprinkles.Sprinkles.getAvailability();
                break;
            case "Toasted_Marshmallow" :
                fillingPrice = Toasted_Marshmallow.Toasted_Marshmallow.getValue();
                availability = Toasted_Marshmallow.Toasted_Marshmallow.getAvailability();
                break;
            case "Toasted_Almond_Flakes":
                fillingPrice = Toasted_Almond_Flakes.Toasted_Almond_Flakes.getValue();
                availability = Toasted_Almond_Flakes.Toasted_Almond_Flakes.getAvailability();
                break;
            case "Dash_Of_Peanut_Butter":
                fillingPrice = Dash_Of_Peanut_Butter.Dash_Of_Peanut_Butter.getValue();
                availability = Dash_Of_Peanut_Butter.Dash_Of_Peanut_Butter.getAvailability();
                break;
            case "Oreo_Crumbles":
                fillingPrice = Oreo_Crumbles.Oreo_Crumbles.getValue();
                availability = Oreo_Crumbles.Oreo_Crumbles.getAvailability();
                break;
            case "Dried_Apples":
                fillingPrice = Dried_Fruit.Dried_Apples.getValue();
                availability = Dried_Fruit.Dried_Apples.getAvailability();
                break;
            case "Dried_Mango":
                fillingPrice = Dried_Fruit.Dried_Mango.getValue();
                availability = Dried_Fruit.Dried_Mango.getAvailability();
                break;
            case "Dried_Apricot":
                fillingPrice = Dried_Fruit.Dried_Apricot.getValue();
                availability = Dried_Fruit.Dried_Apricot.getAvailability();
                break;
            case "Dried_Blueberry":
                fillingPrice = Dried_Fruit.Dried_Blueberry.getValue();
                availability = Dried_Fruit.Dried_Blueberry.getAvailability();
                break;
            case "Dried_Fruit": return new ResponseEntity<>((new FailedResponseDto(false,"200","Select type between ")), HttpStatus.OK);

            default: return new ResponseEntity<>((new FailedResponseDto(false,"200","Invalid Flavors!!")), HttpStatus.OK);

        }

        if(!checkAvailablility(requestDTO.getFlavorsType(),availability))
            return new ResponseEntity<>((new FailedResponseDto(false,"200","Filling Doesnt support for Flavor")), HttpStatus.OK);

        OrderResponseDto orderResponseDto = new OrderResponseDto(requestDTO.getFlavorsType().getValue(),fillingPrice,requestDTO.getConeType().getPrice());
        orderResponseDto.setTotal((requestDTO.getFlavorsType().getValue()+fillingPrice+requestDTO.getConeType().getPrice()));
        return new ResponseEntity<>((new SuccessResponseDto(OPERATION_SUCCESS,orderResponseDto,true)), HttpStatus.OK);
    }


    private boolean checkAvailablility(FlavorsType type ,List<String> availability){
        for (String s : availability){
            return s.equalsIgnoreCase(type.name());
        }
        return false;
    };

}
