package id.ac.ugm.web.arifh.projectandroidkejar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import static java.lang.Math.floor;

public class question1 extends AppCompatActivity {
    private TextView score1, tekscore;
    private Button no1_1, no1_2, no1_3, no2_1, no2_2, no2_3, no3_1, no3_2, no3_3, no4_1, no4_2, no4_3, no5_1, no5_2, no5_3, coba, selesai;
    private ImageView gambar1, gambar2, gambar3, gambar4, gambar5, gambar6, gambar7, gambar8, gambar9, gambar10;
    private Button no6_1, no6_2, no6_3, no7_1, no7_2, no7_3, no8_1, no8_2, no8_3, no9_1, no9_2, no9_3, no10_1, no10_2, no10_3;
    private double tambah = 0.0, kurang = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        no1_1 = (Button) findViewById(R.id.no1_1);
        no1_2 = (Button) findViewById(R.id.no1_2);
        no1_3 = (Button) findViewById(R.id.no1_3);
        no2_1 = (Button) findViewById(R.id.no2_1);
        no2_2 = (Button) findViewById(R.id.no2_2);
        no2_3 = (Button) findViewById(R.id.no2_3);
        no3_1 = (Button) findViewById(R.id.no3_1);
        no3_2 = (Button) findViewById(R.id.no3_2);
        no3_3 = (Button) findViewById(R.id.no3_3);
        no4_1 = (Button) findViewById(R.id.no4_1);
        no4_2 = (Button) findViewById(R.id.no4_2);
        no4_3 = (Button) findViewById(R.id.no4_3);
        no5_1 = (Button) findViewById(R.id.no5_1);
        no5_2 = (Button) findViewById(R.id.no5_2);
        no5_3 = (Button) findViewById(R.id.no5_3);
        no6_1 = (Button) findViewById(R.id.no6_1);
        no6_2 = (Button) findViewById(R.id.no6_2);
        no6_3 = (Button) findViewById(R.id.no6_3);
        no7_1 = (Button) findViewById(R.id.no7_1);
        no7_2 = (Button) findViewById(R.id.no7_2);
        no7_3 = (Button) findViewById(R.id.no7_3);
        no8_1 = (Button) findViewById(R.id.no8_1);
        no8_2 = (Button) findViewById(R.id.no8_2);
        no8_3 = (Button) findViewById(R.id.no8_3);
        no9_1 = (Button) findViewById(R.id.no9_1);
        no9_2 = (Button) findViewById(R.id.no9_2);
        no9_3 = (Button) findViewById(R.id.no9_3);
        no10_1 = (Button) findViewById(R.id.no10_1);
        no10_2 = (Button) findViewById(R.id.no10_2);
        no10_3 = (Button) findViewById(R.id.no10_3);
        gambar1 = (ImageView) findViewById(R.id.fruit1);
        gambar2 = (ImageView) findViewById(R.id.fruit2);
        gambar3 = (ImageView) findViewById(R.id.fruit3);
        gambar4 = (ImageView) findViewById(R.id.fruit4);
        gambar5 = (ImageView) findViewById(R.id.fruit5);
        gambar6 = (ImageView) findViewById(R.id.fruit6);
        gambar7 = (ImageView) findViewById(R.id.fruit7);
        gambar8 = (ImageView) findViewById(R.id.fruit8);
        gambar9 = (ImageView) findViewById(R.id.fruit9);
        gambar10 = (ImageView) findViewById(R.id.fruit10);
        tekscore = (TextView) findViewById(R.id.textscore);
        score1 = (TextView) findViewById(R.id.score);
        coba = (Button) findViewById(R.id.cobalagi);
        selesai = (Button) findViewById(R.id.selesai);
        Button kembali = (Button) findViewById(R.id.selesai);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void tambah() {
        if (no1_3.isPressed() || no2_2.isPressed() || no3_3.isPressed() || no4_1.isPressed() || no5_2.isPressed() ||
                no6_2.isPressed() || no7_1.isPressed() || no8_3.isPressed() || no9_1.isPressed() || no10_3.isPressed()) {
            tambah = Double.parseDouble(score1.getText().toString());
            tambah = tambah + 1;
            score1.setText(String.valueOf(tambah));
            Toast.makeText(this, "You Right!!", Toast.LENGTH_SHORT).show();
        } else {
            kurang = kurang + 1;
            Toast.makeText(this, "You Wrong!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void display() {
        double hasil=0.0;
        hasil = Double.parseDouble(score1.getText().toString());
        hasil = hasil / (hasil+kurang) * 100.0;
        score1.setText(String.valueOf(floor(hasil)));
    }

    public void no1ke2(View view) {
        tambah();
        reset();
        no2_1.setVisibility(View.VISIBLE);
        no2_2.setVisibility(View.VISIBLE);
        no2_3.setVisibility(View.VISIBLE);
        gambar2.setVisibility(View.VISIBLE);
    }

    public void no2ke3(View view) {
        tambah();
        reset();
        no3_1.setVisibility(View.VISIBLE);
        no3_2.setVisibility(View.VISIBLE);
        no3_3.setVisibility(View.VISIBLE);
        gambar3.setVisibility(View.VISIBLE);
    }

    public void no3ke4(View view){
        tambah();
        reset();
        no4_1.setVisibility(View.VISIBLE);
        no4_2.setVisibility(View.VISIBLE);
        no4_3.setVisibility(View.VISIBLE);
        gambar4.setVisibility(View.VISIBLE);
    }

    public void no4ke5(View view) {
        tambah();
        reset();
        no5_1.setVisibility(View.VISIBLE);
        no5_2.setVisibility(View.VISIBLE);
        no5_3.setVisibility(View.VISIBLE);
        gambar5.setVisibility(View.VISIBLE);
    }

    public void no5ke6(View view) {
        tambah();
        reset();
        no6_1.setVisibility(View.VISIBLE);
        no6_2.setVisibility(View.VISIBLE);
        no6_3.setVisibility(View.VISIBLE);
        gambar6.setVisibility(View.VISIBLE);
    }

    public void no6ke7(View view) {
        tambah();
        reset();
        no7_1.setVisibility(View.VISIBLE);
        no7_2.setVisibility(View.VISIBLE);
        no7_3.setVisibility(View.VISIBLE);
        gambar7.setVisibility(View.VISIBLE);
    }

    public void no7ke8(View view) {
        tambah();
        reset();
        no8_1.setVisibility(View.VISIBLE);
        no8_2.setVisibility(View.VISIBLE);
        no8_3.setVisibility(View.VISIBLE);
        gambar8.setVisibility(View.VISIBLE);
    }

    public void no8ke9(View view) {
        tambah();
        reset();
        no9_1.setVisibility(View.VISIBLE);
        no9_2.setVisibility(View.VISIBLE);
        no9_3.setVisibility(View.VISIBLE);
        gambar9.setVisibility(View.VISIBLE);
    }

    public void no9ke10(View view) {
        tambah();
        reset();
        no10_1.setVisibility(View.VISIBLE);
        no10_2.setVisibility(View.VISIBLE);
        no10_3.setVisibility(View.VISIBLE);
        gambar10.setVisibility(View.VISIBLE);
    }

    public void selesaikan(View view) {
        reset();
        tambah();
        display();
        tekscore.setVisibility(View.VISIBLE);
        score1.setVisibility(View.VISIBLE);
        coba.setVisibility(View.VISIBLE);
        selesai.setVisibility(View.VISIBLE);
    }

    public void cobalagi(View view) {
        double reset = 0.0;
        this.kurang = 0.0;
        this.tambah = 0.0;
        score1.setText(String.valueOf(reset));
        tekscore.setVisibility(View.INVISIBLE);
        score1.setVisibility(View.INVISIBLE);
        coba.setVisibility(View.INVISIBLE);
        selesai.setVisibility(View.INVISIBLE);
        gambar1.setVisibility(View.VISIBLE);
        no1_1.setVisibility(View.VISIBLE);
        no1_2.setVisibility(View.VISIBLE);
        no1_3.setVisibility(View.VISIBLE);
    }

    public void reset() {
        gambar1.setVisibility(View.INVISIBLE);
        no1_1.setVisibility(View.INVISIBLE);
        no1_2.setVisibility(View.INVISIBLE);
        no1_3.setVisibility(View.INVISIBLE);
        gambar2.setVisibility(View.INVISIBLE);
        no2_1.setVisibility(View.INVISIBLE);
        no2_2.setVisibility(View.INVISIBLE);
        no2_3.setVisibility(View.INVISIBLE);
        gambar3.setVisibility(View.INVISIBLE);
        no3_1.setVisibility(View.INVISIBLE);
        no3_2.setVisibility(View.INVISIBLE);
        no3_3.setVisibility(View.INVISIBLE);
        gambar4.setVisibility(View.INVISIBLE);
        no4_1.setVisibility(View.INVISIBLE);
        no4_2.setVisibility(View.INVISIBLE);
        no4_3.setVisibility(View.INVISIBLE);
        gambar5.setVisibility(View.INVISIBLE);
        no5_1.setVisibility(View.INVISIBLE);
        no5_2.setVisibility(View.INVISIBLE);
        no5_3.setVisibility(View.INVISIBLE);
        gambar6.setVisibility(View.INVISIBLE);
        no6_1.setVisibility(View.INVISIBLE);
        no6_2.setVisibility(View.INVISIBLE);
        no6_3.setVisibility(View.INVISIBLE);
        gambar7.setVisibility(View.INVISIBLE);
        no7_1.setVisibility(View.INVISIBLE);
        no7_2.setVisibility(View.INVISIBLE);
        no7_3.setVisibility(View.INVISIBLE);
        gambar8.setVisibility(View.INVISIBLE);
        no8_1.setVisibility(View.INVISIBLE);
        no8_2.setVisibility(View.INVISIBLE);
        no8_3.setVisibility(View.INVISIBLE);
        gambar9.setVisibility(View.INVISIBLE);
        no9_1.setVisibility(View.INVISIBLE);
        no9_2.setVisibility(View.INVISIBLE);
        no9_3.setVisibility(View.INVISIBLE);
        gambar10.setVisibility(View.INVISIBLE);
        no10_1.setVisibility(View.INVISIBLE);
        no10_2.setVisibility(View.INVISIBLE);
        no10_3.setVisibility(View.INVISIBLE);
    }
}
