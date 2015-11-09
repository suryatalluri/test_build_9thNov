/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_build_9thnov.t6579;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column;
import javax.persistence.Embeddable;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Table2Id generated by hbm2java
 */
@Embeddable
public class Table2Id  implements java.io.Serializable
 {


private Integer column2;
private Integer id;

    public Table2Id() {
    }




    

    @Column(name="COLUMN2", nullable=false)
    public Integer getColumn2() {
        return this.column2;
    }
    
    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    

    @Column(name="ID", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Table2Id) )
		 return false;

		 Table2Id that = ( Table2Id ) o;

         return ( (this.getColumn2()==that.getColumn2()) || ( this.getColumn2()!=null && that.getColumn2()!=null && this.getColumn2().equals(that.getColumn2()) ) )
 && ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getColumn2() == null ? 0 : this.getColumn2().hashCode() );
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}

