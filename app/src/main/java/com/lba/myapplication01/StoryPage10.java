package com.lba.myapplication01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoryPage10 extends AppCompatActivity {

    final String itemCodeKeyMMM = "mmm123";
    final String itemCodeKeyLBD = "lbd123";
    final String itemCodeKeyKK  = "kk123";
    final String itemCodeKeyMM  = "mm123";
    final String itemCodeKeyMKA = "mka123";
    final String itemCodeKeyJK  = "jk123";

    private List<Fragment> activeQuestsMMM = new ArrayList<>();
    private Fragment activeQuestPageMMM;
    private int iteratorActiveQuestPageMMM = 0;

    private List<Fragment> activeQuestsLBD = new ArrayList<>();
    private Fragment activeQuestPageLBD;
    private int iteratorActiveQuestPageLBD = 0;

    private List<Fragment> activeQuestsKK = new ArrayList<>();
    private Fragment activeQuestPageKK;
    private int iteratorActiveQuestPageKK = 0;

    private List<Fragment> activeQuestsMM = new ArrayList<>();
    private Fragment activeQuestPageMM;
    private int iteratorActiveQuestPageMM = 0;

    private List<Fragment> activeQuestsMKA = new ArrayList<>();
    private Fragment activeQuestPageMKA;
    private int iteratorActiveQuestPageMKA = 0;

    private List<Fragment> activeQuestsJK = new ArrayList<>();
    private Fragment activeQuestPageJK;
    private int iteratorActiveQuestPageJK = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page10);

        activeQuestsMMM.add(QuestLineMMM1.newInstance());
        activeQuestsMMM.add(QuestLineMMM2.newInstance());
        activeQuestsMMM.add(QuestLineMMM3.newInstance());
        activeQuestsMMM.add(QuestLineMMM4.newInstance());
        activeQuestsMMM.add(QuestLineMMM5.newInstance());
        activeQuestsMMM.add(QuestLineMMM6.newInstance());
        activeQuestsMMM.add(QuestLineMMM7.newInstance());
        activeQuestsMMM.add(QuestLineLast.newInstance());
        activeQuestPageMMM = QuestLineMMM1.newInstance();

        activeQuestsLBD.add(QuestLineLBD0.newInstance());
        activeQuestsLBD.add(QuestLineLBD1.newInstance());
        activeQuestsLBD.add(QuestLineLBD2.newInstance());
        activeQuestsLBD.add(QuestLineLBD3.newInstance());
        activeQuestsLBD.add(QuestLineLBD4.newInstance());
        activeQuestsLBD.add(QuestLineLast.newInstance());
        activeQuestPageLBD = QuestLineLBD0.newInstance();

        activeQuestsKK.add(QuestLineKK1.newInstance());
        activeQuestsKK.add(QuestLineKK2.newInstance());
        activeQuestsKK.add(QuestLineKK3.newInstance());
        activeQuestsKK.add(QuestLineLast.newInstance());
        activeQuestPageKK = QuestLineKK1.newInstance();

        activeQuestsMM.add(QuestLineMM1.newInstance());
        activeQuestsMM.add(QuestLineLast.newInstance());
        activeQuestPageMM = QuestLineMM1.newInstance();

        activeQuestsMKA.add(QuestLineMKA1.newInstance());
        activeQuestsMKA.add(QuestLineMKA2.newInstance());
        activeQuestsMKA.add(QuestLineMKA3.newInstance());
        activeQuestsMKA.add(QuestLineLast.newInstance());
        activeQuestPageMKA = QuestLineMKA1.newInstance();

        activeQuestsJK.add(QuestLineJK1.newInstance());
        activeQuestsJK.add(QuestLineJK2.newInstance());
        activeQuestsJK.add(QuestLineJK3.newInstance());
        activeQuestsJK.add(QuestLineLast.newInstance());
        activeQuestPageJK = QuestLineJK1.newInstance();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutSP10, QuestLineMMM1.newInstance()).commit();
    }

    public void showInventory(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, InventoryFragment.newInstance()).commit();
    }

    //-----begin-----show proper quest line-----

    public void showQuestLineMMM(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMMM).commit();
    }

    public void goToNextQuestPageMMM(View view) {
        iteratorActiveQuestPageMMM++;
        if(iteratorActiveQuestPageMMM == 7) {
            iteratorActiveQuestPageMMM = 1;
        }
        activeQuestPageMMM = activeQuestsMMM.get(iteratorActiveQuestPageMMM);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMMM).commit();
    }

    public void showQuestLineLBD(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageLBD).commit();
    }

    public void goToNextQuestPageLBD(View view) {
        iteratorActiveQuestPageLBD++;
        activeQuestPageLBD = activeQuestsLBD.get(iteratorActiveQuestPageLBD);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageLBD).commit();
    }

    public void showQuestLineKK(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageKK).commit();
    }

    public void goToNextQuestPageKK(View view) {
        iteratorActiveQuestPageKK++;
        activeQuestPageKK = activeQuestsKK.get(iteratorActiveQuestPageKK);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageKK).commit();
    }

    public void showQuestLineMM(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMM).commit();
    }

    public void goToNextQuestPageMM(View view) {
        iteratorActiveQuestPageMM++;
        activeQuestPageMM = activeQuestsMM.get(iteratorActiveQuestPageMM);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMM).commit();
    }

    public void showQuestLineMKA(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMKA).commit();
    }

    public void goToNextQuestPageMKA(View view) {
        iteratorActiveQuestPageMKA++;
        if(iteratorActiveQuestPageMKA == 3) {
            iteratorActiveQuestPageMKA = 0;
        }
        activeQuestPageMKA = activeQuestsMKA.get(iteratorActiveQuestPageMKA);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMKA).commit();
    }

    public void showQuestLineJK(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageJK).commit();
    }

    public void goToNextQuestPageJK(View view) {
        iteratorActiveQuestPageJK++;
        activeQuestPageJK = activeQuestsJK.get(iteratorActiveQuestPageJK);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageJK).commit();
    }

    public void endForNow(View view) {
    }

    //-----end-----show proper quest line-----



    //-----begin-----LBD quest line-----

    private int counter = 0;

    public void startOver(View view) {
        counter = 0;
    }

    public void redButtonAction(View view) {
        if(counter == 0) counter++;
        else counter = 0;
    }

    public void lightBlueButtonAction(View view) {
        if(counter == 1) counter++;
        else counter = 0;
    }

    public void greenButtonAction(View view) {
        if(counter == 2) counter++;
        else counter = 0;
    }

    public void orangeButtonAction(View view) {
        if(counter == 3) counter++;
        else counter = 0;
    }

    public void pinkButtonAction(View view) {
        if(counter == 4) counter++;
        else counter = 0;
    }

    public void darkBlueButtonAction(View view) {
        if(counter == 5) counter++;
        else counter = 0;
    }

    public void yellowButtonAction(View view) {
        if(counter == 6) goToNextQuestPageLBD(view);
        else counter = 0;
    }

    //-----end-----LBD quest line-----


    //-----begin-----JK quest line-----

    public void checkCodeAndGoToNextQuestPageJK(View view) {
        final EditText addItemTextField = (EditText) findViewById(R.id.codeEditTextField);
        if (addItemTextField.getText().toString().equals("abcd1234")) {
            goToNextQuestPageJK(view);
        }
    }

    //-----end-----JK quest line-----

    //-----begin-----Inventory-----

    public void addItemToInventory(View view) {
        final EditText addItemTextField = (EditText) findViewById(R.id.addItemTextField);
        if(addItemTextField.getText().toString().equals(itemCodeKeyMMM)) {
            final ImageView handleView = (ImageView) findViewById(R.id.keyMMM);
            handleView.setVisibility(view.VISIBLE);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyLBD)) {
            final ImageView handleView = (ImageView) findViewById(R.id.keyLBD);
            handleView.setVisibility(view.VISIBLE);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyKK)) {
            final ImageView handleView = (ImageView) findViewById(R.id.keyKK);
            handleView.setVisibility(view.VISIBLE);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyMM)) {
            final ImageView handleView = (ImageView) findViewById(R.id.keyMM);
            handleView.setVisibility(view.VISIBLE);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyMKA)) {
            final ImageView handleView = (ImageView) findViewById(R.id.keyMKA);
            handleView.setVisibility(view.VISIBLE);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyJK)) {
            final ImageView handleView = (ImageView) findViewById(R.id.keyJK);
            handleView.setVisibility(view.VISIBLE);
        }
    }

    public void useKeyMMM(View view) {
        activeQuestPageMMM = activeQuestsMMM.get(activeQuestsMMM.size() - 1);
        showQuestLineMMM(view);
    }

    public void useKeyLBD(View view) {
        activeQuestPageLBD = activeQuestsLBD.get(activeQuestsLBD.size() - 1);
        showQuestLineLBD(view);
    }

    public void useKeyKK(View view) {
        activeQuestPageKK = activeQuestsKK.get(activeQuestsKK.size() - 1);
        showQuestLineKK(view);
    }

    public void useKeyMM(View view) {
        activeQuestPageMM = activeQuestsMM.get(activeQuestsMM.size() - 1);
        showQuestLineMM(view);
    }

    public void useKeyMKA(View view) {
        activeQuestPageMKA = activeQuestsMKA.get(activeQuestsMKA.size() - 1);
        showQuestLineMKA(view);
    }

    public void useKeyJK(View view) {
        activeQuestPageJK = activeQuestsJK.get(activeQuestsJK.size() - 1);
        showQuestLineJK(view);
    }

    //-----end-----Inventory-----

}



