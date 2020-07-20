package sg.edu.rp.c346.id18015170.demotodolist;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = getDate().get(Calendar.DATE) + "/" + getDate().get(Calendar.MONTH) + "/" + getDate().get(Calendar.YEAR);
        return str;
    }
}
