# Design Parking Lot

## Requirements

### High Level Overview
- Design Parking lot management system
- In-memory Storage - Schema Design required
- Provide Hardcoded inputs 

### Low Level
- Multiple levels/floors
- Different entry/exit gates for the parking lot
- Different parking slots on floors - For different type of vehicles
- A ticket/token is generated at the entry point
- Slot is assigned at the time of entry 
- Different ways of determining the vehicle slots
- Payment is taken at the time of exit
- Fee calculation should be done dynamically
- Different modes of payment - Cash/Card/Online. Doesn't have to integrate with the 3rd-party payment provider
- Store the reference number of the 3rd party for the payments