package move_proxy;

public class UserDAOImpl implements UserDAO{

	@Override
	public void add(){
		System.out.println("添加用户");
	}


	@Override
	public void update() {
		System.out.println("更新用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void query() {
		System.out.println("查询用户");
	}		
	
}
