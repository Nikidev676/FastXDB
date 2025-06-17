package com.example.FastXprojdemo.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.fastxprojdemo.jpa.UserAccountRegRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // full spring application is  loaded for testing
public class UserAccountTest {

	@Autowired
	private UserAccountRegRepo userAccountRegRepo;

	@Test
	void testUserAccountRegRepoIsNotNull() {
		assertNotNull(userAccountRegRepo, "UserAccountRegRepo should not be null");
	}
}
//It checks whether the repo(object) is injected successfully or not




























/*
 * @Test void testAllFields() { UserAccount user = new
 * UserAccount("test@example.com", "Nikidev@30", "Nikitha Dev", "9876543210",
 * "123 Street", "Female", "User");
 * 
 * assertEquals("test@example.com", user.getEmail()); assertEquals("Nikidev@30",
 * user.getPassword()); assertEquals("Nikitha Dev", user.getFullName());
 * assertEquals("9876543210", user.getPhone()); assertEquals("123 Street",
 * user.getAddress()); assertEquals("Female", user.getGender());
 * assertEquals("User", user.getAccountType()); }
 * 
 * @Test void testSetters() { UserAccount user = new UserAccount();
 * user.setEmail("a@b.com"); user.setPassword("pass");
 * user.setFullName("Akash"); user.setPhone("7845506942");
 * user.setAddress("Addr"); user.setGender("Other");
 * user.setAccountType("Bus Operator");
 * 
 * assertEquals("a@b.com", user.getEmail()); assertEquals("pass",
 * user.getPassword()); assertEquals("Akash", user.getFullName());
 * assertEquals("7845506942", user.getPhone()); assertEquals("Addr",
 * user.getAddress()); assertEquals("Other", user.getGender());
 * assertEquals("Bus Operator", user.getAccountType()); }
 * 
 * @Test void testToString() { UserAccount user = new UserAccount("a@b.com",
 * "p", "AB", "123", "Addr", "Male", "Type"); String expected =
 * "Register [email=a@b.com, password=p, fullname=AB, phone=123, address=Addr, gender=Male, accountType=Type]"
 * ; assertEquals(expected, user.toString()); } }
 */
