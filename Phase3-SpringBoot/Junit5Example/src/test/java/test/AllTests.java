package test;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages("com.test")
@SuiteDisplayName(value ="My All junit5 test files")
public class AllTests {

}
