package edu.arizona.cs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.lucene.document.Document;


public class TestQ13b {
    @Test
    public void testDocsAndScores() {
        String inputFileFullPath = "input.txt";
        QueryEngine objQueryEngine = new QueryEngine(inputFileFullPath); // not here
        try {
            String[] common_query = {"information", "retrieval"};
            List<ResultClass> ans13b = objQueryEngine.runQ13b(common_query);
            assertEquals(ans13b.size(), 0);
        } catch (java.io.FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



