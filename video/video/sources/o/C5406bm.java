package o;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: o.bm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5406bm implements InterfaceC11045yp1 {
    public static final int d = 4096;
    @Deprecated
    public final EI0 a;
    public final AbstractC7112il b;
    public final C3084Gr c;

    @Deprecated
    public C5406bm(EI0 ei0) {
        this(ei0, new C3084Gr(4096));
    }

    @Deprecated
    public static Map<String, String> b(MG0[] mg0Arr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < mg0Arr.length; i++) {
            treeMap.put(mg0Arr[i].a(), mg0Arr[i].b());
        }
        return treeMap;
    }

    @Override // o.InterfaceC11045yp1
    public C3470Kp1 a(AbstractC5091aS1<?> abstractC5091aS1) throws C6524gJ2 {
        IOException iOException;
        CI0 ci0;
        byte[] bArr;
        AbstractC5091aS1<?> abstractC5091aS12;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                CI0 b = this.b.b(abstractC5091aS1, C11161zI0.c(abstractC5091aS1.r()));
                try {
                    int e = b.e();
                    List<MG0> d2 = b.d();
                    if (e == 304) {
                        return C4640Wp1.b(abstractC5091aS1, SystemClock.elapsedRealtime() - elapsedRealtime, d2);
                    }
                    InputStream a = b.a();
                    if (a != null) {
                        bArr2 = C4640Wp1.c(a, b.c(), this.c);
                    } else {
                        bArr2 = new byte[0];
                    }
                    byte[] bArr3 = bArr2;
                    try {
                        C4640Wp1.d(SystemClock.elapsedRealtime() - elapsedRealtime, abstractC5091aS1, bArr3, e);
                        if (e >= 200 && e <= 299) {
                            return new C3470Kp1(e, bArr3, false, SystemClock.elapsedRealtime() - elapsedRealtime, d2);
                        }
                        throw new IOException();
                    } catch (IOException e2) {
                        e = e2;
                        abstractC5091aS12 = abstractC5091aS1;
                        ci0 = b;
                        bArr = bArr3;
                        iOException = e;
                        C4640Wp1.a(abstractC5091aS12, C4640Wp1.e(abstractC5091aS12, iOException, elapsedRealtime, ci0, bArr));
                        abstractC5091aS1 = abstractC5091aS12;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                    ci0 = b;
                    abstractC5091aS12 = abstractC5091aS1;
                }
            } catch (IOException e4) {
                iOException = e4;
                ci0 = null;
                bArr = null;
                abstractC5091aS12 = abstractC5091aS1;
            }
            C4640Wp1.a(abstractC5091aS12, C4640Wp1.e(abstractC5091aS12, iOException, elapsedRealtime, ci0, bArr));
            abstractC5091aS1 = abstractC5091aS12;
        }
    }

    @Deprecated
    public C5406bm(EI0 ei0, C3084Gr c3084Gr) {
        this.a = ei0;
        this.b = new C8677p7(ei0);
        this.c = c3084Gr;
    }

    public C5406bm(AbstractC7112il abstractC7112il) {
        this(abstractC7112il, new C3084Gr(4096));
    }

    public C5406bm(AbstractC7112il abstractC7112il, C3084Gr c3084Gr) {
        this.b = abstractC7112il;
        this.a = abstractC7112il;
        this.c = c3084Gr;
    }
}
