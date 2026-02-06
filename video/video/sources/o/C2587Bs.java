package o;

import java.util.Iterator;

/* renamed from: o.Bs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2587Bs extends C2685Cs {
    public C2587Bs(char[] cArr) {
        super(cArr);
    }

    public static C2783Ds V(char[] cArr) {
        return new C2587Bs(cArr);
    }

    @Override // o.C2783Ds
    public String M(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String Q = Q();
        if (i2 <= 0 && Q.length() + i < C2783Ds.a1) {
            sb.append(Q);
        } else {
            sb.append("[\n");
            Iterator<C2783Ds> it = this.c1.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C2783Ds next = it.next();
                if (!z) {
                    sb.append(",\n");
                } else {
                    z = false;
                }
                d(sb, C2783Ds.b1 + i);
                sb.append(next.M(C2783Ds.b1 + i, i2 - 1));
            }
            sb.append("\n");
            d(sb, i);
            sb.append(C6566gU0.g);
        }
        return sb.toString();
    }

    @Override // o.C2783Ds
    public String Q() {
        StringBuilder sb = new StringBuilder(i() + C6566gU0.f);
        boolean z = true;
        for (int i = 0; i < this.c1.size(); i++) {
            if (!z) {
                sb.append(C6566gU0.h);
            } else {
                z = false;
            }
            sb.append(this.c1.get(i).Q());
        }
        return ((Object) sb) + C6566gU0.g;
    }
}
