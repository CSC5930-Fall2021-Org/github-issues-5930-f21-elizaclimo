package edu.studio.issue;

import kong.unirest.Unirest;

public class GitHubRestClient {

    protected static final String TEST_AREA_URL = "https://api.github.com/repos/CSC5930-Fall2021-Org/github-issues-5930-elizaclimo/issues?state=all";

    public String getIssues(String token) {
        String responseBody = Unirest.get(TEST_AREA_URL)
                .header("Authorization", "Bearer " + token)
                .asString()
                .getBody();

        return responseBody;
    }

}
