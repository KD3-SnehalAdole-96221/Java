package com.app.Fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int Menulist() {
		Scanner sc = new Scanner(System.in);

		System.out.println("******************************");

		System.out.println("0.Exit");
		System.out.println("1.Add Mango: ");
		System.out.println("2.Add Orange: ");
		System.out.println("3.Add Apple: ");
		System.out.println("4.Display Fruits in basket:");
		System.out.println("5.Display name color weight taste of All Fresh Fruits in basket:");
		System.out.println("6. Display tastes of all stale fruit in basket: ");
		System.out.println("7.Mark fruit as stale: ");
		System.out.println("8.Mark all sour fruits stale: ");
		System.out.println("******************************");
		System.out.println("Enter Choice: ");
		int choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basket Size: ");
		int size = sc.nextInt();

		Fruit basket[] = new Fruit[size];
		int count = 0;

		int choice;
		while ((choice = Menulist()) != 0) {
			switch (choice) {

			case 1:
				if (count < size) {

					System.out.println("Enter Mangoname: ");
					String name = sc.next();
					System.out.println("Enter total weight: ");
					double weight = sc.nextDouble();
					System.out.println("Enter Color: ");
					String color = sc.next();
					basket[count++] = new Mango(name, weight, color);
				} else {
					System.out.println("Basket is full: ");
				}
				break;
			case 2:
				if (count < size) {
					System.out.println("Enter Orange name :");
					String name = sc.next();
					System.out.println("Enter total weight: ");
					double weight = sc.nextDouble();
					System.out.println("Enter Color: ");
					String color = sc.next();
					basket[count++] = new Orange(name, weight, color);
				} else {
					System.out.println("Basket is full: ");
				}
				break;
			case 3:
				if (count < size) {
					System.out.println("Enter Apple name :");
					String name = sc.next();
					System.out.println("Enter total weight: ");
					double weight = sc.nextDouble();
					System.out.println("Enter Color: ");
					String color = sc.next();
					basket[count++] = new Apple(name, weight, color);
				} else {
					System.out.println("Basket is full: ");
				}
				break;
			case 4:
				for (Fruit fruit : basket) {
					if (fruit != null)
						System.out.println(fruit.getName());
				}
				break;
			case 5:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.isFresh) {
						System.out.println(fruit.toString() + ",Taste:" + fruit.taste());
					}
				}
				break;
			case 6:
				for (Fruit fruit : basket) {
					if (fruit != null && !fruit.isFresh()) {
						System.out.println(fruit.toString() + ",Taste: " + fruit.taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter index to mark as stale: ");
				int i = sc.nextInt();
				if (i >= 0 && i < count) {
					basket[i].setFresh(false);
					System.out.println("Fruit at index " + i + "marked as Stale.");
				} else {
					System.out.println("Invalid index");
				}
				break;
			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.taste().equals("Sour")) {
						fruit.setFresh(false);
					}
				}
				System.out.println("All sour fruits marked as stale.");
				break;

			}
			
		}
		sc.close();

	}

}
