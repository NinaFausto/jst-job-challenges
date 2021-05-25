package com.ninafausto.pontointeligente.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

    private T data;
    private List<String> errors;

    public Response() {
    }

    public T getData() {
        return data;
    }

    public void setData(T Data) {
        this.data = data;
    }

    public List<String> getErrors() {
        if (this.erros == null) {
            this.erros = new ArrayList<String>();
        }
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
}

}