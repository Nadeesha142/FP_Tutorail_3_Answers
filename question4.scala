object question4 extends App{

	//book price
	def bookPrice(amount:Int):Double=amount*24.95;

	//discount

	def discount(bookPrice:Double):Double=bookPrice*0.4;

	//shipping cost

	def shippingCost(amount:Int):Double=3*amount+(amount-50)*0.75;

	//The total wholsale cost 

	def total(amount:Int):Double=bookPrice(amount)-discount(bookPrice(amount))+shippingCost(amount);

	printf("The total wholsale cost for 60 books=%0.2f",total(60));
}