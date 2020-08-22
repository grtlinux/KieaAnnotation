package org.tain.working;

import org.tain.annotation.SubString;
import org.tain.object.BookObject;

public class BookObjectWorking {

	private static boolean flag = true;
	
	public static void test001() {
		if (flag) {
			try {
				BookObject book = new BookObject();
				String stream = book.getStream();
				System.out.println("STREAM >>>>> [" + stream + "]");
				// [BOOK_This Have a goo      2048Page_this'TIP01     Tip's cont    32020-08-22      1024Kiea      Kang         27]
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (flag) {
			try {
				String stream = "BOOK_This Have a goo      2048Page_this'TIP01     Tip's cont    32020-08-22      1024Kiea      Kang         27";
				SubString subString = new SubString(stream);
				BookObject book = new BookObject();
				book.setStream(subString);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
