import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import helper.BaseHelper;
import helper.json.JsonHelper;


@RunWith(SpringJUnit4ClassRunner.class)
//�����ļ���λ��
//����ǰ�����ļ���=��ǰ��������-context.xml �Ϳ����ڵ�ǰĿ¼�в���@ContextConfiguration()
@ContextConfiguration("classpath:applicationContext.xml")
public class Main extends BaseHelper{

	
	
    @Autowired
    //�Զ�װ��
    private ApplicationContext cxf;
	
	@Test
	public void test(){
		JsonHelper word=(JsonHelper) cxf.getBean("jsonHelper");
		log.debug(word);
		log.error(word);
		log.info(word);
		log.info(word);
		System.out.println("dddd");
	}
	
}
