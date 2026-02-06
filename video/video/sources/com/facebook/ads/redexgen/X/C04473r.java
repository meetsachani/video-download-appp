package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.3r  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04473r extends E2 {
    public static byte[] A01;
    public final /* synthetic */ C04463q A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.p7, -43, -60, C2638Cg0.v7, C2638Cg0.A7};
    }

    public C04473r(C04463q c04463q) {
        this.A00 = c04463q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.get() == null) goto L8;
     */
    @Override // com.facebook.ads.redexgen.X.UN
    /* renamed from: A02 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(E3 e3) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        weakReference = this.A00.A00;
        if (weakReference != null) {
            weakReference3 = this.A00.A00;
        }
        this.A00.A00 = new WeakReference(new C1573f6(this));
        weakReference2 = this.A00.A00;
        ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71))).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) weakReference2.get(), 3, 1);
    }
}
