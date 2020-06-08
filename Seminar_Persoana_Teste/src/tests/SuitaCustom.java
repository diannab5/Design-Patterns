package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import interfete.IPersoanaTanaraTest;
import interfete.IPersoanaVarstnicaTest;

//modificam aici nu mai rulam cu suite, ca nu le vrem pe toate
@RunWith(Categories.class)
@SuiteClasses({TestPersoana.class,TestPachetTuristic.class,TestPersoanaCorrectTest.class})
@IncludeCategory(IPersoanaTanaraTest.class)
@ExcludeCategory(IPersoanaVarstnicaTest.class)
public class SuitaCustom {

}
