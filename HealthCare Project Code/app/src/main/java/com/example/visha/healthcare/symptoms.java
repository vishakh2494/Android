package com.example.visha.healthcare;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class symptoms extends AppCompatActivity {

    TextView display;
    Button done;
    ArrayList<String> selection = new ArrayList<String>();
    WebView webView;
    private String GoogleAPI = "AIzaSyDn9sTIpoBxPx5cGhp0X7Tyk0kPBz8Fvys";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        done = (Button) findViewById(R.id.done);
        display = (TextView) findViewById(R.id.display);

        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void SelectSymptoms(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){

            case R.id.chestpain:
                if(checked){
                    selection.add("Chest Pain");
                    display.setText("Causes: Working hard, eating spicy food, stress, anger, Heart problems \n \n Home Remedy: drink plenty of water, keep calm, mouth-to-mouth air pump \n \n Precaution: Avoid eating spicy food, avoid anger, avoid heavy workouts \n \n Refreshment:What do you call 2 orthopedic doctors reading an EKG - double blind study! ");
                } else {
                    selection.remove("Chest Pain");
                }
                break;

            case R.id.weakness:
                if(checked){
                    selection.add("Weakness");
                    display.setText("Causes: Irregular food habits, bacterial infection, busy schedule, heavy workouts \n \n Home Remedy: Drink plenty of energy drinks, take rest, get fresh air \n \n Precaution: Do not eat just before going to bed, avoid heavy workouts, get sufficient sleep \n \n Refreshment: What did the man say to the x-ray technician after swallowing some money-Do you see any change in me? ");
                } else {
                    selection.remove("Weakness");
                }
                break;


            case R.id.bodypain:
                if(checked){
                    selection.add("Body Pain");
                    display.setText(" Causes: viral infection, bacterial infection, fever symptoms \n \n Home Remedy: get a body massage, get hot water bath \n \n Precaution: avoid heavy weights, avoid heavy workouts \n \n Refreshment: What do you call a doctor that fixes websites- URLologist  ");
                } else {
                    selection.remove("Body Pain");
                }
                break;

            case R.id.vertigo:
                if(checked){
                    selection.add("vertigo");
                    display.setText("Causes: Spinal cord disfunction, inner ear blockage, small crystals inside inner ear lobe \n \n Home Remedy: Stay in fresh air, avoid running or physical activites \n \n Precaution: Frequently clear your inner ears, clean your ears after taking bath \n \n Refreshment:The saying, There’s more pleasure in giving than in receiving, applies chiefly to advice… and medicine");
                } else {
                    selection.remove("vertigo");
                }
                break;

            case R.id.fever:
                if(checked){
                    selection.add("Fever");
                    display.setText(" Causes: Viral Infection, bacterial infection, weather changes, gastroenteritis, stomach flu \n \n Home Remedy: Drink plenty of warm water, intake lemon-honey, wear comfartable dress \n \n Precaution: Maintain proper hygiene, avoid contact with infecte people, make sure that you take proper immunization \n \n Refreshment:The best doctor in the world is the veterinarian. He can’t ask his patients what is the matter – he’s got to just know");
                } else {
                    selection.remove("Fever");
                }
                break;

            case R.id.diarrhea:
                if(checked){
                    selection.add("Diahhrea");
                    display.setText(" Causes: Viral Infection, bacterial infection, food infection, intestinal disorder \n \n Home Remedy:Rehydrate your body frequently, eat vitamin-c food, eat food containing salt \n \n Precaution: Avoid spicy food, avoid oily food \n \n Refreshment: If life gives you lemons, a simple operation can give you melons");
                } else {
                    selection.remove("Diahhrea");
                }
                break;

            case R.id.nausea:
                if(checked){
                    selection.add("Nausea");
                    display.setText(" Causes: Food Poisioning, Gastritis, ulcer, viral infection \n \n Home Remedy: Ginger drinks, Chamomile Tea, get fresh air, avoid fat foods, drink plenty of water \n \n Precaution: Avoid oil/fat food, Have smaller meals, avoid alcohol \n \n Refreshment:The art of medicine consists in amusing the patient while nature affects the cure");
                } else {
                    selection.remove("Nausea");
                }
                break;

            case R.id.cold:
                if(checked){
                    selection.add("cold");
                    display.setText(" Causes: Viral Infection, Cold Weather, Para influenza \n \n Home Remedy: Chicken Soup, Honey, Ginger drink \n \n Precaution: Avoid close contact with infected people, cover your nose and mouth while sneezing and coughing, Avoid Stress, Keep your body warm \n \n Refreshment: Being ill is one of the greatest pleasures of life, provided one is not too ill and is not obliged to work until one is better");
                } else {
                    selection.remove("cold");
                }
                break;
        }
    }

    public void symptomsaction(View view) {
        String final_symptoms = "";

        if(selection.contains("cold"))
        {
            display.setText(" Causes: Viral Infection, Cold Weather, Para influenza \n \n Home Remedy: Chicken Soup, Honey, Ginger drink \n \n Precaution: Avoid close contact with infected people, cover your nose and mouth while sneezing and coughing, Avoid Stress, Keep your body warm \n \n Refreshment: Being ill is one of the greatest pleasures of life, provided one is not too ill and is not obliged to work until one is better");
        }

        if(selection.contains("Nausea"))
        {
            display.setText(" Causes: Food Poisioning, Gastritis, ulcer, viral infection \n \n Home Remedy: Ginger drinks, Chamomile Tea, get fresh air, avoid fat foods, drink plenty of water \n \n Precaution: Avoid oil/fat food, Have smaller meals, avoid alcohol \n \n Refreshment:The art of medicine consists in amusing the patient while nature affects the cure");
        }

        if(selection.contains("Diahhrea"))
        {
            display.setText(" Causes: Viral Infection, bacterial infection, food infection, intestinal disorder \n \n Home Remedy:Rehydrate your body frequently, eat vitamin-c food, eat food containing salt \n \n Precaution: Avoid spicy food, avoid oily food \n \n Refreshment: If life gives you lemons, a simple operation can give you melons");
        }

        if(selection.contains("Fever"))
        {
            display.setText(" Causes: Viral Infection, bacterial infection, weather changes, gastroenteritis, stomach flu \n \n Home Remedy: Drink plenty of warm water, intake lemon-honey, wear comfartable dress \n \n Precaution: Maintain proper hygiene, avoid contact with infecte people, make sure that you take proper immunization \n \n Refreshment:The best doctor in the world is the veterinarian. He can’t ask his patients what is the matter – he’s got to just know");
        }

        if(selection.contains("vertigo"))
        {
            display.setText("Causes: Spinal cord disfunction, inner ear blockage, small crystals inside inner ear lobe \n \n Home Remedy: Stay in fresh air, avoid running or physical activites \n \n Precaution: Frequently clear your inner ears, clean your ears after taking bath \n \n Refreshment:The saying, There’s more pleasure in giving than in receiving, applies chiefly to advice… and medicine");
        }

        if(selection.contains("Body Pain"))
        {
            display.setText(" Causes: viral infection, bacterial infection, fever symptoms \n \n Home Remedy: get a body massage, get hot water bath \n \n Precaution: avoid heavy weights, avoid heavy workouts \n \n Refreshment: What do you call a doctor that fixes websites- URLologist  ");
        }

        if(selection.contains("Chest pain"))
        {
            display.setText("Causes: Working hard, eating spicy food, stress, anger, Heart problems \n \n Home Remedy: drink plenty of water, keep calm, mouth-to-mouth air pump \n \n Precaution: Avoid eating spicy food, avoid anger, avoid heavy workouts \n \n Refreshment:What do you call 2 orthopedic doctors reading an EKG - double blind study! ");
        }

        if(selection.contains("Weakness"))
        {
            display.setText("Causes: Irregular food habits, bacterial infection, busy schedule, heavy workouts \n \n Home Remedy: Drink plenty of energy drinks, take rest, get fresh air \n \n Precaution: Do not eat just before going to bed, avoid heavy workouts, get sufficient sleep \n \n Refreshment: What did the man say to the x-ray technician after swallowing some money-Do you see any change in me? ");
        }

        if(selection.contains("vertigo") && selection.contains("cold"))
        {
            setContentView(R.layout.vcp);
            String KEY="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/RJeqcikMKAI?ecver=1\" frameborder=\"0\" gesture=\"media\" allowfullscreen></iframe>";
            webView = (WebView) findViewById(R.id.vcp);
            webView.getSettings().setJavaScriptEnabled(true);

            webView.loadData(KEY,"text/html", "utf-8");
            webView.setWebChromeClient(new WebChromeClient() {

            });
        }


        if(selection.contains("Fever") && selection.contains("cold") && selection.contains("Body Pain") && selection.contains("Diahhrea") && selection.contains("Weakness"))
        {
            String youtube = GoogleAPI;
            setContentView(R.layout.fcbdw);
            String KEY="<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ugOxONWuM-0?ecver=1\" frameborder=\"0\" gesture=\"media\" allowfullscreen></iframe>";
            webView = (WebView) findViewById(R.id.fcbdw);
            webView.getSettings().setJavaScriptEnabled(true);

            webView.loadData(KEY,"text/html", "utf-8");
            webView.setWebChromeClient(new WebChromeClient() {

            });
        }

        if(selection.contains("Fever") && selection.contains("cold") && selection.contains("Body Pain") && selection.contains("Weakness") && selection.contains("Chest Pain")
                && selection.contains("Nausea") && selection.contains("Diahhrea") && selection.contains("vertigo"))
        {
            Intent intent = null, choose = null;
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:41.878381,-87.627813"));
            choose=Intent.createChooser(intent,"Launch Maps");
            startActivity(choose);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()== android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
