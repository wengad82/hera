package com.dfire.common.service;

import com.dfire.common.entity.HeraFile;

import java.util.List;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 19:19 2018/1/12
 * @desc 开发中心文件文件管理
 */
public interface HeraFileService {


    int insert(HeraFile heraFile);

    int delete(String id);

    int update(HeraFile heraFile);

    List<HeraFile> getAll();

    HeraFile findById(String id);

    List<HeraFile> findByIds(List<Integer> list);

    List<HeraFile> findByParent(HeraFile heraFile);

    List<HeraFile> findByOwner(String heraFile);


}