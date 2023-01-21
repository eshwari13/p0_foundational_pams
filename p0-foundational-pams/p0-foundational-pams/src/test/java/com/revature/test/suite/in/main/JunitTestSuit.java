package com.revature.test.suite.in.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.revature.config.DatabaseConnectionTest;
import com.revature.dao.PatientDaoImplTest;
import com.revature.util.DateUtilTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({ DatabaseConnectionTest.class,PatientDaoImplTest.class ,DateUtilTest.class})
public class JunitTestSuit {

}
