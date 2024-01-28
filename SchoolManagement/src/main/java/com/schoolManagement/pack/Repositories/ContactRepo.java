package com.schoolManagement.pack.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolManagement.pack.Model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
