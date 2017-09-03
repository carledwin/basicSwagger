package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pagamento
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-09-03T03:10:36.258Z")

public class Pagamento   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("valor")
  private Double valor = null;

  public Pagamento id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id do pagamento.
   * @return id
  **/
  @ApiModelProperty(value = "Id do pagamento.")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Pagamento status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status do pagamento
   * @return status
  **/
  @ApiModelProperty(value = "Status do pagamento")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Pagamento valor(Double valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor do pagamento.
   * @return valor
  **/
  @ApiModelProperty(value = "Valor do pagamento.")


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
    Pagamento pagamento = (Pagamento) o;
    return Objects.equals(this.id, pagamento.id) &&
        Objects.equals(this.status, pagamento.status) &&
        Objects.equals(this.valor, pagamento.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagamento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

