package app.helpers

import org.scalatest.{BeforeAndAfterEach, Matchers, WordSpec}
import org.scalatest.mockito.MockitoSugar

trait Test extends WordSpec with Matchers with MockitoSugar with Faker with BeforeAndAfterEach{

}
