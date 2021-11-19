package com.util;

import net.rcarz.jiraclient.*;

public class JiraServiceProvider {
    public JiraClient jira;
    public String project;

    public JiraServiceProvider(String jiraUrl, String username, String password, String project) {
        BasicCredentials cred = new BasicCredentials(username, password);
        jira = new JiraClient(jiraUrl, cred);
        this.project = project;
    }

    public void createJiraTicket(String issueType, String summary, String description, String reporterName) throws JiraException {
        Issue.FluentCreate fluentCreate = jira.createIssue(project, issueType);
        fluentCreate.field((Field.SUMMARY), summary);
        fluentCreate.field((Field.DESCRIPTION), description);
//        fluentCreate.field((Field.REPORTER), reporterName);

        Issue newIssue = fluentCreate.execute();
        System.out.println("new issue created in jira with ID: " + newIssue);

    }

    public void updateJiraStatus(String issueID, String status_field_result) throws JiraException {
//        Issue issue_jira = jira.getIssue(issueID);
        Issue issue_jira = jira.getIssue(issueID, status_field_result);

        System.out.println("issue in jira with ID: " + issue_jira);
    }
}
