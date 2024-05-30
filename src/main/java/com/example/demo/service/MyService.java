package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MyEntity;
import com.example.demo.mapper.ManualMapper;
import com.example.demo.mapper.MyMapper;
import com.example.demo.repository.MyRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MyService {

    // private final MyMapper mapper;
    private final ManualMapper manualMapper;
    private final MyRepository myRepository;

    public MyEntity getEntity(Long id) {
        return myRepository.getReferenceById(id);
    }
}
