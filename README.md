# Lost and Found Item Management System

A comprehensive web-based application designed for campus communities to manage lost and found items efficiently. This full-stack application enables users to report lost items, register found items, and search through listings to reunite people with their belongings.

## 🌟 Features

- **Lost Item Management**: Report and track lost items with detailed descriptions
- **Found Item Management**: Register found items to help others recover their belongings
- **Advanced Search**: Fuzzy search functionality across multiple item attributes (name, category, brand, color, location)
- **User Authentication**: Secure user login and profile management
- **Real-time Updates**: Track item status and manage submissions
- **Responsive Design**: Modern, mobile-friendly interface built with React and Bootstrap

## 🛠️ Technology Stack

### Backend
- **Framework**: Spring Boot
- **Language**: Java
- **Database**: MySQL

### Frontend
- **Framework**: React 19.1.1
- **Language**: JavaScript
- **Styling**: CSS, TailwindCSS, Bootstrap
- **Build Tool**: Vite


## 📁 Project Structure

```
LostAndFoundItem/
├── CampusManagement/                    # Backend Spring Boot Application
│   └── lostAndFoundApplication/
│       └── src/main/java/edu/infosys/lostAndFoundApplication/
│           ├── bean/                    # Entity Models
│           │   ├── LostItem.java
│           │   ├── FoundItem.java
│           │   └── CampusUser.java
│           ├── controller/              # REST Controllers
│           │   ├── LostItemController.java
│           │   ├── FoundItemController.java
│           │   └── SearchController.java
│           ├── service/                 # Business Logic Layer
│           │   ├── LostItemService.java
│           │   ├── FoundItemService.java
│           │   └── CampusUserService.java
│           ├── dao/                     # Data Access Layer
│           │   └── impl/
│           └── repository/              # JPA Repositories
│
└── campus-front/                        # Frontend React Application
    ├── src/
    │   ├── Component/
    │   │   └── ItemComponent/
    │   │       ├── LostItemSubmit.jsx
    │   │       └── FoundItemSubmit.jsx
    │   └── Services/
    │       ├── LostFoundItemService.js
    │       └── LoginService.js
    └── package.json
```

## 🚀 Getting Started

### Prerequisites
- Java JDK 17 or higher
- Node.js 16+ and npm/yarn
- MySQL or PostgreSQL database
- Maven (for backend)

### Backend Setup

1. Navigate to the backend directory:
```bash
cd CampusManagement/lostAndFoundApplication
```

2. Configure your database in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/lost_found_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Build and run the Spring Boot application:
```bash
mvn clean install
mvn spring-boot:run
```

The backend API will start on `http://localhost:8080`

### Frontend Setup

1. Navigate to the frontend directory:
```bash
cd campus-front
```

2. Install dependencies:
```bash
npm install
```

3. Start the development server:
```bash
npm run dev
```

The frontend will start on `http://localhost:3939`

## 📡 API Endpoints

### Lost Items
- `POST /lost-found/lost-items` - Submit a new lost item
- `GET /lost-found/lost-items` - Get all lost items
- `GET /lost-found/lost-items/{id}` - Get lost item by ID
- `DELETE /lost-found/lost-items/{id}` - Delete lost item
- `GET /lost-found/lost-items/user/{username}` - Get user's lost items

### Found Items
- `POST /lost-found/found-items` - Submit a new found item
- `GET /lost-found/found-items` - Get all found items
- `GET /lost-found/found-items/{id}` - Get found item by ID
- `DELETE /lost-found/found-items/{id}` - Delete found item
- `GET /lost-found/found-items/user/{username}` - Get user's found items

### Search
- `GET /lost-found/api/search/lost?q={query}` - Search lost items
- `GET /lost-found/api/search/found?q={query}` - Search found items


## 🔍 Key Features Implementation

### Fuzzy Search
The application implements an intelligent fuzzy search algorithm that:
- Searches across multiple fields (item name, category, brand, color, location)
- Assigns weighted scores to matches
- Returns results sorted by relevance
- Provides accurate results even with partial queries


## 📄 License

This project is developed as part of an educational initiative.
