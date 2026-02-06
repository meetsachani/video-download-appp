package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C10997yd1;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Pp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0996Pp implements YT {
    public static byte[] A04;
    public C1669ge A00;
    public C1104Tw A01;
    public InterfaceC1624fv A02;
    public final Executor A03;

    static {
        A06();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{98, 103, 103, 97, 100, 105, 97, 99, 102, 98, 99, 96, 103, 97, 98, 92, 87, 89, 94, 93, 91, 90, 92, 94, 86, 86, 91, 90, 93, 90, 95, 80, 90, 80, 92, 90, 80, 93, 89, 80, 80, 94, 80, 89, 88, C8077mf.y, 80, C8077mf.m, C8077mf.q, 91, 80, 8, 88, C8077mf.q, 91, 94, 93, 92, 94, 93, 95, 8, 95, 10, 95, 89, 13, 94, 89, 94, C8077mf.q, 92, C8077mf.m, 10, 91, 90, 10, 91, 94, 124, 115, 126, QC1.w, 113, 109, 65, 89, 0, 79, 84, 72, 69, 82, 83, 0, 76, 79, 71, 73, 78, 0, 65, 83, 0, 89, 79, 85, 0, 84, 79, 0, 68, 69, 66, 85, 71, 31, 0, 104, 79, 87, 0, 68, 79, 0, 89, 79, 85, 0, 82, 69, 80, 82, 79, 68, 85, 67, 69, 0, 84, 72, 69, 0, 73, 83, 83, 85, 69, 31, 53, 3, 8, 2, 70, 52, 3, C8077mf.z, 9, C8077mf.x, C8077mf.u, 62, 1, 8, C8077mf.G, 73, C3307Iz.V, 8, C8077mf.C, C8077mf.C, C8077mf.n, 7, C8077mf.n, 13, 86, C8077mf.E, C8077mf.C, C8077mf.C, 31, 9, 9, C3307Iz.X, C8077mf.p, C8077mf.y, 17, 31, C8077mf.x, C8077mf.C, C8077mf.E, C8077mf.p, 31, C8077mf.G, C8077mf.y, 8, 3, C3307Iz.X, 19, C8077mf.H, 47, 32, C3307Iz.X, C3307Iz.a0, 34, 56, 19, 56, C3307Iz.X, C3307Iz.V, C3307Iz.a0, 99, 108, 105, 101, 110, 116, 95, 116, 111, 107, 101, 110, 89, 85, 84, 92, 83, 93, 101, 83, 94, 1, 0, C8077mf.z, 6, C8077mf.A, C8077mf.n, C8077mf.y, 17, C8077mf.n, 10, C8077mf.m, 47, C3307Iz.Z, 54, 35, C3307Iz.Y, 35, 54, 35, 57, C4715Xk.i, C3307Iz.Z, 55, C8077mf.m, C4715Xk.i, 58, 50, 59, 116, 114, 100, 115, 94, 104, 101, 100, 111, 117, 104, 103, 104, 100, 115};
    }

    public C0996Pp(Executor executor, C1104Tw c1104Tw, C1673gi c1673gi) {
        this.A00 = c1673gi.A02();
        this.A02 = C1642gD.A01(this.A00);
        this.A03 = executor;
        this.A01 = c1104Tw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A02(String str) {
        C1638g9 c1638g9 = new C1638g9();
        C1638g9 c1638g92 = new C1638g9();
        C1638g9 c1638g93 = new C1638g9();
        c1638g9.put(A03(257, 15, 52), SZ.A00().A03());
        c1638g9.put(A03(220, 9, 15), A03(15, 15, 91));
        c1638g9.put(A03(C10997yd1.Q1, 11, 79), A03(0, 15, 101));
        c1638g9.put(A03(C10997yd1.y1, 12, 79), A03(30, 48, 92));
        c1638g9.put(A03(197, 11, 121), (System.currentTimeMillis() / 1000) + A03(0, 0, 108));
        String A09 = this.A01.A09();
        if (A09 != null) {
            c1638g93.put(A03(208, 12, 53), A09);
        }
        c1638g92.put(A03(229, 11, 80), str);
        c1638g92.put(A03(248, 9, 97), AbstractC1184Xd.A01(c1638g93));
        c1638g9.A04(A03(240, 8, 119), AbstractC1184Xd.A01(c1638g92));
        return c1638g9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C1104Tw c1104Tw) {
        this.A01 = c1104Tw;
    }

    @Override // com.facebook.ads.redexgen.X.YT
    public final void AFv() {
        Activity A00 = ActivityUtils.A00();
        if (A00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(A00);
        builder.setTitle(A03(160, 14, 92));
        EditText editText = new EditText(A00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 21));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 40), new YQ(this));
        builder.setPositiveButton(A03(149, 11, 83), new YR(this, editText));
        builder.create().show();
    }
}
