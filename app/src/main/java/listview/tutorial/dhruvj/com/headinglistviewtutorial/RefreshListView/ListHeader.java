package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;


import android.preference.PreferenceActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;


public interface ListHeader {

    ArrayList<ListRow> getRows();


    void addRow(ListRow rowData);

}
