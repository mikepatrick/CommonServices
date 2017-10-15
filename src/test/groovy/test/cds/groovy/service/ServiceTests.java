package test.cds.groovy.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GlobalCustomerLookupServiceTests.class,
				RecRegLookupServiceTests.class })

public class ServiceTests {

}
