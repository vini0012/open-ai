package com.poc.apiopenapi.http.impl;

import com.poc.apiopenapi.http.OpenAIController;
import com.poc.apiopenapi.http.data.request.PoemRequestDTO;
import com.poc.apiopenapi.http.data.request.ScienceFictionRequestDTO;
import com.poc.apiopenapi.http.data.request.SynopsisRequestDTO;
import com.poc.apiopenapi.http.data.request.TaleRequestDTO;
import com.poc.apiopenapi.service.impl.CallOpenAiServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/openai")
public record OpenAIControllerImpl(CallOpenAiServiceImpl service) implements OpenAIController {

    @Override
    @PostMapping(value = "/poem")
    @ResponseStatus(HttpStatus.OK)
    public String generatePoem(@Valid @RequestBody PoemRequestDTO poemRequestDTO) {
        return service.generatePoem(poemRequestDTO);
    }

    @Override
    @PostMapping(value = "/tale")
    @ResponseStatus(HttpStatus.OK)
    public String generateTale(@Valid @RequestBody TaleRequestDTO taleRequestDTO) {
        return service.generateTale(taleRequestDTO);
    }

    @Override
    @PostMapping(value = "/synopsis")
    @ResponseStatus(HttpStatus.OK)
    public String generateSynopsis(@Valid @RequestBody SynopsisRequestDTO synopsisRequestDTO) {
        return service.generateSynopsis(synopsisRequestDTO);
    }

    @Override
    @PostMapping(value = "/science-fiction")
    @ResponseStatus(HttpStatus.OK)
    public String generateScienceFiction(@Valid @RequestBody ScienceFictionRequestDTO scienceFictionRequestDTO) {
        return service.generateScienceFiction(scienceFictionRequestDTO);
    }

}
