package o;

/* renamed from: o.Hs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3186Hs {
    public static boolean d = false;
    public String a;
    public boolean b = false;
    public int c;

    /* renamed from: o.Hs$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public C3186Hs(String str) {
        this.a = str;
    }

    public static C3088Gs d(String str) throws C3284Is {
        return new C3186Hs(str).c();
    }

    public final C2783Ds a(C2783Ds c2783Ds, int i, a aVar, boolean z, char[] cArr) {
        C2783Ds L0;
        if (d) {
            System.out.println("CREATE " + aVar + " at " + cArr[i]);
        }
        switch (aVar.ordinal()) {
            case 1:
                L0 = C3088Gs.L0(cArr);
                i++;
                break;
            case 2:
                L0 = C2587Bs.V(cArr);
                i++;
                break;
            case 3:
                L0 = C2990Fs.U(cArr);
                break;
            case 4:
                L0 = C3382Js.U(cArr);
                break;
            case 5:
                L0 = C2881Es.V(cArr);
                break;
            case 6:
                L0 = C3480Ks.U(cArr);
                break;
            default:
                L0 = null;
                break;
        }
        if (L0 == null) {
            return null;
        }
        L0.K(this.c);
        if (z) {
            L0.L(i);
        }
        if (c2783Ds instanceof C2685Cs) {
            L0.H((C2685Cs) c2783Ds);
        }
        return L0;
    }

    public final C2783Ds b(int i, char c, C2783Ds c2783Ds, char[] cArr) throws C3284Is {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c != '\"' && c != '\'') {
                if (c != '[') {
                    if (c != ']') {
                        if (c != '{') {
                            if (c != '}') {
                                switch (c) {
                                    case '+':
                                    case '-':
                                    case '.':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        return a(c2783Ds, i, a.NUMBER, true, cArr);
                                    case ',':
                                    case ':':
                                        break;
                                    case '/':
                                        int i2 = i + 1;
                                        if (i2 >= cArr.length || cArr[i2] != '/') {
                                            return c2783Ds;
                                        }
                                        this.b = true;
                                        return c2783Ds;
                                    default:
                                        if ((c2783Ds instanceof C2685Cs) && !(c2783Ds instanceof C3088Gs)) {
                                            C2783Ds a2 = a(c2783Ds, i, a.TOKEN, true, cArr);
                                            C3480Ks c3480Ks = (C3480Ks) a2;
                                            if (c3480Ks.b0(c, i)) {
                                                return a2;
                                            }
                                            throw new C3284Is("incorrect token <" + c + "> at line " + this.c, c3480Ks);
                                        }
                                        return a(c2783Ds, i, a.KEY, true, cArr);
                                }
                            }
                        } else {
                            return a(c2783Ds, i, a.OBJECT, true, cArr);
                        }
                    }
                    c2783Ds.J(i - 1);
                    C2783Ds h = c2783Ds.h();
                    h.J(i);
                    return h;
                }
                return a(c2783Ds, i, a.ARRAY, true, cArr);
            } else if (c2783Ds instanceof C3088Gs) {
                return a(c2783Ds, i, a.KEY, true, cArr);
            } else {
                return a(c2783Ds, i, a.STRING, true, cArr);
            }
        }
        return c2783Ds;
    }

    public C3088Gs c() throws C3284Is {
        int i;
        char[] charArray = this.a.toCharArray();
        int length = charArray.length;
        int i2 = 1;
        this.c = 1;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                char c = charArray[i3];
                if (c == '{') {
                    break;
                }
                if (c == '\n') {
                    this.c++;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            C3088Gs L0 = C3088Gs.L0(charArray);
            L0.K(this.c);
            L0.L(i3);
            int i4 = i3 + 1;
            C3088Gs c3088Gs = L0;
            while (i4 < length) {
                char c2 = charArray[i4];
                if (c2 == '\n') {
                    this.c += i2;
                }
                if (this.b) {
                    if (c2 == '\n') {
                        this.b = z;
                    } else {
                        i = i2;
                        i4++;
                        i2 = i;
                        z = false;
                    }
                }
                if (c3088Gs == null) {
                    break;
                }
                if (c3088Gs.D()) {
                    c3088Gs = b(i4, c2, c3088Gs, charArray);
                } else if (c3088Gs instanceof C3088Gs) {
                    if (c2 == '}') {
                        c3088Gs.J(i4 - 1);
                    } else {
                        c3088Gs = b(i4, c2, c3088Gs, charArray);
                    }
                } else if (c3088Gs instanceof C2587Bs) {
                    if (c2 == ']') {
                        c3088Gs.J(i4 - 1);
                    } else {
                        c3088Gs = b(i4, c2, c3088Gs, charArray);
                    }
                } else {
                    boolean z2 = c3088Gs instanceof C3382Js;
                    if (z2) {
                        long j = c3088Gs.Y;
                        if (charArray[(int) j] == c2) {
                            c3088Gs.L(j + 1);
                            c3088Gs.J(i4 - 1);
                        }
                    } else {
                        if (c3088Gs instanceof C3480Ks) {
                            C3480Ks c3480Ks = (C3480Ks) c3088Gs;
                            i = i2;
                            if (!c3480Ks.b0(c2, i4)) {
                                throw new C3284Is("parsing incorrect token " + c3480Ks.f() + " at line " + this.c, c3480Ks);
                            }
                        } else {
                            i = i2;
                        }
                        if ((c3088Gs instanceof C2881Es) || z2) {
                            long j2 = c3088Gs.Y;
                            char c3 = charArray[(int) j2];
                            if ((c3 == '\'' || c3 == '\"') && c3 == c2) {
                                c3088Gs.L(j2 + 1);
                                c3088Gs.J(i4 - 1);
                            }
                        }
                        if (!c3088Gs.D() && (c2 == '}' || c2 == ']' || c2 == ',' || c2 == ' ' || c2 == '\t' || c2 == '\r' || c2 == '\n' || c2 == ':')) {
                            long j3 = i4 - 1;
                            c3088Gs.J(j3);
                            if (c2 == '}' || c2 == ']') {
                                c3088Gs = c3088Gs.h();
                                c3088Gs.J(j3);
                                if (c3088Gs instanceof C2881Es) {
                                    c3088Gs = c3088Gs.h();
                                    c3088Gs.J(j3);
                                }
                            }
                        }
                        if (c3088Gs.D() && (!(c3088Gs instanceof C2881Es) || ((C2881Es) c3088Gs).c1.size() > 0)) {
                            c3088Gs = c3088Gs.h();
                        }
                        i4++;
                        i2 = i;
                        z = false;
                    }
                }
                i = i2;
                if (c3088Gs.D()) {
                    c3088Gs = c3088Gs.h();
                }
                i4++;
                i2 = i;
                z = false;
            }
            while (c3088Gs != null && !c3088Gs.D()) {
                if (c3088Gs instanceof C3382Js) {
                    c3088Gs.L(((int) c3088Gs.Y) + 1);
                }
                c3088Gs.J(length - 1);
                c3088Gs = c3088Gs.h();
            }
            if (d) {
                System.out.println("Root: " + L0.Q());
            }
            return L0;
        }
        throw new C3284Is("invalid json content", null);
    }
}
