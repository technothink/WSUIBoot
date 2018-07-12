package com.technothink.wsui.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.technothink.wsui.pojo.Project;

public class AppUtil {

	private static AppUtil appUtil;
	private Map<String, Project> projectMap = null;

	private AppUtil() {
		projectMap = new HashMap<String, Project>();
	}

	public static AppUtil get() {
		if (null == appUtil) {
			synchronized (AppUtil.class) {
				if (null == appUtil) {
					appUtil = new AppUtil();
				}
			}
		}

		return appUtil;
	}

	public Project getProject(String key) {

		return projectMap.get(key);
	}

	public void saveProject(Project project, String key) {
		projectMap.put(key, project);
	}

	public List<Project> getProjects() {

		List<Project> project = new ArrayList<Project>();
		for (Map.Entry<String, Project> map : projectMap.entrySet()) {
			project.add(map.getValue());
		}
		return project;
	}

}
