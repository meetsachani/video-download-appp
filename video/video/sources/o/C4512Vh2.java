package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Vh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4512Vh2 {
    public final List<AbstractC4609Wh2> a = new ArrayList();

    public static void b(List<int[]> list, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 < i2) {
                    if (i3 == iArr[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    iArr[i2] = i3;
                    b(list, i, iArr, i2 + 1);
                    break;
                }
            }
        }
    }

    public boolean a(AbstractC4609Wh2 abstractC4609Wh2) {
        return this.a.add(abstractC4609Wh2);
    }

    public final List<int[]> c(int i) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<AbstractC4609Wh2> d(List<AbstractC4609Wh2> list) {
        int i;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.a.size()) {
            return null;
        }
        List<int[]> c = c(this.a.size());
        AbstractC4609Wh2[] abstractC4609Wh2Arr = new AbstractC4609Wh2[list.size()];
        Iterator<int[]> it = c.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z = true;
            while (i < this.a.size()) {
                if (next[i] < list.size()) {
                    z &= this.a.get(i).g(list.get(next[i]));
                    if (!z) {
                        break;
                    }
                    abstractC4609Wh2Arr[next[i]] = this.a.get(i);
                }
                i++;
            }
            if (z) {
                i = 1;
                break;
            }
        }
        if (i == 0) {
            return null;
        }
        return Arrays.asList(abstractC4609Wh2Arr);
    }

    public List<AbstractC4609Wh2> e() {
        return this.a;
    }

    public boolean f(AbstractC4609Wh2 abstractC4609Wh2) {
        return this.a.remove(abstractC4609Wh2);
    }
}
