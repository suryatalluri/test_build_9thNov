/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_build_9thnov.t6579.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.test_build_9thnov.t6579.service.Table2Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wordnik.swagger.annotations.*;
import com.test_build_9thnov.t6579.*;
import com.test_build_9thnov.t6579.service.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class Table2.
 * @see com.test_build_9thnov.t6579.Table2
 */
@RestController(value = "T6579.Table2Controller")
@RequestMapping("/t6579/Table2")
@Api(description = "Exposes APIs to work with Table2 resource.", value = "Table2Controller")
public class Table2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table2Controller.class);

    @Autowired
    @Qualifier("t6579.Table2Service")
    private Table2Service table2Service;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of Table2 instances matching the search criteria.")
    public Page<Table2> findTable2s(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of Table2 instances.")
    public Page<Table2> getTable2s(Pageable pageable) {
        LOGGER.debug("Rendering Table2s list");
        return table2Service.findAll(pageable);
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the Table2 instance associated with the given composite-id.")
    public Table2 getTable2(@RequestParam("column2") Integer column2, @RequestParam("id") Integer id) throws EntityNotFoundException {
        Table2Id temp = new Table2Id();
        temp.setColumn2(column2);
        temp.setId(id);
        LOGGER.debug("Getting Table2 with id: {}", temp);
        Table2 instance = table2Service.findById(temp);
        LOGGER.debug("Table2 details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the Table2 instance associated with the given composite-id.")
    public boolean deleteTable2(@RequestParam("column2") Integer column2, @RequestParam("id") Integer id) throws EntityNotFoundException {
        Table2Id temp = new Table2Id();
        temp.setColumn2(column2);
        temp.setId(id);
        LOGGER.debug("Deleting Table2 with id: {}", temp);
        Table2 deleted = table2Service.delete(temp);
        return deleted != null;
    }

    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the Table2 instance associated with the given composite-id.")
    public Table2 editTable2(@RequestParam("column2") Integer column2, @RequestParam("id") Integer id, @RequestBody Table2 instance) throws EntityNotFoundException {
        Table2Id temp = new Table2Id();
        temp.setColumn2(column2);
        temp.setId(id);
        table2Service.delete(temp);
        instance = table2Service.create(instance);
        LOGGER.debug("Table2 details with id is updated: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ApiOperation(value = "Creates a new Table2 instance.")
    public Table2 createTable2(@RequestBody Table2 instance) {
        LOGGER.debug("Create Table2 with information: {}", instance);
        instance = table2Service.create(instance);
        LOGGER.debug("Created Table2 with information: {}", instance);
        return instance;
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setTable2Service(Table2Service service) {
        this.table2Service = service;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of Table2 instances.")
    public Long countAllTable2s() {
        LOGGER.debug("counting Table2s");
        Long count = table2Service.countAll();
        return count;
    }
}