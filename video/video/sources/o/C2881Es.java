package o;

import java.util.ArrayList;
import java.util.Objects;
import o.InterfaceC8148mw2;

/* renamed from: o.Es  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2881Es extends C2685Cs {
    public static ArrayList<String> d1;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d1 = arrayList;
        arrayList.add("ConstraintSets");
        d1.add("Variables");
        d1.add("Generate");
        d1.add(InterfaceC8148mw2.h.a);
        d1.add(C10243vX0.f);
        d1.add("KeyAttributes");
        d1.add("KeyPositions");
        d1.add("KeyCycles");
    }

    public C2881Es(char[] cArr) {
        super(cArr);
    }

    public static C2783Ds L0(String str, C2783Ds c2783Ds) {
        C2881Es c2881Es = new C2881Es(str.toCharArray());
        c2881Es.L(0L);
        c2881Es.J(str.length() - 1);
        c2881Es.P0(c2783Ds);
        return c2881Es;
    }

    public static C2783Ds V(char[] cArr) {
        return new C2881Es(cArr);
    }

    @Override // o.C2783Ds
    public String M(int i, int i2) {
        StringBuilder sb = new StringBuilder(i());
        d(sb, i);
        String f = f();
        if (this.c1.size() > 0) {
            sb.append(f);
            sb.append(": ");
            if (d1.contains(f)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(this.c1.get(0).M(i, i2 - 1));
            } else {
                String Q = this.c1.get(0).Q();
                if (Q.length() + i < C2783Ds.a1) {
                    sb.append(Q);
                } else {
                    sb.append(this.c1.get(0).M(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        return f + ": <> ";
    }

    public String N0() {
        return f();
    }

    public C2783Ds O0() {
        if (this.c1.size() > 0) {
            return this.c1.get(0);
        }
        return null;
    }

    public void P0(C2783Ds c2783Ds) {
        if (this.c1.size() > 0) {
            this.c1.set(0, c2783Ds);
        } else {
            this.c1.add(c2783Ds);
        }
    }

    @Override // o.C2783Ds
    public String Q() {
        if (this.c1.size() > 0) {
            return i() + f() + ": " + this.c1.get(0).Q();
        }
        return i() + f() + ": <> ";
    }

    @Override // o.C2685Cs, o.C2783Ds
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2881Es) && !Objects.equals(N0(), ((C2881Es) obj).N0())) {
            return false;
        }
        return super.equals(obj);
    }

    @Override // o.C2685Cs, o.C2783Ds
    public int hashCode() {
        return super.hashCode();
    }
}
