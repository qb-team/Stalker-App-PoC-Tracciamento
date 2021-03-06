package android.StalkerAppPoCTracciamento;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

public class Registrati extends AppCompatActivity {
    public static final String TAG = "TAG";
    EditText mEmail, mPassword, mConfPassword;
    Button mRegisterBtn;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Inizio onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrati);

        mEmail =(EditText) findViewById(R.id.EmailID);
        mPassword = (EditText)findViewById(R.id.PasswordID);
        mConfPassword = (EditText)findViewById(R.id.ConfPasswordID);
        mRegisterBtn= (Button) findViewById(R.id.RegistratiID);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        mRegisterBtn.setOnClickListener(new View.OnClickListener() { // Inizio Funzionalità pulsante Registrati (quando lo clicchi)
            @Override
            public void onClick(View v) {
                final String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                String confPassword = mConfPassword.getText().toString().trim();

                // Inizio Messaggi Errore compilazione
                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Inserire l'Email");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Inserire la Password");
                    return;
                }

                if(password.length() < 6){
                    mPassword.setError("La Password deve contenere almeno 6 caratteri");
                    return;
                }

                if(!(password.equals(confPassword))){
                    mConfPassword.setError("Le Password non coincidono");
                    return;
                }
                // Fine Messaggi Errore compilazione

                // Registrazione dell'utente in Firebase
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Registrati.this, "Ti sei registrato e hai effettuato il login", Toast.LENGTH_SHORT).show();
                            userID = fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference = fStore.collection("users").document(userID);
                            Map<String, Object> user = new HashMap<>();
                            user.put("email",email);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d(TAG, "onSuccess: Registrazione effettuata "+ userID);
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d(TAG, "onFailure: Si è verificato un errore" + e.toString());
                                }
                            });
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                        else{
                            Toast.makeText(Registrati.this, "Errore! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        }); // Fine Funzionalità pulsante Registrati

    }//Fine onCreate

    // Funzionalità per il backbutton (tasto per andare indietro)
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Sicuro di voler uscire?")
                    .setCancelable(false)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            setResult(123);
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

}