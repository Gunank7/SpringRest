package com.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.Coursedao;
import com.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private Coursedao courseDao;
	//List<Course> list;

	public CourseServiceImpl() {
		//list = new ArrayList<>();
	//	list.add(new Course(121, "JAVA DEVELOPER", "THESE IS VERY HARD LANGUAGE DONT TRY AT HOME"));
	//	list.add(new Course(122, "PYTHON DEVELOPER", "THESE IS EASY LANGUAGE U CAN  TRY AT HOME "));

	}

	@Override
	public List<Course> getCourses() {
//		return list;
		return courseDao.findAll();
	}

	@Override
	public Course getCourses(long courseId) {

//		Course c = null;
//
//		for (Course course : list) {
//
//			if (course.getId() == courseId) {
//
//				c = course;
//				break;
//			}
//		}

//		return c;
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
	
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
