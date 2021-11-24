package edu.studio.issue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.Test;

public class IssueParserTest {
    @Test
    void testParseIssueWithValidJson() throws IOException {
        IssueParser parser = new IssueParser();
        //read in sample JSON
        String json = Files.readString(
                Paths.get("src/test/resources/sample-output.txt"));
        
        List<Issue> issues = parser.parseIssues(json);
        assertNotNull(issues);
        assertEquals(2, issues.size());  
        
        Issue issue0 = issues.get(0);
        assertEquals(1, issue0.getNumber());

       
    }
}
