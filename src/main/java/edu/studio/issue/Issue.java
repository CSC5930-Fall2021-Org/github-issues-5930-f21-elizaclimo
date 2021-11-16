package edu.studio.issue;

import java.util.Date;

public class Issue implements Comparable<Issue>{
    
    private int number; //the displayed issue number
    private long id; //the internal GitHub id for the issue
    private boolean state; //whether the issue is open or closed
    private String title; //the summary description of the issue
    private String body; //the initial description of the issue
    private Date createdAt; //the Date on which the issue was created. Use the Java Date class, not a String.
    private Date closedAt; //if the issue’s state is closed, the Date on which the issue was closed; otherwisenull
    private User user; //the user who created the issue – should be of type User
    private User assignee; //the user to whom the issue is currently assigned – should be of type User
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Issue other = (Issue) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public Issue() {}
    
    public Date getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int compareTo(Issue other) {
        // TODO Auto-generated method stub
        //based on id 
        //comparing this and other by id 
        if( this.id > other.id) {
            return 1;
        }
        else if(this.id < other.id) {
            return -1;
        }
        return 0;
    }
    
}
