# RailGate
RailGate is a simple train booking system created with Java Swing. **JDBC API** has been used to store all the data in this project.

## Screenshots
- Login Page
![login page](screenshots/login.png)

- Dashboard Page
![dashboard page](screenshots/dashboard.png)

- Book Ticket Page
![book-ticket page](screenshots/book-ticket.png)

- Bookings Page
![bookings page](screenshots/bookings.png)

## Prerequisite

- Java 8 or higher
- FlatLaf [Download Here](https://www.formdev.com/flatlaf/)
- Playlist Script Font [Download Here](https://www.dafontfree.io/playlist-script-font-free/)
- SQL Database
- IntelliJ IDEA / Apache NetBeans / Eclipse

## Running the project

- Clone the repository

  ``git clone https://github.com/ayxsth/RailGate.git``
- Create a database named **railgate**
- Create a table named **ticket** with these properties:
  - **ticketid** - *int*
  - **trainid** - *int*
  - **lfrom** - *varchar*
  - **lto** - *varchar*
  - **date** - *varchar*
  - **seats** - *int*
  - **status** - *varchar*
- Open the IDE
- Go to the **Open Project** section
- Run the project
- Enter **admin** in both text fields