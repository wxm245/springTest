package org.wangxm;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyTagHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
