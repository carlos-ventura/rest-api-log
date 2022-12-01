Thought process

1. I started with reading the challenge and trying to understand it. There was a few points that I was in doubt of what was asked. But the main I took from it was that I was at least to build an API that could print the logs and could let logs being added. So minimum 2 endpoints.
    1. I had trouble understanding what exactly was meant by this "The REST API must be able to support multiple log destinations e.g., Kafka topic, Flat file, MQ topic."
    2. Also trouble understanding what was meant by "including needed data models".
2. The next step I did was create a short TODO list that I would "complete" and add more entries as I worked throught the project within the time frame.
3. As this was a new topic for me the first tasks were to get a rough idea on how the technology works and how to initialize a simple project
4. After searching I ended up using https://start.spring.io/
5. Next step would be to create a Log class
    1. Regarding this class I had question how to implement Optional parameters / fields 
    2. Apart from that the data types was also a question I had in mind but I tried to keep it simple to get more done in the time given
6. With the Log class "done" I started rethinking that I would need a place to store the logs and thus updated the dependencies with an h2 database
7. For this database I searched and followed some guides ending up create an interface to use
8. With the "setup complete" I could do the controller with the mappings
    1. One question I had was if it would make sense to have a GET and POST operation with the same name. Again the approach take was to keep it simple to try and get more done.
9. After creating the endpoints I tested locally and by creating simple tests
10. Last task would be to write this README since the time limit was over.

