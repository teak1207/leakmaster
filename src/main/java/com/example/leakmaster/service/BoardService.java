package com.example.leakmaster.service;

import com.example.leakmaster.domain.BoardModel;
import com.example.leakmaster.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository repository;

    public List<BoardModel> getBoards() {
        return repository.findAll();
    }

}
