# HeadingListView

Create ListView with Headings and Descriptions for rows like this:


![Alt text](/demo.png?raw=true "HeadingListView")


```

refreshListAdapter = new HeaderListAdapter(this);

        final HeaderListAdapterData serviceListAdapterData = new HeaderListAdapterData();

        // Pizzas
        HeadingListData pizzaHeading = new HeadingListData("Pizza", R.layout.layout_heading);


        RowListData MarinaraPizza = new RowListData("MarinaraPizza", R.layout.layout_row);
        ArrayList<String> info =  new ArrayList<>();
        info.add("Features tomatoes, garlic, oregano, and extra virgin olive oil.");
        MarinaraPizza.addInformation(info);
        pizzaHeading.addRow(MarinaraPizza);
        pizzaHeading.addRow(MarinaraPizza);
        pizzaHeading.addRow(MarinaraPizza);
        pizzaHeading.addRow(MarinaraPizza);

        serviceListAdapterData.addHeading(pizzaHeading);

        //Donuts

        HeadingListData donutsHeading = new HeadingListData("Donuts", R.layout.layout_heading);


        RowListData TastyDonut = new RowListData("Lorem Ipsum Yum", R.layout.layout_row);
        donutsHeading.addRow(TastyDonut);
        donutsHeading.addRow(TastyDonut);
        donutsHeading.addRow(TastyDonut);
        donutsHeading.addRow(TastyDonut);

        serviceListAdapterData.addHeading(donutsHeading);

        listView.setAdapter(refreshListAdapter);
        refreshListAdapter.setHeaderListAdapterData(serviceListAdapterData);

```
