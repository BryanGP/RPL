package com.example.hello.rpc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RakitanFragment extends Fragment {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentrakitan, container, false);
    }

//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
//        ExpandableListView listView = (ExpandableListView)getView().findViewById(R.id.elistview
//        );
//        initData();
//        listAdapter = new ExpandableListAdapter(,listDataHeader,listHash);
//        listView.setAdapter(listAdapter);
//    }
//
//    private void initData() {
//        listDataHeader = new ArrayList<>();
//        listHash = new HashMap<>();
//
//        listDataHeader.add("kui");
//        listDataHeader.add("kuii");
//        listDataHeader.add("kuiii");
//
//        List<String> list = new ArrayList<>();
//        list.add("Ini list");
//
//        List<String> list1 = new ArrayList<>();
//        list1.add("Ini list1");
//        list1.add("Ini list1");
//        list1.add("Ini list1");
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("Ini list2");
//        list2.add("Ini list2");
//        list2.add("Ini list2");
//
//        listHash.put(listDataHeader.get(0),list);
//        listHash.put(listDataHeader.get(1),list1);
//        listHash.put(listDataHeader.get(2),list2);
//    }
}
