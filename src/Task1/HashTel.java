package Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    public class HashTel {

        private final Map<FullName, String> book = new HashMap<>();

        public void addPhone(FullName fullName, String phone) {
            book.put(fullName, phone);
        }

        public Set<Map.Entry<FullName, String>> getEntries() {
            return book.entrySet();

        }
    }