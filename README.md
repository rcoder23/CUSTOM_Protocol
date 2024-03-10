# Java Server-Client Communication

## Overview
This project demonstrates a simple server-client communication setup using Java. The server listens for incoming connections, and the client sends requests to the server using a specific format.

## Usage
To use this project, follow these steps:

1. Compile and run the `Server.java` file. This will start the server, which will listen for incoming connections.

    ```bash
    javac Server.java
    java Server
    ```

2. Once the server is running, you can establish a connection with the server using the `Client.java` file or using Telnet.

    - To use `Client.java`, compile and run the file:

        ```bash
        javac Client.java
        java Client
        ```

    - Alternatively, you can use Telnet to connect to the server. For example:

        ```bash
        telnet localhost <port_number>
        ```

3. Once the connection is established, you can send requests to the server using the following format:

    ```
    REQUEST_TYPE CUSTOM URL PARAMS
    ```

    - `REQUEST_TYPE`: The type of request (e.g., GET, POST, etc.).
    - `CUSTOM`: Custom identifier for the request.
    - `URL`: The URL or endpoint of the request.
    - `PARAMS`: Parameters associated with the request.

    For example:
    
    ```
    GET CUSTOM /add 2 4
    ```


