package main.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(Double.MAX_VALUE);
		if (args.length != 1) {
			System.out
					.println("Error: you must provide the path of the file that contains the numbers");
			return;
		}
		String path = args[0];
		System.out.println(path);
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(path),
					Charset.defaultCharset());
			if (lines != null) {
				for (String line : lines) {
					System.out.println("\n - Prime numbers less than  " + line
							+ ": ");
					try {
						Number number = new Number(line);
						findAndPrintPrimes(number);
					} catch (NumberFormatException e) {
						System.out.print(line + " is not a number");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void findAndPrintPrimes(Number limit) {
		for (int i = 2; i <= limit.getNumber(); i++) {
			Number number = new Number(i);
			if (number.isPrime()) {
				if (i > 2)
					System.out.print(",");
				System.out.print(i);
			}
		}

	}

}
