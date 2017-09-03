package io.swagger.api.factories;

import io.swagger.api.PagamentosApiService;
import io.swagger.api.impl.PagamentosApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-03T03:09:16.791Z")
public class PagamentosApiServiceFactory {
    private final static PagamentosApiService service = new PagamentosApiServiceImpl();

    public static PagamentosApiService getPagamentosApi() {
        return service;
    }
}
