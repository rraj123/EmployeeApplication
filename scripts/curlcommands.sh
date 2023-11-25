curl -X POST http://localhost:8093/employees \
     -H "Content-Type: application/json" \
     -d '{"employeeId": 4, "employeeName": "Frank", "employeeCity": "San Ramon"}'


  curl -X POST http://localhost:8093/employees \
       -H "Content-Type: application/json" \
       -d '{"employeeId": 5, "employeeName": "Dan", "employeeCity": "Dublin"}'


curl -X PUT http://localhost:8093/employees/5 \
     -H "Content-Type: application/json" \
     -d '{"employeeId": 5, "employeeName": "Dan Mood", "employeeCity": "Dubflin"}'

curl -X DELETE http://localhost:8093/employees/5 \
     -H "Content-Type: application/json" \
     -d '{"employeeId": 5, "employeeName": "Dan Mood", "employeeCity": "Dubflin"}'