package com.poc.apiopenapi.http.data.request;

import jakarta.validation.constraints.NotBlank;

public record TaleRequestDTO(@NotBlank String title) {
}