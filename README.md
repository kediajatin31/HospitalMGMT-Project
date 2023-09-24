# Hospital Management Project README

This project is implemented using Spring Boot, REST API, and MySQL. The following steps explain how to execute the project based on the project assignment requirements.

## Tools Used
- Spring Tool Suite (STS) IDE
- MySQL Workbench
- POSTMAN API

Note: It's not necessary to use these specific tools; you can choose similar alternatives to run the project.

## Steps to Execute the Project

1. Register a User using API Request:

   - Method: POST
   - URL: http://localhost:8090/register
   - Port No: 8090 (You can change this in the `application.properties` file if needed)
   - Request Body: JSON format (You can change values but not key names)

   Example Request Body:
   ```json
   {
       "username": "jatinx",
       "password": "kediax",
       "role": "ROLE_USER"
   }
   ```

2. Authenticate the User:

   - Method: POST
   - URL: http://localhost:8090/authenticate
   - Follow the same steps as in step 1 for the request.

   Example Request Body:
   ```json
   {
       "username": "jatinx",
       "password": "kediax"
   }
   ```

3. Submit Patient Details:

   - Method: POST
   - URL: http://localhost:8090/api/patients/admit
   - Follow the same steps as in step 1 for the request.

   Example Request Body:
   ```json
   {
       "name": "Ajay Kedia",
       "age": 24,
       "room": "101",
       "doctorName": "Dr. Smith",
       "admitDate": "2023-09-23",
       "expenses": 1500.00,
       "status": "admitted"
   }
   ```

4. Fetch All Patient Details:

   - Method: GET
   - URL: http://localhost:8090/api/patients/all

5. Discharge a Patient:

   - Method: PUT
   - URL: http://localhost:8090/api/patients/discharge/{Patient_id}

```

Please replace `{Patient_id}` in step 5 with the actual patient ID you want to discharge. This README provides clear instructions for executing the Hospital Management Project.
