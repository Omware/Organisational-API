## Author 
Keith Omware
## Organisational-API
This is a spark-java api that enables one dispay the data from a database in form of a json object.

## Installation

* Clone the repo: `https://github.com/Omware/Organisational-API.git`
* Run the command `gradle build`
* Run the tests `gradle test`
* Launch the app `gradle run`. The app will open on port 4567 on your browser: `localhost:4567`

## HTTP Methods

	|Method|Path|Description|
	|------|------|------|
	|`Post`|/departments/new|Creates a new Department|
	|`Get`|/departments|Fetches all departments|
	|`Get`|/departments/:id|Fetches departments by id|
	|`Get`|/departments/:id/news|Fetches department news|
	|`Post`|/users/new|Creates a new User|
	|`Get`|/users|Fetches all users|
	|`Post`|/news/new|Creates news|
	|`Get`|/news|Fetches all news|
	
## Technologies Used
```
* Java.
* Spark - the front end framework.
* Postgres database.
* Postman
```

## Contact Information
* Email: keithomware@gmail.com
* Phone number: 0712759803
## Licence

MIT License

Copyright (c) 2019 Keith Omware

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.