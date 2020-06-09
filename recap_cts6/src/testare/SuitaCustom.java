package testare;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ ProdusGetVanzareMaximaTests.class, ProdusSetPretTests.class })
@IncludeCategory({CategorieProduseCuVanzariZilnice.class, CategorieProduseFaraVanzariZilnice.class})
public class SuitaCustom {

}
