# Flipkart Search Automation Project

This is a Maven-based Selenium TestNG automation project that performs a product search on Flipkart and validates the page title for multiple search terms using a DataProvider.
Screenshots are captured after each search.

---

## 🧪 Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Page Object Model (POM)**

---

## 📁 Project Structure
```bash
FlipkartAutomationSelenium/
│
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite configuration
├── .gitignore # Ignored files/folders
├── README.md # Project documentation
│
├── screenshots/ # Captured screenshots after test execution
│
├── src/
│ ├── main/
│ │ └── java/
│ │ ├── base/ # Browser and WebDriver setup
│ │ └── utils/ # Utility classes (WaitUtil, ScreenshotUtil)
│ │
│ └── test/
│ └── java/
│ ├── pages/ # Page classes (SearchPage, CartPage etc.)
│ └── testcases/ # TestNG test cases (SearchTests, CartTests)
│
└── test/
└── resources/
└── config.properties # Project config (URLs, timeouts, etc.)

      
```


---

## 🚀 How to Run

### Prerequisites

- Java JDK 8 or higher
- Maven
- ChromeDriver (or configure WebDriver in `DriverSetup.java`)
- Internet connection (Flipkart site must be reachable)

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/FlipkartSearchAutomation.git
   cd FlipkartSearchAutomation
