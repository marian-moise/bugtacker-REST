package com.project.service;

import com.project.Status;
import com.project.StatusRepository;
import com.project.dto.StatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {

    @Autowired
    StatusRepository statusRepository;

    public List<StatusDTO> getStatuses(){
        List<Status> all = statusRepository.findAll();

        return convertToDTOs(all);
    }

    public List<StatusDTO> getStatusesByParams(String order, Integer startingId){

        if(startingId == null || startingId < 0){
            startingId = 0;
        }

        List<Status> statuses;

        if("desc".equals(order)){
            statuses = statusRepository.
                    findAllByIdDeStatusGreaterThanOrderByIdDeStatusDesc(startingId);
            return convertToDTOs(statuses);
        }

        statuses = statusRepository.
                findAllByIdDeStatusGreaterThanOrderByIdDeStatus(startingId);

        return convertToDTOs(statuses);
    }

    private List<StatusDTO> convertToDTOs(List<Status> statuses){
        List<StatusDTO> statusDTOS = new ArrayList<>();

        for(Status s: statuses){
            statusDTOS.add(new StatusDTO(s.getIdDeStatus(), s.getNumeDeStatus()));
        }

        return statusDTOS;
     }
}
