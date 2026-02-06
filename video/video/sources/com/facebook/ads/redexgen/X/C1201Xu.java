package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Xu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1201Xu implements InterfaceC1651gM {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C1669ge A00;
    public final /* synthetic */ InterfaceC1649gK A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C1201Xu(InterfaceC1649gK interfaceC1649gK, C1669ge c1669ge) {
        this.A01 = interfaceC1649gK;
        this.A00 = c1669ge;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1651gM
    public final void A4m() {
        try {
            C1123Up.A0V(this.A00).A37(this.A01.A7i().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e) {
            this.A00.A08().A4I(e);
        }
    }
}
