package spring_mybatil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xywy.dao.UserDao;
import com.xywy.model.User;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		User user = new User();

		// �����������20
		// user.setId(1);
		// user.setUsername("Jessica");
		// user.setPassword("123");
		// userDao.addUser(user);
		// user.setId(2);
		// user.setUsername("Jessica2");
		// user.setPassword("123");
		// userDao.addUser(user);
		// System.out.println("��ӳɹ�");

		// ��ѯ����30
//		 user.setUsername("Jessica");
//		 user.setPassword("123");
//		 System.out.println(userDao.getUser(user).toString());
//		 user.setUsername("Jessica2");
//		 user.setPassword("123");
//		 System.out.println(userDao.getUser(user).toString());

		// �޸�����37
		 user.setId(2);
		 user.setPassword("123456");
		 userDao.updateUser(user);
		 System.out.println("�޸ĳɹ�");

		// ɾ������42
		// userDao.deleteUser(1);
		// System.out.println("ɾ���ɹ�");
	}
}
