package o;

import android.content.Context;

/* renamed from: o.Kr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3479Kr2 {
    public static C3479Kr2 e;
    public C6874hm a;
    public C7358jm b;
    public C3665Mp1 c;
    public C6841hd2 d;

    public C3479Kr2(Context context, InterfaceC3748Nl2 taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.a = new C6874hm(applicationContext, taskExecutor);
        this.b = new C7358jm(applicationContext, taskExecutor);
        this.c = new C3665Mp1(applicationContext, taskExecutor);
        this.d = new C6841hd2(applicationContext, taskExecutor);
    }

    public static synchronized C3479Kr2 c(Context context, InterfaceC3748Nl2 taskExecutor) {
        C3479Kr2 c3479Kr2;
        synchronized (C3479Kr2.class) {
            try {
                if (e == null) {
                    e = new C3479Kr2(context, taskExecutor);
                }
                c3479Kr2 = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3479Kr2;
    }

    public static synchronized void f(C3479Kr2 trackers) {
        synchronized (C3479Kr2.class) {
            e = trackers;
        }
    }

    public C6874hm a() {
        return this.a;
    }

    public C7358jm b() {
        return this.b;
    }

    public C3665Mp1 d() {
        return this.c;
    }

    public C6841hd2 e() {
        return this.d;
    }
}
