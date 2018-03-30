package uk.ac.aston.gardnersdiary.services.database.task;

import uk.ac.aston.gardnersdiary.models.TaskType;

public interface TaskRetrieval {

    /**
     * Adds a {@link TaskType task type} to the database.
     * @param taskType the task type to add
     */
    void addTaskType(TaskType taskType);

}
