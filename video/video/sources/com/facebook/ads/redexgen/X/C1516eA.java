package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.eA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1516eA implements InterfaceC1166Wi {
    public static byte[] A01;
    public static String[] A02 = {"cL9KuymxmXYmG8NC9NVGcaGlfdWWeniK", "Nk16ts9BY6zqy", "EgJ1qeWjq2zhUumNQfvGHLF4hTEd3z2y", "RODoYaIjQAnjV1WNThn2vejpwKsM19Cc", "40Y1apu8pWAms0kzI1QlbJay1792dWSe", "dN3sSSJjIpaTvjnI8sFpNb6rIgDjDuKA", "fmvlDKN6b1IL1", "7gRFv5vnh1tPqRcG4sTxqyzgIBUkam47"};
    public final /* synthetic */ C1669ge A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[0] = "cTAx5t1qCw5Hmq8oguM2xeNpSThd5fgi";
        A01 = new byte[]{-47, C2638Cg0.y7, -52, 0, -17, -12, -16, -7, -18, -16, C2638Cg0.E7, -16, -1, 2, -6, -3, -10, -5, C8077mf.x, C8077mf.m, C8077mf.H, C8077mf.z, C8077mf.m, 9, C8077mf.D, C8077mf.m, 10, C2638Cg0.t7, C8077mf.m, C8077mf.B, C8077mf.B, C8077mf.y, C8077mf.B, -44, -94, -79, -96, -78, -89, -98, -78, -89, -88, -92, -85, -93};
    }

    static {
        A01();
    }

    public C1516eA(C1669ge c1669ge) {
        this.A00 = c1669ge;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1166Wi
    public final void AAx(int i, Throwable th) {
        Log.e(A00(0, 17, 81), A00(17, 17, 108), th);
        this.A00.A08().ABC(A00(34, 12, 5), i, new C1086Te(th));
    }
}
