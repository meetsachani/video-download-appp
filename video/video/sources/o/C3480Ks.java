package o;

/* renamed from: o.Ks  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3480Ks extends C2783Ds {
    public int c1;
    public a d1;
    public char[] e1;
    public char[] f1;
    public char[] g1;

    /* renamed from: o.Ks$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public C3480Ks(char[] cArr) {
        super(cArr);
        this.c1 = 0;
        this.d1 = a.UNKNOWN;
        this.e1 = "true".toCharArray();
        this.f1 = C3855Oo.a.toCharArray();
        this.g1 = "null".toCharArray();
    }

    public static C2783Ds U(char[] cArr) {
        return new C3480Ks(cArr);
    }

    @Override // o.C2783Ds
    public String M(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        d(sb, i);
        sb.append(f());
        return sb.toString();
    }

    @Override // o.C2783Ds
    public String Q() {
        if (C3186Hs.d) {
            return "<" + f() + ">";
        }
        return f();
    }

    public boolean V() throws C3284Is {
        a aVar = this.d1;
        if (aVar == a.TRUE) {
            return true;
        }
        if (aVar == a.FALSE) {
            return false;
        }
        throw new C3284Is("this token is not a boolean: <" + f() + ">", this);
    }

    public a X() {
        return this.d1;
    }

    public boolean Y() throws C3284Is {
        if (this.d1 == a.NULL) {
            return true;
        }
        throw new C3284Is("this token is not a null: <" + f() + ">", this);
    }

    public boolean b0(char c, long j) {
        int ordinal = this.d1.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        char[] cArr = this.g1;
                        int i = this.c1;
                        if (cArr[i] == c) {
                            z = true;
                        }
                        if (z && i + 1 == cArr.length) {
                            J(j);
                        }
                    }
                } else {
                    char[] cArr2 = this.f1;
                    int i2 = this.c1;
                    if (cArr2[i2] == c) {
                        z = true;
                    }
                    if (z && i2 + 1 == cArr2.length) {
                        J(j);
                    }
                }
            } else {
                char[] cArr3 = this.e1;
                int i3 = this.c1;
                if (cArr3[i3] == c) {
                    z = true;
                }
                if (z && i3 + 1 == cArr3.length) {
                    J(j);
                }
            }
        } else {
            char[] cArr4 = this.e1;
            int i4 = this.c1;
            if (cArr4[i4] == c) {
                this.d1 = a.TRUE;
            } else if (this.f1[i4] == c) {
                this.d1 = a.FALSE;
            } else if (this.g1[i4] == c) {
                this.d1 = a.NULL;
            }
            z = true;
        }
        this.c1++;
        return z;
    }
}
