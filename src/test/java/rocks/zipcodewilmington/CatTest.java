package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import javax.naming.Name;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        //Given
        String expected = "cat";
        //When
        Date catDate = new Date();
        Cat cat = new Cat(expected, catDate, 1);
        //Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest(){
        //Given
        String expected = "meow!";
        //When
        String catName = "cat";
        Date catDate = new Date();
        Cat cat = new Cat(catName, catDate, 1);
        //Then
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest(){
        //Given
        Date expected = new Date(1,1,1);
        //When
        String catName = "cat";
        Date catDate = new Date();
        Cat cat = new Cat(catName, expected, 1);
        //Then
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        //Given
        Food food = new Food();
        int expected = 3;
        //When
        String catName = "cat";
        Date catDate = new Date();
        Cat cat = new Cat(catName, catDate, 1);
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        //Then
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void idTest(){
        //Given
        int expected = 5;
        //When
        String catName = "cat";
        Date catDate = new Date();
        Cat cat = new Cat(catName, catDate, expected);
        //Then
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void animalInheritTest(){
        //When
        String catName = "cat";
        Date catDate = new Date();
        Cat cat = new Cat(catName, catDate, 1);
        //Then
        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void mammalInheritTest(){
        //When
        String catName = "cat";
        Date catDate = new Date();
        Cat cat = new Cat(catName, catDate, 1);
        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }
}
