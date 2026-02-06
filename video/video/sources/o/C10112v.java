package o;

/* renamed from: o.v  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10112v extends AbstractC11087z {
    public static final int f = 8;
    public static final int g = 20;
    public static final int h = 16;
    public final String d;
    public final String e;

    public C10112v(C10792xn c10792xn, String str, String str2) {
        super(c10792xn);
        this.d = str2;
        this.e = str;
    }

    @Override // o.F0
    public String d() throws C9349rr1 {
        if (c().m() == 84) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            j(sb, 48, 20);
            k(sb, 68);
            return sb.toString();
        }
        throw C9349rr1.a();
    }

    @Override // o.AbstractC11087z
    public void h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.e);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // o.AbstractC11087z
    public int i(int i) {
        return i % 100000;
    }

    public final void k(StringBuilder sb, int i) {
        int f2 = b().f(i, 16);
        if (f2 == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.d);
        sb.append(')');
        int i2 = f2 % 32;
        int i3 = f2 / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb.append(C3599Ly1.j);
        }
        sb.append(i5);
        if (i4 / 10 == 0) {
            sb.append(C3599Ly1.j);
        }
        sb.append(i4);
        if (i2 / 10 == 0) {
            sb.append(C3599Ly1.j);
        }
        sb.append(i2);
    }
}
