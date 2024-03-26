package com.nashss.se.musicplaylistservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.nashss.se.musicplaylistservice.converters.ZonedDateTimeConverter;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@DynamoDBTable(tableName = "Projects")
public class Project {
    private String orgId;
    private String projectId;
    private String name;
    private List<Task> taskList;
    private Double completionPercentage;
    private String projectStatus;
    private ZonedDateTime creationDate;
    private ZonedDateTime endDate;

    @DynamoDBHashKey(attributeName = "orgId")
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @DynamoDBRangeKey(attributeName = "projectId")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "completionPercentage")
    public Double getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(Double completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    @DynamoDBAttribute(attributeName = "projectStatus")
    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    @DynamoDBAttribute(attributeName = "taskList")
    public List<Task> getTaskList() {
        return new ArrayList<>(taskList);
    }

    public void setTaskList(Task task) {
        this.taskList.add(task);
    }

    @DynamoDBAttribute(attributeName = "creationDate")
    @DynamoDBTypeConverted(converter = ZonedDateTimeConverter.class)
    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setStartTime(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @DynamoDBAttribute(attributeName = "endDate")
    @DynamoDBTypeConverted(converter = ZonedDateTimeConverter.class)
    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

}

