package com.example.leakmaster.repository;

import com.example.leakmaster.domain.BoardModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardModel, Long> {
}
