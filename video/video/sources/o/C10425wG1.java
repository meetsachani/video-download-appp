package o;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkDatabase;

/* renamed from: o.wG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10425wG1 {
    public static final String b = "androidx.work.util.preferences";
    public static final String c = "last_cancel_all_time_ms";
    public static final String d = "reschedule_needed";
    public final WorkDatabase a;

    /* renamed from: o.wG1$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC6490gB0<Long, Long> {
        public a() {
        }

        @Override // o.InterfaceC6490gB0
        /* renamed from: a */
        public Long apply(Long value) {
            long j;
            if (value != null) {
                j = value.longValue();
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        }
    }

    public C10425wG1(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void d(Context context, InterfaceC10528wh2 sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b, 0);
        if (!sharedPreferences.contains(d) && !sharedPreferences.contains(c)) {
            return;
        }
        long j = 0;
        long j2 = sharedPreferences.getLong(c, 0L);
        if (sharedPreferences.getBoolean(d, false)) {
            j = 1;
        }
        sqLiteDatabase.w0();
        try {
            sqLiteDatabase.u1(androidx.work.impl.a.v, new Object[]{c, Long.valueOf(j2)});
            sqLiteDatabase.u1(androidx.work.impl.a.v, new Object[]{d, Long.valueOf(j)});
            sharedPreferences.edit().clear().apply();
            sqLiteDatabase.s1();
        } finally {
            sqLiteDatabase.W1();
        }
    }

    public long a() {
        Long c2 = this.a.G().c(c);
        if (c2 != null) {
            return c2.longValue();
        }
        return 0L;
    }

    public LiveData<Long> b() {
        return C6901hs2.c(this.a.G().a(c), new a());
    }

    public boolean c() {
        Long c2 = this.a.G().c(d);
        if (c2 != null && c2.longValue() == 1) {
            return true;
        }
        return false;
    }

    public void e(final long timeMillis) {
        this.a.G().b(new C8472oG1(c, timeMillis));
    }

    public void f(boolean needsReschedule) {
        this.a.G().b(new C8472oG1(d, needsReschedule));
    }
}
