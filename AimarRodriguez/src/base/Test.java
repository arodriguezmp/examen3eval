package base;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		assertEquals(false, Principal.solicitarPermiso(20));
		assertEquals(true, Principal.solicitarPermiso(90));
	}

}
