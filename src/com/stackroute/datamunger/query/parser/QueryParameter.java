package com.stackroute.datamunger.query.parser;

import java.util.List;
/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */
public class QueryParameter {

	private String queryString;
	private String fileName;
	private String baseQuery;
	private List<Restriction> restrictions;
	private List<String> logicalOperators;
	private List<String> fields;
	private List<AggregateFunction> aggregateFunctions;
	private List<String> groupByFields;
	private List<String> orderByFields;
	private String QUERY_TYPE;
	


	public String getQueryString() {
		return queryString;
	}



	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}



	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public String getBaseQuery() {
		return baseQuery;
	}



	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}



	public List<Restriction> getRestrictions() {
		return restrictions;
	}



	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}



	public List<String> getLogicalOperators() {
		return logicalOperators;
	}



	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}



	public List<String> getFields() {
		return fields;
	}



	public void setFields(List<String> fields) {
		this.fields = fields;
	}



	public List<AggregateFunction> getAggregateFunctions() {
		return aggregateFunctions;
	}



	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}



	public List<String> getGroupByFields() {
		return groupByFields;
	}



	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}



	public List<String> getOrderByFields() {
		return orderByFields;
	}



	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}



	public String getQUERY_TYPE() {
		return QUERY_TYPE;
	}



	public void setQUERY_TYPE(String qUERY_TYPE) {
		QUERY_TYPE = qUERY_TYPE;
	}



	@Override
	public String toString() {
		return "QueryParameter [queryString=" + queryString + ", fileName=" + fileName + ", baseQuery=" + baseQuery
				+ ", restrictions=" + restrictions + ", logicalOperators=" + logicalOperators + ", fields=" + fields
				+ ", aggregateFunctions=" + aggregateFunctions + ", groupByFields=" + groupByFields + ", orderByFields="
				+ orderByFields + ", QUERY_TYPE=" + QUERY_TYPE + "]";
	}


		

	
}
