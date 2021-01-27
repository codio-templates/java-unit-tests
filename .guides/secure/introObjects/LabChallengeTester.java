import static org.junit.Assert.*;
import org.junit.Test;

public class LabChallengeTester {
  Dog dog1 = new Dog("Marceline", "German Shepherd");
  Dog dog2 = new Dog(dog1);
//   dog2.name = "Cajun";
//   dog2.breed = "Belgian Malinois";
  
  @Test
  public void checkName() {
    assertEquals("Marceline", dog1.name);
    assertEquals("Cajun", dog2.name);
  }
  
  @Test
  public void checkBreed() {
    assertEquals("German Shepherd", dog1.breed);
    assertEquals("Belgian Malinois", dog2.breed);
  }
  
  @Test
  public void checkMemoryAddress() {
    assertNotEquals(dog1, dog2);
  }
  
}