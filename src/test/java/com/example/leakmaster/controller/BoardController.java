package com.example.leakmaster.controller;

import com.example.leakmaster.domain.BoardModel;
import com.example.leakmaster.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService service;

    public ResponseEntity<List<BoardModel>> getBoards(){
        return ResponseEntity.ok(service.getBoards());
    }
}
