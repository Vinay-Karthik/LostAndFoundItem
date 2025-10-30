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
├── CampusManagement/                        # Backend Spring Boot Application
│   └── lostAndFoundApplication/
│       ├── src/
│       │   ├── main/
│       │   │   ├── java/
│       │   │   │   └── edu/infosys/lostAndFoundApplication/
│       │   │   │       ├── LostAndFoundApplication.java    # Main Spring Boot Application
│       │   │   │       │
│       │   │   │       ├── bean/                           # Entity Models (JPA Entities)
│       │   │   │       │   ├── CampusUser.java
│       │   │   │       │   ├── FoundItem.java
│       │   │   │       │   └── LostItem.java
│       │   │   │       │
│       │   │   │       ├── config/                         # Configuration Classes
│       │   │   │       │   ├── CorsConfig.java
│       │   │   │       │   └── SecurityConfig.java
│       │   │   │       │
│       │   │   │       ├── controller/                     # REST API Controllers
│       │   │   │       │   ├── CampusUserController.java
│       │   │   │       │   ├── FoundItemController.java
│       │   │   │       │   ├── LostItemController.java
│       │   │   │       │   └── SearchController.java
│       │   │   │       │
│       │   │   │       ├── dao/                            # Data Access Objects (Interface)
│       │   │   │       │   ├── CampusUserDao.java
│       │   │   │       │   ├── FoundItemDao.java
│       │   │   │       │   ├── LostItemDao.java
│       │   │   │       │   └── impl/                       # DAO Implementations
│       │   │   │       │       ├── CampusUserDaoImpl.java
│       │   │   │       │       ├── FoundItemDaoImpl.java
│       │   │   │       │       └── LostItemDaoImpl.java
│       │   │   │       │
│       │   │   │       ├── repository/                     # JPA Repositories
│       │   │   │       │   ├── CampusUserRepository.java
│       │   │   │       │   ├── FoundItemRepository.java
│       │   │   │       │   └── LostItemRepository.java
│       │   │   │       │
│       │   │   │       ├── service/                        # Business Logic Layer
│       │   │   │       │   ├── CampusUserService.java
│       │   │   │       │   ├── FoundItemService.java
│       │   │   │       │   └── LostItemService.java
│       │   │   │       │
│       │   │   │       └── util/                           # Utility Classes
│       │   │   │           └── FuzzySearchUtil.java
│       │   │   │
│       │   │   └── resources/
│       │   │       ├── application.properties              # Spring Boot Configuration
|
|
|
├── campus-front/                                           # Frontend React Application
│   │   ├── Component/                                      # React Components
│   │   │   ├── DashboardComponent/
│   │   │   │   ├── AdminDashboard.jsx
│   │   │   │   ├── Dashboard.jsx
│   │   │   │   └── UserDashboard.jsx
│   │   │   │
│   │   │   ├── FooterComponent/
│   │   │   │   └── Footer.jsx
│   │   │   │
│   │   │   ├── HeaderComponent/
│   │   │   │   └── Header.jsx
│   │   │   │
│   │   │   ├── HomeComponent/
│   │   │   │   ├── Home.jsx
│   │   │   │   └── HomePageCards.jsx
│   │   │   │
│   │   │   ├── ItemComponent/
│   │   │   │   ├── AllFoundItems.jsx
│   │   │   │   ├── AllLostItems.jsx
│   │   │   │   ├── FoundItemSubmit.jsx
│   │   │   │   ├── LostItemSubmit.jsx
│   │   │   │   ├── MyFoundItems.jsx
│   │   │   │   ├── MyLostItems.jsx
│   │   │   │   └── SearchPage.jsx
│   │   │   │
│   │   │   ├── LoginComponent/
│   │   │   │   ├── Login.jsx
│   │   │   │   └── Register.jsx
│   │   │   │
│   │   │   └── UserComponent/
│   │   │       ├── AllUsers.jsx
│   │   │       └── UserProfile.jsx
│   │   │
│   │   ├── Services/                                       # API Service Layer
│   │   │   ├── CampusUserService.js
│   │   │   ├── LoginService.js
│   │   │   └── LostFoundItemService.js
│   │   │
│   │   ├── App.css                                         # Main App Styles
│   │   ├── App.jsx                                         # Root Component
│   │   ├── Dashboard.css                                   # Dashboard Styles
│   │   ├── Footer.css                                      # Footer Styles
│   │   ├── FoundItemSubmit.css                             # Found Item Form Styles
│   │   ├── Header.css                                      # Header Styles
│   │   ├── Home.css                                        # Home Page Styles
│   │   ├── index.css                                       # Global Styles
│   │   ├── Login.css                                       # Login Page Styles
│   │   ├── LostItemSubmit.css                              # Lost Item Form Styles
│   │   ├── main.jsx                                        # Application Entry Point
│   │   ├── MyFoundItems.css                                # My Found Items Styles
│   │   ├── MyLostItems.css                                 # My Lost Items Styles
│   │   └── SearchPage.css                                  # Search Page Styles
│   │
│   ├── eslint.config.js                                    # ESLint Configuration
│   ├── index.html                                          # HTML Entry Point
│   ├── package.json                                        # NPM Dependencies & Scripts
│   ├── package-lock.json                                   # NPM Lock File
│   ├── README.md                                           # Frontend Documentation
│   └── vite.config.js                                      # Vite Configuration
│
└── README.md                                               # Main Project Documentation
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
