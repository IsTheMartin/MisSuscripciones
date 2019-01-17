package com.mcuadrada.missuscripciones;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.colorpicker.ColorPickerDialog;
import com.android.colorpicker.ColorPickerPalette;
import com.android.colorpicker.ColorPickerSwatch;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsertSuscriptionFragment extends Fragment {

    ColorPickerDialog colorPickerDialog = new ColorPickerDialog();

    public InsertSuscriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insert_suscription, container,
                false);

        LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
        ColorPickerPalette colorPickerPalette = (ColorPickerPalette) layoutInflater.inflate(R.layout.color_picker_dialog, null);

        colorPickerPalette.init(10, 5, new ColorPickerSwatch.OnColorSelectedListener() {
            @Override
            public void onColorSelected(int color) {
                Toast.makeText(getActivity(), "Color seleccionado: " + color, Toast.LENGTH_LONG).show();
            }
        });

        colorPickerPalette.drawPalette(new int[] {1,2,3,4,5}, 1);

        AlertDialog alertDialog = new AlertDialog.Builder(getActivity(), R.style.Theme_AppCompat_DayNight_Dialog_Alert)
                .setTitle("Elije un color")
                .setPositiveButton("Me gusta", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Color seleccionado: ", Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("No quiero", null)
                .setView(colorPickerPalette)
                .show();


        return view;
    }

}
