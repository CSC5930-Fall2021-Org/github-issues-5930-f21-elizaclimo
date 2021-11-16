package edu.studio.issue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class IssueTest {

    @Test
    void testProperties() {
        
        Issue issue = new Issue();
        issue.setId(999);
        assertEquals(999,issue.getId());
        
        Date now = new Date();
        issue.setCreatedAt(now);
        assertEquals(now, issue.getCreatedAt());
        
        User user = new User();
        user.setId(42);
        issue.setUser(user);
        assertEquals(42, issue.getId());
    }
    
    @Test
    void testEquals() {
        
        Issue issueA = new Issue();
        issueA.setId(999);
        
        Issue issueB = new Issue();
        issueA.setId(999);
        
        assertEquals(issueA, issueB);
        assertEquals(issueA.hashCode(),issueB.hashCode());
        
    }
    
    @Test
    void testCompareTo() {
        
        Issue issueA = new Issue();
        issueA.setId(1000);
        
        Issue issueB = new Issue();
        issueA.setId(1000);
        
        assertEquals(issueA, issueB);
        assertEquals(issueA.compareTo(issueB), 0);
        
    }
    
    

}
