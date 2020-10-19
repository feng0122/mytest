import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class servicetest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
    @Autowired
 private ItemsServiceImpl ItemsServiceImpl;

    @Test
    public void  test01(){

        List<Items> all = ItemsServiceImpl.findAll();
        System.out.println(all);

        Items items = new Items();
        items.setName("wogiao");
        int save = ItemsServiceImpl.save(items);
        System.out.println(save);

    }
}
