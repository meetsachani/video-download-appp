package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzavf {
    public static final ConditionVariable c = new ConditionVariable();
    @InterfaceC5056aJ2
    public static volatile zzfpx d = null;
    public static volatile Random e = null;
    public final zzawo a;
    @InterfaceC5056aJ2
    public volatile Boolean b;

    public zzavf(zzawo zzawoVar) {
        this.a = zzawoVar;
        zzawoVar.j().execute(new zzave(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (e == null) {
                synchronized (zzavf.class) {
                    try {
                        if (e == null) {
                            e = new Random();
                        }
                    } finally {
                    }
                }
            }
            return e.nextInt();
        }
    }

    public final void c(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (this.b.booleanValue() && d != null) {
                zzarq s2 = zzaru.s2();
                s2.Y1(this.a.a.getPackageName());
                s2.c2(j);
                if (str != null) {
                    s2.Z1(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    s2.d2(stringWriter.toString());
                    s2.b2(exc.getClass().getName());
                }
                zzfpv a = d.a(((zzaru) s2.V1()).b1());
                a.a(i);
                if (i2 != -1) {
                    a.b(i2);
                }
                a.c();
            }
        } catch (Exception unused) {
        }
    }
}
