# PROJECT INTRO
- This is a Doctor Appointment System made for 4458 lecture final.
- Link to the presentation: --
- Dockerfiles can be found inside of each service folder.

# Services
- Gateway Service
- Comments Service ( connects to a mongodb database on internet )
- Appointment Service ( connects to a mysql database on internet ) ( Inserts to RabbitMQ queue )
- Notification Service ( Reads from the RabbitMQ queue ) ( Sends emails )

# SQL DB
```
    - USER
    id                  : int
    email               : string
    fullname            : string
    isDoctor            : tinyint
    areaOfInterest      : string
    availableDays       : integer (left shift carry will determine each day starting from monday )
    availableHour       : time
    availableHour_end   : time
    address             : string
```
# NOSQL DB
```
    - COMMENTS
    id          : int
    doctorId    : int
    userId      : int
    comment     : string
    rating      : int
```