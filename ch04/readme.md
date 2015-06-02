```xml
<bean id="engine" class="com.apress.isf.spring.service.ServiceSearchEngine" >
 <property name="documentDAO" ref="documentDAO"/>
</bean>
```

上述bean的定义方式默认是`单例（Singleton）`无论怎么使用诸如`getBean()`的方法调用，
得到的总是同一个实例。

```java

    @Bean
    @Scope("prototype")
    public SearchEngine engine() {
        // 方法命和变量名一样，同xml中的id
        SearchEngineService engine = new SearchEngineService();
        engine.setDocumentDAO(documentDAO());

        if (log.isDebugEnabled())
            log.debug("SearchEngine created: " + engine);

        return engine;
    }
```

Java configuration class配置bean的方式。