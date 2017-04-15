package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;


import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;


public class HeaderListAdapterData {

    private ArrayList<ListHeader> headings;

    public HeaderListAdapterData() {
        headings = new ArrayList<>();
    }

    public void addHeading(ListHeader newHeading) {
        for(ListHeader heading: headings) {
            if(heading.equals(newHeading)) {
                for(ListRow rowData: newHeading.getRows()) {
                    heading.addRow(rowData);
                }
                return;
            }
        }
        headings.add(newHeading);
    }

    public HeaderListItem getItem(int position) {
        ++position;
        for (ListHeader heading: headings) {
            if (heading.getRows().size() + 1 < position) {
                position = position - heading.getRows().size() - 1;
            } else {
                if (position == 1) return (HeaderListItem) heading;
                return (HeaderListItem)heading.getRows().get(position-2);
            }
        }
        return null;
    }

    public int getSize() {
        int size = 0;
        for (ListHeader heading: headings) {
            size += heading.getRows().size() + 1;
        }
        return size;
    }

}
