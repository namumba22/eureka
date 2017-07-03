#!/bin/bash


	COUNTER=0
         while [  $COUNTER -lt 1000 ]; do
             clear;
             echo The counter is $COUNTER
             echo ""
                curl https://hero-sb-eureka.herokuapp.com/eureka/apps/
                curl https://hero-sb-rounder.herokuapp.com/round/9.55888
                curl https://hero-sb-tax.herokuapp.com/tax
             echo ""
                sleep 5;
                

             let COUNTER=COUNTER+1 
         done
         
 

   
   