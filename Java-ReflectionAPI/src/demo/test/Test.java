package demo.test;

import java.lang.reflect.Field;

import demo.user.User;


//setting value and accessing the private variable of "User class" without setter method

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		// =========load the class into JVM================
		Class<?> forName = Class.forName("demo.user.User");

		// ========load the class variable============
		Field field = forName.getDeclaredField("age");

		// ==========give access for variable=================
		field.setAccessible(true);

		// ==========getting object from the loaded class==================
		Object newInstance = forName.newInstance();

		// ===========type casting===========================
		User user = (User) newInstance;
		user.getAge(); // before age=10

		// ===============setting value to private variable================
		field.set(newInstance, 30);
		user.getAge();// after age=30

	}
}
