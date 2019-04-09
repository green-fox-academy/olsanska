public class TodoPrint {
    public static void main(String... args){
        String todoText = "-Buy milk\n";
        String myTodo = "My todo:\n";
        String[] todolist = {myTodo, todoText, "-Download games\n", "  -Diablo"};

        //for (int i = 0; i < todolist.length; i++) {
        for (String list: todolist
             ) {
            System.out.print(list);

        }

    }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo