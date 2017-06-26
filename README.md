from the root of eureka,

compile:
$mvn clean install

run:
$docker-compose up

test:
eureka is accessable via.
http://localhost:8761/eureka/apps/

pizza calculator:
http://localhost:8080/calculate/4200/3


Components:

Agregator: aggregator

Endpoint:   discount
Endpoint:   multiple-devide
Endpoint:   plus-minus
Endpoint:   rounder

Agregator:  tax


!!! it's not configured for timeout ... that's why sometimes some exceptions with the error coud appear.


