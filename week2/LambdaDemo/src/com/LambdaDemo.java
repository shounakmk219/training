package com;

interface I {
	void abc();
}

interface J {
	void abc(String msg);
}

interface K {
	int abc(int a, int b);
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		I i=()->{System.out.println("In lambda");};
		i.abc();
		J j=(msg)->{System.out.println("Message: "+msg);};
		j.abc("hey");
		K k=(a,b)->{return a+b;};
		System.out.println(k.abc(2, 3));
	}

}
