package com.project.service;

import com.project.Project;
import com.project.ProjectRepository;
import com.project.Status;
import com.project.dto.ProjectDTO;
import com.project.dto.StatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    public List<ProjectDTO> getProjectByParam(String name) {

        List<Project> projects =
                projectRepository.findAllOrderByName(name);
        return convertToDTOs(projects);
    }

    public List<ProjectDTO> getProjectByParam2(String order, Integer startingId) {

        if (startingId == null || startingId < 0) {
            startingId = 0;
        }
        List<Project> projects;
        if ("desc".equals(order)) {
            projects = projectRepository.
                    findAllByProjectIdLessThanOrderByProjectIdDesc(startingId);
            return convertToDTOs(projects);
        }
        projects = projectRepository.
                findAllByProjectIdLessThanOrderByProjectIdDesc(startingId);

        return convertToDTOs(projects);
    }


    private List<ProjectDTO> convertToDTOs(List<Project> projects) {
        List<ProjectDTO> projectDTOS = new ArrayList<>();

        for (Project p : projects) {
            projectDTOS.add(
                    new ProjectDTO(p.getProjectId(), p.getName(), p.getIdentifier()));
        }
        return projectDTOS;
    }


}
