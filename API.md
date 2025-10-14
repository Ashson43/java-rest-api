# APIs

## Books API

### Create Book API

Request:

`POST /books`

```json
{
  "title":"Finding Vrushank",
  "author":"Vrushank Joshi"

}
```

Response:

```json
{
  "id":1,
  "title":"Finding Vrushank",
  "author":"Vrushank Joshi"
}

```

### Get all Books

Request:

`GET /books`

Response:
```json
[
 {
  "id":1,
  "title":"Finding Vrushank",
  "author":"Vrushank Joshi"
 },
 {
  "id":2,
  "title":"Found Vrushank",
  "author":"Vrushank Joshi"
 }
]
```

### Get Book By Id
Request:

`GET /books/{id}`

Response:
```json
  {
    "id":1,
    "title":"Finding Vrushank",
    "author":"Vrushank Joshi"
  }
```

### Update Book
Request:

`PUT /books/{id}`
```json
{
 "title":"Found Vrushank",
 "author":"Vrushank Joshi"
}
```
Response:
```json
{
  "id":1,
  "title":"Found Vrushank",
  "author":"Vrushank Joshi"
}
```

### Delete Book
Request:

`DELETE /books/{id}`

```json
{
  "title":"Found Vrushank",
  "author":"Vrushank Joshi"
}
```


## User API

### Create User

Request:

`POST /users`

```json
    {
    "name":"Vrushank Joshi"
    }
```

Response:

```json
{
    "id":1,
    "name":"Vrushank Joshi"
}
```

### Delete User
Request:

`DELETE /users/{userId}`

### Get User by Id

Request:

`GET /users/{userId}`

```json
    {
        "id":1,
        "name":"Vrushank Joshi"
    }

```
### Add Book to Wishlist
Request:
`POST /users/{userId}/wishlist/`

```json
{
   "id":1,
   "title":"Finding Vrushank",
   "author":"Vrushank Joshi"

}
```


Response:
```json
{
    "wishlist":[
        {
            "id":1,
            "title":"Finding Vrushank",
            "author":"Vrushank Joshi"
        }
    ]
}

```
### Remove Book from Wishlist
Request:

`DELETE /users/{userId}/wishlist/{id}`

Response:
```json
{
    "wishlist":[]
}
```
### Get Wishlist
Request:

`GET /users/{userId}/wishlist`

Response:

```json
{
    "wishlist":[
            {
            "id":1,
            "title":"Finding Vrushank",
            "author":"Vrushank Joshi"
        },
        {
            "id":"2",
            "title":"Found Vrushank",
            "author":"Vrushank Joshi"
        },
        {
            "id":"3",
            "title":"Lost Vrushank",
            "author":"Vrushank Joshi"
        }

    ]
}

```