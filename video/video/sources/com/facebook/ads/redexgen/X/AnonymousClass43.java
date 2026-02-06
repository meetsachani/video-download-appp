package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.43  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass43 {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"rt6CjKtQUOFxarnmkWqgGWje", "3nuh3b0J3kR9pkmWbi6mdwRc069ydG03", "vgqSEb59pwcvKw9WdixQFoz3Va18KFsr", "h35Isj3aZViVWltuKEoucz22tQqncTnx", "yJGJRoZVng69n9xQNPvqaXzNAukE8cwJ", "ZigbL863Rtw4tWoi2mLflUon", "c977rkHkuANnZfYHmbWrwArrI1mgRqhG", "I5ankwGA25juUPMFKSRh1H9yjdqc0trO"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{107, 92, 71, 77, 69, 76, 124, 93, 64, 69, C3307Iz.d0, C8077mf.m, 3, 6, C8077mf.q, C8077mf.p, 74, C8077mf.H, 5, 74, 3, 4, 28, 5, 1, C8077mf.q, 74, 13, C8077mf.q, C8077mf.H, 35, 40, 3, 4, C8077mf.p, C8077mf.q, C8077mf.B, 74, 28, 3, C8077mf.m, 74, C8077mf.B, C8077mf.q, C8077mf.n, 6, C8077mf.q, 9, C8077mf.H, 3, 5, 4, 99, 68, 76, 73, 64, 65, 5, 81, 74, 5, 87, 64, 81, 87, 76, 64, 83, 64, 5, 66, 64, 81, 108, 103, 76, 75, 65, 64, 87, 5, 72, 64, 81, 77, 74, 65, QC1.w, 122, 107, 86, 93, 118, 113, 123, 122, 109};
    }

    static {
        A03();
    }

    public static IBinder A00(Bundle bundle, String str) {
        if (C5C.A02 >= 18) {
            return bundle.getBinder(str);
        }
        IBinder A012 = A01(bundle, str);
        if (A02[7].charAt(19) != 'S') {
            A02[7] = "R1pRDUJQUvAtWdszhYbqbgNcOgXvgcSI";
            return A012;
        }
        throw new RuntimeException();
    }

    public static IBinder A01(Bundle bundle, String str) {
        Method method = A00;
        String A022 = A02(0, 10, 89);
        if (method == null) {
            try {
                Method getIBinder = Bundle.class.getMethod(A02(88, 10, 111), String.class);
                A00 = getIBinder;
                Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (NoSuchMethodException e) {
                AbstractC04624g.A09(A022, A02(52, 36, 85), e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            AbstractC04624g.A09(A022, A02(10, 42, 26), e2);
            return null;
        }
    }
}
