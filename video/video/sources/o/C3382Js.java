package o;

/* renamed from: o.Js  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3382Js extends C2783Ds {
    public C3382Js(char[] cArr) {
        super(cArr);
    }

    public static C2783Ds U(char[] cArr) {
        return new C3382Js(cArr);
    }

    public static C3382Js V(String str) {
        C3382Js c3382Js = new C3382Js(str.toCharArray());
        c3382Js.L(0L);
        c3382Js.J(str.length() - 1);
        return c3382Js;
    }

    @Override // o.C2783Ds
    public String M(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        d(sb, i);
        sb.append("'");
        sb.append(f());
        sb.append("'");
        return sb.toString();
    }

    @Override // o.C2783Ds
    public String Q() {
        return "'" + f() + "'";
    }

    @Override // o.C2783Ds
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3382Js) && f().equals(((C3382Js) obj).f())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // o.C2783Ds
    public int hashCode() {
        return super.hashCode();
    }
}
