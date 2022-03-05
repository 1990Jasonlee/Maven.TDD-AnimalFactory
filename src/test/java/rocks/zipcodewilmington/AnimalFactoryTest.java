package rocks.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    // Given (cat data)


    @Test
        public void creatDogTest(){
        String expectedName = "Milo";
        Date expectedDate = new Date(1,1,1);

        Dog newDog = AnimalFactory.createDog(expectedName,expectedDate);

        String actualName = newDog.getName();
        Date actualDate = newDog.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
        public void createCatTest() {
        String expectedName = "Zula";
        Date expectedDate = new Date(1,1,1);

        Cat newCat = AnimalFactory.createCat(expectedName, expectedDate);

        String actualName = newCat.getName();
        Date actualDate = newCat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
