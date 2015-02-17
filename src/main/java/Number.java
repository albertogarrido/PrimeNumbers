package main.java;

public class Number {

	private Integer number;

	public Number(Integer number) {
		this.number = number;
	}

	public Number(String number) throws NumberFormatException {
		this.number = parseNumber(number);
	}

	private Integer parseNumber(String number) {
		try {
			Integer integer = new Integer(number);
			return integer;
		} catch (NumberFormatException numberFormatException) {
			throw numberFormatException;
		}
	}
	
	public Integer getNumber(){
		return this.number;
	}

	public boolean isPrime() {
		if (this.number != 2 && this.number % 2 == 0) return false;
		if (this.number != 3 && this.number % 3 == 0) return false;
		if (this.number != 5 && this.number % 5 == 0) return false;
		if (this.number != 7 && this.number % 7 == 0) return false;
		if (this.number % 10 == 0) return false;
		if (countPositiveDivisors(this.number) > 2) return false;
		return true;
	}

	private int countPositiveDivisors(int number) {
		Integer i = 1;
		int factorsCount = 0;
		while (i < Math.sqrt(number) + 1) {
			if (number % i == 0) {
				factorsCount++;
				if(factorsCount > 2) return factorsCount;
			}
			i++;
		}
		return factorsCount;
	}

}
