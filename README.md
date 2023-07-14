Поставленная задача
Реализуйте простое консольное приложение, демонстрирующее работу с объектами иерархии хранящиеся в БД (схема на рисунке) используя Spring Data:
Vehicle - Abstract Class
Id – Long
Type - String
Model - String
Price - BigDecimal
FuelType – String

Car
Наследует Vehicle.
Seats - Integer

Truck
Наследует Vehicle.
loadCapacity - Double

Bike
Наследует Vehicle

Plane
Наследует Vehicle.
passengerCapacity – Integer
![image](https://github.com/Recwayer/SpringDataPractice/assets/95271934/1ba0cb97-198c-4228-a367-7ae83d8fc455)

Результат:
![image](https://github.com/Recwayer/SpringDataPractice/assets/95271934/1312eaa7-3d2f-4501-8194-ef3e6b99bfc5)
![image](https://github.com/Recwayer/SpringDataPractice/assets/95271934/56350a91-6199-4e1b-84b1-a3b318336a69)
![image](https://github.com/Recwayer/SpringDataPractice/assets/95271934/198123f7-97d4-4f42-90ec-8263c9b7dab8)


