# Assessment-Spring-boot-api-2

Clone this repository to your local machine:

```shell
   git clone https://github.com/anuragroque/my-spring-boot-comment-app.git
```

Build the project:

```shell
mvn clean install
```

Run the application:

```shell
mvn spring-boot:run
```

The application will start and be accessible at `http://localhost:8080`.

## Endpoints

* **Add Comment** : You can add a comment by sending a POST request to `/api/comment/add`. Provide a JSON request body with the comment details.
* `http://localhost:8080/api/comment/add`
* **Get Comments** : Retrieve comments for a specific user by sending a GET request to `/api/comment/get`. Include the `commentTo` query parameter to specify the user.
* `http://localhost:8080/api/comment/get?commentTo=User 7`


[@AnuragRoque](https://github.com/AnuragRoque)
