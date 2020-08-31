package com.project;

import com.project.dto.ProjectDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {


    List<Project> findAllByProjectIdLessThanOrderByProjectIdDesc(Integer startingId);

    List<Project> findAllByProjectIdOrderByProjectIdDesc(Integer projectId);

    List<Project> deleteProjectByProjectIdAndIdentifier(Integer projectId, String identifier);

    List<Project> countAllByProjectIdGreaterThan(Integer graterThan);

    Optional<Project> findByName(String name);

    Optional<Project> findByIdentifier(String identifier);

    Optional<Project> findByIdentifierContaining(String containing);

    Optional<Project> findDistinctByDescriptionContaining(String containing);

    List<Project> findAllOrderByName(String name);


}
