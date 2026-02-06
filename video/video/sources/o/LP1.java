package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class LP1 {
    public final LC0 a;
    public final List<MC0> b;

    public LP1(LC0 lc0) {
        this.a = lc0;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new MC0(lc0, new int[]{1}));
    }

    public final MC0 a(int i) {
        if (i >= this.b.size()) {
            List<MC0> list = this.b;
            MC0 mc0 = list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                LC0 lc0 = this.a;
                mc0 = mc0.i(new MC0(lc0, new int[]{1, lc0.c((size - 1) + lc0.d())}));
                this.b.add(mc0);
            }
        }
        return this.b.get(i);
    }

    public void b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                MC0 a = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new MC0(this.a, iArr2).j(i, 1).b(a)[1].e();
                int length2 = i - e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e, 0, iArr, length + length2, e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
