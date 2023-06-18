package br.com.api.openai.http.impl;

import br.com.api.openai.http.OpenAIController;
import br.com.api.openai.http.data.request.PoemRequestDTO;
import br.com.api.openai.http.data.request.ScienceFictionRequestDTO;
import br.com.api.openai.http.data.request.SynopsisRequestDTO;
import br.com.api.openai.http.data.request.TaleRequestDTO;
import br.com.api.openai.service.impl.CallOpenAiServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "API Endpoints")
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
