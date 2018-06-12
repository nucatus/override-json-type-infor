# override-json-type-information

In case of a deserialization where a TypeReference is provided, the deserializer should favor the type reference information in the detriment of a possible JsonTypeInfo annotation. 

Since the information related to the concrete types to be used for deserialization is provided in a declarative way, it makes much more sense to override whatever strategy a `@JsonTypeInfo` enforces.