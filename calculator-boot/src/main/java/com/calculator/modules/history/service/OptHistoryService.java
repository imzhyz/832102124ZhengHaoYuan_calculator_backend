package com.calculator.modules.history.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.calculator.modules.history.domain.entity.OptHistory;

import java.util.List;

/**
 * (OptHistory)表服务接口
 *
 */
public interface OptHistoryService extends IService<OptHistory> {

    /**
     * 最近十条数据
     */
    List<OptHistory> listHistoryLastTen();
}

