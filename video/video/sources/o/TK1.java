package o;

/* loaded from: classes3.dex */
public final class TK1 {
    public static final int f = 8;
    public EnumC6625gk1 a;
    public EnumC8074me0 b;
    public WE2 c;
    public int d = -1;
    public C5672cs e;

    public static boolean f(int i) {
        if (i >= 0 && i < 8) {
            return true;
        }
        return false;
    }

    public EnumC8074me0 a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public C5672cs c() {
        return this.e;
    }

    public EnumC6625gk1 d() {
        return this.a;
    }

    public WE2 e() {
        return this.c;
    }

    public void g(EnumC8074me0 enumC8074me0) {
        this.b = enumC8074me0;
    }

    public void h(int i) {
        this.d = i;
    }

    public void i(C5672cs c5672cs) {
        this.e = c5672cs;
    }

    public void j(EnumC6625gk1 enumC6625gk1) {
        this.a = enumC6625gk1;
    }

    public void k(WE2 we2) {
        this.c = we2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
