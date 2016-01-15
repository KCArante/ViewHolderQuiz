package sidespell.tech.viewholderquiz.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import sidespell.tech.viewholderquiz.R;
import sidespell.tech.viewholderquiz.adapter.ListItem;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends Fragment {

    private ListView mListView;
    private List exampleListItemList;


    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_listview, container, false);

        mListView = (ListView) view.findViewById(R.id.listView);

        exampleListItemList = new ArrayList();
        exampleListItemList.add(new ListItem("Example 1"));
        exampleListItemList.add(new ListItem("Example 2"));
        exampleListItemList.add(new ListItem("Example 3"));
         mAdapter = new ListAdapter(getActivity(), exampleListItemList);

        return view;
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListItem item = (ListItem) this.exampleListItemList.get(position);
        Toast.makeText(getActivity(), item.getItemTitle() + " Clicked!"
                , Toast.LENGTH_SHORT).show();
    }


}
