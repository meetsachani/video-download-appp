package o;

import java.util.ArrayList;
import java.util.Collections;
import o.C7284jS;

@Deprecated
/* renamed from: o.Dl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2757Dl1 extends AbstractC5012a82 {
    public static final int p = 8;
    public static final int q = 1885436268;
    public static final int r = 1937011815;
    public static final int s = 1987343459;

    /* renamed from: o  reason: collision with root package name */
    public final C3012Fy1 f443o;

    public C2757Dl1() {
        super("Mp4WebvttDecoder");
        this.f443o = new C3012Fy1();
    }

    public static C7284jS C(C3012Fy1 c3012Fy1, int i) throws C4217Sg2 {
        CharSequence charSequence = null;
        C7284jS.c cVar = null;
        while (i > 0) {
            if (i >= 8) {
                int s2 = c3012Fy1.s();
                int s3 = c3012Fy1.s();
                int i2 = s2 - 8;
                String O = TD2.O(c3012Fy1.e(), c3012Fy1.f(), i2);
                c3012Fy1.Z(i2);
                i = (i - 8) - i2;
                if (s3 == 1937011815) {
                    cVar = C10928yK2.o(O);
                } else if (s3 == 1885436268) {
                    charSequence = C10928yK2.q(null, O.trim(), Collections.EMPTY_LIST);
                }
            } else {
                throw new C4217Sg2("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (cVar != null) {
            return cVar.A(charSequence).a();
        }
        return C10928yK2.l(charSequence);
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z) throws C4217Sg2 {
        this.f443o.W(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f443o.a() > 0) {
            if (this.f443o.a() >= 8) {
                int s2 = this.f443o.s();
                if (this.f443o.s() == 1987343459) {
                    arrayList.add(C(this.f443o, s2 - 8));
                } else {
                    this.f443o.Z(s2 - 8);
                }
            } else {
                throw new C4217Sg2("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C2855El1(arrayList);
    }
}
