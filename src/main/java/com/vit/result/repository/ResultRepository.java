package com.vit.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vit.result.entity.StudentResult;

public interface ResultRepository extends JpaRepository<StudentResult, Long> {
}