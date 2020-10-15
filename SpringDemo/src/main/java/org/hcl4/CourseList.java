package org.hcl4;

import java.util.ArrayList;

public class CourseList {
	  ArrayList<Course>courseList=new ArrayList();


	public  void insert(Course course)
	{
		courseList.add(course);
	}

	public void discount(){
		double min=0;
		double max=0;
		String maxCourse="";
		String minCourse="";
		for(Course course:courseList) 
		{
			if(course.getFee()>max) 
			{
				max=course.getFee();
				maxCourse=course.getName();
				}
			else if(course.getFee()<min) 
			{
				min=course.getFee();
				minCourse=course.getName();
			}
		}
		System.out.println("Discount "+0.1*max+" for "+maxCourse+" Course");
		System.out.println("Discount "+0.05*min+" for "+minCourse+" Course");
	}
}
