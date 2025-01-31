
# Observability with Spring Boot and Grafana

## 🔎 Table of Contents

- [About](#about)
- [Features](#features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Accessing the Monitoring Tools](#accessing-the-monitoring-tools)
- [Contacts](#contacts)

## <a name="about"></a> 📎 About :

This project demonstrates how to implement observability in a Spring Boot application using Grafana, Prometheus, and Loki.

## <a name="features"></a> 📎 Features :

- **Metrics Collection**: Gather application metrics using Prometheus.
- **Logging**: Centralized logging with Loki.
- **Visualization**: Display metrics and logs in Grafana dashboards.

## <a name="project-structure"></a> 📎 Project Structure :

```
observability-spring-grafana/
│
│── src/
│   └── main/java/com/tmane/observabilityspringgrafana/
│       ├── controller/
│       ├── entity/
│       ├── model/
│       ├── repository/
│       └── ObservabilitySpringGrafanaApplication.java
│
│── src/main/resources/
│   ├── application.pro
│   └── logback-spring.xml
│
│── docker/
│   ├── grafana/
│   │   └── grafana.yml
│   ├── prometheus/
│   │   └── prometheus.yml
│   └── tempo/
│       └── tempo.yml
│
│── compose.yml
│── Dockerfile
│── README.md
```

## <a name="prerequisites"></a> 📎 Prerequisites :

- **Java Development Kit (JDK) 17 or higher**
- **Docker**

## <a name="getting-started"></a> 📎 Getting Started :

1. **Clone the Repository**

   ```bash
   git clone https://github.com/TmaneChouaib/observability-spring-grafana.git
   cd observability-spring-grafana
   ```
   
2. **Build the project using Maven**
    
```bash
mvn clean install
```

3. **Start the Docker Services**

   Ensure Docker is running on your system, then execute:

   ```bash
   docker-compose up -d
   ```

   This command will start Prometheus, Loki, and Grafana services as defined in the `docker-compose.yml` file.

4. **Run the Spring Boot Application**

   Start your Spring Boot application using Maven:

   ```bash
   ./mvnw spring-boot:run
   ```

   The application will be accessible at `http://localhost:8080`.


## <a name="accessing-the-monitoring-tools"></a> 📎 Accessing the Monitoring Tools :

- **Grafana**: Navigate to `http://localhost:3000`. Use those credentials `admin/password` to log in.

- **Prometheus**: Available at `http://localhost:9090`. It collects and stores metrics from the Spring Boot application.

- **Loki**: Loki aggregates logs from the application.


## <a name="contacts"></a> 📎 Contacts:

- For any inquires or feedback regarding this project, please contact me on: chouaib.tmane@hotmail.com.
