package edu.studio.issue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IssueExporter {
    
    public static void main(String[] args) throws IOException {
        IssueExporter issueEx = new IssueExporter();
        GitHubRestClient git = new GitHubRestClient();
        IssueParser parser = new IssueParser();
        
        if (issueEx.validatePat(args) == false) {
            System.out.println("Invalid PAT. Please rerun the program with a valid PAT");
        }
        else {
            
            String issues = git.getIssues(args[0]);
            List<Issue> json = parser.parseIssues(issues);
            
            File file = new File("src/test/resources/actual-issues.txt");
            FileWriter myWriter = new FileWriter(file);
                
            for(Issue issue : json) {
                myWriter.write(issue.toString());
            }
            
            myWriter.close();
        }
    }
    
    public boolean validatePat(String[] pat) {
        if (pat != null && pat[0] != "") {
            return true;
        }
        return false;
    }

}
