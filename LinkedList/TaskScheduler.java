/*Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers. */


class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class CircularLinkedList {
    private Task head;
    private Task tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    public void removeTaskById(int taskId) {
        if (head == null) return;

        Task current = head;
        Task previous = tail;
        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
    }

    public void displayAllTasks() {
        if (head == null) return;

        Task current = head;
        do {
            System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName +", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }
}
public class TaskScheduler {
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();

        taskList.addTaskAtEnd(1, "Task One", 2, "2024-07-01");
        taskList.addTaskAtEnd(2, "Task Two", 1, "2024-06-15");

        System.out.println("All Tasks:");
        taskList.displayAllTasks();

        System.out.println("\nRemoving Task with ID 2");
        taskList.removeTaskById(2);
    }
}
