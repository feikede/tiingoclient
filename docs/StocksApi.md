# StocksApi

All URIs are relative to *https://api.tiingo.com/tiingo*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dailySymbolGet**](StocksApi.md#dailySymbolGet) | **GET** /daily/{symbol} | To request meta data for a stock


<a name="dailySymbolGet"></a>
# **dailySymbolGet**
> Meta dailySymbolGet(symbol, authorization)

To request meta data for a stock

### Example
```java
// Import classes:
//import de.feike.client.ApiException;
//import de.feike.client.api.StocksApi;


StocksApi apiInstance = new StocksApi();
String symbol = "symbol_example"; // String | 
String authorization = "authorization_example"; // String | 
try {
    Meta result = apiInstance.dailySymbolGet(symbol, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#dailySymbolGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  |
 **authorization** | **String**|  |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

