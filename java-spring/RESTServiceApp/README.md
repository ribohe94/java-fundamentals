## Levels of compliance with RESTful principles

* Level 0: the Swamp of POX - at this level, we’re just using HTTP as a transport. You could call SOAP a Level 0 technology. It uses HTTP, but as a transport. It’s worth mentioning that you could also use SOAP on top of something like JMS with no HTTP at all. SOAP, thus, is not RESTful. It’s only just HTTP-aware.
* Level 1: Resources - at this level, a service might use HTTP URIs to distinguish between nouns, or entities, in the system. For example, you might route requests to /customers, /users, etc. XML-RPC is an example of a Level 1 technology: it uses HTTP, and it can use URIs to distinguish endpoints. Ultimately, though, XML-RPC is not RESTful: it’s using HTTP as a transport for something else (remote procedure calls).
* Level 2: HTTP Verbs - this is the level you want to be at. If you do everything wrong with Spring MVC, you’ll probably still end up here. At this level, services take advantage of native HTTP qualities like headers, status codes, distinct URIs, and more. This is where we’ll start our journey.
* Level 3: Hypermedia Controls - This final level is where we’ll strive to be. Hypermedia, as practiced using the HATEOAS ("HATEOAS" is a truly welcome acronym for the mouthful, "Hypermedia as the Engine of Application State") design pattern. Hypermedia promotes service longevity by decoupling the consumer of a service from intimate knowledge of that service’s surface area and topology. It describes REST services. The service can answer questions about what to call, and when. We’ll look at this in depth later.

![alt text](http://martinfowler.com/articles/images/richardsonMaturityModel/overview.png "Logo Title Text 1")

* Status codes in the 100x range (from 100-199) are informational, and describe the processing for the request.
* Status codes in the 200x range (from 200-299) indicate the action requested by the client was received, understood, accepted and processed successfully
* Status codes in the 300x range (from 300-399) indicate that the client must take additional action to complete the request, such as following a redirect
* Status codes in the 400x range (from 400-499) is intended for cases in which the client seems to have erred and must correct the request before continuing. The aforementioned 404 is an example of this.
* Status codes in the 500x range (from 500-599) is intended for cases where the server failed to fulfill an apparently valid request.

## Annotations
* What does _@SpringBootApplication_ do?

    http://docs.spring.io/autorepo/docs/spring-boot/current/reference/html/using-boot-using-springbootapplication-annotation.html
* What does _@Bean_ do?

    http://stackoverflow.com/questions/17193365/what-in-the-world-are-spring-beans
http://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s02.html
* What does _@RestController_ do?

    @RestController, when it sits at the type level, provides defaults for all the methods in the type. Each individual method may override most of the type-level annotation.
