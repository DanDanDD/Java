package backtrack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Dennis
 * @date: 2020/8/5 13:40
 */

class Employee {
    public int id;
    public int importance;  // 重要性
    public List<Integer> subordinates; // 下属
}

public class LeetCode690 {
    public int DFS(Map<Integer, Employee> employeeMap, int id) {
        Employee curE = employeeMap.get(id);
        int result = curE.importance;
        for (int curId : curE.subordinates){
            result += DFS(employeeMap,curId);
        }
        return result;
    }

    public int getImportance(List<Employee> employees, int id) {
        if(employees.isEmpty()){
            return 0;
        }
        Map<Integer,Employee> employeeMap = new HashMap<>();
        for (Employee e : employees){
            employeeMap.put(e.id,e);
        }
        return DFS(employeeMap,id);
    }
}
