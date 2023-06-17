package com.poc.apiopenapi.http.data.response;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.lang.NonNull;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class Error {

    private final String code;
    private final String message;
    private final String documentation;

    public Error(@NonNull String code, @NonNull String message, @NonNull String urlDocumentation) {
        this.code = code;
        this.message = message;
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        String url = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        this.documentation = url + urlDocumentation;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDocumentation() {
        return documentation;
    }
}
