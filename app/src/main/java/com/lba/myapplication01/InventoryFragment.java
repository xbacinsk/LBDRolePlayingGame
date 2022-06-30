package com.lba.myapplication01;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InventoryFragment#newInstance} factory method to
 * create an instance of this fragment.xz
 */
public class InventoryFragment extends Fragment {

    // the fragment initialization parameters
    private static final String ITEM_VISIBILITY_KEY_MMM = "itemVisibilityKeyMMM";
    private static final String ITEM_VISIBILITY_KEY_LBD = "itemVisibilityKeyLBD";
    private static final String ITEM_VISIBILITY_KEY_KK = "itemVisibilityKeyKK";
    private static final String ITEM_VISIBILITY_KEY_MM = "itemVisibilityKeyMM";
    private static final String ITEM_VISIBILITY_KEY_MKA = "itemVisibilityKeyMKA";
    private static final String ITEM_VISIBILITY_KEY_JK = "itemVisibilityKeyJK";

    private int itemVisibilityKeyMMM;
    private int itemVisibilityKeyLBD;
    private int itemVisibilityKeyKK;
    private int itemVisibilityKeyMM;
    private int itemVisibilityKeyMKA;
    private int itemVisibilityKeyJK;

    public InventoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment LBDFragment.
     */
    public static InventoryFragment newInstance(int argumentKeyMMM, int argumentKeyLBD, int argumentKeyKK, int argumentKeyMM, int argumentKeyMKA, int argumentKeyJK) {
        InventoryFragment fragment = new InventoryFragment();
        Bundle args = new Bundle();
        args.putInt(ITEM_VISIBILITY_KEY_MMM, argumentKeyMMM);
        args.putInt(ITEM_VISIBILITY_KEY_LBD, argumentKeyLBD);
        args.putInt(ITEM_VISIBILITY_KEY_KK, argumentKeyKK);
        args.putInt(ITEM_VISIBILITY_KEY_MM, argumentKeyMM);
        args.putInt(ITEM_VISIBILITY_KEY_MKA, argumentKeyMKA);
        args.putInt(ITEM_VISIBILITY_KEY_JK, argumentKeyJK);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            itemVisibilityKeyMMM = getArguments().getInt(ITEM_VISIBILITY_KEY_MMM);
            itemVisibilityKeyLBD = getArguments().getInt(ITEM_VISIBILITY_KEY_LBD);
            itemVisibilityKeyKK = getArguments().getInt(ITEM_VISIBILITY_KEY_KK);
            itemVisibilityKeyMM = getArguments().getInt(ITEM_VISIBILITY_KEY_MM);
            itemVisibilityKeyMKA = getArguments().getInt(ITEM_VISIBILITY_KEY_MKA);
            itemVisibilityKeyJK = getArguments().getInt(ITEM_VISIBILITY_KEY_JK);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_inventory, container, false);
        ImageView imageViewMMM = (ImageView) rootView.findViewById(R.id.keyMMM);
        imageViewMMM.setVisibility(itemVisibilityKeyMMM);

        ImageView imageViewLBD = (ImageView) rootView.findViewById(R.id.keyLBD);
        imageViewLBD.setVisibility(itemVisibilityKeyLBD);

        ImageView imageViewKK = (ImageView) rootView.findViewById(R.id.keyKK);
        imageViewKK.setVisibility(itemVisibilityKeyKK);

        ImageView imageViewMM = (ImageView) rootView.findViewById(R.id.keyMM);
        imageViewMM.setVisibility(itemVisibilityKeyMM);

        ImageView imageViewMKA = (ImageView) rootView.findViewById(R.id.keyMKA);
        imageViewMKA.setVisibility(itemVisibilityKeyMKA);

        ImageView imageViewJK = (ImageView) rootView.findViewById(R.id.keyJK);
        imageViewJK.setVisibility(itemVisibilityKeyJK);

        return rootView;
    }

}