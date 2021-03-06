package listview.tutorial.dhruvj.com.headinglistviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.HeaderListAdapter;
import listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.HeaderListAdapterData;
import listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.HeaderListItem;
import listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.HeadingListData;
import listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.ListHeader;
import listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.RowListData;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView.HeaderListAdapter refreshListAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        refreshListAdapter = new HeaderListAdapter(this);

        final HeaderListAdapterData serviceListAdapterData = new HeaderListAdapterData();

        // Pizzas
        HeadingListData pizzaHeading = new HeadingListData("Pizza");


        RowListData MarinaraPizza = new RowListData("MarinaraPizza");
        ArrayList<String> info =  new ArrayList<>();
        info.add("Features tomatoes, garlic, oregano, and extra virgin olive oil.");
        MarinaraPizza.addInformation(info);
        pizzaHeading.addRow(MarinaraPizza);
        pizzaHeading.addRow(MarinaraPizza);
        pizzaHeading.addRow(MarinaraPizza);
        pizzaHeading.addRow(MarinaraPizza);

        serviceListAdapterData.addHeading(pizzaHeading);

        //Donuts

        HeadingListData donutsHeading = new HeadingListData("Donuts");


        RowListData TastyDonut = new RowListData("Lorem Ipsum Yum");
        donutsHeading.addRow(TastyDonut);
        donutsHeading.addRow(TastyDonut);
        donutsHeading.addRow(TastyDonut);
        donutsHeading.addRow(TastyDonut);

        serviceListAdapterData.addHeading(donutsHeading);

        listView.setAdapter(refreshListAdapter);
        refreshListAdapter.setHeaderListAdapterData(serviceListAdapterData);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HeaderListItem item = serviceListAdapterData.getItem(position);
                if(item instanceof ListHeader) {
                    //do something
                } else {
                    //do something
                }
            }
        });




    }
}
