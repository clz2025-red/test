# test

## 동시성 제어(PESSIMISTIC_WRITE)

재고 차감 시 동시성 이슈를 줄이기 위해 `ProductRepository`에 비관적 쓰기 락 메서드를 추가했습니다.

- 메서드: `findByIdForUpdate(Long id)`
- 락 모드: `LockModeType.PESSIMISTIC_WRITE`

## Swagger UI 설정

Spring Boot 3.3에서 Swagger UI를 사용하려면 `springdoc-openapi` 의존성을 추가합니다.

### Maven

```xml
<dependency>
	<groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
	<version>2.6.0</version>
</dependency>
```

### Gradle

```gradle
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.6.0'
```

## Swagger UI 접속 정보

- Swagger UI: `http://localhost:8080/swagger-ui/index.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`