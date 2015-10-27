package net.apispark.webapi.db;

import static org.junit.Assert.*;
import net.apispark.webapi.representation.Contact;

import org.junit.Test;

public class ContactPersistenceTest {

	@Test
	public void test() {
		Contact contact = new Contact("1", "Augustin", "De Vita", "test");
		ContactPersistence.INSTANCE.addContact(contact);
		Contact contactTest = ContactPersistence.INSTANCE.getContact("1");
		assertEquals(contact, contactTest);
	}

}
