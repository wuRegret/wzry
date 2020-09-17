package com.miao.hero;

import com.miao.ISkill;

public class jinke implements ISkill {
    @Override
    public void firstSkill() {
        System.out.println("阿珂使用1技能");
    }

    @Override
    public void secondSkill() {
        System.out.println("阿珂使用2技能");
    }

    @Override
    public void thirdSkill() {
        System.out.println("阿珂使用3技能");
    }

    @Override
    public void generalAttack() {
        System.out.println("阿珂平A");
    }
}
