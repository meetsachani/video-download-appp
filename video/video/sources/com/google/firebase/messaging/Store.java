package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.C10201vM;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Store {
    public static final String b = "|T|";
    public static final String c = "*";
    public static final String d = "com.google.android.gms.appid";
    public static final String e = "com.google.android.gms.appid-no-backup";
    public final SharedPreferences a;

    /* loaded from: classes3.dex */
    public static class Token {
        public static final String d = "token";
        public static final String e = "appVersion";
        public static final String f = "timestamp";
        public static final long g = TimeUnit.DAYS.toMillis(7);
        public final String a;
        public final String b;
        public final long c;

        public Token(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public static String a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e2) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e2);
                return null;
            }
        }

        public static Token c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e2) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e2);
                    return null;
                }
            }
            return new Token(str, null, 0L);
        }

        public boolean b(String str) {
            if (System.currentTimeMillis() <= this.c + g && str.equals(this.b)) {
                return false;
            }
            return true;
        }
    }

    public Store(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, e);
    }

    public final void a(Context context, String str) {
        File file = new File(C10201vM.p(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    c();
                }
            } catch (IOException e2) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e2.getMessage());
                }
            }
        }
    }

    public final String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b2 = b(str, str2);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(b2);
        edit.commit();
    }

    public synchronized Token e(String str, String str2) {
        return Token.c(this.a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a = Token.a(str3, str4, System.currentTimeMillis());
        if (a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(b(str, str2), a);
        edit.commit();
    }
}
