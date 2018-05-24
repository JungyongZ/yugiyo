package com.example.jungyong.myapplication;


        import android.app.Dialog;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class MyTwo extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my_two);
        ArrayList<ListViewItem> list = new ArrayList<ListViewItem>();
        list.add(new ListViewItem("캐나다", "캐나다 굿!", R.drawable.hansik));
        list.add(new ListViewItem("프랑스", "프랑스 굿!", R.drawable.dongas));
        list.add(new ListViewItem("한국", "한국 굿!", R.drawable.chicken));
        list.add(new ListViewItem("멕시코", "멕시코 굿!", R.drawable.bunsik));
        list.add(new ListViewItem("독일", "독일 굿", R.drawable.pizza));
        list.add(new ListViewItem("아르헨티나", "아르헨티나 굿", R.drawable.junggook));
        list.add(new ListViewItem("오스트레일리아", "오스트레일리아 굿", R.drawable.junggook));


        listView = (ListView) findViewById(R.id.ListView01);
        CustomAdapter adp = new CustomAdapter(getApplicationContext(), R.layout.list_view, list);
        listView.setAdapter(adp);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showDialog(position);
            }
        });

    }

    protected Dialog onCreateDialog(int id) {
        Dialog dialog=null;

        switch(id){
            case 0 :
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                TextView text = (TextView) dialog.findViewById(R.id.text1);
                ImageView image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("캐나다 입니다\nGDP : $1조 6003억\n인구수 : 35623680명");
                image.setImageResource(R.drawable.canada);

                dialog.show();
                break;
            case 1 :
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                text = (TextView) dialog.findViewById(R.id.text1);
                image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("프랑스 입니다\nGDP : $2조4204억\n인구수 : 67106161명");
                image.setImageResource(R.drawable.france);
                dialog.show();
                break;
            case 2 :
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                text = (TextView) dialog.findViewById(R.id.text1);
                image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("한국 입니다\nGDP : $1조4981억\n인구수 : 51762492명");
                image.setImageResource(R.drawable.korea);
                dialog.show();
                break;
            case 3 :
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                text = (TextView) dialog.findViewById(R.id.text1);
                image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("멕시코 입니다\nGDP : $9873억\n인구수 : 124574795명");
                image.setImageResource(R.drawable.mexico);
                dialog.show();
                break;
            case 4:
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                text = (TextView) dialog.findViewById(R.id.text1);
                image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("독일 입니다\nGDP : $3조4233억\n인구수 : 80594017명");
                image.setImageResource(R.drawable.germany);
                dialog.show();
                break;
            case 5:
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                text = (TextView) dialog.findViewById(R.id.text1);
                image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("아르헨티나 입니다\nGDP : $6289억\n인구수 : 44293293명");
                image.setImageResource(R.drawable.argentina);
                dialog.show();
                break;
            case 6:
                dialog = new Dialog(this);
                dialog.setContentView(R.layout.layout1);
                text = (TextView) dialog.findViewById(R.id.text1);
                image = (ImageView) dialog.findViewById(R.id.image1);
                text.setText("오스트레일리아 입니다\nGDP : $1조 3597억\n인구수 : 23232413명");
                image.setImageResource(R.drawable.austrlia);
                dialog.show();
                break;
        }
        return dialog;
    }
}

