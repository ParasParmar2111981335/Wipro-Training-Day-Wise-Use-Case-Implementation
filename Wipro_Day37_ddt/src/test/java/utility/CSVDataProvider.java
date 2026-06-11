package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class CSVDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {

        List<Object[]> data = new ArrayList<>();

        BufferedReader br = new BufferedReader(
                new FileReader("loginData.csv"));

        String line;

        br.readLine(); // Skip header

        while ((line = br.readLine()) != null) {

            String[] values = line.split(",");

            data.add(new Object[] {
                    values[0],
                    values[1]
            });
        }

        br.close();

        return data.toArray(new Object[0][]);
    }
}