package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.MyMapper;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MyService {

    private final MyMapper mapper;
    // private final ManualMapper manualMapper;
    // private final MyRepository myRepository;

    // public MyEntity getEntity(Long id) {
    //     return myRepository.getReferenceById(id);
    // }
}
