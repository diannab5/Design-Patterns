package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TesteCalculTotalPuncte.class, TestSetPunctajMaxim.class })
@IncludeCategory({ITesteCustom.class})
public class SuitaCustom {

}
