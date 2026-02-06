package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C11284zo1;
import o.C5036aE2;
import o.FS2;
import o.JT;
import o.N32;

/* loaded from: classes3.dex */
public class DirectChatActivity extends ActivityC3020Gb {
    public Spinner C1;
    public EditText D1;
    public LinearLayout E1;
    public LinearLayout F1;
    public String G1 = JT.d;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DirectChatActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(DirectChatActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            char[] charArray;
            N32.b(DirectChatActivity.this).h("DIRECT_CHAT_COUNTRY_CODE_INDEX", adapterView.getSelectedItemPosition());
            TextView textView = (TextView) adapterView.getChildAt(0);
            if (textView != null) {
                String charSequence = textView.getText().toString();
                StringBuilder sb = new StringBuilder();
                for (char c : charSequence.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                DirectChatActivity.this.G1 = sb.toString();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DirectChatActivity.this.J1(view);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DirectChatActivity.this.K1(view);
        }
    }

    private void M1() {
        int i;
        String[] stringArray = getResources().getStringArray(R.array.countrycode);
        List asList = Arrays.asList(getResources().getStringArray(R.array.countryname));
        String simCountryIso = ((TelephonyManager) getSystemService("phone")).getSimCountryIso();
        if (simCountryIso.isEmpty()) {
            simCountryIso = getResources().getConfiguration().locale.getCountry();
        }
        if (asList.contains(simCountryIso.toUpperCase())) {
            i = asList.indexOf(simCountryIso.toUpperCase());
        } else {
            i = 0;
        }
        this.C1.setOnItemSelectedListener(new c());
        this.C1.setAdapter((SpinnerAdapter) new ArrayAdapter(this, (int) R.layout.item_country, stringArray));
        if (!simCountryIso.isEmpty()) {
            this.C1.setSelection(i);
            if (N32.b(this).c("DIRECT_CHAT_COUNTRY_CODE_INDEX", 0) != 0) {
                this.C1.setSelection(N32.b(this).c("DIRECT_CHAT_COUNTRY_CODE_INDEX", 0));
            }
        } else {
            this.C1.setSelection(N32.b(this).c("DIRECT_CHAT_COUNTRY_CODE_INDEX", 0));
        }
        this.E1.setOnClickListener(new d());
        this.F1.setOnClickListener(new e());
    }

    public final boolean I1(String str) {
        if (!Pattern.matches("[a-zA-Z]+", str) && str.length() > 6 && str.length() <= 13) {
            return false;
        }
        return true;
    }

    public final void J1(View view) {
        String obj = this.D1.getText().toString();
        String str = this.G1 + obj;
        if (this.G1.isEmpty()) {
            Toast.makeText(this, getString(R.string.select_country), 0).show();
        } else if (obj.isEmpty()) {
            this.D1.setError(getString(R.string.description));
        } else if (I1(obj)) {
            this.D1.setError(getString(R.string.error));
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://wa.me/" + str));
                if (N1(FS2.c)) {
                    intent.setPackage(FS2.c);
                }
                startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(this, "WhatsApp not installed", 0).show();
            }
        }
    }

    public final void K1(View view) {
        String obj = this.D1.getText().toString();
        String str = this.G1 + obj;
        if (this.G1.isEmpty()) {
            Toast.makeText(this, getString(R.string.select_country), 0).show();
        } else if (obj.isEmpty()) {
            this.D1.setError(getString(R.string.description));
        } else if (I1(obj)) {
            this.D1.setError(getString(R.string.error));
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://wa.me/" + str));
                if (N1(FS2.a)) {
                    intent.setPackage(FS2.a);
                }
                startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(this, "WhatsApp not installed", 0).show();
            }
        }
    }

    public final void L1() {
        this.C1 = (Spinner) findViewById(R.id.mSpCountryCode);
        this.D1 = (EditText) findViewById(R.id.mEtMobileNumber);
        this.E1 = (LinearLayout) findViewById(R.id.mImgWChat);
        this.F1 = (LinearLayout) findViewById(R.id.mImgWbChat);
    }

    public final boolean N1(String str) {
        try {
            getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_direct_chat);
        C11284zo1.c(this, (LinearLayout) findViewById(R.id.llnative_full), (LinearLayout) findViewById(R.id.llline_full), Boolean.TRUE);
        findViewById(R.id.ic_back).setOnClickListener(new a());
        R().e(new b(true));
        L1();
        M1();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
    }
}
