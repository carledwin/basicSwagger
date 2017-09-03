package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PagamentosApiService;
import io.swagger.api.factories.PagamentosApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Pagamento;
import io.swagger.model.Transacao;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/pagamentos")


@io.swagger.annotations.Api(description = "the pagamentos API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-03T03:09:16.791Z")
public class PagamentosApi  {
   private final PagamentosApiService delegate;

   public PagamentosApi(@Context ServletConfig servletContext) {
      PagamentosApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PagamentosApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PagamentosApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PagamentosApiServiceFactory.getPagamentosApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "| O Pagamentos delete endpoint *busca o* pagamento.", response = Pagamento.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Pagamento.class) })
    public Response buscaPagamento(@ApiParam(value = "",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.buscaPagamento(id,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Cancela um pagamento", notes = "| O Pagamentos delete endpoint *cancela o* pagamento.", response = Pagamento.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Pagamento cancelado", response = Pagamento.class) })
    public Response cancelarPagamento(@ApiParam(value = "",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelarPagamento(id,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Confirma o pagamento", notes = "| O Pagamentos put endpoint *confirma o* pagamento.", response = Pagamento.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Pagamento confirmado", response = Pagamento.class) })
    public Response confirmarPagamento(@ApiParam(value = "",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.confirmarPagamento(id,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cria novo pagamento", notes = "Endpoint de pagamento", response = Pagamento.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Novo pagamento criado", response = Pagamento.class) })
    public Response criarPagamento(@ApiParam(value = "Transação" ,required=true) Transacao transacao
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.criarPagamento(transacao,securityContext);
    }
}
