package tests;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import interfaces.PersoaneMajore;
import interfaces.PersoaneMinore;

@RunWith(Suite.class)
@SuiteClasses({ TestPachetTuristic.class })
@IncludeCategory({PersoaneMinore.class, PersoaneMajore.class})
public class SuitaCustom2 {

}
