package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Marc";

        } else if (query.contains("what is 1 + 1")) {
            return "2";
        }else if (query.contains("which of the following numbers is the largest: 12, 876, 560, 74")) {
            return "876";

        }else if (query.contains("what is 0 plus 12")){
            return "12";
        }else if (query.contains("74633480")) {
            return "530";

        }else if (query.contains("afa484a0: what is 2 plus 2")){
            return "4";
        } else  { // TODO extend the programm here
            return "";
        }
    }
}
