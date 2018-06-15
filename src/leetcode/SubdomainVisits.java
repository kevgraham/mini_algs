package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisits {

    public static void main(String[] args) {
        String[] test1 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisits(test1);
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> count = new HashMap<>();

        for (String s : cpdomains) {
            String[] parts = s.split(" ");
            int visits = Integer.parseInt(parts[0]);

            // iterate through domain chars
            String[] domains = parts[1].split("\\.");

            StringBuilder currDomain = new StringBuilder();

            for (int i = domains.length - 1; i >= 0; i--) {

                // get current domain
                if (currDomain.length() > 0) {
                    currDomain.insert(0, ".");
                }
                currDomain.insert(0, domains[i]);

                // update count
                if (count.containsKey(currDomain.toString())) {
                    count.put(currDomain.toString(), count.get(currDomain.toString()) + visits);
                } else {
                    count.put(currDomain.toString(), visits);
                }
            }
        }

        // make result array
        ArrayList<String> results = new ArrayList<>();

        for (String k : count.keySet()) {
            StringBuilder r = new StringBuilder();
            r.append(count.get(k));
            r.append(" ");
            r.append(k);
            results.add(r.toString());
        }

        return results;
    }
}
