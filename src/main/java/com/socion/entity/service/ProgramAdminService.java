package com.socion.entity.service;

import com.socion.entity.dao.Entity;
import com.socion.entity.dao.ProgramAdmin;
import com.socion.entity.dto.ProgramAdminDTO;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface ProgramAdminService {
    public Iterable<ProgramAdmin> convertAndSaveAll(List<String> userIds, Entity entity);

    public Iterable<ProgramAdmin> addAdmins(ProgramAdminDTO programAdminDTO, BindingResult bindingResult);

    public List<ProgramAdmin> getByUserId(String userId);

    public void deleteProgramAdmin(Long entityId, String userId);

    public void deleteProgramAdminsByEntityId(Long entityId);

    public List<ProgramAdmin> getProgramAdminsByEntityId(Long entityId);

}
