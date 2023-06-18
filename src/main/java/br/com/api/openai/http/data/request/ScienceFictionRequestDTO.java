package br.com.api.openai.http.data.request;

import jakarta.validation.constraints.NotBlank;

public record ScienceFictionRequestDTO(@NotBlank String scenario) {
}
