package User_Registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTesting {

    @Test
    public void FirstName() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.CheckFirstName("Kailashnath");
        Assert.assertTrue(result);
    }

    @Test
    public void LastName() throws UserRegistrationException {
    	UserRegistration user = new UserRegistration();
        boolean result = user.CheckLastName("Vishwakarma");
        Assert.assertTrue(result);
    }

    @Test
    public void Mail() throws UserRegistrationException {
    	UserRegistration user = new UserRegistration();
        boolean result = user.Email("nathkailash2020@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void Number() throws UserRegistrationException {
    	UserRegistration user = new UserRegistration();
        boolean result = user.PhoneNumber("91 9205267464");
        Assert.assertTrue(result);
    }

    @Test
    public void PasswordTest() throws UserRegistrationException {
    	UserRegistration user = new UserRegistration();
        boolean result = user.Password("baba@Kailash97");
        Assert.assertTrue(result);
    }
}