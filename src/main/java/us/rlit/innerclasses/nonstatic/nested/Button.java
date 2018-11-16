package us.rlit.innerclasses.nonstatic.nested;

public class Button {
    private String title;
    private OnClickListener onClockListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClockListener(OnClickListener onClockListener){
        this.onClockListener = onClockListener;
    }

    public void onClick() {
        this.onClockListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }

}
