package ahusby.scalasterketyper

import ahusby.scalasterketyper.Ovingsoppgave.enProveErAvlagtIOslo
import org.scalatest.FunSpec

class OvingsoppgaveSpec extends FunSpec {

  describe("enProveErAvlagtIOslo") {
    it("forventet input") {
      assert(enProveErAvlagtIOslo(Dto("true", "true", "true", "true")))
      assert(enProveErAvlagtIOslo(Dto("true", "false", "true", "true")))
      assert(enProveErAvlagtIOslo(Dto("true", "true", "true", "false")))
      assert(enProveErAvlagtIOslo(Dto("false", "false", "true", "true")))
      assert(enProveErAvlagtIOslo(Dto("true", "true", "false", "false")))
      assert(!enProveErAvlagtIOslo(Dto("false", "false", "false", "false")))
    }

    it("bør aldri forekomme") {
      assertThrows[IllegalArgumentException] {
        enProveErAvlagtIOslo(Dto("false", "true", "true", "true"))
      }

      assertThrows[IllegalArgumentException] {
        assert(enProveErAvlagtIOslo(Dto("true", "true", "false", "true")))
      }

      assertThrows[IllegalArgumentException] {
        assert(enProveErAvlagtIOslo(Dto("false", "true", "false", "true")))
      }
    }
  }

}
