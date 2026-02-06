package o;

import java.util.List;

@Deprecated
/* renamed from: o.u80  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9903u80 extends AbstractC5012a82 {

    /* renamed from: o  reason: collision with root package name */
    public final C10146v80 f881o;

    public C9903u80(List<byte[]> list) {
        super("DvbDecoder");
        C3012Fy1 c3012Fy1 = new C3012Fy1(list.get(0));
        this.f881o = new C10146v80(c3012Fy1.R(), c3012Fy1.R());
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f881o.r();
        }
        return new C10392w80(this.f881o.b(bArr, i));
    }
}
