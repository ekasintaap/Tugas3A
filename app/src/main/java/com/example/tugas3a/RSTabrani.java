package com.example.tugas3a;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSTabrani extends ListActivity {
    protected  void onCreate(Bundle icicle){
        super.onCreate(icicle);
        String[] listAction= new String[]{
                "Call Center",
                "SMS Center",
                "Driving Direction",
                "Website",
                "Info Google",
                "Exit"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAction));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position,id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;

            if(pilihan.equals("Call Center"))
            {
                String noTlp = "tel:0895-618221419";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(noTlp));
                startActivity(a);

            }else if(pilihan.equals("SMS Center"))
            {
                String smsTlp = "Eka Sinta Aprilia P/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0895-61822-1419"));
                a.putExtra(" sms_body", smsTlp);
                startActivity(a);

            }else if(pilihan.equals("Driving Direction"))
            {
                String lokasiRS ="https://maps.app.goo.gl/VgHDwQZyGdZQcgFr5";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasiRS));
                startActivity(a);

            }else if(pilihan.equals("Website"))
            {
                String website ="https://rstabrani.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                startActivity(a);
            }
            else if(pilihan.equals("Info Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Tabrani");
                startActivity(a);
            }


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
