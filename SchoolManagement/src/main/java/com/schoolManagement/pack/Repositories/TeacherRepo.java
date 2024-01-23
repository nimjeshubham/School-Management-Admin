package com.schoolManagement.pack.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolManagement.pack.Model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
