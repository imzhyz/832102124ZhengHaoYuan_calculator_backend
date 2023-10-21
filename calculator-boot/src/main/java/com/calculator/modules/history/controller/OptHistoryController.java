package com.calculator.modules.history.controller;


import com.calculator.common.result.Result;
import com.calculator.modules.history.domain.entity.OptHistory;
import com.calculator.modules.history.service.OptHistoryService;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * (OptHistory)表控制层
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("optHistory")
public class OptHistoryController {

    private final OptHistoryService optHistoryService;

    /**
     * 查询最近十条
     */
    @GetMapping("/listHistoryLastTen")
    public Result listHistoryLastTen() {
        return Result.success(this.optHistoryService.listHistoryLastTen());
    }


    /**
     * 新增数据
     *
     * @param optHistory 实体对象
     * @return 新增结果
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody OptHistory optHistory) {
        return Result.success(this.optHistoryService.save(optHistory));
    }

}

