package tr1fker.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import tr1fker.models.Task;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TaskStorage {
    private static final String FILE_NAME = "tasks.json";
    private final ObjectMapper mapper = new ObjectMapper();

    public void saveTasks(Set<Task> tasks) {
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(FILE_NAME), tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Task> loadTasks() {
        try {
            File file = new File(FILE_NAME);
            CollectionType listType = mapper.getTypeFactory()
                    .constructCollectionType(Set.class, Task.class);
            return mapper.readValue(file, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
