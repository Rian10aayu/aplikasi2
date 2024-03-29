package com.example.aplikasi2.activities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.aplikasi2.R;

public class Fragment_Ceklis6 extends Fragment {

    public Model model = new Model();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment__ceklis6, container, false);

        RadioGroup rg_Kaca_Mobil = (RadioGroup) view.findViewById(R.id.rgKaca_Mobil_dan_Kaca_Film);
        RadioButton b_Kaca_Mobil = (RadioButton) view.findViewById(R.id.b36);
        RadioButton r_Kaca_Mobil = (RadioButton) view.findViewById(R.id.r36);
        RadioButton t_Kaca_Mobil = (RadioButton) view.findViewById(R.id.t36);
        RadioGroup rg_STNK = (RadioGroup) view.findViewById(R.id.rgSTNK);
        RadioButton b_STNK = (RadioButton) view.findViewById(R.id.b37);
        RadioButton r_STNK = (RadioButton) view.findViewById(R.id.r37);
        RadioButton t_STNK = (RadioButton) view.findViewById(R.id.t37);
        RadioGroup rg_Buku_KIR = (RadioGroup) view.findViewById(R.id.rgBuku_KIR_Stiker_Peneng);
        RadioButton b_Buku_KIR = (RadioButton) view.findViewById(R.id.b38);
        RadioButton r_Buku_KIR = (RadioButton) view.findViewById(R.id.r38);
        RadioButton t_Buku_KIR = (RadioButton) view.findViewById(R.id.t38);
        RadioGroup rg_Owners_Manual = (RadioGroup) view.findViewById(R.id.rgOwners_Manual_Book);
        RadioButton b_Owners_Manual = (RadioButton) view.findViewById(R.id.b39);
        RadioButton r_Owners_Manual = (RadioButton) view.findViewById(R.id.r39);
        RadioButton t_Owners_Manual = (RadioButton) view.findViewById(R.id.t39);
        RadioGroup rg_Buku_Service = (RadioGroup) view.findViewById(R.id.rgBuku_Service);
        RadioButton b_Buku_Service = (RadioButton) view.findViewById(R.id.b40);
        RadioButton r_Buku_Service = (RadioButton) view.findViewById(R.id.r40);
        RadioButton t_Buku_Service = (RadioButton) view.findViewById(R.id.t40);
        RadioGroup rg_Ban_Serep = (RadioGroup) view.findViewById(R.id.rgBan_Serep);
        RadioButton b_Ban_Serep = (RadioButton) view.findViewById(R.id.b41);
        RadioButton r_Ban_Serep = (RadioButton) view.findViewById(R.id.r41);
        RadioButton t_Ban_Serep = (RadioButton) view.findViewById(R.id.t41);
        RadioGroup rg_Kunci_Roda = (RadioGroup) view.findViewById(R.id.rgKunci_Roda_Busi_Pas_Tang);
        RadioButton b_Kunci_Roda = (RadioButton) view.findViewById(R.id.b42);
        RadioButton r_Kunci_Roda = (RadioButton) view.findViewById(R.id.r42);
        RadioButton t_Kunci_Roda = (RadioButton) view.findViewById(R.id.t42);
        EditText te_Kaca_Mobil = (EditText) view.findViewById(R.id.teKaca_Mobil_dan_Kaca_Film);
        EditText te_STNK = (EditText) view.findViewById(R.id.teSTNK);
        EditText te_Buku_KIR = (EditText) view.findViewById(R.id.teBuku_KIR_Stiker_Peneng);
        EditText te_Owners_Manual = (EditText) view.findViewById(R.id.teOwners_Manual_Book);
        EditText te_Buku_Service = (EditText) view.findViewById(R.id.teBuku_Service);
        EditText te_Ban_Serep = (EditText) view.findViewById(R.id.teBan_Serep);
        EditText te_Kunci_Roda = (EditText) view.findViewById(R.id.teKunci_Roda_Busi_Pas_Tang);

        if(model.Kaca_Mobil_dan_Kaca_Film!=null){
            te_Kaca_Mobil.setText(model.Kaca_Mobil_dan_Kaca_Film_Ket);
            if(model.Kaca_Mobil_dan_Kaca_Film == "B"){
                b_Kaca_Mobil.setChecked(true);
            }
            else if(model.Kaca_Mobil_dan_Kaca_Film == "R"){
                r_Kaca_Mobil.setChecked(true);
            }
            else if(model.Kaca_Mobil_dan_Kaca_Film == "T"){
                t_Kaca_Mobil.setChecked(true);
            }
        }
        if(model.STNK!=null){
            te_STNK.setText(model.STNK_Ket);
            if(model.STNK == "B"){
                b_STNK.setChecked(true);
            }
            else if(model.STNK == "R"){
                r_STNK.setChecked(true);
            }
            else if(model.STNK == "T"){
                t_STNK.setChecked(true);
            }
        }
        if(model.Buku_KIR_Stiker_Peneng!=null){
            te_Buku_KIR.setText(model.Buku_KIR_Stiker_Peneng_Ket);
            if(model.Buku_KIR_Stiker_Peneng == "B"){
                b_Buku_KIR.setChecked(true);
            }
            else if(model.Buku_KIR_Stiker_Peneng == "R"){
                r_Buku_KIR.setChecked(true);
            }
            else if(model.Buku_KIR_Stiker_Peneng == "T"){
                t_Buku_KIR.setChecked(true);
            }
        }
        if(model.Owners_Manual_Book!=null){
            te_Owners_Manual.setText(model.Owners_Manual_Book_Ket);
            if(model.Owners_Manual_Book == "B"){
                b_Owners_Manual.setChecked(true);
            }
            else if(model.Owners_Manual_Book == "R"){
                r_Owners_Manual.setChecked(true);
            }
            else if(model.Owners_Manual_Book == "T"){
                t_Owners_Manual.setChecked(true);
            }
        }
        if(model.Buku_Service!=null){
            te_Buku_Service.setText(model.Buku_Service_Ket);
            if(model.Buku_Service == "B"){
                b_Buku_Service.setChecked(true);
            }
            else if(model.Buku_Service == "R"){
                r_Buku_Service.setChecked(true);
            }
            else if(model.Buku_Service == "T"){
                t_Buku_Service.setChecked(true);
            }
        }
        if(model.Ban_Serep!=null){
            te_Ban_Serep.setText(model.Ban_Serep_Ket);
            if(model.Ban_Serep == "B"){
                b_Ban_Serep.setChecked(true);
            }
            else if(model.Ban_Serep == "R") {
                r_Ban_Serep.setChecked(true);
            }
            else if(model.Ban_Serep == "T"){
                t_Ban_Serep.setChecked(true);
            }
        }
        if(model.Kunci_Roda_Busi_Pas_Tang!=null){
            te_Kunci_Roda.setText(model.Kunci_Roda_Busi_Pas_Tang_Ket);
            if(model.Kunci_Roda_Busi_Pas_Tang == "B"){
                b_Kunci_Roda.setChecked(true);
            }
            else if(model.Kunci_Roda_Busi_Pas_Tang == "R"){
                r_Kunci_Roda.setChecked(true);
            }
            else if(model.Kunci_Roda_Busi_Pas_Tang == "T"){
                t_Kunci_Roda.setChecked(true);
            }
        }

        ImageButton button1 = (ImageButton) view.findViewById(R.id.button_ceklis);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                model.Kaca_Mobil_dan_Kaca_Film_Ket = te_Kaca_Mobil.getText().toString();
                model.STNK_Ket = te_STNK.getText().toString();
                model.Buku_KIR_Stiker_Peneng_Ket = te_Buku_KIR.getText().toString();
                model.Owners_Manual_Book_Ket = te_Owners_Manual.getText().toString();
                model.Buku_Service_Ket = te_Buku_Service.getText().toString();
                model.Ban_Serep_Ket = te_Ban_Serep.getText().toString();
                model.Kunci_Roda_Busi_Pas_Tang_Ket = te_Kunci_Roda.getText().toString();

                if(b_Kaca_Mobil.isChecked()){
                    model.Kaca_Mobil_dan_Kaca_Film = "B";
                }
                else if(r_Kaca_Mobil.isChecked()){
                    model.Kaca_Mobil_dan_Kaca_Film = "R";
                }
                else if(t_Kaca_Mobil.isChecked()){
                    model.Kaca_Mobil_dan_Kaca_Film = "T";
                }

                if(b_STNK.isChecked()){
                    model.STNK = "B";
                }
                else if(r_STNK.isChecked()){
                    model.STNK = "R";
                }
                else if(t_STNK.isChecked()){
                    model.STNK= "T";
                }

                if(b_Buku_KIR.isChecked()){
                    model.Buku_KIR_Stiker_Peneng = "B";
                }
                else if(r_Buku_KIR.isChecked()){
                    model.Buku_KIR_Stiker_Peneng = "R";
                }
                else if(t_Buku_KIR.isChecked()){
                    model.Buku_KIR_Stiker_Peneng = "T";
                }

                if(b_Owners_Manual.isChecked()){
                    model.Owners_Manual_Book = "B";
                }
                else if(r_Owners_Manual.isChecked()){
                    model.Owners_Manual_Book = "R";
                }
                else if(t_Owners_Manual.isChecked()){
                    model.Owners_Manual_Book = "T";
                }

                if(b_Buku_Service.isChecked()){
                    model.Buku_Service = "B";
                }
                else if(r_Buku_Service.isChecked()){
                    model.Buku_Service = "R";
                }
                else if(t_Buku_Service.isChecked()){
                    model.Buku_Service = "T";
                }

                if(b_Ban_Serep.isChecked()){
                    model.Ban_Serep = "B";
                }
                else if(r_Ban_Serep.isChecked()){
                    model.Ban_Serep = "R";
                }
                else if(t_Ban_Serep.isChecked()){
                    model.Ban_Serep = "T";
                }

                if(b_Kunci_Roda.isChecked()){
                    model.Kunci_Roda_Busi_Pas_Tang = "B";
                }
                else if(r_Kunci_Roda.isChecked()){
                    model.Kunci_Roda_Busi_Pas_Tang = "R";
                }
                else if(t_Kunci_Roda.isChecked()){
                    model.Kunci_Roda_Busi_Pas_Tang = "T";
                }

                next_Fragment(model); }
        });

        ImageButton button2 = (ImageButton) view.findViewById(R.id.button_Back);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                model.Kaca_Mobil_dan_Kaca_Film_Ket = te_Kaca_Mobil.getText().toString();
                model.STNK_Ket = te_STNK.getText().toString();
                model.Buku_KIR_Stiker_Peneng_Ket = te_Buku_KIR.getText().toString();
                model.Owners_Manual_Book_Ket = te_Owners_Manual.getText().toString();
                model.Buku_Service_Ket = te_Buku_Service.getText().toString();
                model.Ban_Serep_Ket = te_Ban_Serep.getText().toString();
                model.Kunci_Roda_Busi_Pas_Tang_Ket = te_Kunci_Roda.getText().toString();

                if(b_Kaca_Mobil.isChecked()){
                    model.Kaca_Mobil_dan_Kaca_Film = "B";
                }
                else if(r_Kaca_Mobil.isChecked()){
                    model.Kaca_Mobil_dan_Kaca_Film = "R";
                }
                else if(t_Kaca_Mobil.isChecked()){
                    model.Kaca_Mobil_dan_Kaca_Film = "T";
                }

                if(b_STNK.isChecked()){
                    model.STNK = "B";
                }
                else if(r_STNK.isChecked()){
                    model.STNK = "R";
                }
                else if(t_STNK.isChecked()){
                    model.STNK= "T";
                }

                if(b_Buku_KIR.isChecked()){
                    model.Buku_KIR_Stiker_Peneng = "B";
                }
                else if(r_Buku_KIR.isChecked()){
                    model.Buku_KIR_Stiker_Peneng = "R";
                }
                else if(t_Buku_KIR.isChecked()){
                    model.Buku_KIR_Stiker_Peneng = "T";
                }

                if(b_Owners_Manual.isChecked()){
                    model.Owners_Manual_Book = "B";
                }
                else if(r_Owners_Manual.isChecked()){
                    model.Owners_Manual_Book = "R";
                }
                else if(t_Owners_Manual.isChecked()){
                    model.Owners_Manual_Book = "T";
                }

                if(b_Buku_Service.isChecked()){
                    model.Buku_Service = "B";
                }
                else if(r_Buku_Service.isChecked()){
                    model.Buku_Service = "R";
                }
                else if(t_Buku_Service.isChecked()){
                    model.Buku_Service = "T";
                }

                if(b_Ban_Serep.isChecked()){
                    model.Ban_Serep = "B";
                }
                else if(r_Ban_Serep.isChecked()){
                    model.Ban_Serep = "R";
                }
                else if(t_Ban_Serep.isChecked()){
                    model.Ban_Serep = "T";
                }

                if(b_Kunci_Roda.isChecked()){
                    model.Kunci_Roda_Busi_Pas_Tang = "B";
                }
                else if(r_Kunci_Roda.isChecked()){
                    model.Kunci_Roda_Busi_Pas_Tang = "R";
                }
                else if(t_Kunci_Roda.isChecked()){
                    model.Kunci_Roda_Busi_Pas_Tang = "T";
                }

                back_Fragment(); }
        });


        return view;
    }
    private void next_Fragment(Model model) {
        Fragment_Ceklis7 fragment = new Fragment_Ceklis7();
        fragment.model = model;
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    private void back_Fragment() {
        Fragment_Ceklis5 fragment = new Fragment_Ceklis5();
        fragment.model = model;
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
