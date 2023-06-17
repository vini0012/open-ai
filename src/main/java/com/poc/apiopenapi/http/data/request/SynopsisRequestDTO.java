package com.poc.apiopenapi.http.data.request;

import jakarta.validation.constraints.NotBlank;

public record SynopsisRequestDTO(@NotBlank String actor, @NotBlank String genre) {
}
