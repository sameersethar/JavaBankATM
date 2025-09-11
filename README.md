# Java Bank ATM Simulator

A desktop-based ATM machine simulator built with Java Swing and MySQL. This project allows users to create an account and perform all standard banking operations through a graphical interface.

## Features

-   **User Login:** Secure login with a Card Number and PIN.
-   **Account Creation:** Multi-step signup form to collect user details.
-   **Core ATM Functions:**
    -   Cash Withdrawal
    -   Cash Deposit
    -   Fast Cash (quick withdrawal of set amounts)
    -   Balance Inquiry
    -   Mini Statement
    -   PIN Change
-   **Database Storage:** All data is saved in a MySQL database.

## How to Run

1.  **Setup Database:**
    -   import the give .sql file in mysql 

2.  **Configure Connection:**
    -   Open the `Conn.java` file.
    -   Update the database password to your own:
    ```java
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "YOUR_PASSWORD_HERE");
    ```

3.  **Run the Application:**
    -   Compile and run the `Login.java` file in your Java IDE.

## Technology Used

-   **Java** (Swing for GUI)
-   **MySQL** (Database)
-   **JDBC** (Database Connection)

## Important Note

This is a simulation project for educational purposes only. It is not a real banking system.