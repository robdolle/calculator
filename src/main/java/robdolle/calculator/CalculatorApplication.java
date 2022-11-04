package robdolle.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class CalculatorApplication {
	public static void main(String[] args){
	
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
}
