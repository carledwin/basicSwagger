/*
 * Pagamento API
 * Descricao da API de pagamento
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;

/**
 * Transacao
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-03T03:09:16.791Z")
public class Transacao   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("titular")
  private String titular = null;

  @JsonProperty("data")
  private Date data = null;

  @JsonProperty("valor")
  private Double valor = null;

  public Transacao codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Codigo da transacao.
   * @return codigo
   **/
  @JsonProperty("codigo")
  @ApiModelProperty(value = "Codigo da transacao.")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Transacao titular(String titular) {
    this.titular = titular;
    return this;
  }

  /**
   * Titular da transacao.
   * @return titular
   **/
  @JsonProperty("titular")
  @ApiModelProperty(value = "Titular da transacao.")
  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Transacao data(Date data) {
    this.data = data;
    return this;
  }

  /**
   * Data da transacao.
   * @return data
   **/
  @JsonProperty("data")
  @ApiModelProperty(value = "Data da transacao.")
  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Transacao valor(Double valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor da transacao.
   * @return valor
   **/
  @JsonProperty("valor")
  @ApiModelProperty(value = "Valor da transacao.")
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transacao transacao = (Transacao) o;
    return Objects.equals(this.codigo, transacao.codigo) &&
        Objects.equals(this.titular, transacao.titular) &&
        Objects.equals(this.data, transacao.data) &&
        Objects.equals(this.valor, transacao.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, titular, data, valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transacao {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

