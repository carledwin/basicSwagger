# DefaultApi

All URIs are relative to *http://localhost:8080/nataly-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buscaPagamento**](DefaultApi.md#buscaPagamento) | **GET** /pagamentos/{id} | 
[**cancelarPagamento**](DefaultApi.md#cancelarPagamento) | **DELETE** /pagamentos/{id} | Cancela um pagamento
[**confirmarPagamento**](DefaultApi.md#confirmarPagamento) | **PUT** /pagamentos/{id} | Confirma o pagamento
[**criarPagamento**](DefaultApi.md#criarPagamento) | **POST** /pagamentos | Cria novo pagamento


<a name="buscaPagamento"></a>
# **buscaPagamento**
> Pagamento buscaPagamento(id)



| O Pagamentos delete endpoint *busca o* pagamento.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    Pagamento result = apiInstance.buscaPagamento(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#buscaPagamento");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Pagamento**](Pagamento.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="cancelarPagamento"></a>
# **cancelarPagamento**
> Pagamento cancelarPagamento(id)

Cancela um pagamento

| O Pagamentos delete endpoint *cancela o* pagamento.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    Pagamento result = apiInstance.cancelarPagamento(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelarPagamento");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Pagamento**](Pagamento.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="confirmarPagamento"></a>
# **confirmarPagamento**
> Pagamento confirmarPagamento(id)

Confirma o pagamento

| O Pagamentos put endpoint *confirma o* pagamento.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    Pagamento result = apiInstance.confirmarPagamento(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#confirmarPagamento");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Pagamento**](Pagamento.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="criarPagamento"></a>
# **criarPagamento**
> Pagamento criarPagamento(transacao)

Cria novo pagamento

Endpoint de pagamento

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Transacao transacao = new Transacao(); // Transacao | Transação
try {
    Pagamento result = apiInstance.criarPagamento(transacao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#criarPagamento");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transacao** | [**Transacao**](Transacao.md)| Transação |

### Return type

[**Pagamento**](Pagamento.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

