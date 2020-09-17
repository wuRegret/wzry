package com.miao.hero;

import com.miao.ISkill;

public class zhubajie implements ISkill {
    @Override
    public void firstSkill() {
        System.out.println("猪八戒使用1技能");
    }

    @Override
    public void secondSkill() {
        System.out.println("猪八戒使用2技能");
    }

    @Override
    public void thirdSkill() {
        System.out.println("猪八戒使用3技能");
    }

    @Override
    public void generalAttack() {
        System.out.println("猪八戒平A");
    }
}
