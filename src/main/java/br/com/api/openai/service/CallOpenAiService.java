package br.com.api.openai.service;

import br.com.api.openai.http.data.request.PoemRequestDTO;
import br.com.api.openai.http.data.request.ScienceFictionRequestDTO;
import br.com.api.openai.http.data.request.SynopsisRequestDTO;
import br.com.api.openai.http.data.request.TaleRequestDTO;
import org.springframework.stereotype.Service;

@Service
public interface CallOpenAiService {
    String generatePoem(PoemRequestDTO poemRequestDTO);
    String generateTale(TaleRequestDTO taleRequestDTO);
    String generateSynopsis(SynopsisRequestDTO taleRequestDTO);
    String generateScienceFiction(ScienceFictionRequestDTO taleRequestDTO);
}
