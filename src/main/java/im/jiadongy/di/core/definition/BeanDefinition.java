package im.jiadongy.di.core.definition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiadongy on 16/7/8.
 */
public class BeanDefinition {

    private String id;

    private String clazz;

    private List<Property> properties = new ArrayList<Property>();

    private boolean isInterface = false;

    private String initMethod;

    private String factoryMethod;

    private String factoryBean;

    private List<ConstructorArgs> constructorArgs = new ArrayList<>();

    private boolean innerBean;

    public List<ConstructorArgs> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArgs> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    public String getFactoryMethod() {
        return factoryMethod;
    }

    public void setFactoryMethod(String factoryMethod) {
        this.factoryMethod = factoryMethod;
    }

    public String getFactoryBean() {
        return factoryBean;
    }

    public void setFactoryBean(String factoryBean) {
        this.factoryBean = factoryBean;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean anInterface) {
        isInterface = anInterface;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public String getInitMethod() {
        return initMethod;
    }

    public void setInitMethod(String initMethod) {
        this.initMethod = initMethod;
    }

    public boolean isInnerBean() {
        return innerBean;
    }

    public void setInnerBean(boolean innerBean) {
        this.innerBean = innerBean;
    }
}

