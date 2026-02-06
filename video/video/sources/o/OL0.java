package o;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class OL0 {
    public static final int b = 0;
    public static final String c = "androidx.work.util.id";
    public static final String d = "next_job_scheduler_id";
    public static final String e = "next_alarm_manager_id";
    public final WorkDatabase a;

    public OL0(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void a(Context context, InterfaceC10528wh2 sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(c, 0);
        if (!sharedPreferences.contains(d) && !sharedPreferences.contains(d)) {
            return;
        }
        int i = sharedPreferences.getInt(d, 0);
        int i2 = sharedPreferences.getInt(e, 0);
        sqLiteDatabase.w0();
        try {
            sqLiteDatabase.u1(androidx.work.impl.a.v, new Object[]{d, Integer.valueOf(i)});
            sqLiteDatabase.u1(androidx.work.impl.a.v, new Object[]{e, Integer.valueOf(i2)});
            sharedPreferences.edit().clear().apply();
            sqLiteDatabase.s1();
        } finally {
            sqLiteDatabase.W1();
        }
    }

    public int b() {
        int c2;
        synchronized (OL0.class) {
            c2 = c(e);
        }
        return c2;
    }

    public final int c(String key) {
        int i;
        this.a.c();
        try {
            Long c2 = this.a.G().c(key);
            int i2 = 0;
            if (c2 != null) {
                i = c2.intValue();
            } else {
                i = 0;
            }
            if (i != Integer.MAX_VALUE) {
                i2 = i + 1;
            }
            e(key, i2);
            this.a.A();
            this.a.i();
            return i;
        } catch (Throwable th) {
            this.a.i();
            throw th;
        }
    }

    public int d(int minInclusive, int maxInclusive) {
        synchronized (OL0.class) {
            int c2 = c(d);
            if (c2 >= minInclusive && c2 <= maxInclusive) {
                minInclusive = c2;
            }
            e(d, minInclusive + 1);
        }
        return minInclusive;
    }

    public final void e(String key, int value) {
        this.a.G().b(new C8472oG1(key, value));
    }
}
