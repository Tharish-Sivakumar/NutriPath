# NutriPath – Nutrition Tracking and Personalized Diet Management System

NutriPath is a nutrition tracking and personalized diet management application designed to help users monitor their daily food intake, calculate nutritional requirements, and manage their dietary goals.

The system calculates Basal Metabolic Rate (BMR) using user profile information and supports personalized nutrition targets, meal logging, and daily nutrient tracking.

## Features

- **User Profile Management** – Manage user details such as age, height, weight, and activity level.
- **BMR Calculation** – Calculate Basal Metabolic Rate based on user information.
- **Nutrition Plan Management** – Create and manage daily calorie and macronutrient targets.
- **Food and Meal Tracking** – Record meals and consumed serving sizes.
- **Nutritional Calculation** – Calculate calorie, protein, carbohydrate, and fat intake based on food serving sizes.
- **Daily Progress Tracking** – Monitor daily nutrient consumption against nutrition targets.
- **REST API Backend** – Provide API endpoints for profile management, nutrition plans, and meal tracking.

## Technology Stack

### Frontend
- Add the frontend framework and libraries used in this project.

### Backend
- Java
- Spring Boot
- Spring Data JPA / Hibernate
- REST APIs
- Maven

### Database
- Add the database used by your project (for example, MySQL).

## Project Structure

```text
NutriPath/
├── frontend/
│   └── Frontend application
├── backend/
│   ├── src/
│   │   └── main/
│   └── pom.xml
└── README.md
```

## How It Works

1. Users provide their profile information.
2. The system calculates BMR from the available profile details.
3. Nutrition targets are created and managed based on the implemented calculation logic.
4. Users log meals and specify consumed serving sizes.
5. The system calculates the corresponding nutritional intake.
6. Daily intake can be compared with the user's nutrition targets.

## Installation and Setup

### Prerequisites

- Java Development Kit (JDK)
- Maven
- Node.js and npm
- The database configured for the project

### 1. Clone the Repository

```bash
git clone https://github.com/Tharish-Sivakumar/NutriPath.git
cd NutriPath
```

### 2. Run the Backend

Open a terminal in the backend directory:

```bash
cd backend
```

Configure the required database connection and other environment-specific settings, then run:

```bash
mvn spring-boot:run
```

### 3. Run the Frontend

Open another terminal:

```bash
cd frontend
npm install
npm run dev
```

Use the local URL displayed by the frontend development server.

> **Note:** The commands above assume a Maven-based Spring Boot backend and a frontend that supports `npm run dev`. Adjust the commands if your project uses a different frontend framework or startup configuration.

## Security

- Keep passwords, API keys, and database credentials out of source control.
- Use environment variables or appropriate external configuration for sensitive values.
- Configure authentication and authorization according to the application's requirements.

## Future Enhancements

- Nutrition dashboards and visual reports.
- Improved dietary recommendations.
- Integration with food databases.
- Progress analytics and personalized nutrition insights.

## Author

**Tharish Sivakumar**

GitHub: [Tharish-Sivakumar](https://github.com/Tharish-Sivakumar)

## License

Add a license if you intend to distribute or reuse this project publicly.
