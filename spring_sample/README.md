# spring_sample (Spring Fundamentals, Pluralsight)
component - any POJO, service and repository extends it, but don't have any difference, only the way you think about them.
service - business logic layer. Business logic should not be in controllers.
repository - data layer

Autowire:
memeber variables(field)
constructor
setter

Component Scanner of Autowirings in applicationContext.xml
    <context:annotation-config></context:annotation-config>
    <context:component-scan base-package="com.pluralsight"/>

# Java Configuration:
applicationConfiguration.xml replaced by @Configuration
Spring Beans defined by @Bean
@Bean at method level getters

Injection

# Bean Scopes
5 Scopes
Valid i any configuration
  Singleton - one instance, Default Bean Scope. Single instance per Spring container.
  Prototype - Unique instance per request.
Valid only in web-aware Spring projects - Spring MVC cource
  Request - lifecycle of request
  Session - per HTTP session
  GlobalSession - for application
  
# Properties
