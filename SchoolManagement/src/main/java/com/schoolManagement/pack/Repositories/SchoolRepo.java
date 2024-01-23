package com.schoolManagement.pack.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolManagement.pack.Model.School;

public interface SchoolRepo extends JpaRepository<School, Integer>{

}
