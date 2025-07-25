Survey One
Survey One is a web-based survey platform designed to create, distribute, and analyze surveys with ease. It allows users to participate in surveys and administrators to manage questions and collect responses efficiently.

🔧 Features
Create and manage surveys

Multiple question types (MCQs, text, etc.)

Collect and store user responses securely

Admin dashboard for analytics and survey management

Responsive UI for desktop and mobile devices

🛠️ Tech Stack
Frontend: HTML, CSS, JavaScript (or React.js/Thymeleaf)

Backend: Java (Spring Boot)

Database: MySQL / PostgreSQL

Security: Spring Security with BCrypt hashing

Build Tool: Maven / Gradle

🚀 Getting Started
Prerequisites
Java 17+

Maven or Gradle

MySQL/PostgreSQL

IDE (e.g., IntelliJ IDEA or Eclipse)

Installation
Clone the repository:

git clone https://github.com/yourusername/survey-one.git
cd survey-one
Configure database credentials in application.properties.

Run the application:

mvn spring-boot:run
Visit http://localhost:8080 in your browser.

👤 User Roles
Admin: Create/manage surveys, view results

User: Fill out surveys, view confirmation

📂 Folder Structure
src/main/java – Backend logic

src/main/resources/templates – HTML/Thymeleaf views

src/main/resources/static – Static assets (CSS, JS)

src/main/resources/application.properties – Configuration

📈 Future Enhancements
Export survey results (CSV/Excel)

Add user authentication with OAuth

Real-time analytics and charts

📄 License
This project is licensed under the MIT License – see the LICENSE file for details.
