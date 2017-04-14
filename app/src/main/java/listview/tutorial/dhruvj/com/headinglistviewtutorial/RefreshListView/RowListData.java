package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;


import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import listview.tutorial.dhruvj.com.headinglistviewtutorial.R;

import static listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.HeadingListData.TYPE;

public class RowListData implements ListData {

    private String rowData;
    private ArrayList<String> information;
    private int rowLayout;

    public RowListData(String _rowData, int _rowLayout) {
        rowData = _rowData;
        information = new ArrayList<>();
        rowLayout = _rowLayout;
    }
    public RowListData(String _rowData, String _information, int _rowLayout) {
        rowData = _rowData;
        information = new ArrayList<>();
        information.add(_information);
        rowLayout = _rowLayout;
    }

    public void addInformation(ArrayList<String> info) {
        information.addAll(info);
    }

    public ArrayList<String> getInformation() {
        return information;
    }


    public int getType() {
        return TYPE;
    }


    public String getData() {
        return rowData;
    }


    public View getView(LayoutInflater inflater) {
        View convertView = inflater.inflate(rowLayout, null);
        LinearLayout parentView = (LinearLayout)convertView.findViewById(R.id.service_layout);

        TextView serviceNameTV = (TextView)convertView.findViewById(R.id.service_name);
        serviceNameTV.setText(getData());

        ArrayList<String> informations = getInformation();
        if(informations != null) {
            for(String information: informations) {
                RelativeLayout infoView = (RelativeLayout) inflater.inflate(R.layout.service_list_extra_information, parentView, false);
                ((TextView)infoView.findViewById(R.id.service_description)).setText("\u2022 "+information);
                parentView.addView(infoView);
            }
        }
        return convertView;
    }
}
