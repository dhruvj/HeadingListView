/*
 * ************************************************************************
 *  ADOBE CONFIDENTIAL
 *  ___________________
 *
 *   Copyright 2016 Adobe Systems Incorporated
 *   All Rights Reserved.
 *
 *  NOTICE:  All information contained herein is, and remains
 *  the property of Adobe Systems Incorporated and its suppliers,
 *  if any.  The intellectual and technical concepts contained
 *  herein are proprietary to Adobe Systems Incorporated and its
 *  suppliers and are protected by all applicable intellectual property
 *  laws, including trade secret and copyright laws.
 *  Dissemination of this information or reproduction of this material
 *  is strictly forbidden unless prior written permission is obtained
 *  from Adobe Systems Incorporated.
 * ************************************************************************
 */
package listview.tutorial.dhruvj.com.headinglistviewtutorial.RefreshListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class HeaderListAdapter extends BaseAdapter {

    private Context context;
    private HeaderListAdapterData HeaderListAdapterData;
    private LayoutInflater inflater;

    public HeaderListAdapter(Context context, HeaderListAdapterData _HeaderListAdapterData) {
        this.context = context;
        this.HeaderListAdapterData = _HeaderListAdapterData;
    }

    public HeaderListAdapter(Context context) {
        this.context = context;
    }

    public void setHeaderListAdapterData(HeaderListAdapterData _HeaderListAdapterData) {
        HeaderListAdapterData = _HeaderListAdapterData;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if(HeaderListAdapterData == null) return 0;
        return HeaderListAdapterData.getSize();
    }

    @Override
    public Object getItem(int position) {
        if(HeaderListAdapterData == null) return null;
        return HeaderListAdapterData.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {

        }
        return HeaderListAdapterData.getItem(position) == null ? null : HeaderListAdapterData.getItem(position).getView(inflater);
    }
}
