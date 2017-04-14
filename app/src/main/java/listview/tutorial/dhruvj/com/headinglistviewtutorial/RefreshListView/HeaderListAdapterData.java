package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;


import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class HeaderListAdapterData {

    private ArrayList<HeadingListData> headings;

    public HeaderListAdapterData() {
        headings = new ArrayList<>();
    }

    public void addHeading(HeadingListData newHeading) {
        for(HeadingListData heading: headings) {
            if(heading.equals(newHeading)) {
                for(RowListData rowData: newHeading.getRows()) {
                    heading.addRow(rowData);
                }
                return;
            }
        }
        headings.add(newHeading);
    }

    public ListData getItem(int position) {
        ++position;
        for (HeadingListData heading: headings) {
            if (heading.getRows().size() + 1 < position) {
                position = position - heading.getRows().size() - 1;
            } else {
                if (position == 1) return heading;
                return heading.getRows().get(position-2);
            }
        }
        return null;
    }

    public int getSize() {
        int size = 0;
        for (HeadingListData heading: headings) {
            size += heading.getRows().size() + 1;
        }
        return size;
    }

}
