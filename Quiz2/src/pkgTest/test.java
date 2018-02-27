package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Question1.carPayment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class test {
	
	@Test
	void testcar() {
		carPayment cp = new carPayment (35000.0,0.0, 60, 0.1);

		double monthlyPayment = Math.round(cp.monthlyPayment()*100.0)/100.0;
		double totalInterestPaid = Math.round(cp.totalInterestPaid()*100.0)/100.0;
		
		assertTrue(monthlyPayment==743.65);
		assertTrue(totalInterestPaid==9618.79);
	}

}
