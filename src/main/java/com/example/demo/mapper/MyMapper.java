package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.example.demo.domain.MyDomain;
import com.example.demo.entity.MyEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MyMapper {
    MyEntity domainToEntity(MyDomain domain);
    MyDomain entityToDomain(MyEntity entity);
}
