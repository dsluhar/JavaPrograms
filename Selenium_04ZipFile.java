package AutomationScripts;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Selenium_04ZipFile {
	
	// Sample Function to make zip of reports
	public static void Selenium_04ZipFile(String filepath){
	try
	{
	File inputFolder=new File("Mention file path her");
	File outputFolder=new File("Reports.zip");
	ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outputFolder)));
	BufferedInputStream in = null;
	byte[] data = new byte[1000];
	String files[] = inputFolder.list();
	for (int j=0; j<files.length; i++)
	{
	in = new BufferedInputStream(new FileInputStream(inputFolder.getPath() + "/" + files[j]), 1000); 
	out.putNextEntry(new ZipEntry(files[j]));
	int totalcount;
	while((totalcount= in.read(data,0,1000)) != -1)
	{
	out.write(data, 0, totalcount);
	}
	out.closeEntry();
	}
	out.flush();
	out.close(); 
	}
	catch(Exception e)
	{
	e.printStackTrace();
	return "Fail - " + e.getMessage();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
