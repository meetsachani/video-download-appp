package o;

import o.InterfaceC6493gC;

@Deprecated
/* renamed from: o.vl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10295vl implements InterfaceC6493gC.b {
    public static final String c = "BaseMediaChunkOutput";
    public final int[] a;
    public final GX1[] b;

    public C10295vl(int[] iArr, GX1[] gx1Arr) {
        this.a = iArr;
        this.b = gx1Arr;
    }

    public int[] a() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            GX1[] gx1Arr = this.b;
            if (i < gx1Arr.length) {
                iArr[i] = gx1Arr[i].I();
                i++;
            } else {
                return iArr;
            }
        }
    }

    @Override // o.InterfaceC6493gC.b
    public InterfaceC10568wr2 b(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.b[i3];
                }
                i3++;
            } else {
                I31.d(c, "Unmatched track of type: " + i2);
                return new W70();
            }
        }
    }

    public void c(long j) {
        for (GX1 gx1 : this.b) {
            gx1.b0(j);
        }
    }
}
