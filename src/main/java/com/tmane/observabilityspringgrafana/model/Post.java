package com.tmane.observabilityspringgrafana.model;

public record Post(Integer id,
                   Integer userId,
                   String title,
                   String body) { }
