package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class EK2 implements InterfaceC4020Qg2 {
    public final List<C10685xK2> X;
    public final long[] Y;
    public final long[] Z;

    public EK2(List<C10685xK2> list) {
        this.X = Collections.unmodifiableList(new ArrayList(list));
        this.Y = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            C10685xK2 c10685xK2 = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.Y;
            jArr[i2] = c10685xK2.b;
            jArr[i2 + 1] = c10685xK2.c;
        }
        long[] jArr2 = this.Y;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.Z = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // o.InterfaceC4020Qg2
    public int e(long j) {
        int j2 = TD2.j(this.Z, j, false, false);
        if (j2 < this.Z.length) {
            return j2;
        }
        return -1;
    }

    @Override // o.InterfaceC4020Qg2
    public List<C7284jS> g(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.X.size(); i++) {
            long[] jArr = this.Y;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C10685xK2 c10685xK2 = this.X.get(i);
                C7284jS c7284jS = c10685xK2.a;
                if (c7284jS.Z0 == -3.4028235E38f) {
                    arrayList2.add(c10685xK2);
                } else {
                    arrayList.add(c7284jS);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: o.DK2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((C10685xK2) obj).b, ((C10685xK2) obj2).b);
                return compare;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C10685xK2) arrayList2.get(i3)).a.b().t((-1) - i3, 1).a());
        }
        return arrayList;
    }

    @Override // o.InterfaceC4020Qg2
    public long h(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (i < this.Z.length) {
            z2 = true;
        }
        C9542sf.a(z2);
        return this.Z[i];
    }

    @Override // o.InterfaceC4020Qg2
    public int i() {
        return this.Z.length;
    }
}
