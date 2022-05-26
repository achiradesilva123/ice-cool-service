# Ice cool-Backend

# INTRODUCTION

# This is a solution for the ice cool ice cream brand to help them handle their calculations
# Contains a single API for the calculations.

# INFORMATION

# Consist of 3 ENUMS which are Cone type, Filling Type and Flavors Type. 
# When calling the API, pass the enum values only in the request body else you will receive bad request error.
# No database connections are made in this project so, There are no data persistant and therefore a repository isnt used.
# This applications implements only through a service.


--here postman curl--

curl --location --request POST 'http://localhost:8080/ap1/v1/order' \
--header 'Content-Type: application/json' \
--data-raw '{
    "flavorsType" : "Raspberry_Slushy",
    "fillingType" : "Sprinkles",
    "coneType" : "Wafer_cone"
}'
