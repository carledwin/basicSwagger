package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Pagamento;
import io.swagger.model.Transacao;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-03T03:09:16.791Z")
public abstract class PagamentosApiService {
    public abstract Response buscaPagamento(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response cancelarPagamento(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response confirmarPagamento(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response criarPagamento(Transacao transacao,SecurityContext securityContext) throws NotFoundException;
}
