package com.facebook.ads.redexgen.X;

import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.common.math.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.gS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1657gS {
    public static byte[] A00;
    public static String[] A01 = {"AE3RQ6SjoFsrAp99H6Zd4spKw", "3Pq1cGGFUNEEXAchrVP3Xf", "yX", "SQjo6b3iOf0URtZXiBRUVHbWf8EnkAui", ChipTextInputComboView.b.Y, "u726MkM70Dw3XEWQiRy0H2gvugSd8Tre", "3sVZHBX6ZyruD1ikbvJFjqJz5AcrXt3h", "iwn02HMEBncjK0hVIYdCKaY5g2oqtZ"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A01[7].length() == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "H9pmIUr4yhuwQEnoSmBFmn";
            strArr[0] = "tMM9GmlwKAk4hf8HM9GRHGRZ0";
            copyOfRange[i4] = (byte) ((b - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C3307Iz.e0, 47, 36, C3307Iz.X, -32, 55, C3307Iz.V, 51, -32, C8077mf.y, C8077mf.p, C8077mf.p, 5, 3, 5, 19, 19, 1, C8077mf.u, C8077mf.C, -20, -32, 34, 53, 52, -32, 50, 47, 53, C3307Iz.f0, 36, C3307Iz.a0, C3307Iz.f0, C3307Iz.Z, -32, 55, C3307Iz.V, 51, -32, C3307Iz.f0, C3307Iz.X, 35, C3307Iz.X, 51, 51, C3307Iz.V, 50, 57};
    }

    static {
        A01();
    }

    public static void A02(boolean condition) {
        if (condition) {
            return;
        }
        throw new ArithmeticException(A00(0, 48, 92));
    }
}
