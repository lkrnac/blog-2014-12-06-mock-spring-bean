package net.lkrnac.blog.testing.mockbean;

import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;
import net.lkrnac.blog.testing.mockbean.AddressDao;
import net.lkrnac.blog.testing.mockbean.AddressService;
import net.lkrnac.blog.testing.mockbean.Application;
import net.lkrnac.blog.testing.mockbean.fake.AddressDaoMock;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Application.class, AddressDaoMock.class })
public class AddressServiceITest {
	@Autowired
	private AddressService addressService;

	@Autowired
	private AddressDao addressDao;

	@Test
	public void testGetAddressForUser() {
		// GIVEN
		when(addressDao.readAddress("john")).thenReturn("5 Bright Corner");

		// WHEN
		String actualAddress = addressService.getAddressForUser("john");

		// THEN
		Assert.assertEquals("5 Bright Corner", actualAddress);
	}

	@After
	public void resetMock() {
		reset(addressDao);
	}
}
