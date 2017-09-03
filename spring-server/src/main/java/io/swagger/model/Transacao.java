package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transacao
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-03T03:10:36.258Z")

public class Transacao   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("titular")
  private String titular = null;

  @JsonProperty("data")
  private LocalDate data = null;

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
  @ApiModelProperty(value = "Titular da transacao.")


  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Transacao data(LocalDate data) {
    this.data = data;
    return this;
  }

   /**
   * Data da transacao.
   * @return data
  **/
  @ApiModelProperty(value = "Data da transacao.")

  @Valid

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
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

