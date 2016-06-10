package com.socialehr.autocompletetextdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutocompleteFragment extends Fragment {
    String[] str={"Ram","Shyam","Monika","Tripti","Muskan","Amit","Ankit","Aashish","Ravi","Manoj"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_autocomplete, container, false);
        AutoCompleteTextView textView=(AutoCompleteTextView)view.findViewById(R.id.autocomplete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, str);
        textView.setThreshold(1);
        textView.setAdapter(adapter);


        return view;
    }
}
