package sg.edu.rp.c346.id18015170.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoItem> alTodo;
    ArrayAdapter<ToDoItem> aaTodo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewTodo);
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2020,8,1);
        date2.set(2020,8,2);

        alTodo = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("Go for movie", date1 );
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);

        alTodo.add(item1);
        alTodo.add(item2);

        //aaTodo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alTodo);
        adapter = new CustomAdapter(this, R.layout.row, alTodo);
        lvToDo.setAdapter(aaTodo);

    }
}
