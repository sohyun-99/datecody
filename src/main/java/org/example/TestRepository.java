package org.example;

import org.example.dto.test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<test, Long> {
}
