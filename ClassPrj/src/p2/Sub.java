package p2;

import java.util.Scanner;

public class Sub {
	int age, offensePower, defensePower;
	String name;
	
	public Sub(String a, int b, int c, int d){
		this.name = a;
		this.age = b;
		this.offensePower = c;
		this.defensePower = d;
	}
	
	public Sub(String a, int b){
		this.name = a;
		this.age = b;
	}

	public Sub(String a, int b, int c) {
		this.name = a;
		this.age = b;
		this.offensePower = c;
	}

	public void printChoose() {

		System.out.println(this.name + " " + this.age + " " + this.offensePower + " " + this.defensePower + "\n");

	}

	public void printChoose2() {

		System.out.println(this.name + " " + this.age + "\n");

	}

	public void printChoose3() {

		System.out.println(this.name + " " + this.age + " " + this.offensePower + "\n");

	}
}