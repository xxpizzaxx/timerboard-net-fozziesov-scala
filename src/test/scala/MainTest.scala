/**
 * Created by Andi on 16/07/2015.
 */
import utest._

import org.scalajs.jquery.jQuery

object MainTest extends TestSuite {

  // Initialize App
  Main.main()

  def tests = TestSuite {
    'HelloWorld {
      assert(jQuery("p:contains('jquery works too!')").length == 1)
    }
  }
}

