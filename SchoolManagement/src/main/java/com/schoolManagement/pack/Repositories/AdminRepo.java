package com.schoolManagement.pack.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolManagement.pack.Model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
