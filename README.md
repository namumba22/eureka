from the root of eureka,
$mvn clean install


go to docker.
$docker-compose up

eureka is accessable via.
http://localhost:8080/eureka/v2/apps/

it's seet that it registered two apps.

!!! but, how to call them no clue.

=============


how it should work:

aggregator
discount
multiple-devide
plus-minus
rounder
tax

are the apps that should run under eureka hood.
entry point should be http://localhost:8080/{H????}/calculate/{price}/{quantity}




