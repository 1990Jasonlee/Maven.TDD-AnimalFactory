package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest(){
        //Given
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        // When
        CatHouse.add(animal);
        CatHouse.add(animal);
        int expected = 2;
        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeIdTest(){
        String name = "Zula";
        Date birthDate = new Date();
        Cat zula = new Cat(name, birthDate, 11);
        String name1 = "Dula";
        Date birthDate1 = new Date();
        Cat dula = new Cat(name1, birthDate1, 4);

        CatHouse.clear();
        // When
        CatHouse.add(zula);
        CatHouse.add(dula);
        CatHouse.remove(4);
        int expected = 1;
        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeCatTest(){
        //Given
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        // When
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.remove(animal);
        int expected = 3;
        // Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatByIdTest(){
        String name = "Zula";
        Date birthDate = new Date();
        Cat zula = new Cat(name, birthDate, 11);
        String name1 = "Dula";
        Date birthDate1 = new Date();
        Cat dula = new Cat(name1, birthDate1, 4);

        CatHouse.clear();
        // When
        CatHouse.add(zula);
        CatHouse.add(dula);
        Cat expected = zula;

        // Then
        Cat actual = CatHouse.getCatById(11);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNumOfCatsTest(){
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
