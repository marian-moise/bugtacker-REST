package com.project.controller;

import com.project.Project;
import com.project.ProjectRepository;
import com.project.dto.ProjectDTO;
import com.project.dto.StatusDTO;
import com.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {


    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    ProjectService projectService;

    //Gets with @PathVariable:
    //Gets with query param:
    @GetMapping(value = "/showProjectByIdNumber/{projectId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectDTO> showProjectByIdNumber(@PathVariable Integer projectId) {
        Optional<Project> project = projectRepository.findById(projectId);
        if (!project.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        Project projectFromOptional = project.get();
        ProjectDTO dto = new ProjectDTO(projectFromOptional.getProjectId(), projectFromOptional.getName(),
                projectFromOptional.getIdentifier());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/showProjectsByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectDTO> showProjectsByName(@PathVariable String name) {
        Optional<Project> project = projectRepository.findByName(name);
        if (!project.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        Project projectFromOptional = project.get();
        ProjectDTO dto = new ProjectDTO(projectFromOptional.getProjectId(), projectFromOptional.getIdentifier(),
                projectFromOptional.getName());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/showProjectsByIdentifier/{identifier}")
    public ResponseEntity<ProjectDTO> showProjectsByIdentifier(@PathVariable String identifier) {
        Optional<Project> projectFromOptional = projectRepository.findByIdentifier(identifier);
        if (!projectFromOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        Project pr = projectFromOptional.get();
        ProjectDTO dto = new ProjectDTO(pr.getProjectId(), pr.getName(), pr.getIdentifier());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/showProjectsByIdentifierContaining/{hint}")
    public ResponseEntity<ProjectDTO> showProjectsByIdentifierContaining(@PathVariable String hint) {
        Optional<Project> projectFromOptional = projectRepository.findByIdentifierContaining(hint);
        if (!projectFromOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        Project pr = projectFromOptional.get();
        ProjectDTO dto = new ProjectDTO(pr.getProjectId(), pr.getName(), pr.getIdentifier());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/showProjectsByDescriptionContaining/{hint}")
    public ResponseEntity<ProjectDTO> showProjectsByDescriptionContaining(@PathVariable String hint) {
        Optional<Project> projectFromOptional = projectRepository.findDistinctByDescriptionContaining(hint);
        if (!projectFromOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        Project pr = projectFromOptional.get();
        ProjectDTO dto = new ProjectDTO(pr.getProjectId(), pr.getName(), pr.getIdentifier(), pr.getDescription());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }


//????????????????????????????????????????????????????????

    @GetMapping(value = "/projects")
    public ResponseEntity<List<ProjectDTO>> projectList1(
            @RequestParam(name = "order", required = false) String order,
            @RequestParam(name = "idLessThan", required = false) Integer idLessThan) {


        List<ProjectDTO> dtos = projectService.getProjectByParam2(order, idLessThan);

        return new ResponseEntity<List<ProjectDTO>>(dtos, HttpStatus.OK);
    }

    // ????????????????????????????????????????????????????????


    //Gets:
    @GetMapping("/something")
    public ResponseEntity<String> firstMethodNoParam() {
        String s = "Get from the firstMethodNoParam ";
        return new ResponseEntity<>(s, HttpStatus.IM_USED);
    }

    @GetMapping("/otherValue")
    public ResponseEntity<Integer> secondMethodNoParam() {
        Integer x = 147;
        return new ResponseEntity<>(x, HttpStatus.I_AM_A_TEAPOT);
    }

    @GetMapping("/testString1")
    public ResponseEntity<String> teststring1() {
        String s = "Hello from localhost ";
        return new ResponseEntity<>(s, HttpStatus.ACCEPTED);
    }

    @GetMapping("/test2String2")
    public ResponseEntity<String> tstString2() {
        String s = "Ego zenovius votum posui ";
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping("/fibonacci")
    public ResponseEntity<List<Integer>> fibonacci() {

        List<Integer> list = new ArrayList<>(20);
        list.add(0, 0);
        list.add(1, 1);
        for (int i = 2; i < 20; i++) {
            list.add(i, list.get(i - 1) + list.get(i - 2));
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/nrImpare")
    public ResponseEntity<List<Integer>> nrImpare() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                ints.add(i);
            }
        }
        return new ResponseEntity<>(ints, HttpStatus.OK);
    }


//????????????????????????????????????????????????????????

//    @GetMapping("/nrImpare2")
//    public void nrImpare2() {
//        List<Integer> ints = new ArrayList<>();
//        for (int i = 0; i < 20 ; i++) {
//            if (i % 2 != 0) {
//                ints.add(i);
//            }
//        }
//        System.out.println(ints);
//    }
// ????????????????????????????????????????????????????????


    //Gets with no parameters show the whole DTO List of objects:
    @GetMapping(value = "/showAllProjects")
    public ResponseEntity<List<ProjectDTO>> projectsList1() {
        List<Project> projectsFromDatabase = projectRepository.findAll();
        List<ProjectDTO> dto = new ArrayList<>();
        for (Project p : projectsFromDatabase) {
            dto.add(new ProjectDTO(
                    p.getProjectId(), p.getName(), p.getIdentifier()
            ));
        }
        return new ResponseEntity<List<ProjectDTO>>(dto, HttpStatus.OK);
    }

    @GetMapping(value = "/showProjectsOrderedByName")
    public ResponseEntity<List<ProjectDTO>> projectsList2(
            @RequestParam(name = "name", required = false) String name) {
        List<ProjectDTO> dtos = projectService.getProjectByParam(name);
        return new ResponseEntity<List<ProjectDTO>>(dtos, HttpStatus.OK);
    }


    //Posts with just Strings:
    @PostMapping("/firstPost")
    public void postMethodNoParam1(@RequestBody String data) {
        System.out.println("data from first post: " + data);
    }

    @PostMapping("/secondPost")
    public void secondPost() {
        System.out.println("Ego zenovius votum posui");
    }

    @PostMapping("/thirdPost")
    public void thirdPost(@RequestBody String data) {
        System.out.println("the value posted is: " + data);
    }

    @PostMapping("/fibonacciPost")
    public void fibonacciPost() {
        int[] ints = new int[10];
        ints[0] = 0;
        ints[1] = 1;
        for (int i = 2; i < ints.length; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        System.out.println(Arrays.toString(ints));
    }

    @PostMapping("/nrImpare")
    public void fourthPost() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                ints.add(i);
            }
        }
        System.out.println(ints);
    }


    //Posts with the whole DTO object:
    @PostMapping(value = "/makeNewProject")
    public ResponseEntity<Project> saveProjectInDatabase(@RequestBody ProjectDTO newProject) {
        Project projectToSave = new Project(newProject.getProjectId(), newProject.getName(), newProject.getIdentifier(), newProject.getDescription());
        projectRepository.save(projectToSave);
        return new ResponseEntity<>(projectToSave, HttpStatus.OK);
    }

    @PostMapping(value = "/showProjectName",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void showProjectName(@RequestBody ProjectDTO projectDTO) {
        System.out.println(projectDTO);
    }


}
