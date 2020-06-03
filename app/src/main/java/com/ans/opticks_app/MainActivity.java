package com.ans.opticks_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ans.opticks_app.Modelos.Modelo_Usuario;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    EditText cedula_usuario,contrasena_usuario;
    Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cedula_usuario=findViewById(R.id.cedula);
        contrasena_usuario=findViewById(R.id.contrasena);
        ingresar=findViewById(R.id.ingresar);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar_usuario("http://192.168.1.61:82/conexion/validar_usuario.php");

            }
        });

        Modelo_Usuario usuario = new Modelo_Usuario();

    }

    private void validar_usuario(String URL){
        StringRequest stringRequest= new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (!response.isEmpty()){
                    
                    try {
                        JSONObject objetojson = new JSONObject(response);
                        Integer id_usuario = objetojson.getInt("id_usuario");
                        Integer admin_id_admin = objetojson.getInt("admin_id_admin");
                        Long cedula_usuario = objetojson.getLong("cedula_usuario");
                        Long telefono_usuario = objetojson.getLong("telefono_usuario");
                        String nombres_usuario = objetojson.getString("nombres_usuario");
                        String apellidos_usuario = objetojson.getString("apellidos_usuario");
                        String correo_usuario = objetojson.getString("correo_usuario");
                        String contrasena_usuario = objetojson.getString("contrasena_usuario");
                        String estado_usuario = objetojson.getString("estado_usuario");
                        String foto_usuario = objetojson.getString("foto");
                        String firma_usuario = objetojson.getString("firma_digital");

                        Modelo_Usuario usuario = new Modelo_Usuario(id_usuario,admin_id_admin,cedula_usuario,telefono_usuario,
                                nombres_usuario,apellidos_usuario,correo_usuario,contrasena_usuario,
                                estado_usuario,foto_usuario,firma_usuario);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Intent intent=new Intent(getApplicationContext(),Dashboard.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros = new HashMap<String, String>();
                parametros.put("cedula_usuario",cedula_usuario.getText().toString());
                parametros.put("contrasena_usuario",contrasena_usuario.getText().toString());
                return parametros;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
