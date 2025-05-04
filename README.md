# User Management App (Java Console Project)

This is a basic Java console application that simulates a user management system.  
It is structured using a layered architecture with separate packages for controller, service, repository, and model layers.

## Project Structure

```
src/  
└── com/  
    └── reza/  
        └── usermanagement/  
            ├── controller/  
            │   └── UserController.java  
            ├── service/  
            │   └── UserService.java  
            ├── repository/  
            │   └── UserRepository.java  
            └── model/  
                └── User.java  
```

## Features

- Create new users with name and email  
- Store users in memory (no database required)  
- Retrieve all users  
- Find a user by ID  
- Print user information to the console  
- Structured, readable, and well-commented code  

## Technologies Used

- Java (JDK 17+ recommended)  
- Visual Studio Code (or any Java IDE)  
- No external libraries or dependencies  

## How to Run

1. Clone this repository or download the project folder.  
2. Open the project in Visual Studio Code or any Java IDE.  
3. Navigate to `UserController.java` inside the `controller` package.  
4. Run the file to see output in the terminal.  

## Example Output

```
All Users:  
User{id=1, name='Reza', email='reza@example.com'}  
User{id=2, name='Mahshad', email='mahshad@example.com'}  

User with ID 1:  
User{id=1, name='Reza', email='reza@example.com'}  
```

## Author

Created by **Reza** — beginner backend developer learning Java through project-based practice.
