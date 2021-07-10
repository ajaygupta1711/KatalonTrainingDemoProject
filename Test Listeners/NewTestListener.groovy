import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite

class NewTestListener {
	
	@BeforeTestCase
	def beforetest() {
	
	println "\n I am inside beforeTest\n"
}

	@AfterTestCase
    def aftertest() {
		
	println "\n I am inside afterTest\n"
 }

 	@BeforeTestSuite
 	def beforetestsuite() {
		 
		 println "\n I am inside beforeSuite\n"
}
 	
	@AfterTestSuite
	def aftertestsuite() {
		
		println "\n I am inside afterSuite\n"
	}
	
}
	
	