package com.calculator.modules.history.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.calculator.modules.history.service.OptHistoryService;
import com.calculator.modules.history.mapper.OptHistoryMapper;
import com.calculator.modules.history.domain.entity.OptHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (OptHistory)表服务实现类
 *
 */
@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class OptHistoryServiceImpl extends ServiceImpl<OptHistoryMapper, OptHistory> implements OptHistoryService {

    @Override
    public List<OptHistory> listHistoryLastTen() {
        return baseMapper.listHistoryLastTen();
    }


}

