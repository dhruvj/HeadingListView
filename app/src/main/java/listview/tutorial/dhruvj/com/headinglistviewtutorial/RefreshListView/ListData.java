package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;


import android.view.LayoutInflater;
import android.view.View;

/**
 * Stores either Service or DNSServer. Used to send data to ServiceListAdaper.
 */
public interface ListData {

    int getType();

    String getData();

    View getView(LayoutInflater inflater);

}
