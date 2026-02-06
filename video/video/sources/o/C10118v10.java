package o;

import android.util.SparseArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import o.C10833xx0;
import o.Yu2;

@Deprecated
/* renamed from: o.v10  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10118v10 implements Yu2.c {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    public static final int i = 64;
    public static final int j = 134;
    public final int a;
    public final List<C10833xx0> b;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.v10$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C10118v10() {
        this(0);
    }

    @Override // o.Yu2.c
    public SparseArray<Yu2> a() {
        return new SparseArray<>();
    }

    @Override // o.Yu2.c
    @InterfaceC11300zs1
    public Yu2 b(int i2, Yu2.b bVar) {
        if (i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 27) {
                        if (i2 != 36) {
                            if (i2 != 89) {
                                if (i2 != 138) {
                                    if (i2 != 172) {
                                        if (i2 != 257) {
                                            if (i2 != 134) {
                                                if (i2 != 135) {
                                                    switch (i2) {
                                                        case 15:
                                                            if (f(2)) {
                                                                return null;
                                                            }
                                                            return new PC1(new M7(false, bVar.b));
                                                        case 16:
                                                            return new PC1(new FF0(d(bVar)));
                                                        case 17:
                                                            if (f(2)) {
                                                                return null;
                                                            }
                                                            return new PC1(new C9517sY0(bVar.b));
                                                        default:
                                                            switch (i2) {
                                                                case 128:
                                                                    break;
                                                                case 129:
                                                                    break;
                                                                case 130:
                                                                    if (!f(64)) {
                                                                        return null;
                                                                    }
                                                                    break;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                                }
                                                return new PC1(new H3(bVar.b));
                                            } else if (f(16)) {
                                                return null;
                                            } else {
                                                return new IZ1(new C4671Wy1(C4128Rj1.H0));
                                            }
                                        }
                                        return new IZ1(new C4671Wy1(C4128Rj1.N0));
                                    }
                                    return new PC1(new L3(bVar.b));
                                }
                                return new PC1(new N70(bVar.b));
                            }
                            return new PC1(new C10635x80(bVar.c));
                        }
                        return new PC1(new HF0(c(bVar)));
                    } else if (f(4)) {
                        return null;
                    } else {
                        return new PC1(new GF0(c(bVar), f(1), f(8)));
                    }
                }
                return new PC1(new NL0());
            }
            return new PC1(new C2964Fl1(bVar.b));
        }
        return new PC1(new EF0(d(bVar)));
    }

    public final WZ1 c(Yu2.b bVar) {
        return new WZ1(e(bVar));
    }

    public final C9196rD2 d(Yu2.b bVar) {
        return new C9196rD2(e(bVar));
    }

    public final List<C10833xx0> e(Yu2.b bVar) {
        boolean z;
        String str;
        int i2;
        List<byte[]> list;
        if (f(32)) {
            return this.b;
        }
        C3012Fy1 c3012Fy1 = new C3012Fy1(bVar.d);
        List<C10833xx0> list2 = this.b;
        while (c3012Fy1.a() > 0) {
            int L = c3012Fy1.L();
            int f2 = c3012Fy1.f() + c3012Fy1.L();
            if (L == 134) {
                list2 = new ArrayList<>();
                int L2 = c3012Fy1.L() & 31;
                for (int i3 = 0; i3 < L2; i3++) {
                    String I = c3012Fy1.I(3);
                    int L3 = c3012Fy1.L();
                    boolean z2 = true;
                    if ((L3 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2 = L3 & 63;
                        str = C4128Rj1.y0;
                    } else {
                        str = C4128Rj1.x0;
                        i2 = 1;
                    }
                    byte L4 = (byte) c3012Fy1.L();
                    c3012Fy1.Z(1);
                    if (z) {
                        if ((L4 & 64) == 0) {
                            z2 = false;
                        }
                        list = JE.b(z2);
                    } else {
                        list = null;
                    }
                    list2.add(new C10833xx0.b().g0(str).X(I).H(i2).V(list).G());
                }
            }
            c3012Fy1.Y(f2);
        }
        return list2;
    }

    public final boolean f(int i2) {
        if ((i2 & this.a) != 0) {
            return true;
        }
        return false;
    }

    public C10118v10(int i2) {
        this(i2, AbstractC5317bO0.L());
    }

    public C10118v10(int i2, List<C10833xx0> list) {
        this.a = i2;
        this.b = list;
    }
}
