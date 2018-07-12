package com.technothink.wsui.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technothink.wsui.pojo.Project;
import com.technothink.wsui.pojo.ServiceResponse;
import com.technothink.wsui.util.AppUtil;

@CrossOrigin
@RestController
public class RestServiceController {

	@RequestMapping(value = "/saveProject", method = RequestMethod.POST)
	public ServiceResponse saveProject(@RequestBody Project project) {
		ServiceResponse response = null;
		try {
			AppUtil.get().saveProject(project, project.getProjectName());
			System.out.println("Project saved");

		} catch (Throwable th) {

		}

		return response;

	}

	@RequestMapping(value = "/getProjects", method = RequestMethod.GET)
	public ServiceResponse getProjects() {
		ServiceResponse response = null;
		try {
			List<Project> projectList = AppUtil.get().getProjects();
			response = new ServiceResponse("Success", 0, projectList);
		} catch (Throwable th) {

		}
		return response;
	}

	@RequestMapping("/check")
	public String isRunning() {
		return "Hurray Its Working !!!! ";
	}
}
