package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;


import android.inputmethodservice.Keyboard;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import listview.tutorial.dhruvj.com.headinglistviewtutorial.R;

public class HeadingListData implements ListHeader, HeaderListItem {



    private String headingData;
    private ArrayList<ListRow> rowListData;
    private int headingLayout;

    public HeadingListData(String _headingData, int _headingLayout) {
        headingData = _headingData;
        rowListData = new ArrayList<>();
        headingLayout = _headingLayout;
    }

    @Override
    public void addRow(ListRow rowData) {
        rowListData.add(rowData);
    }

    public ArrayList<ListRow> getRows() {
        return rowListData;
    }




    public String getData() {
        return headingData;
    }


    @Override
    public View getView(LayoutInflater inflater) {
        View convertView = inflater.inflate(headingLayout, null);

        TextView dnsNameTV = (TextView)convertView.findViewById(R.id.dns_name);
        dnsNameTV.setText(getData());
        return convertView;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof HeadingListData)) return false;
        if(this.headingData == ((HeadingListData) obj).headingData) return true;
        return false;
    }
}
