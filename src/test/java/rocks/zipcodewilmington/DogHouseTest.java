package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogTest(){
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        int expected = 2;
        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeIdTest(){
//Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 10);
        String name1 = "Bilo";
        Date birthDate1 = new Date();
        Dog bilo = new Dog(name1, birthDate1, 3);

        DogHouse.clear();
        // When
        DogHouse.add(milo);
        DogHouse.add(bilo);
        DogHouse.remove(10);
        int expected = 1;
        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeDogTest(){
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.remove(animal);
        int expected = 2;
        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void getDogByIdTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 10);
        String name1 = "Bilo";
        Date birthDate1 = new Date();
        Dog bilo = new Dog(name1, birthDate1, 3);

        DogHouse.clear();
        // When
        DogHouse.add(milo);
        DogHouse.add(bilo);
        Dog expected = bilo;

        // Then
        Dog actual = DogHouse.getDogById(3);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
