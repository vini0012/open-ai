package com.poc.apiopenapi.service;

import com.poc.apiopenapi.http.data.request.PoemRequestDTO;
import com.poc.apiopenapi.http.data.request.ScienceFictionRequestDTO;
import com.poc.apiopenapi.http.data.request.SynopsisRequestDTO;
import com.poc.apiopenapi.http.data.request.TaleRequestDTO;
import org.springframework.stereotype.Service;

@Service
public interface CallOpenAiService {
    String generatePoem(PoemRequestDTO poemRequestDTO);
    String generateTale(TaleRequestDTO taleRequestDTO);
    String generateSynopsis(SynopsisRequestDTO taleRequestDTO);
    String generateScienceFiction(ScienceFictionRequestDTO taleRequestDTO);
}
