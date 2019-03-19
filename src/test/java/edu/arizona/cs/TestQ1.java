package edu.arizona.cs;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestQ1 {

    @Test
    public void testDocsAndScores() {
        String inputFileFullPath="input.txt";
        QueryEngine objQueryEngine = new QueryEngine(inputFileFullPath);
        try {
            String[] common_query = {"information", "retrieval"};
            List<ResultClass> ans1 = objQueryEngine.runQ1(common_query);
            String[] doc_names_q1 = {"Doc1", "Doc2"};
            int counter1 = 0;
            assertEquals((doc_names_q1.length) , ans1.size());
            for (ResultClass docs : ans1) {
                assertEquals(doc_names_q1[counter1], docs.DocName.get("docid"));
                counter1 = counter1 + 1;
            }
        }
        catch ( java.io.FileNotFoundException ex)
        {
            System.out.println(ex.getMessage()); }

        catch ( java.io.IOException ex)
        {
            System.out.println(ex.getMessage()); }

    }


}



