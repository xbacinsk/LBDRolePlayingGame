package com.lba.myapplication01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoryPage10 extends AppCompatActivity {

    final String itemCodeKeyMMM = "mmm123";
    final String itemCodeKeyLBD = "lbd123";
    final String itemCodeKeyKK  = "kk123";
    final String itemCodeKeyMM  = "mm123";
    final String itemCodeKeyMKA = "mka123";
    final String itemCodeKeyJK  = "jk123";

    private int itemVisibilityKeyMMM = View.INVISIBLE;
    private int itemVisibilityKeyLBD = View.INVISIBLE;
    private int itemVisibilityKeyKK = View.INVISIBLE;
    private int itemVisibilityKeyMM = View.INVISIBLE;
    private int itemVisibilityKeyMKA = View.INVISIBLE;
    private int itemVisibilityKeyJK = View.INVISIBLE;

    final String doorbellKosmova = "kosmova";
    final String doorbellBea = "bea";
    final String doorbellSfinx = "sfinx";
    final String doorbellKobka = "kobka";

    final String tsNumber  = "689";
    final List<String> possibleMorseAnswers = Arrays.asList("lbd", "kruzok", "krúžok", "krouzek", "kroužek", "kolecko", "kolečko", "o", "koliecko", "koliečko", "koliesko", "circle");
    final String pianoCode = "abcd1234";

    private int iteratorActivePhotoMMM = 0;
    private List<Integer> activePhotosMMM = new ArrayList();

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

    private boolean qlCompletedMMM = false;
    private boolean qlCompletedLBD = false;
    private boolean qlCompletedKK = false;
    private boolean qlCompletedMM = false;
    private boolean qlCompletedMKA = false;
    private boolean qlCompletedJK = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page10);

        activeQuestsMMM.add(QuestLineMMM1.newInstance());
        activeQuestsMMM.add(QuestLineMMM2.newInstance());
        activeQuestPageMMM = activeQuestsMMM.get(0);

        activePhotosMMM.add(R.drawable.mmm02);
        activePhotosMMM.add(R.drawable.mmm03);
        activePhotosMMM.add(R.drawable.mmm04);
        activePhotosMMM.add(R.drawable.mmm05);
        activePhotosMMM.add(R.drawable.mmm06);
        activePhotosMMM.add(R.drawable.mmm07);
        activePhotosMMM.add(R.drawable.mmm08);
        activePhotosMMM.add(R.drawable.mmm09);
        activePhotosMMM.add(R.drawable.mmm10);
        activePhotosMMM.add(R.drawable.mmm11);
        activePhotosMMM.add(R.drawable.mmm12);
        activePhotosMMM.add(R.drawable.mmm13);
        activePhotosMMM.add(R.drawable.mmm14);
        activePhotosMMM.add(R.drawable.mmm15);

        activeQuestsLBD.add(QuestLineLBD0.newInstance());
        activeQuestsLBD.add(QuestLineLBD1.newInstance());
        activeQuestsLBD.add(QuestLineLBD2.newInstance());
        activeQuestsLBD.add(QuestLineLBD3.newInstance());
        activeQuestsLBD.add(QuestLineLBD4.newInstance());
        activeQuestsLBD.add(QuestLineLBD5.newInstance());
        activeQuestsLBD.add(QuestLineLBD6.newInstance());
        activeQuestPageLBD = activeQuestsLBD.get(0);

        activeQuestsKK.add(QuestLineKK1.newInstance());
        activeQuestsKK.add(QuestLineKK2.newInstance());
        activeQuestsKK.add(QuestLineKK3.newInstance());
        activeQuestPageKK = activeQuestsKK.get(0);

        activeQuestsMM.add(QuestLineMM0.newInstance());
        activeQuestsMM.add(QuestLineMM1.newInstance());
        activeQuestsMM.add(QuestLineMM2.newInstance());
        activeQuestsMM.add(QuestLineMM3.newInstance());
        activeQuestsMM.add(QuestLineMM4.newInstance());
        activeQuestPageMM = activeQuestsMM.get(0);

        activeQuestsMKA.add(QuestLineMKA0.newInstance());
        activeQuestsMKA.add(QuestLineMKA1.newInstance());
        activeQuestsMKA.add(QuestLineMKA2.newInstance());
        activeQuestsMKA.add(QuestLineMKA3.newInstance());
        activeQuestPageMKA = activeQuestsMKA.get(0);

        activeQuestsJK.add(QuestLineJK0.newInstance());
        activeQuestsJK.add(QuestLineJK1.newInstance());
        activeQuestsJK.add(QuestLineJK2.newInstance());
        activeQuestsJK.add(QuestLineJK3.newInstance());
        activeQuestPageJK = activeQuestsJK.get(0);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutSP10, Rozcestnik.newInstance()).commit();
    }

    //-----begin-----show proper quest line-----

    public void showQuestLineMMM(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMMM).commit();
    }

    public void showQuestLineLBD(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageLBD).commit();
    }

    public void showQuestLineKK(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageKK).commit();
    }

    public void showQuestLineMM(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMM).commit();
    }

    public void showQuestLineMKA(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageMKA).commit();
    }

    public void showQuestLineJK(View view) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, activeQuestPageJK).commit();
    }

    //-----end-----show proper quest line-----

    //-----begin-----MMM-----

    public void updateQuestLineMMM(View view) {
        showQuestLineMMM(view);
    }

    public void goToNextQuestPageMMM(View view) {
        iteratorActiveQuestPageMMM++;
        if(iteratorActiveQuestPageMMM == activeQuestsMMM.size()) {
            iteratorActiveQuestPageMMM = 0;
        }
        activeQuestPageMMM = activeQuestsMMM.get(iteratorActiveQuestPageMMM);
        updateQuestLineMMM(view);
    }

    public void showNextPhotoMMM(View view) {
        iteratorActivePhotoMMM++;
        if(iteratorActivePhotoMMM == activePhotosMMM.size()) {
            iteratorActivePhotoMMM = 0;
        }
        final ImageView imageViewPhotoMMM = (ImageView) findViewById(R.id.imagePhotoMMM);
        imageViewPhotoMMM.setImageResource(activePhotosMMM.get(iteratorActivePhotoMMM));
    }

    //-----end-----MMM-----

    //-----begin-----LBD quest line-----

    public void updateQuestLineLBD(View view) {
        showQuestLineLBD(view);
    }

    public void goToNextQuestPageLBD(View view) {
        iteratorActiveQuestPageLBD++;
        activeQuestPageLBD = activeQuestsLBD.get(iteratorActiveQuestPageLBD);
        updateQuestLineLBD(view);
    }

    //-----begin-----doorbell-----

    public void checkDoorbellTextFieldAndGoToNextQuestPageLBD(View view) {
        final EditText doorbellTextField = (EditText) findViewById(R.id.doorbellEditTextFieldLBD0);
        if (doorbellTextField.getText().toString().toLowerCase().equals(doorbellKosmova)) {
            goToNextQuestPageLBD(view);
        }
    }

    //-----end-----doorbell-----

    //-----begin-----hriste-----

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

    //-----end-----hriste-----

    //-----begin-----zastavka

    public void checkTextFieldsAndGoToNextQuestPageLBD(View view) {
        final EditText stairsTextField01 = (EditText) findViewById(R.id.stairsEditTextFieldLBD1);
        final EditText stairsTextField02 = (EditText) findViewById(R.id.stairsEditTextFieldLBD2);
        final EditText stairsTextField03 = (EditText) findViewById(R.id.stairsEditTextFieldLBD3);
        if (stairsTextField01.getText().toString().equals("15") && stairsTextField02.getText().toString().equals("16") && stairsTextField03.getText().toString().equals("16") ) {
            goToNextQuestPageLBD(view);
        }
    }

    //-----end-----zastavka-----

    //-----begin-----TS-----

    public void checkTsNumberTextFieldAndGoToNextQuestPageLBD(View view) {
        final EditText tsNumberTextField = (EditText) findViewById(R.id.tsNumberEditTextFieldLBD);
        if (tsNumberTextField.getText().toString().equals(tsNumber)) {
            goToNextQuestPageLBD(view);
        }
    }

    //-----end-----TS-----

    //-----begin-----Morse-----

    public void checkMorseAnswerTextFieldAndGoToNextQuestPageLBD(View view) {
        final EditText morseAnswerTextField = (EditText) findViewById(R.id.morseAnswerEditTextFieldLBD);
        if (possibleMorseAnswers.contains(morseAnswerTextField.getText().toString().toLowerCase())) {
            goToNextQuestPageLBD(view);
        }
    }

    //-----end-----Morse-----

    //-----end-----LBD quest line-----

    //-----begin-----KK-----

    public void updateQuestLineKK(View view) {
        showQuestLineKK(view);
    }

    public void goToNextQuestPageKK(View view) {
        iteratorActiveQuestPageKK++;
        if(iteratorActiveQuestPageKK == activeQuestsKK.size()) {
            iteratorActiveQuestPageKK = 0;
        }
        activeQuestPageKK = activeQuestsKK.get(iteratorActiveQuestPageKK);
        updateQuestLineKK(view);
    }

    //-----end-----KK-----

    //-----begin-----MM-----

    public void updateQuestLineMM(View view) {
        showQuestLineMM(view);
    }

    public void goToNextQuestPageMM(View view) {
        iteratorActiveQuestPageMM++;
        if(iteratorActiveQuestPageMM == activeQuestsMM.size()) {
            iteratorActiveQuestPageMM = 2;
        }
        activeQuestPageMM = activeQuestsMM.get(iteratorActiveQuestPageMM);
        updateQuestLineMM(view);
    }

    //-----begin-----doorbell-----

    public void checkDoorbellTextFieldAndGoToNextQuestPageMM(View view) {
        final EditText doorbellTextField = (EditText) findViewById(R.id.doorbellEditTextFieldMM0);
        if (doorbellTextField.getText().toString().toLowerCase().equals(doorbellBea)) {
            goToNextQuestPageMM(view);
        }
    }

    //-----end-----doorbell-----

    //-----end-----MM-----

    //-----begin-----MKA-----

    public void updateQuestLineMKA(View view) {
        showQuestLineMKA(view);
    }

    public void goToNextQuestPageMKA(View view) {
        iteratorActiveQuestPageMKA++;
        if(iteratorActiveQuestPageMKA == activeQuestsMKA.size()) {
            iteratorActiveQuestPageMKA = 1;
        }
        activeQuestPageMKA = activeQuestsMKA.get(iteratorActiveQuestPageMKA);
        updateQuestLineMKA(view);
    }

    //-----begin-----doorbell-----

    public void checkDoorbellTextFieldAndGoToNextQuestPageMKA(View view) {
        final EditText doorbellTextField = (EditText) findViewById(R.id.doorbellEditTextFieldMKA0);
        if (doorbellTextField.getText().toString().toLowerCase().equals(doorbellSfinx)) {
            goToNextQuestPageMKA(view);
        }
    }

    //-----end----doorbell-----

    //-----end-----MKA-----

    //-----begin-----JK quest line-----

    public void updateQuestLineJK(View view) {
        showQuestLineJK(view);
    }

    public void goToNextQuestPageJK(View view) {
        iteratorActiveQuestPageJK++;
        activeQuestPageJK = activeQuestsJK.get(iteratorActiveQuestPageJK);
        updateQuestLineJK(view);
    }

    //-----begin-----doorbell-----

    public void checkDoorbellTextFieldAndGoToNextQuestPageJK(View view) {
        final EditText doorbellTextField = (EditText) findViewById(R.id.doorbellEditTextFieldJK0);
        if (doorbellTextField.getText().toString().toLowerCase().equals(doorbellKobka)) {
            goToNextQuestPageJK(view);
        }
    }

    //-----end-----doorbell-----

    public void checkCodeAndGoToNextQuestPageJK(View view) {
        final EditText addItemTextField = (EditText) findViewById(R.id.codeEditTextField);
        if (addItemTextField.getText().toString().equals(pianoCode)) {
            goToNextQuestPageJK(view);
        }
    }

    //-----end-----JK quest line-----

    //-----begin-----Inventory-----

    public void showInventory(View view) {
        InventoryFragment inventoryFragmentInstance = InventoryFragment.newInstance(itemVisibilityKeyMMM, itemVisibilityKeyLBD, itemVisibilityKeyKK, itemVisibilityKeyMM, itemVisibilityKeyMKA, itemVisibilityKeyJK);
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutSP10, inventoryFragmentInstance).commit();
    }

    private void setItemVisibilityKeyMMM(View view) {
        final ImageView handleView = (ImageView) findViewById(R.id.keyMMM);
        handleView.setVisibility(itemVisibilityKeyMMM);
    }

    private void setItemVisibilityKeyLBD(View view) {
        final ImageView handleView = (ImageView) findViewById(R.id.keyLBD);
        handleView.setVisibility(itemVisibilityKeyLBD);
    }

    private void setItemVisibilityKeyKK(View view) {
        final ImageView handleView = (ImageView) findViewById(R.id.keyKK);
        handleView.setVisibility(itemVisibilityKeyKK);
    }

    private void setItemVisibilityKeyMM(View view) {
        final ImageView handleView = (ImageView) findViewById(R.id.keyMM);
        handleView.setVisibility(itemVisibilityKeyMM);
    }

    private void setItemVisibilityKeyMKA(View view) {
        final ImageView handleView = (ImageView) findViewById(R.id.keyMKA);
        handleView.setVisibility(itemVisibilityKeyMKA);
    }

    private void setItemVisibilityKeyJK(View view) {
        final ImageView handleView = (ImageView) findViewById(R.id.keyJK);
        handleView.setVisibility(itemVisibilityKeyJK);
    }


    public void addItemToInventory(View view) {
        final EditText addItemTextField = (EditText) findViewById(R.id.addItemTextField);
        if(addItemTextField.getText().toString().equals(itemCodeKeyMMM)) {
            itemVisibilityKeyMMM = view.VISIBLE;
            setItemVisibilityKeyMMM(view);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyLBD)) {
            itemVisibilityKeyLBD = view.VISIBLE;
            setItemVisibilityKeyLBD(view);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyKK)) {
            itemVisibilityKeyKK = view.VISIBLE;
            setItemVisibilityKeyKK(view);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyMM)) {
            itemVisibilityKeyMM = view.VISIBLE;
            setItemVisibilityKeyMM(view);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyMKA)) {
            itemVisibilityKeyMKA = view.VISIBLE;
            setItemVisibilityKeyMKA(view);
        }
        else if(addItemTextField.getText().toString().equals(itemCodeKeyJK)) {
            itemVisibilityKeyJK = view.VISIBLE;
            setItemVisibilityKeyJK(view);
        }
    }

    public void useKeyMMM(View view) {
        qlCompletedMMM = true;
        if(checkMissionComplete()) {
            showMissionCompletedPage(view);
        } else {
            activeQuestPageMMM = QuestLineLast.newInstance();
            showQuestLineMMM(view);
        }
    }

    public void useKeyLBD(View view) {
        qlCompletedLBD = true;
        if(checkMissionComplete()) {
            showMissionCompletedPage(view);
        } else {
            activeQuestPageLBD = QuestLineLast.newInstance();
            showQuestLineLBD(view);
        }
    }

    public void useKeyKK(View view) {
        qlCompletedKK = true;
        if(checkMissionComplete()) {
            showMissionCompletedPage(view);
        } else {
            activeQuestPageKK = QuestLineLast.newInstance();
            showQuestLineKK(view);
        }
    }

    public void useKeyMM(View view) {
        qlCompletedMM = true;
        if(checkMissionComplete()) {
            showMissionCompletedPage(view);
        } else {
            activeQuestPageMM = QuestLineLast.newInstance();
            showQuestLineMM(view);
        }
    }

    public void useKeyMKA(View view) {
        qlCompletedMKA = true;
        if(checkMissionComplete()) {
            showMissionCompletedPage(view);
        } else {
            activeQuestPageMKA = QuestLineLast.newInstance();
            showQuestLineMKA(view);
        }
    }

    public void useKeyJK(View view) {
        qlCompletedJK = true;
        if(checkMissionComplete()) {
            showMissionCompletedPage(view);
        } else {
            activeQuestPageJK = QuestLineLast.newInstance();
            showQuestLineJK(view);
        }
    }

    private boolean checkMissionComplete() {
        return qlCompletedMMM && qlCompletedLBD && qlCompletedKK && qlCompletedMM && qlCompletedMKA && qlCompletedJK;
    }

    //-----end-----Inventory-----

    public void endForNow(View view) {
    }

    public void showMissionCompletedPage(View view) {
        Intent intent = new Intent(this, MissionCompleted.class);
        startActivity(intent);
    }
}



