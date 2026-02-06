package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes3.dex */
public class HS2 {
    public static a b = new a(null);
    public static volatile HS2 c = null;
    public static String d = FirebaseMessaging.r;
    public SharedPreferences a;

    /* loaded from: classes3.dex */
    public static class a {
        public a(C9516sY c9516sY) {
            this();
        }

        public HS2 a(Context context) {
            HS2 hs2;
            C6562gT0.p(context, "context");
            HS2 hs22 = HS2.c;
            if (hs22 == null) {
                synchronized (this) {
                    try {
                        hs2 = HS2.c;
                        if (hs2 == null) {
                            Context applicationContext = context.getApplicationContext();
                            C6562gT0.o(applicationContext, "getApplicationContext(...)");
                            hs2 = new HS2(applicationContext, null);
                            a aVar = HS2.b;
                            HS2.c = hs2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hs2;
            }
            return hs22;
        }

        public a() {
        }
    }

    public HS2(Context context, C9516sY c9516sY) {
        this(context);
    }

    public void c() {
        this.a.edit().clear().apply();
    }

    public boolean d(String str) {
        C6562gT0.p(str, "key");
        return this.a.getBoolean(str, false);
    }

    public int e(String str) {
        C6562gT0.p(str, "key");
        return this.a.getInt(str, 0);
    }

    public String f(String str) {
        C6562gT0.p(str, "key");
        return this.a.getString(str, "");
    }

    public void g(String str) {
        C6562gT0.p(str, "key");
        this.a.edit().remove(str).apply();
    }

    public void h(String str, boolean z) {
        C6562gT0.p(str, "key");
        this.a.edit().putBoolean(str, z).apply();
    }

    public void i(String str, int i) {
        C6562gT0.p(str, "key");
        this.a.edit().putInt(str, i).apply();
    }

    public void j(String str, String str2) {
        C6562gT0.p(str, "key");
        C6562gT0.p(str2, "value");
        this.a.edit().putString(str, str2).apply();
    }

    public HS2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(d, 0);
        C6562gT0.o(sharedPreferences, "getSharedPreferences(...)");
        this.a = sharedPreferences;
    }
}
