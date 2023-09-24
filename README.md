# Hospital Management Project Setup and Execution Guide

This guide will help you set up and execute the Hospital Management Project implemented using Spring Boot, REST API, and MySQL. The project uses Spring Tool Suite (STS) IDE, MySQL Workbench, and Postman API, but you can use similar tools of your choice.

## Step 1: Tools and Prerequisites

- **Tools Used:** Spring Tool Suite (STS) IDE, MySQL Workbench, Postman API (You can choose alternative tools if preferred).

## Step 2: Register a User

To begin, register a user using the following API request:

- **Method:** POST
- **URL:** http://localhost:8090/register (You can change the port number in application.properties)
- **Headers:** Content-Type: application/json
- **Body:**

```json
{
    "username": "jatinx",
    "password": "kediax",
    "role": "ROLE_USER"
}
After registration, you will receive an authentication token. Save this token as it will be needed for further requests.

Step 3: Authentication
Authenticate the user by sending a POST request to the following endpoint:

Method: POST
URL: http://localhost:8090/authenticate
Headers: Content-Type: application/json
Body:
json
{
    "username": "jatinx",
    "password": "kediax"
}
Use the token received for authorization in subsequent requests.

Step 4: Submit Patient Details
To submit patient details, make a POST request to:

Method: POST
URL: http://localhost:8090/api/patients/admit
Headers: Content-Type: application/json, Authorization: Bearer {your_token}
Body:
json
{
    "name": "Ajay kedia",
    "age": 24,
    "room": "101",
    "doctorName": "Dr. Smith",
    "admitDate": "2023-09-23",
    "expenses": 1500.00,
    "status": "admitted"
}
Step 5: Fetch All Patient Details
To retrieve all patient details, send a GET request to:

Method: GET
URL: http://localhost:8090/api/patients/all
Headers: Authorization: Bearer {your_token}
Step 6: Discharge a Patient
To discharge a patient from the hospital, use a PUT request with the patient's ID in the URL:

Method: PUT
URL: http://localhost:8090/api/patients/discharge/{Patient_id}
Headers: Authorization: Bearer {your_token}
Please follow these steps to set up and execute the Hospital Management Project. Make sure to replace {your_token} and {Patient_id} with actual values as needed.
