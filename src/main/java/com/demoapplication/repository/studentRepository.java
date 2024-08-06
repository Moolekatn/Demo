package com.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoapplication.entity.studentEntity;

public interface studentRepository extends JpaRepository<studentEntity, Integer>{

}
