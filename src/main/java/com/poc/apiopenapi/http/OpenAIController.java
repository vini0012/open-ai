package com.poc.apiopenapi.http;

import com.poc.apiopenapi.http.data.request.PoemRequestDTO;
import com.poc.apiopenapi.http.data.request.ScienceFictionRequestDTO;
import com.poc.apiopenapi.http.data.request.SynopsisRequestDTO;
import com.poc.apiopenapi.http.data.request.TaleRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface OpenAIController {
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generatePoem(@Valid @RequestBody PoemRequestDTO poemRequestDTO);

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generateTale(@Valid @RequestBody TaleRequestDTO taleRequestDTO);

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generateSynopsis(@Valid @RequestBody SynopsisRequestDTO synopsisRequestDTO);

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generateScienceFiction(@Valid @RequestBody ScienceFictionRequestDTO scienceFictionRequestDTO);
}
