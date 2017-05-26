# QoutesApi

All URIs are relative to *https://api.tiingo.com/tiingo*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dailySymbolPricesGet**](QoutesApi.md#dailySymbolPricesGet) | **GET** /daily/{symbol}/prices | quote data for a fund or stock


<a name="dailySymbolPricesGet"></a>
# **dailySymbolPricesGet**
> List&lt;Price&gt; dailySymbolPricesGet(symbol, authorization, startDate, endDate)

quote data for a fund or stock

### Example
```java
// Import classes:
//import de.feike.client.ApiException;
//import de.feike.client.api.QoutesApi;


QoutesApi apiInstance = new QoutesApi();
String symbol = "symbol_example"; // String | 
String authorization = "authorization_example"; // String | Your auth from www.tiingo.com
LocalDate startDate = new LocalDate(); // LocalDate | Earliest date to request EOD qoutes for
LocalDate endDate = new LocalDate(); // LocalDate | Last date to request EOD qoutes for
try {
    List<Price> result = apiInstance.dailySymbolPricesGet(symbol, authorization, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QoutesApi#dailySymbolPricesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  |
 **authorization** | **String**| Your auth from www.tiingo.com |
 **startDate** | **LocalDate**| Earliest date to request EOD qoutes for | [optional]
 **endDate** | **LocalDate**| Last date to request EOD qoutes for | [optional]

### Return type

[**List&lt;Price&gt;**](Price.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

