# Java-Serialization-DeSerialization

A simple Java project that demonstrates **object serialization** and **deserialization** using `ObjectOutputStream` and `ObjectInputStream`.

## Project Description

This project shows how to:
- Make a Java class serializable by implementing the `Serializable` interface
- Serialize (save) an object to a file
- Deserialize (load) the object back from the file
- Use `try-with-resources` for safe handling of streams
- Include `serialVersionUID` for better version control

## Features
- Clean and modern code structure
- Proper exception handling
- Uses package structure (`com.example.serialization`)
- Prints the deserialized object's data to verify the process

## Technologies
- Java (JDK 8 or higher)
- No external dependencies (pure Java SE)

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/niwanthaniluka/Java-Serialization-DeSerialization.git


Serialized successfully to:employee.ser
Deserialized successfully!
Name: Niwantha
Age: 25

src/
├── main/
│   └── java/
│       └── com/
│           └── example/
│               └── serialization/
│                   ├── Employee.java     # Serializable class
│                   └── Main.java         # Serialization + Deserialization demo
employee.ser   # Generated binary file (after running)
