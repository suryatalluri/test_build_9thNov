
package com.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;

import  com.hrdb.service.HrdbQueryExecutorService;
import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.*;

@RestController(value = "Hrdb.QueryExecutionController")
@Api(value = "/hrdb/queryExecutor", description = "Controller class for query execution")
@RequestMapping("/hrdb/queryExecutor")
public class QueryExecutionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

	@Autowired
	private HrdbQueryExecutorService queryService;
	
	@ApiOperation(value = "Process request to execute queries")
	@RequestMapping(value = "/queries/test", method = RequestMethod.GET)
	public Page<Object> executeTest(
		 Pageable pageable)
	    {
			LOGGER.debug("Executing named query test");

		Page<Object> result = queryService.executeTest(pageable);
		LOGGER.debug("got the result of named query {}", result);
		return result;
	}
	@ApiOperation(value = "Process request to execute queries")
	@RequestMapping(value = "/queries/test1", method = RequestMethod.GET)
	public Page<Object> executeTest1(
		 Pageable pageable)
	    {
			LOGGER.debug("Executing named query test1");

		Page<Object> result = queryService.executeTest1(pageable);
		LOGGER.debug("got the result of named query {}", result);
		return result;
	}
	

	@RequestMapping(value = "/queries/wm_custom", method = RequestMethod.POST)
	@ApiOperation(value = "Process request to execute customer queries")
	public Page<Object> executeWMCustomQuery(@RequestBody CustomQuery query, Pageable pageable) {
		Page<Object> result = queryService.executeWMCustomQuerySelect(query, pageable);
		LOGGER.debug("got the result {}" + result);
		return result;
	}

	@RequestMapping(value = "/queries/wm_custom_update", method = RequestMethod.POST)
	@ApiOperation(value = "Process request to execute customer queries")
    public int executeWMCustomQuery(@RequestBody CustomQuery query) {
        int result = queryService.executeWMCustomQueryUpdate(query);
        LOGGER.debug("got the result {}" + result);
        return result;
    }

}

