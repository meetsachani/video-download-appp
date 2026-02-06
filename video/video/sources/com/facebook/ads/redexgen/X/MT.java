package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.util.Arrays;
import o.C3307Iz;

/* loaded from: assets/audience_network/classes2.dex */
public final class MT implements InterfaceC1215Yi {
    public static byte[] A02;
    public static String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final C1035Re A00;
    public final C1673gi A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{C3307Iz.f0, C3307Iz.a0, 51, 56, 53, 49, 56, C3307Iz.Y, 55, 55, 56, 40, 53, C3307Iz.f0, 34, C3307Iz.a0, 51, C3307Iz.Y, 51, C3307Iz.f0, 40, C3307Iz.a0, 56, C3307Iz.d0, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public MT(C1673gi c1673gi, C1035Re c1035Re) {
        this.A01 = c1673gi;
        this.A00 = c1035Re;
    }

    private final void A02() {
        T5 A0G = this.A01.A0G();
        if (A0G != null) {
            com.facebook.ads.Ad A6k = A0G.A6k();
            String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (A6k != null && A0G.A6o() != null) {
                A0G.A6o().onError(A6k, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AAu(Intent intent, Bundle bundle, C1035Re c1035Re) {
        ComponentName component = new ComponentName(AbstractC1126Us.A05(AbstractC1126Us.A02.get()), A00(39, 61, 63));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String A00 = A00(26, 13, 4);
        intent2.putExtra(A00, intent.getStringExtra(A00));
        String A002 = A00(0, 26, 126);
        intent2.putExtra(A002, intent.getIntExtra(A002, -1));
        try {
            this.A01.A0F().AID();
            C1177Wu.A09(c1035Re.A05(), intent2);
        } catch (C1175Ws unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFA(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFi(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        this.A01.A0F().AHp();
        if (i2 != -1) {
            this.A01.A0F().AHo(i2);
            A02();
            return false;
        }
        C1035Re c1035Re = this.A00;
        String[] strArr = A03;
        if (strArr[6].length() != strArr[7].length()) {
            String[] strArr2 = A03;
            strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
            strArr2[7] = "fqqSdoB1RgIi";
            c1035Re.A05().finish();
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void onDestroy() {
    }
}
