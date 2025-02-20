package com.wipro.employee.fegin;

import com.wipro.employee.client.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "project-service", url = "http://localhost:9098/project")
public interface ProjectClient {

    @GetMapping("/company/{pcode}")
    List<Project> getProjectsByPcode(@PathVariable("pcode") Long pcode);
}