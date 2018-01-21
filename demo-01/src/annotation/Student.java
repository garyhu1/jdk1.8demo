package annotation;

@MyBind(name="Judy",ID=1023)
public class Student {

	@MyField(value="香蕉",type="热带水果")
	private String fruit;
	
	@MyField(value="菠菜",type="蔬菜")
	private String vagetable;
	
	@MyMethod(method="GET",name="getStudentFra")
	public void getStudentFra(){
		System.out.println("获取学生爱吃什么水果");
	}
	
	@MyMethod(method="POST",name="likeEatVagetable")
	public void likeEatVagetable(){
		System.out.println("大力士爱吃菠菜");
	}
}
