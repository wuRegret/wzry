package com.miao;

public class HeroFactory {

    public static ISkill getHero(String name) throws Exception {
        String classStr = "com.miao.hero."+name;
        Class<?> cla = Class.forName(classStr);
        Object obj = cla.newInstance();
        return (ISkill)obj;

    }
}
