package o;

import android.text.TextUtils;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes2.dex */
public final class AK2 extends AbstractC5012a82 {
    public static final int q = -1;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final String v = "NOTE";
    public static final String w = "STYLE";

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f411o;
    public final C10196vK2 p;

    public AK2() {
        super("WebvttDecoder");
        this.f411o = new C3012Fy1();
        this.p = new C10196vK2();
    }

    public static int C(C3012Fy1 c3012Fy1) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = c3012Fy1.f();
            String u2 = c3012Fy1.u();
            if (u2 == null) {
                i = 0;
            } else if (w.equals(u2)) {
                i = 2;
            } else if (u2.startsWith(v)) {
                i = 1;
            } else {
                i = 3;
            }
        }
        c3012Fy1.Y(i2);
        return i;
    }

    public static void D(C3012Fy1 c3012Fy1) {
        do {
        } while (!TextUtils.isEmpty(c3012Fy1.u()));
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z) throws C4217Sg2 {
        C10685xK2 n;
        this.f411o.W(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            CK2.e(this.f411o);
            do {
            } while (!TextUtils.isEmpty(this.f411o.u()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = C(this.f411o);
                if (C != 0) {
                    if (C == 1) {
                        D(this.f411o);
                    } else if (C == 2) {
                        if (arrayList2.isEmpty()) {
                            this.f411o.u();
                            arrayList.addAll(this.p.d(this.f411o));
                        } else {
                            throw new C4217Sg2("A style block was found after the first cue.");
                        }
                    } else if (C == 3 && (n = C10928yK2.n(this.f411o, arrayList)) != null) {
                        arrayList2.add(n);
                    }
                } else {
                    return new EK2(arrayList2);
                }
            }
        } catch (C3989Py1 e) {
            throw new C4217Sg2(e);
        }
    }
}
