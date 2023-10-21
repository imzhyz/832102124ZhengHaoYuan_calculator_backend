package com.calculator.modules.history.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.calculator.modules.history.domain.entity.OptHistory;

import java.util.List;

/**
 * (OptHistory)表数据库访问层
 *
 */
public interface OptHistoryMapper extends BaseMapper<OptHistory> {


    List<OptHistory> listHistoryLastTen();
}

