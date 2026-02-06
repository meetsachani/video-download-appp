package o;

import java.util.Iterator;

/* renamed from: o.Gs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3088Gs extends C2685Cs implements Iterable<C2881Es> {

    /* renamed from: o.Gs$a */
    /* loaded from: classes.dex */
    public static class a implements Iterator<C2881Es> {
        public C3088Gs X;
        public int Y = 0;

        public a(C3088Gs c3088Gs) {
            this.X = c3088Gs;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public C2881Es next() {
            C2881Es c2881Es = (C2881Es) this.X.c1.get(this.Y);
            this.Y++;
            return c2881Es;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X.size()) {
                return true;
            }
            return false;
        }
    }

    public C3088Gs(char[] cArr) {
        super(cArr);
    }

    public static C3088Gs L0(char[] cArr) {
        return new C3088Gs(cArr);
    }

    @Override // o.C2783Ds
    public String M(int i, int i2) {
        StringBuilder sb = new StringBuilder(i());
        sb.append("{\n");
        Iterator<C2783Ds> it = this.c1.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C2783Ds next = it.next();
            if (!z) {
                sb.append(",\n");
            } else {
                z = false;
            }
            sb.append(next.M(C2783Ds.b1 + i, i2 - 1));
        }
        sb.append("\n");
        d(sb, i);
        sb.append("}");
        return sb.toString();
    }

    @Override // o.C2685Cs, o.C2783Ds
    /* renamed from: N0 */
    public C3088Gs e() {
        return (C3088Gs) super.e();
    }

    public String O0() {
        return M(0, 0);
    }

    @Override // o.C2783Ds
    public String Q() {
        StringBuilder sb = new StringBuilder(i() + "{ ");
        Iterator<C2783Ds> it = this.c1.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C2783Ds next = it.next();
            if (!z) {
                sb.append(C6566gU0.h);
            } else {
                z = false;
            }
            sb.append(next.Q());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<C2881Es> iterator() {
        return new a(this);
    }
}
