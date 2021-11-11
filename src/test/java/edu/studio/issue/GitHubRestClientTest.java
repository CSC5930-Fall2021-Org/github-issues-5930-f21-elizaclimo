package edu.studio.issue;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

class GitHubRestClientTest {

    @Test
    void testGetIssues() throws IOException {
        GitHubRestClient client = new GitHubRestClient();
        String bearerToken = System.getProperty("bearer.token");
        String actualJson = client.getIssues(bearerToken);
        String expectedJson = Files.readString(
                Paths.get("src/test/resources/sample-output.txt"));
        
        assertEquals(expectedJson,actualJson);
    }

}
