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
- **Language**: Java (25.8%)
- **Database**: JPA/Hibernate with relational database
- **Architecture**: RESTful API with MVC pattern
- **Key Components**:
  - REST Controllers for API endpoints
  - Service layer for business logic
  - DAO pattern for data access
  - Entity models for data representation

### Frontend
- **Framework**: React 19.1.1
- **Language**: JavaScript (58.1%)
- **Styling**: CSS (15.8%), TailwindCSS, Bootstrap
- **Build Tool**: Vite
- **Key Libraries**:
  - React Router DOM for navigation
  - Axios for HTTP requests
  - React Icons for UI icons
  - Framer Motion for animations
  - React Bootstrap for UI components

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

## 💾 Data Models

### Lost Item
```java
{
  "lostItemId": "string",
  "username": "string",
  "userEmail": "string",
  "itemName": "string",
  "category": "string",
  "color": "string",
  "brand": "string",
  "location": "string",
  "lostDate": "string",
  "status": "boolean"
}
```

### Found Item
```java
{
  "foundItemId": "string",
  "username": "string",
  "userEmail": "string",
  "itemName": "string",
  "category": "string",
  "color": "string",
  "brand": "string",
  "location": "string",
  "foundDate": "string",
  "status": "boolean"
}
```

## 🔍 Key Features Implementation

### Fuzzy Search
The application implements an intelligent fuzzy search algorithm that:
- Searches across multiple fields (item name, category, brand, color, location)
- Assigns weighted scores to matches
- Returns results sorted by relevance
- Provides accurate results even with partial queries

### Auto-generated IDs
Lost and Found items are assigned unique auto-generated IDs using a synchronized method to ensure consistency across concurrent submissions.

## 🎨 Frontend Scripts

```bash
npm run dev      # Start development server on port 3939
npm run build    # Build for production
npm run preview  # Preview production build
npm run lint     # Run ESLint
```

## 🔐 CORS Configuration

The backend is configured to accept requests from `http://localhost:3939` for local development. Update CORS settings in production accordingly.

## 📝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is developed as part of an educational initiative.

## 👥 Author

**Vinay-Karthik**

## 🙏 Acknowledgments

- Built with Spring Boot framework
- UI powered by React and Vite
- Styled with TailwindCSS and Bootstrap
- Icons from React Icons library

---

**Note**: This is a campus management system designed to facilitate the lost and found process in educational institutions. For production deployment, ensure proper security measures, environment configurations, and database optimizations are in place.
