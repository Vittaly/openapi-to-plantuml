# openapi-to-plantuml
Java library to generate a [PlantUML](https://plantuml.com) Class Diagram (merged with paths) from an OpenAPI 3.0 definition (YAML or JSON).

This library makes big assumptions about the style that the definition uses. In particular it expects:

* No anonymous object structures (declare each structure as a schema)
* It only consumes the first response content (but uses all responses) 
* Members of a mixed type (`oneOf`, `anyOf`, `allOf`) should be `$ref` (to add meaning to the generated diagram)

You can infer more about the style I'm preferring by looking at [openapi-example.yml](src/test/resources/openapi-example.yml). 

The corresponding Class Diagram (supplemented with Path operations) is (best viewed with a light background colour):

<img style="background-color:white" src="src/docs/openapi-example.svg"/>

## Getting started
Add this dependency to your pom.xml:

```xml
<dependency>
  <groupId>com.github.davidmoten</groupId>
  <artifactId>openapi-to-plantuml</artifactId>
  <version>VERSION_HERE</version>
</dependency>
```

## Usage

```java
String puml = Puml.openApiToPuml(openapi);
```

## Examples

[petstore.yml](src/test/resources/inputs/petstore.yml):

<img src="src/docs/tests/petstore-expanded.puml.svg"/>

[bookstore.yml](src/test/resources/inputs/bookstore.yml):

<img src="src/docs/tests/bookstore.puml.svg"/>

[ecommerce.yml](src/test/resources/inputs/ecommerce.yml)

<img src="src/docs/tests/ecommerce.puml.svg"/>

[banking.yml](src/test/resources/inputs/banking.yml):

<img src="src/docs/tests/banking.puml.svg"/>

[amazon-s3.yml](src/test/resources/inputs/amazon-s3.yml):

<img src="src/docs/tests/amazon-s3.puml.svg"/>
