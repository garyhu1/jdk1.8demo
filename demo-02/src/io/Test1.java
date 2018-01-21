package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class Test1 {
	public static void main(String[] args) {
		String fileName = "E:/demo/file.txt";
		String disFileName = "E:/demo/newFile.txt";
		String content = "add new Content to this file";
		readBufferFile(fileName);
//		readFileByByte(fileName,disFileName);
//		appendContentToLast1(disFileName,content);
		appendContentToLast2(fileName,content);
	}
	
	public static void readBufferFile(String fileName) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 以字节为单位读取文件，常用于读二进制文件，如图片、声音、影像等文件。
	 */
	public static void readFileByByte(String fileName,String disFileName) {
		File file = new File(fileName);
		File disFile = new File(disFileName);
		InputStream in = null;
		OutputStream out = null;
		byte[] b = new byte[1024*2];
		try {
			in = new FileInputStream(file);
			out = new FileOutputStream(disFileName);
			int len = 0;
			while((len = in.read(b))!=-1) {
				out.write(b,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null) {
					in.close();
				}
				if(out!=null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 在文件末尾添加新内容1
	 */
	public static void appendContentToLast1(String fileName,String content) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(fileName,"rw");
			long fileLength = raf.length();
			raf.seek(fileLength);
			raf.writeBytes(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(raf!=null) {
					raf.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 添加内容在文件的末尾2
	 */
	public static void appendContentToLast2(String fileName,String content) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName,true);
			fw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
