package com.lba.myapplication01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuestLineJK2#newInstance} factory method to
 * create an instance of this fragment.xz
 */
public class QuestLineJK2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuestLineJK2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment LBDFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuestLineJK2 newInstance() {
        QuestLineJK2 fragment = new QuestLineJK2();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_questline_jk2, container, false);
        ImageView imgQrCodeJK = (ImageView) rootView.findViewById(R.id.qrCodeJK);
        imgQrCodeJK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView urlTextView = (TextView) rootView.findViewById(R.id.textViewFragmentJK2);
                urlTextView.setVisibility(View.VISIBLE);
            }
        });

        return rootView;
    }


}