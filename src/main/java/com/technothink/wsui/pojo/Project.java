package com.technothink.wsui.pojo;

public class Project {

	private String projectName;
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", endPoint=" + endPoint
				+ ", serviceType=" + serviceType + ", wsdl=" + wsdl + "]";
	}

	private String endPoint;
	private String serviceType;
	private String wsdl;
	
	
	

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getWsdl() {
		return wsdl;
	}

	public void setWsdl(String wsdl) {
		this.wsdl = wsdl;
	}

}
