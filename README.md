# EndTerm-Project
This project was conducted by Alibi Umirzhanov and Raiymbek Duldiyev from the group, SE-2009.
The project is about building a new house. The house is made by builder. Builder is managed by head master and head master asks to build one of three type of house for client.
Person class is inherited by HeadMaster, HouseOzber and Client.
Person has id, first name, last name, gender and
age.
Client class has Crib object (myCrib)
Ozbek class is interface. It is implemented by HouseOzbek Class.It has methods that HouseOzbek can perform.
HeadMaster class has Ozbek object. RandomNumber class is to generate random number and return it by generate method.
SQLExecution class is to get connected with database and executes the query. It also has method called nextCribId(), it returns max value of id from any table.
