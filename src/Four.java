import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Four {
    public static void main(String[] args) {

        try {
            class Password implements Comparable<Password> {
                String text;
                int count;

                public Password(String text, int count) {
                    this.text = text;
                    this.count = count;
                }

                @Override
                public int compareTo(Password other) {
                    if (this.count < other.count)
                        return 1;
                    if (this.count > other.count)
                        return -1;
                    return 0;
                }
            }


            ArrayList<String> mas = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("/home/artem/IdeaProjects/module/src/Pass.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ':') {
                        mas.add(line.substring(i + 1, line.length()));
                    }
                }
            }

            ArrayList<Password> result = new ArrayList<>();
            for (String password : mas) {
                if (result.size() == 0)
                    result.add(new Password(password, 1));
                else {
                    boolean is_unique = true;
                    for (Password object : result)
                        if (password.equals(object.text)) {
                            is_unique = false;
                            object.count++;
                            break;
                        }

                    if (is_unique) result.add(new Password(password, 1));
                }
            }


            Collections.sort(result);
            int i = 1;
            for (Password object : result) {
                if (i == 11) break;
                System.out.println("TOP " + i + ":" + object.text);
                i++;
            }

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}




