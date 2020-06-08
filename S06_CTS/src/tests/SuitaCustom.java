package tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import interfaces.IPersoanaTanaraTest;
import interfaces.IPersoanaVarstnicaTest;

@RunWith(Categories.class)
@SuiteClasses({ TestPachetTuristic.class, TestPersoana.class })
//@IncludeCategory(IPersoanaVarstnicaTest.class)
@ExcludeCategory(IPersoanaTanaraTest.class)
public class SuitaCustom {

}