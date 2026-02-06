package com.facebook.ads.redexgen.X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public class XZ implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ T8 A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, C3307Iz.V, 42, C4715Xk.i, C3307Iz.Y, C3307Iz.d0, C3307Iz.c0, C3307Iz.a0, 56, 31, 60, 32, C3307Iz.X, 56, 2, C3307Iz.e0, C3307Iz.V, C3307Iz.a0, C3307Iz.c0, C3307Iz.a0, 56, C8077mf.B, 53, 60, C3307Iz.a0, 73, 75, 90, QC1.w, 79, 66, 91, 75, C8077mf.G, 28, 49, C8077mf.D, C8077mf.A, 17, C8077mf.C, 1, 7, 31, 1, 32, C8077mf.A, 19, C8077mf.z, C8077mf.m};
    }

    public XZ(int i, LinkedBlockingQueue linkedBlockingQueue, T8 t8) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = t8;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c : (List) objArr[0]) {
                    String str = (String) c.getClass().getMethod(A00(7, 12, 120), new Class[0]).invoke(c, new Object[0]);
                    int intValue = ((Integer) c.getClass().getMethod(A00(19, 7, 120), new Class[0]).invoke(c, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t) {
            this.A01.A08().ABC(A00(0, 7, 123), AbstractC1085Td.A1G, new C1086Te(t));
        }
        return null;
    }
}
