# Strategy Design pattern 
 - >   has a
-|> is a


child require same capability but not same as parent  -> duplication


* uses  constructor injection  (strategy Interface )



## Example - 1. 

* Gadi - SportsGadi , PassengerGadi, OffRoadGadi 

- drive() --> For SportsGadi and OffRoadGadi -> we need special drive. 
- Same special drive is required for both. 

    