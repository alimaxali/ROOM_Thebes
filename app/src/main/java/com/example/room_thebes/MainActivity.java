package com.example.room_thebes;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText set_Email , set_pass , set_naem;
    public static String phpp = "com/example/room_thebes/services/LogIn.php";
    public static String Ema , passd , safff,qsmmm,name,passdd,pa,paa,paaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sing = (Button) findViewById(R.id.new_stu) ;
        Button login = (Button) findViewById(R.id.test_stu) ;



        ////Buoton
        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        ////Buoton

    }

    public void data(){

        set_naem = findViewById(R.id.name_stu);
        set_Email = findViewById(R.id.Email1);
        set_pass = findViewById(R.id.pass1);
        Spinner saff =  (Spinner) findViewById(R.id.saf);
        Spinner qsmm =  (Spinner) findViewById(R.id.qsm);
        ////ا
        safff = saff.getSelectedItem().toString();
        qsmmm = qsmm.getSelectedItem().toString();
        Ema = set_Email.getText().toString().trim().replace(" ","");
        passd = set_pass.getText().toString().trim().replace("&","^");
        pa = passd.replace(" ","");
        paa = pa.replace("#","^^");
        paaa = paa.replace("+","^^^");
        passdd = paaa.replace("&","^");


        name = set_naem.getText().toString().trim();

    }


    void send() {
        data();

        if (Ema.equals("")|passd.equals("")|name.equals("")){
            Toast.makeText(getBaseContext(), "يجب ملي جميع الحقول", Toast.LENGTH_LONG).show();

        }else {

            String URLL =("https://roomroom99x.000webhostapp.com/sing_in.php?id_stu="+Ema+"&pass="+passdd+"&name="+name+"&phone=0"+"&alsafu="+safff+"&alqism="+qsmmm).toString();

            Toast.makeText(getBaseContext(),"Please Wait...", Toast.LENGTH_LONG).show();

            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            StringRequest stringRequest = new StringRequest(Request.Method.GET, URLL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    //JSONObject obj = null;
                    try {
                        JSONObject obj = new JSONObject(response);
                        String ggg = obj.getString("success");
                        if (ggg == "true") {
                            Toast.makeText(getBaseContext(), "موجود بالفعل", Toast.LENGTH_LONG).show();
                        }else if (ggg == "false"){

                            Toast.makeText(getBaseContext(),"تم التسجيل", Toast.LENGTH_LONG).show();
                            set_naem.setText("");
                            set_Email.setText("");
                            set_pass.setText("");
                        }else {

                            Toast.makeText(getBaseContext(),"تاكد من الانترنت", Toast.LENGTH_LONG).show();

                        }
                    } catch (JSONException e) {
                        Toast.makeText(getBaseContext(),"تاكد من الانترنت", Toast.LENGTH_LONG).show();

                        e.printStackTrace();
                    }


                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getBaseContext(),"تاكد من الانترنت", Toast.LENGTH_LONG).show();

                }
            });

            requestQueue.add(stringRequest);

        }

    }
    public void login() {

        data();
        if (Ema.equals("")|passd.equals("")|name.equals("")){
            Toast.makeText(getBaseContext(), "يجب ملي جميع الحقول", Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(getBaseContext(),"Please Wait...", Toast.LENGTH_LONG).show();


            String URLLl =("https://roomroom99x.000webhostapp.com/login.php?id_stu="+Ema+"&pass="+passdd+"&alsafu="+safff+"&alqism="+qsmmm).toString();


            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            StringRequest stringRequest = new StringRequest(Request.Method.GET, URLLl, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    //JSONObject obj = null;
                    try {
                        JSONObject obj = new JSONObject(response);
                        String ggg = obj.getString("success");

                        if (ggg == "true") {
                            Toast.makeText(getBaseContext(), "تم تسجيل الدخول بالنجاح", Toast.LENGTH_LONG).show();
                            Intent wep_11 = new Intent(MainActivity.this,wep_1.class);
                            Bundle b = new Bundle();
                            b.putString("qsmmm",qsmmm);
                            b.putString("safff",safff);
                            wep_11.putExtras(b);
                            startActivity(wep_11);
                        }else if (ggg == "false") {

                            Toast.makeText(getBaseContext(), "البينات خطأ", Toast.LENGTH_LONG).show();
                            set_naem.setText("");
                            set_Email.setText("");
                            set_pass.setText("");
                        }else{
                            Toast.makeText(getBaseContext(),"تاكد من الانترنت", Toast.LENGTH_LONG).show();




                        }
                    } catch (JSONException e) {
                        Toast.makeText(getBaseContext(),"تاكد من الانترنت", Toast.LENGTH_LONG).show();

                        e.printStackTrace();
                    }


                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getBaseContext(),"تاكد من الانترنت", Toast.LENGTH_LONG).show();

                }
            });


            requestQueue.add(stringRequest);

        }




    }


}