\# Student Result Management System



A web-based Student Result Management System developed using \*\*Java, Spring Boot, Thymeleaf, and MySQL\*\* as part of Web Technology Assignment 4.



The application allows users to enter student details and semester examination marks for four subjects, calculate subject-wise totals, and generate a semester result with percentage and grades.



\## Features



\- Student information input (Name and Roll Number).

\- Marks entry for four subjects.

\- Separate MSE and ESE marks input.

\- Automatic subject-wise total calculation.

\- Automatic grand total and percentage calculation.

\- Grade assignment based on percentage.

\- Pass/Fail result determination.

\- Responsive user interface using Bootstrap.



\## Technologies Used



| Technology | Purpose |

|---|---|

| Java 26 | Programming Language |

| Spring Boot 4.1.1 | Backend Framework |

| Spring MVC | Request Handling |

| Thymeleaf | Server-side HTML Rendering |

| Spring Data JPA | Data Access Layer |

| MySQL | Relational Database |

| Maven | Build and Dependency Management |

| Bootstrap 5.3.3 | Frontend Styling |



\## Grade Calculation



The application calculates the percentage using the total marks obtained across four subjects.



| Percentage | Grade |

|---|---|

| 75% and above | A |

| 60% – 74.99% | B |

| 50% – 59.99% | C |

| 40% – 49.99% | D |

| Below 40% | FAIL |



Each subject has:

\- MSE: 30 marks

\- ESE: 70 marks

\- Maximum total: 100 marks



\## Project Structure



```text

Student-Result-Management-System/

│

├── .mvn/

│   └── wrapper/

│

├── src/

│   ├── main/

│   │   ├── java/

│   │   │   └── com/vit/result/

│   │   │       ├── ResultApplication.java

│   │   │       ├── controller/

│   │   │       │   └── ResultController.java

│   │   │       ├── entity/

│   │   │       │   └── StudentResult.java

│   │   │       └── repository/

│   │   │           └── ResultRepository.java

│   │   │

│   │   └── resources/

│   │       ├── templates/

│   │       │   ├── index.html

│   │       │   └── result.html

│   │       └── application.properties

│   │

│   └── test/

│

├── .gitignore

├── .gitattributes

├── mvnw

├── mvnw.cmd

├── pom.xml

└── README.md

```



\## Prerequisites



Make sure the following software is installed:



\- Java Development Kit (JDK) 26

\- MySQL Server

\- Git



\## Database Configuration



1\. Start your MySQL server.

2\. Create the database:



```sql

CREATE DATABASE vitresultdb;

```



3\. Open `src/main/resources/application.properties`.

4\. Configure your MySQL username and password according to your local MySQL installation.



The application currently uses the following database configuration:



```properties

spring.datasource.url=jdbc:mysql://localhost:3306/vitresultdb

spring.datasource.username=root

spring.datasource.password=



spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.thymeleaf.cache=false

server.port=8081

```



\## How to Run



\*\*1. Clone the repository\*\*



```bash

git clone https://github.com/thetesatyam/Student-Result-Management-System.git

```



\*\*2. Navigate to the project directory\*\*



```bash

cd Student-Result-Management-System

```



\*\*3. Build the project\*\*



```bash

.\\mvnw.cmd clean package

```



\*\*4. Run the Spring Boot application\*\*



```bash

.\\mvnw.cmd spring-boot:run

```



\*\*5. Open the application\*\*



Visit:



http://localhost:8081



\## Application Workflow



1\. Open the application in your browser.

2\. Enter the student's name and roll number.

3\. Enter the names of four subjects.

4\. Enter MSE and ESE marks for each subject.

5\. Click \*\*Generate Result\*\*.

6\. View the calculated semester result, including totals, percentage, grade, and pass/fail status.



\## Database Implementation Note



The project includes a JPA entity, Spring Data JPA repository, and MySQL configuration. However, database persistence is not yet connected to the current result calculation workflow.



\## Author



\*\*Satyam Thete\*\*



Web Technology Assignment – 4



GitHub: \[@thetesatyam](https://github.com/thetesatyam)

