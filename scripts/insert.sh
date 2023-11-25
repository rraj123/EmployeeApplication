curl -X POST http://localhost:8093/employees \
     -H "Content-Type: application/json" \
     -d '{"employeeName": "Frank", "employeeCity": "San Ramon"}'

  curl -X POST http://localhost:8093/employees \
       -H "Content-Type: application/json" \
       -d '{"employeeName": "Dan", "employeeCity": "Dublin"}'