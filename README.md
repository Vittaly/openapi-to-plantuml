# openapi-to-plantuml
Java library to generate a [PlantUML](https://plantuml.com) Class Diagram (merged with paths) from an OpenAPI 3.0 definition (YAML or JSON).

This library makes big assumptions about the style that the definition uses. In particular it expects:

* No anonymous object structures (declare each structure as a schema)
* It only consumes the first response content (but uses all responses) 

You can infer more about the style I'm preferring by looking at [openapi-example.yml](src/test/resources/openapi-example.yml). 

The corresponding Class Diagram (supplemented with Path operations) is (best viewed with a light background colour):

<img style="background-color:white" src="src/docs/openapi-example.svg"/>

