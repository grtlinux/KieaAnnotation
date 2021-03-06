package org.tain;

import org.tain.container.StreamContainer;
import org.tain.object.Info;
import org.tain.object.Sender;
import org.tain.object.Source;
import org.tain.object.ToString;
import org.tain.object2.SubString;
import org.tain.object2._Source;

public class KieaAnnotation02Main {

	private static boolean flag = true;
	
	public static void main(String[] args) throws Exception {
		
		if (!flag) job01();
		if (!flag) job02();
		if (!flag) job03();
		
		if (flag) job04();
	}
	
	////////////////////////////////////////////////////////////////////
	
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
		System.out.println("Info >>> [" + new Info() + "]");
		System.out.println("Source >>> [" + new Source() + "]");
	}
	
	private static void job03() throws Exception {
		System.out.println("ToString >>> [" + new ToString() + "]");
	}
	
	////////////////////////////////////////////////////////////////////
	
	private static void job04() throws Exception {
		_Source source = new _Source();
		System.out.println("1st >>>>> [" + source + "]");
		
		String strSource = source.get();
		System.out.println("2nd >>>>> [" + strSource + "]");
		
		SubString subString = new SubString(strSource);
		source.set(subString);
		System.out.println("3rd >>>>> [" + source + "]");
	}
}
