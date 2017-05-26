# tiingoclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

TODO: Deploy project to maven central - it's not done until now
Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>de.feike.tiingoclient1</groupId>
    <artifactId>tiingoclient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "de.feike.tiingoclient1:tiingoclient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/tiingoclient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import java.util.List;

import org.joda.time.LocalDate;
import org.junit.Test;

import de.feike.tiingoclient.ApiException;
import de.feike.tiingoclient.model.Price;

/**
 * API tests for QoutesApi
 */
public class QoutesApiTest extends TestBase {

	private final QoutesApi api = new QoutesApi();

	@Test
	public void dailySymbolPricesGetTest() throws ApiException {

		LocalDate startDate = new LocalDate(2017, 5, 1);
		LocalDate endDate = new LocalDate(2017, 5, 24);
		List<Price> response = api.dailySymbolPricesGet("intc", "Token secret", startDate, endDate);
		System.out.println(response.get(0).toString());
	}

}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.tiingo.com/tiingo*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*QoutesApi* | [**dailySymbolPricesGet**](docs/QoutesApi.md#dailySymbolPricesGet) | **GET** /daily/{symbol}/prices | quote data for a fund or stock
*StocksApi* | [**dailySymbolGet**](docs/StocksApi.md#dailySymbolGet) | **GET** /daily/{symbol} | To request meta data for a stock


## Documentation for Models

 - [Error](docs/Error.md)
 - [Meta](docs/Meta.md)
 - [Price](docs/Price.md)


## Documentation for Authorization

All endpoints do require token authorization, see tiingo.com.

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
Rainer Feike, 2017
