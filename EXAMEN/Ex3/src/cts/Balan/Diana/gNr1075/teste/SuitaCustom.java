package cts.Balan.Diana.gNr1075.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TesteCalculValoareTVA.class, TesteSetPret.class })
@IncludeCategory(ICustomTeste.class)
public class SuitaCustom {

}
