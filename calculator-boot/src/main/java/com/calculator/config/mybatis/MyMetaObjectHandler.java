package com.calculator.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 插入时的填充策略
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        // 起始版本 3.3.3   推荐
        this.strictInsertFill(metaObject, "createTime", Date::new, Date.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }


}