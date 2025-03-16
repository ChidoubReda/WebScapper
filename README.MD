# Web Scraper Project

This project is a simple web scraper that extracts data from a website and saves it to a CSV file. The project uses the Jsoup library to parse HTML and extract the required information.

## Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/ChidoubReda/WebScapper.git
    cd <repository-directory>
    ```

2. **Add Jsoup dependency:**

   Ensure that the `pom.xml` file includes the Jsoup dependency:

    ```xml
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.14.3</version>
    </dependency>
    ```

3. **Build the project:**

    ```sh
    mvn clean install
    ```

## Running the Project

1. **Navigate to the project directory:**

    ```sh
    cd <repository-directory>
    ```

2. **Run the main class:**

    ```sh
    mvn exec:java -Dexec.mainClass="com.springdemo.Main"
    ```

## Project Structure

- `src/main/java/com/springdemo/Main.java`: The main class that contains the web scraping logic.
- `pom.xml`: Maven configuration file that includes project dependencies.
- `books.csv`: The output file where the scraped data is saved.

## How It Works

1. The `Main` class connects to the specified URL using Jsoup.
2. It selects the required HTML elements using CSS selectors.
3. It extracts the text content of these elements.
4. It writes the extracted data to a CSV file.

## Example Output

The output CSV file (`books.csv`) will contain data in the following format:

```csv
Title,Price
"A Light in the ...","£51.77"
"Tipping the Velvet","£53.74"
...