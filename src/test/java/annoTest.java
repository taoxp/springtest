import com.txp.spring.SpringTestApplocation;
import com.txp.spring.annotation.Animal;
import com.txp.spring.annotation.AnimalService;
import com.txp.spring.util.AnimalType;
import org.assertj.core.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author: taoxp
 * @create: 2020-11-24 18:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplocation.class)
public class annoTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test() throws InvocationTargetException, IllegalAccessException {

        Map<String, Object> beanNames=applicationContext.getBeansWithAnnotation(AnimalService.class);
        Map<AnimalType,Method> methodMap=new HashMap<>();
        Map<AnimalType,Object> beanMap=new HashMap<>();
        for (String key : beanNames.keySet()){
            Method[] methods=applicationContext.getType(key).getMethods();
            for (Method method:methods){
                Animal animalAnnotation=method.getAnnotation(Animal.class);
                if (!Objects.isNull(animalAnnotation)){
                    methodMap.put(animalAnnotation.value(),method);
                    beanMap.put(animalAnnotation.value(),beanNames.get(key));
                }
            }
        }
        methodMap.get(AnimalType.CAT).invoke(beanMap.get(AnimalType.CAT),null);
        methodMap.get(AnimalType.DOG).invoke(beanMap.get(AnimalType.DOG),null);
    }
}
