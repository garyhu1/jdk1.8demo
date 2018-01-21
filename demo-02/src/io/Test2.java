package io;

public class Test2 {
   public static void main(String[] args) {
	   
	   /**
	    * ��ӡ����
	    */
	   Human aPerson = new Human();
	   Class c1 = aPerson.getClass();
	   System.out.println(c1.getName());
	   
	   Human lady = new Woman();
	   Class c2 = lady.getClass();
	   System.out.println(c2.getName());
	   
	   Class c3 = Woman.class;
	   System.out.println(c3.getName());
	   
	   /**
	    * ��ӡ�����ڵİ���
	    */
	   System.out.println(c1.getPackage());
	   
	   /**
	    * ͨ��class����ȡ����ʵ��
	    */
	   try {
		  Human man = (Human) c3.newInstance();
		  man.growHeight(20);
		  System.out.println(man.getHeight());
	   } catch (InstantiationException e) {
		  e.printStackTrace();
	   } catch (IllegalAccessException e) {
		  e.printStackTrace();
	   }
   }
}

class Human{
	private int height;
	
	public int getHeight() {
		return height;
	}
	
	public void growHeight(int h) {
		this.height = this.height+h;
	}
}

class Woman extends Human{
	
	public Human giveBirth() {
		System.out.println("Give Birth");
		return (new Human());
	}
}
