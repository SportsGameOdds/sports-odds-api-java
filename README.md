# Sports Game Odds Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.sportsgameodds.api/sports-odds-api)](https://central.sonatype.com/artifact/com.sportsgameodds.api/sports-odds-api/1.0.0)
[![javadoc](https://javadoc.io/badge2/com.sportsgameodds.api/sports-odds-api/1.0.0/javadoc.svg)](https://javadoc.io/doc/com.sportsgameodds.api/sports-odds-api/1.0.0)

<!-- x-release-please-end -->

The Sports Game Odds Java SDK provides convenient access to the [Sports Game Odds REST API](https://sportsgameodds.com/docs/) from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

<!-- x-release-please-start-version -->

The REST API documentation can be found on [sportsgameodds.com](https://sportsgameodds.com/docs/). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.sportsgameodds.api/sports-odds-api/1.0.0).

<!-- x-release-please-end -->

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.sportsgameodds.api:sports-odds-api:1.0.0")
```

### Maven

```xml
<dependency>
  <groupId>com.sportsgameodds.api</groupId>
  <artifactId>sports-odds-api</artifactId>
  <version>1.0.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.models.events.EventGetPage;
import com.sportsgameodds.api.models.events.EventGetParams;

// Configures using the `sportsgameodds.sportsOddsApiKeyHeader`, `sportsgameodds.sportsOddsApiKeyHeader` and `sportsgameodds.baseUrl` system properties
// Or configures using the `SPORTS_ODDS_API_KEY_HEADER`, `SPORTS_ODDS_API_KEY_HEADER` and `SPORTS_GAME_ODDS_BASE_URL` environment variables
SportsGameOddsClient client = SportsGameOddsOkHttpClient.fromEnv();

EventGetPage page = client.events().get();
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;

// Configures using the `sportsgameodds.sportsOddsApiKeyHeader`, `sportsgameodds.sportsOddsApiKeyHeader` and `sportsgameodds.baseUrl` system properties
// Or configures using the `SPORTS_ODDS_API_KEY_HEADER`, `SPORTS_ODDS_API_KEY_HEADER` and `SPORTS_GAME_ODDS_BASE_URL` environment variables
SportsGameOddsClient client = SportsGameOddsOkHttpClient.fromEnv();
```

Or manually:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .apiKeyHeader("My API Key Header")
    .build();
```

Or using a combination of the two approaches:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    // Configures using the `sportsgameodds.sportsOddsApiKeyHeader`, `sportsgameodds.sportsOddsApiKeyHeader` and `sportsgameodds.baseUrl` system properties
    // Or configures using the `SPORTS_ODDS_API_KEY_HEADER`, `SPORTS_ODDS_API_KEY_HEADER` and `SPORTS_GAME_ODDS_BASE_URL` environment variables
    .fromEnv()
    .apiKeyHeader("My API Key Header")
    .build();
```

See this table for the available options:

| Setter         | System property                         | Environment variable         | Required | Default value                         |
| -------------- | --------------------------------------- | ---------------------------- | -------- | ------------------------------------- |
| `apiKeyHeader` | `sportsgameodds.sportsOddsApiKeyHeader` | `SPORTS_ODDS_API_KEY_HEADER` | false    | -                                     |
| `apiKeyParam`  | `sportsgameodds.sportsOddsApiKeyHeader` | `SPORTS_ODDS_API_KEY_HEADER` | false    | -                                     |
| `baseUrl`      | `sportsgameodds.baseUrl`                | `SPORTS_GAME_ODDS_BASE_URL`  | true     | `"https://api.sportsgameodds.com/v2"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;

SportsGameOddsClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Sports Game Odds API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.events().get(...)` should be called with an instance of `EventGetParams`, and it will return an instance of `EventGetPage`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import com.sportsgameodds.api.models.events.EventGetPageAsync;
import com.sportsgameodds.api.models.events.EventGetParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `sportsgameodds.sportsOddsApiKeyHeader`, `sportsgameodds.sportsOddsApiKeyHeader` and `sportsgameodds.baseUrl` system properties
// Or configures using the `SPORTS_ODDS_API_KEY_HEADER`, `SPORTS_ODDS_API_KEY_HEADER` and `SPORTS_GAME_ODDS_BASE_URL` environment variables
SportsGameOddsClient client = SportsGameOddsOkHttpClient.fromEnv();

CompletableFuture<EventGetPageAsync> page = client.async().events().get();
```

Or create an asynchronous client from the beginning:

```java
import com.sportsgameodds.api.client.SportsGameOddsClientAsync;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClientAsync;
import com.sportsgameodds.api.models.events.EventGetPageAsync;
import com.sportsgameodds.api.models.events.EventGetParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `sportsgameodds.sportsOddsApiKeyHeader`, `sportsgameodds.sportsOddsApiKeyHeader` and `sportsgameodds.baseUrl` system properties
// Or configures using the `SPORTS_ODDS_API_KEY_HEADER`, `SPORTS_ODDS_API_KEY_HEADER` and `SPORTS_GAME_ODDS_BASE_URL` environment variables
SportsGameOddsClientAsync client = SportsGameOddsOkHttpClientAsync.fromEnv();

CompletableFuture<EventGetPageAsync> page = client.events().get();
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.sportsgameodds.api.core.http.Headers;
import com.sportsgameodds.api.core.http.HttpResponseFor;
import com.sportsgameodds.api.models.events.EventGetPage;
import com.sportsgameodds.api.models.events.EventGetParams;

HttpResponseFor<EventGetPage> page = client.events().withRawResponse().get();

int statusCode = page.statusCode();
Headers headers = page.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.sportsgameodds.api.models.events.EventGetPage;

EventGetPage parsedPage = page.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`SportsGameOddsServiceException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/SportsGameOddsServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                              |
  | ------ | -------------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/UnexpectedStatusCodeException.kt) |

- [`SportsGameOddsIoException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/SportsGameOddsIoException.kt): I/O networking errors.

- [`SportsGameOddsRetryableException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/SportsGameOddsRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`SportsGameOddsInvalidDataException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/SportsGameOddsInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`SportsGameOddsException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/SportsGameOddsException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

The SDK defines methods that return a paginated lists of results. It provides convenient ways to access the results either one page at a time or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, use the `autoPager()` method, which automatically fetches more pages as needed.

When using the synchronous client, the method returns an [`Iterable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

```java
import com.sportsgameodds.api.models.events.Event;
import com.sportsgameodds.api.models.events.EventGetPage;

EventGetPage page = client.events().get();

// Process as an Iterable
for (Event event : page.autoPager()) {
    System.out.println(event);
}

// Process as a Stream
page.autoPager()
    .stream()
    .limit(50)
    .forEach(event -> System.out.println(event));
```

When using the asynchronous client, the method returns an [`AsyncStreamResponse`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/core/http/AsyncStreamResponse.kt):

```java
import com.sportsgameodds.api.core.http.AsyncStreamResponse;
import com.sportsgameodds.api.models.events.Event;
import com.sportsgameodds.api.models.events.EventGetPageAsync;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

CompletableFuture<EventGetPageAsync> pageFuture = client.async().events().get();

pageFuture.thenRun(page -> page.autoPager().subscribe(event -> {
    System.out.println(event);
}));

// If you need to handle errors or completion of the stream
pageFuture.thenRun(page -> page.autoPager().subscribe(new AsyncStreamResponse.Handler<>() {
    @Override
    public void onNext(Event event) {
        System.out.println(event);
    }

    @Override
    public void onComplete(Optional<Throwable> error) {
        if (error.isPresent()) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error.get());
        } else {
            System.out.println("No more!");
        }
    }
}));

// Or use futures
pageFuture.thenRun(page -> page.autoPager()
    .subscribe(event -> {
        System.out.println(event);
    })
    .onCompleteFuture()
    .whenComplete((unused, error) -> {
        if (error != null) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error);
        } else {
            System.out.println("No more!");
        }
    }));
```

### Manual pagination

To access individual page items and manually request the next page, use the `items()`,
`hasNextPage()`, and `nextPage()` methods:

```java
import com.sportsgameodds.api.models.events.Event;
import com.sportsgameodds.api.models.events.EventGetPage;

EventGetPage page = client.events().get();
while (true) {
    for (Event event : page.items()) {
        System.out.println(event);
    }

    if (!page.hasNextPage()) {
        break;
    }

    page = page.nextPage();
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `SPORTS_GAME_ODDS_LOG` environment variable to `info`:

```sh
$ export SPORTS_GAME_ODDS_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export SPORTS_GAME_ODDS_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `sports-odds-api-core` is published with a [configuration file](sports-odds-api-core/src/main/resources/META-INF/proguard/sports-odds-api-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`SportsGameOddsOkHttpClient`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClient.kt) or [`SportsGameOddsOkHttpClientAsync`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.sportsgameodds.api.models.events.EventGetPage;

EventGetPage page = client.events().get(RequestOptions.builder().timeout(Duration.ofSeconds(30)).build());
```

Or configure the default for all method calls at the client level:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import java.time.Duration;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `sports-odds-api-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`SportsGameOddsClient`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClient.kt), [`SportsGameOddsClientAsync`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientAsync.kt), [`SportsGameOddsClientImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientImpl.kt), and [`SportsGameOddsClientAsyncImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientAsyncImpl.kt), all of which can work with any HTTP client
- `sports-odds-api-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`SportsGameOddsOkHttpClient`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClient.kt) and [`SportsGameOddsOkHttpClientAsync`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClientAsync.kt), which provide a way to construct [`SportsGameOddsClientImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientImpl.kt) and [`SportsGameOddsClientAsyncImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientAsyncImpl.kt), respectively, using OkHttp
- `sports-odds-api`
  - Depends on and exposes the APIs of both `sports-odds-api-core` and `sports-odds-api-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`sports-odds-api` dependency](#installation) with `sports-odds-api-core`
2. Copy `sports-odds-api-client-okhttp`'s [`OkHttpClient`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`SportsGameOddsClientImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientImpl.kt) or [`SportsGameOddsClientAsyncImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientAsyncImpl.kt), similarly to [`SportsGameOddsOkHttpClient`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClient.kt) or [`SportsGameOddsOkHttpClientAsync`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`sports-odds-api` dependency](#installation) with `sports-odds-api-core`
2. Write a class that implements the [`HttpClient`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/core/http/HttpClient.kt) interface
3. Construct [`SportsGameOddsClientImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientImpl.kt) or [`SportsGameOddsClientAsyncImpl`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/client/SportsGameOddsClientAsyncImpl.kt), similarly to [`SportsGameOddsOkHttpClient`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClient.kt) or [`SportsGameOddsOkHttpClientAsync`](sports-odds-api-client-okhttp/src/main/kotlin/com/sportsgameodds/api/client/okhttp/SportsGameOddsOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.sportsgameodds.api.core.JsonValue;
import com.sportsgameodds.api.models.events.EventGetParams;

EventGetParams params = EventGetParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/core/Values.kt) object to its setter:

