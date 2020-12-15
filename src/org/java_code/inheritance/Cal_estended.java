package org.java_code.inheritance;

public class Cal_estended extends Cal {

	int c;
	
	int add() {
		return super.a + super.b + this.c;
//		return super.add()+this.c;
	}

	int mul() {
		return super.a + super.b + this.c;
//		return super.mul()+this.c;
	}
}
