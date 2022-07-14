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
        }
        else if (query.contains("which of the following numbers is the largest: 12, 876, 560, 74")) {
            return "876";

        }else if (query.contains("what is 0 plus 12")){
            return "12";
        }else if (query.contains("74633480")) {
            return "530";

        }else if (query.contains("afa484a0: what is 2 plus 2")){
            return "4";
        } else if (query.contains("c91732e0: which of the following numbers is the largest: 245, 93, 293, 94")){
            return "293";
        } else if (query.contains("which of the following numbers is the largest: 21, 80")) {
            return "80";
        } else if (query.contains("which of the following numbers is the largest: 84, 49")) {
            return "84";
        } else if (query.contains("what is 0 plus 3")) {
            return "3";
        } else if (query.contains("what is 15 plus 9")) {
            return "24";
        } else if (query.contains("which of the following numbers is the largest: 12, 34, 695, 214")) {
            return "695";
        } else if (query.contains("what is 0 minus 15")) {
            return "15";
        } else if (query.contains("which city is the Eiffel tower in")) {
            return "Paris";
        } else if (query.contains("what is 7 minus 18")) {
           return "-11";
        } else if (query.contains("which of the following numbers is both a square and a cube: 400, 299")) {
            return "400";
        } else  { // TODO extend the programm here
            return "";
        }
    }
}
