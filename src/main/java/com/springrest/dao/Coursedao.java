package com.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Course;

public interface Coursedao extends JpaRepository<Course, Long>{

}
