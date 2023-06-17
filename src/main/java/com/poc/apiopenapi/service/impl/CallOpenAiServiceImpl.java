package com.poc.apiopenapi.service.impl;

import com.poc.apiopenapi.http.data.request.PoemRequestDTO;
import com.poc.apiopenapi.http.data.request.ScienceFictionRequestDTO;
import com.poc.apiopenapi.http.data.request.SynopsisRequestDTO;
import com.poc.apiopenapi.http.data.request.TaleRequestDTO;
import com.poc.apiopenapi.service.CallOpenAiService;
import com.poc.apiopenapi.component.ChatStreamComponent;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.completion.chat.ChatMessageRole;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record CallOpenAiServiceImpl(ChatStreamComponent chatStreamService) implements CallOpenAiService {

    public static final String POEM_PROMPT_MESSAGE = "Gere um poema curto, ao estilo de %s, continuando o texto: %s";
    public static final String TALE_PROMPT_MESSAGE = "Gere um conto de 5 parágrafos partir do título %s";
    public static final String SYNOPSIS_PROMPT_MESSAGE = "Gere uma sinopse sobre um filme do ator %s para um filme do genero %s e coloque o título na primeira linha";
    public static final String SCIENCE_FICTION_PROMPT_MESSAGE = "Gere uma estória de ficção científica de acordo com o seguinte cenário: %s";

    @Override
    public String generatePoem(PoemRequestDTO poemRequestDTO) {
        ChatCompletionRequest chatCompletionRequest = chatStreamService.createChatStreamRequest(List.of(
            new ChatMessage(ChatMessageRole.SYSTEM.value(), String.format(POEM_PROMPT_MESSAGE, poemRequestDTO.author(), poemRequestDTO.prompt()))
        ));
        return chatStreamService.getChatStreamResult(chatCompletionRequest);
    }

    @Override
    public String generateTale(TaleRequestDTO taleRequestDTO) {
        ChatCompletionRequest chatCompletionRequest = chatStreamService.createChatStreamRequest(List.of(
                new ChatMessage(ChatMessageRole.SYSTEM.value(), String.format(TALE_PROMPT_MESSAGE, taleRequestDTO.title()))
        ));
        return chatStreamService.getChatStreamResult(chatCompletionRequest);
    }

    @Override
    public String generateSynopsis(SynopsisRequestDTO synopsisRequestDTO) {
        ChatCompletionRequest chatCompletionRequest = chatStreamService.createChatStreamRequest(List.of(
                new ChatMessage(ChatMessageRole.SYSTEM.value(), String.format(SYNOPSIS_PROMPT_MESSAGE, synopsisRequestDTO.actor(), synopsisRequestDTO.genre()))
        ));
        return chatStreamService.getChatStreamResult(chatCompletionRequest);
    }

    @Override
    public String generateScienceFiction(ScienceFictionRequestDTO scienceFictionRequestDTO) {
        ChatCompletionRequest chatCompletionRequest = chatStreamService.createChatStreamRequest(List.of(
                new ChatMessage(ChatMessageRole.SYSTEM.value(), String.format(SCIENCE_FICTION_PROMPT_MESSAGE, scienceFictionRequestDTO.scenario()))
        ));
        return chatStreamService.getChatStreamResult(chatCompletionRequest);
    }
}
