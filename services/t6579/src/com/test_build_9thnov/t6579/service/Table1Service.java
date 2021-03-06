/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_build_9thnov.t6579.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.test_build_9thnov.t6579.*;

/**
 * Service object for domain model class Table1.
 * @see com.test_build_9thnov.t6579.Table1
 */

public interface Table1Service {
   /**
	 * Creates a new table1.
	 * 
	 * @param created
	 *            The information of the created table1.
	 * @return The created table1.
	 */
	public Table1 create(Table1 created);

	/**
	 * Deletes a table1.
	 * 
	 * @param table1Id
	 *            The id of the deleted table1.
	 * @return The deleted table1.
	 * @throws EntityNotFoundException
	 *             if no table1 is found with the given id.
	 */
	public Table1 delete(Table1Id table1Id) throws EntityNotFoundException;

	/**
	 * Finds all table1s.
	 * 
	 * @return A list of table1s.
	 */
	public Page<Table1> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Table1> findAll(Pageable pageable);
	
	/**
	 * Finds table1 by id.
	 * 
	 * @param id
	 *            The id of the wanted table1.
	 * @return The found table1. If no table1 is found, this method returns
	 *         null.
	 */
	public Table1 findById(Table1Id id) throws EntityNotFoundException;
	/**
	 * Updates the information of a table1.
	 * 
	 * @param updated
	 *            The information of the updated table1.
	 * @return The updated table1.
	 * @throws EntityNotFoundException
	 *             if no table1 is found with given id.
	 */
	public Table1 update(Table1 updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the table1s in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the table1.
	 */

	public long countAll();


    public Page<Table1> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

