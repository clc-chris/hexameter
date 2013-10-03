package biz.pavonis.hexameter.api;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import biz.pavonis.hexameter.categories.UnitTests;

@Category(UnitTests.class)
public class HexagonOrientationTest {

	@Test
	public void testFlatCoordinateOffset() {
		assertEquals(0.0f, HexagonOrientation.FLAT_TOP.getCoordinateOffset());
	}

	@Test
	public void testPointyCoordinateOffset() {
		assertEquals(0.5f, HexagonOrientation.POINTY_TOP.getCoordinateOffset());
	}
}
