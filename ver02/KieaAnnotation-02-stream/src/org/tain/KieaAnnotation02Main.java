package org.tain;

import org.tain.container.StreamContainer;
import org.tain.object.Info;
import org.tain.object.Sender;
import org.tain.object.Source;

public class KieaAnnotation02Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (flag) job01();
		if (flag) job02();
	}
	
	private static void job01() throws Exception {
		StreamContainer<Sender> streamContainer = new StreamContainer<Sender>();
		Sender sender = new Sender();
		sender.setName("NAME");
		sender.setTitle("TITLE");
		sender.setContent("CONTENT");
		
		String stream = streamContainer.get(sender);
		System.out.println("[" + stream + "]");
	}
	
	private static void job02() throws Exception {
		System.out.println(">>> [" + new Info() + "]");
		System.out.println(">>> [" + new Source() + "]");
	}
}
