package com.poc.apiopenapi.http;

import com.poc.apiopenapi.http.data.request.PoemRequestDTO;
import com.poc.apiopenapi.http.data.request.ScienceFictionRequestDTO;
import com.poc.apiopenapi.http.data.request.SynopsisRequestDTO;
import com.poc.apiopenapi.http.data.request.TaleRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface OpenAIController {

    @Operation(summary = "Gera um poema curto no estilo do Autor informado dando continuidade ao seu texto.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "400",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = """
                                            {
                                                "errorCode": "400",
                                                "message": "Parâmetro(s) inválido(s).",
                                                "documentation": null
                                            }
                                            """
                            )
                    )
            )
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generatePoem(@Valid @RequestBody PoemRequestDTO poemRequestDTO);

    @Operation(summary = "Gera um conto de partir do título informado.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "400",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = """
                                            {
                                                "errorCode": "400",
                                                "message": "Parâmetro(s) inválido(s).",
                                                "documentation": null
                                            }
                                            """
                            )
                    )
            )
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generateTale(@Valid @RequestBody TaleRequestDTO taleRequestDTO);

    @Operation(summary = "Gera uma sinópse de um filme a partir do(a) ator/atriz e gênero de filme informado.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "400",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = """
                                            {
                                                "errorCode": "400",
                                                "message": "Parâmetro(s) inválido(s).",
                                                "documentation": null
                                            }
                                            """
                            )
                    )
            )
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generateSynopsis(@Valid @RequestBody SynopsisRequestDTO synopsisRequestDTO);

    @Operation(summary = "Gera uma história de ficção científica a partir do cenário informado.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "400",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = """
                                            {
                                                "errorCode": "400",
                                                "message": "Parâmetro(s) inválido(s).",
                                                "documentation": null
                                            }
                                            """
                            )
                    )
            )
    })
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    String generateScienceFiction(@Valid @RequestBody ScienceFictionRequestDTO scienceFictionRequestDTO);
}
