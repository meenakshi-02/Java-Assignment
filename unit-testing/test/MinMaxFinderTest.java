package assignment.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Nested
	@DisplayName("Return Array Min Max")
	@Tag("ReturnArrayMinMax")
	class FindMinMax {
		@Test
		void testPositive() {
			assertArrayEquals(new int[] { 3, 789 }, MinMaxFinder.findMinMax(new int[] { 6, 345, 54, 3, 23, 789, 45 }));
		}

		@Test
		void testRepeatedPositive() {
			assertArrayEquals(new int[] { 19, 487 },
					MinMaxFinder.findMinMax(new int[] { 45, 487, 19, 345, 64, 19, 64 }));
		}

		@Test
		void testNegetive() {
			assertArrayEquals(new int[] { -385, -9 },
					MinMaxFinder.findMinMax(new int[] { -34, -29, -73, -234, -98, -9, -385 }));
		}

		@Test
		void testRepeatedNegetive() {
			assertArrayEquals(new int[] { -8763, -34 },
					MinMaxFinder.findMinMax(new int[] { -82, -34, -57, -34, -8763, -35, -8763 }));
		}

		@Test
		void testInteger() {
			assertArrayEquals(new int[] { -100, 849 },
					MinMaxFinder.findMinMax(new int[] { 654, -56, 8, 0, 45, 81, -49, 849, -100 }));
		}

		@Test
		void testRepeatedInteger() {
			assertArrayEquals(new int[] { -67, 360 },
					MinMaxFinder.findMinMax(new int[] { -4, 345, -67, 230, 63, 360, 43, -4, 230, 8, 8 }));
		}

		@Test
		void testEmptyArray() {
			assertThrows(ArrayIndexOutOfBoundsException.class, () -> MinMaxFinder.findMinMax(new int[] {}));
		}

		@Test
		void testWithZero() {
			assertArrayEquals(new int[] { 0, 345 }, MinMaxFinder.findMinMax(new int[] { 0, 345, 0, 0, 4, 0, 0, 0, 0 }));
		}

		@Test
		void testSameValues() {
			assertArrayEquals(new int[] { 10, 10 },
					MinMaxFinder.findMinMax(new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
		}
	}

	@Nested
	@DisplayName("Return Object Min Max")
	@Tag("ReturnObjectMinMax")
	class FindMinMax1 {
		@Test
		void testPositive() {
			assertEquals(new MinMax(3, 789), MinMaxFinder.findMinMax2(new int[] { 6, 345, 54, 3, 23, 789, 45 }));
		}

		@Test
		void testRepeatedPositive() {
			assertEquals(new MinMax(19, 487), MinMaxFinder.findMinMax2(new int[] { 45, 487, 19, 345, 64, 19, 64 }));
		}

		@Test
		void testNegetive() {
			assertEquals(new MinMax(-385, -9),
					MinMaxFinder.findMinMax2(new int[] { -34, -29, -73, -234, -98, -9, -385 }));
		}

		@Test
		void testRepeatedNegetive() {
			assertEquals(new MinMax(-8763, -34),
					MinMaxFinder.findMinMax2(new int[] { -82, -34, -57, -34, -8763, -35, -8763 }));
		}

		@Test
		void testInteger() {
			assertEquals(new MinMax(-100, 849),
					MinMaxFinder.findMinMax2(new int[] { 654, -56, 8, 0, 45, 81, -49, 849, -100 }));
		}

		@Test
		void testRepeatedInteger() {
			assertEquals(new MinMax(-67, 360),
					MinMaxFinder.findMinMax2(new int[] { -4, 345, -67, 230, 63, 360, 43, -4, 230, 8, 8 }));
		}
		
		@Test
		void testEmptyArray() {
			assertThrows(ArrayIndexOutOfBoundsException.class, () -> MinMaxFinder.findMinMax(new int[] {}));
		}

		@Test
		void testWithZero() {
			assertEquals(new MinMax(0, 345), MinMaxFinder.findMinMax2(new int[] { 0, 345, 0, 0, 4, 0, 0, 0, 0 }));
		}

		@Test
		void testSameMinMax() {
			assertEquals(new MinMax(10, 10),
					MinMaxFinder.findMinMax2(new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
		}

	}

}
