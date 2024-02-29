package com.example.project.repository;

import com.example.project.entity.DictKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictKeyRepository extends JpaRepository<DictKey, String> {
}
