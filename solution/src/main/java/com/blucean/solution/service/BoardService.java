package com.blucean.solution.service;

import com.blucean.solution.model.Board;
import com.blucean.solution.model.User;
import com.blucean.solution.repositories.BoardRepository;
import com.blucean.solution.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
         User user = userRepository.findByUsername(username);
         board.setUser(user);
         return  boardRepository.save(board);
    }

}
