package o;

import o.C8901q20;

/* renamed from: o.v30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10126v30 extends C8901q20 {
    public int m;

    public C10126v30(WK2 wk2) {
        super(wk2);
        if (wk2 instanceof C7731lI0) {
            this.e = C8901q20.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = C8901q20.a.VERTICAL_DIMENSION;
        }
    }

    @Override // o.C8901q20
    public void e(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            for (InterfaceC7910m20 interfaceC7910m20 : this.k) {
                interfaceC7910m20.a(interfaceC7910m20);
            }
        }
    }
}
