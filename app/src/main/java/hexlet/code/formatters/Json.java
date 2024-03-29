package hexlet.code.formatters;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public final class Json implements FormatterType {
    public String format(List<Map<String, Object>> difference) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(difference);
    }
}
