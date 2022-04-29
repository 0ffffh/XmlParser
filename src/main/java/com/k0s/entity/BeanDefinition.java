package com.k0s.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class BeanDefinition {
    private String id;
    private String className;
    private Map<String, String> valueDependencies;
    private Map<String, String> refDependencies;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }
}