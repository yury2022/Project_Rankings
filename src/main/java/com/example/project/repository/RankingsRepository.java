package com.example.project.repository;

import com.example.project.model.Rankings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankingsRepository extends JpaRepository<Rankings, Integer> {
}