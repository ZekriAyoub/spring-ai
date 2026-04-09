# Spring AI — Roadmap Generator

A simple Spring Boot REST API that uses **Spring AI** with **Groq** (via OpenAI-compatible API) to generate personalized learning roadmaps using a Large Language Model.

---

## Features

- Generate a monthly learning roadmap for any skill
- Powered by `llama-3.1-8b-instant` via Groq
- Clean REST endpoint, easy to extend

---

## Tech Stack

| Technology                | Version |
|---------------------------|---------|
| Java                      | 17      |
| Spring Boot               | 3.4.4   |
| Spring AI                 | 1.0.0   |
| Groq (OpenAI-compatible)  | —       |
| Lombok                    | 1.18.x  |
| Maven                     | 3.x     |

---

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.x
- A [Groq API key](https://console.groq.com)

### Installation

```bash
git clone https://github.com/ZekriAyoub/spring-ai.git
cd spring-ai
```

### Configuration

Create a `.env` file in the root of the project :

```
GROQ_API_KEY=your_api_key_here
```

> ⚠️ **Never hardcode your API key.** Use an environment variable `GROQ_API_KEY` instead.

### Run

```bash
mvn spring-boot:run
```

The app starts on `http://localhost:8080`.

---

## API Usage

### `GET /roadmap`

Generates a learning roadmap for a given skill and duration.

**Query Parameters**

| Parameter   | Type     | Required   | Description                                     |
|-------------|----------|------------|-------------------------------------------------|
| `skill`     | `String` | Yes          | The skill to learn (e.g. `marketing`, `java`) |
| `months`    | `int`    | Yes          | Number of months for the roadmap              |

**Example Request**

```
GET http://localhost:8080/roadmap?skill=marketing&months=6
```

**Example Response**

```
Month 1: Introduction to Marketing Fundamentals
- Topics: market research, target audience, brand positioning
- Resources: HubSpot Academy, Kotler's "Marketing Management"

Month 2: Digital Marketing Basics
...
```

---

## Project Structure

```
src/
└── main/
    ├── java/com/he2b/spring_ai/
    │   ├── controller/
    │   │   └── RoadmapController.java   # REST endpoint
    │   ├── service/
    │   │   └── RoadmapService.java      # AI prompt logic
    │   └── SpringAiApplication.java
    └── resources/
        └── application.yml
```

---

## Security Note

Never commit your API key to GitHub. Use environment variables or a secrets manager. If you accidentally pushed a key, revoke it immediately on [console.groq.com](https://console.groq.com).

---

## 📄 License

This project is for educational purposes.
