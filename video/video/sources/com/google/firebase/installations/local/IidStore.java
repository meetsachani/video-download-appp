package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o.C8077mf;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IidStore {
    public static final String c = "com.google.android.gms.appid";
    public static final String d = "|S||P|";
    public static final String e = "|S|id";
    public static final String f = "|T|";
    public static final String g = "|";
    public static final String h = "token";
    public static final String i = "{";
    public static final String[] j = {"*", FirebaseMessaging.s, CodePackage.B, ""};
    @InterfaceC8710pF0("iidPrefs")
    public final SharedPreferences a;
    public final String b;

    public IidStore(@InterfaceC5670cr1 FirebaseApp firebaseApp) {
        this.a = firebaseApp.n().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(firebaseApp);
    }

    public static String b(FirebaseApp firebaseApp) {
        String m = firebaseApp.s().m();
        if (m != null) {
            return m;
        }
        String j2 = firebaseApp.s().j();
        if (!j2.startsWith("1:") && !j2.startsWith("2:")) {
            return j2;
        }
        String[] split = j2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @InterfaceC11300zs1
    public static String c(@InterfaceC5670cr1 PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & C8077mf.q) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @InterfaceC11300zs1
    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    @InterfaceC11300zs1
    public String f() {
        synchronized (this.a) {
            try {
                String g2 = g();
                if (g2 != null) {
                    return g2;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public final String g() {
        String string;
        synchronized (this.a) {
            string = this.a.getString(e, null);
        }
        return string;
    }

    @InterfaceC11300zs1
    public final String h() {
        synchronized (this.a) {
            try {
                String string = this.a.getString(d, null);
                if (string == null) {
                    return null;
                }
                PublicKey e2 = e(string);
                if (e2 == null) {
                    return null;
                }
                return c(e2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public String i() {
        synchronized (this.a) {
            try {
                for (String str : j) {
                    String string = this.a.getString(a(this.b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC5056aJ2
    public IidStore(@InterfaceC5670cr1 SharedPreferences sharedPreferences, @InterfaceC11300zs1 String str) {
        this.a = sharedPreferences;
        this.b = str;
    }
}
