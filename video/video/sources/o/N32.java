package o;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class N32 {
    public static SharedPreferences a;
    public static N32 b;

    public N32(Context context) {
        if (context != null) {
            a = context.getApplicationContext().getSharedPreferences("sp_save_video_status", 0);
            return;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static N32 b(Context context) {
        if (b == null) {
            synchronized (N32.class) {
                try {
                    if (b == null) {
                        b = new N32(context);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public boolean a(String str, boolean z) {
        return a.getBoolean(str, z);
    }

    public int c(String str, int i) {
        return a.getInt(str, i);
    }

    public boolean d() {
        return a.getBoolean("firstTimeOpenApp", true);
    }

    public long e(String str) {
        return a.getLong(str, 0L);
    }

    public String f(String str, String str2) {
        return a.getString(str, str2);
    }

    public void g(String str, boolean z) {
        a.edit().putBoolean(str, z).apply();
    }

    public void h(String str, int i) {
        a.edit().putInt(str, i).apply();
    }

    public void i(String str, long j) {
        a.edit().putLong(str, j).apply();
    }

    public void j(String str, String str2) {
        a.edit().putString(str, str2).apply();
    }

    public void k(boolean z) {
        a.edit().putBoolean("firstTimeOpenApp", z).apply();
    }
}
