package com.socion.entity.service;

import com.socion.entity.dto.EntityDTO;
import com.socion.entity.dto.RequestDTO;
import com.socion.entity.dto.ResponseDTO;
import org.springframework.validation.BindingResult;

public interface UtilityService {

    public ResponseDTO createEntity(EntityDTO requestDTO, BindingResult bindingResult);

    public ResponseDTO createProgrDBMulti(RequestDTO payload, BindingResult bindingResult);

}
