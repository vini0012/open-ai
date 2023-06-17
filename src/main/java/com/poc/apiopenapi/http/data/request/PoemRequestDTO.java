package com.poc.apiopenapi.http.data.request;

import jakarta.validation.constraints.NotBlank;

public record PoemRequestDTO(@NotBlank String author, @NotBlank String prompt) {}
