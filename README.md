# HackHers Image Microservice

This project provides a search service for images that match a given demographic, category or type.

## Using the Service

#### Service URL: http://localhost:8081

### The following endpoints are exposed to GET requests:

- /images

    - this endpoint accepts query parameters -- one, none or all parameters can be included.

        - productId
        - type
        - category
        - demographic
        - imageUrl

- /images/{id}

## Postman ##

A postman collection demonstrates Get requests for demographic & category, demographic & type, and get by ID. The collection can be accessed by clicking this button:

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/14413928-1b39b282-8c03-435c-b77b-3739a03377c6?action=collection%2Ffork&collection-url=entityId%3D14413928-1b39b282-8c03-435c-b77b-3739a03377c6%26entityType%3Dcollection%26workspaceId%3Da40c480b-02a3-4641-8897-5ae90ec6f15b)

### Image Domain Object ###

The Image object has the following properties:

| **Property Name** | **Data Type**     | **Description**                                     |
|-------------------|-------------------| ----------------------------------------------------|
| **id**            | Long              | The unique identifier for a record in the database. |
| **productId**     | String            | The product ID of the image                         |
| **type**          | String            | The type of the image                               |
| **category**      | String            | The category of the image                           |
| **demographic**   | String            | The demographic of the image                        |
| **imageUrl**      | String            | The url of the image

### Demographics

- "Kids", "Men", "Women"

### Categories

- "Baseball", "Basketball", "Boxing", "Football", "Golf", "Hockey", "Running", "Skateboarding", "Soccer", "Weightlifting"

### Types

- "Belt", "Elbow Pad", "Flip Flop", "Glove", "Hat", "Headband", "Helmet", "Hoodie", "Jacket", "Pant", "Pool Noodle", "Shin Guard", "Shoe", "Short", "Sock", "Sunglasses", "Tank Top", "Visor", "Wristband"

### Examples

To get the image with the id number 1, the request would be:
http://localhost:8081/images/1

To get all images with the Women's demographic:
http://localhost:8081/images?demographic=Women

To get all images matching demographic 'Women' and type 'Shin Guard':
http://localhost:8081/images?demographic=Women&type=Shin+Guard

To get all images matching demographic Women and category Basketball:
http://localhost:8081/images?demographic=Women&category=Basketball

---

## Installation

* Fork the repository to your specified remote work directory. Navigate to the local directory in
  which you will store the project, then clone it to your computer using the following command:

```bash
git clone <insert_url_here>
```

* Open the project in your IDE.

## Data

***Starting Spring Application with Postgres***

* Make sure that your postgres database is available and configured with the following options:
    * POSTGRES_USER=postgres
    * POSTGRES_PASSWORD=root
    * PORT=5432

## Swagger

* Run application
* The configuration file for swagger is found in io.catalyte.training.hackhersimageservice.config
  package.
* Go to localhost:8081/swagger-ui.html to see swagger documentation for all endpoints. |

## Coding Style Standards ##

The files in this project are linted according to
the  [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html). To lint the
files:

- To lint the whole project, right click on the src folder in the Project window and select
  'Reformat code' from the drop down list.
- To lint an individual file, type **Ctrl Alt L** while focus is on the file you want to lint.

## Contact ##

For questions, comments and concerns, please contact Jen Perry at jperry@catalyte.io.
