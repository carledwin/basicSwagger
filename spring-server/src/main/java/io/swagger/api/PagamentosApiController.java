package io.swagger.api;

import io.swagger.model.Pagamento;
import io.swagger.model.Transacao;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-03T03:10:36.258Z")

@Controller
public class PagamentosApiController implements PagamentosApi {



    public ResponseEntity<Pagamento> buscaPagamento(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Pagamento>(HttpStatus.OK);
    }

    public ResponseEntity<Pagamento> cancelarPagamento(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Pagamento>(HttpStatus.OK);
    }

    public ResponseEntity<Pagamento> confirmarPagamento(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id) {
        // do some magic!
        return new ResponseEntity<Pagamento>(HttpStatus.OK);
    }

    public ResponseEntity<Pagamento> criarPagamento(@ApiParam(value = "Transação" ,required=true )  @Valid @RequestBody Transacao transacao) {
        // do some magic!
        return new ResponseEntity<Pagamento>(HttpStatus.OK);
    }

}
