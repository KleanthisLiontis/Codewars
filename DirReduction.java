import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        Map<String, String> opposites = new HashMap<>();
        opposites.put("NORTH", "SOUTH");
        opposites.put("SOUTH", "NORTH");
        opposites.put("EAST", "WEST");
        opposites.put("WEST", "EAST");

        List<String> result = new ArrayList<>();
        for (String direction : arr) {
            if (!result.isEmpty() && opposites.get(direction).equals(result.get(result.size() - 1))) {
                result.remove(result.size() - 1);
            } else {
                result.add(direction);
            }
        }

        return result.toArray(new String[0]);
    }
}


/*import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
}

 */