```java
import com.sportsgameodds.api.models.events.EventGetParams;

EventGetParams params = EventGetParams.builder().build();
```

The most straightforward way to create a [`JsonValue`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/core/Values.kt) is using its `from(...)` method:

```java
import com.sportsgameodds.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.sportsgameodds.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.account().getUsage(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.sportsgameodds.api.core.JsonField;
import java.util.Optional;

JsonField<Object> field = client.account().getUsage(params)._field();

if (field.isMissing()) {
  // The property is absent from the JSON response
} else if (field.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = field.asString();

  // Try to deserialize into a custom type
  MyClass myObject = field.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`SportsGameOddsInvalidDataException`](sports-odds-api-core/src/main/kotlin/com/sportsgameodds/api/errors/SportsGameOddsInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.sportsgameodds.api.models.account.AccountUsage;

AccountUsage accountUsage = client.account().getUsage(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.sportsgameodds.api.models.events.EventGetPage;

EventGetPage page = client.events().get(RequestOptions.builder().responseValidation(true).build());
```

Or configure the default for all method calls at the client level:

```java
import com.sportsgameodds.api.client.SportsGameOddsClient;
import com.sportsgameodds.api.client.okhttp.SportsGameOddsOkHttpClient;

SportsGameOddsClient client = SportsGameOddsOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/SportsGameOdds/sports-odds-api-java/issues) with questions, bugs, or suggestions.
