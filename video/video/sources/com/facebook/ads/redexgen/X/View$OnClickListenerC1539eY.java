package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.eY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1539eY implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"6oymiTsLeOB6akVZhYZlzt9u0lzod266", "zcFrhgW", "pA0IIkGKiekAr0fjB", "y6hjg8mxqAalWUMcxQuHYQOItnPT39hG", "7U0TsM6", "Tg7m67O8vHVp5z623KOmUlfZNUrkO0e2", "eZwTRoaquQnWH3ejc5rSlBlQZkiVI59b", "AT7ca5j6uH8ZMFY8gdhWcohA"};
    public final /* synthetic */ FO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 52);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "b4q8hXeVYJWgCCKNMDRDzuby";
            strArr2[1] = "dEe326h";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.z, 31, C8077mf.y, C8077mf.x, C8077mf.u, 35, C8077mf.y, 36};
    }

    static {
        A01();
    }

    public View$OnClickListenerC1539eY(FO fo) {
        this.A00 = fo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr;
        View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            view$OnClickListenerC0871Kr = this.A00.A06;
            if (view$OnClickListenerC0871Kr != null) {
                view$OnClickListenerC0871Kr2 = this.A00.A06;
                view$OnClickListenerC0871Kr2.A0E(A00(0, 8, 125));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[6] = "NoOvb1ER3rIaV6vkspGGWoVzXAP3qQ3Z";
        }
    }
}
