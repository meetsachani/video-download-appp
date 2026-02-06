package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC8616os;
import o.C11040yo0;
import o.C6842he;
import o.C9258rT0;
import o.C9740tS0;
import o.IM2;
import o.NN2;
import o.O71;
import sun.misc.Unsafe;

/* renamed from: o.Oi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3833Oi1<T> implements InterfaceC9026qY1<T> {
    public static final int r = 3;
    public static final int s = 20;
    public static final int t = 1048575;
    public static final int u = 267386880;
    public static final int v = 268435456;
    public static final int w = 536870912;
    public static final int y = 51;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final InterfaceC3540Li1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final InterfaceC4834Yp1 m;
    public final Q01 n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC10645xA2<?, ?> f578o;
    public final AbstractC3249Ij0<?> p;
    public final R71 q;
    public static final int[] x = new int[0];
    public static final Unsafe z = TB2.R();

    /* renamed from: o.Oi1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IM2.b.values().length];
            a = iArr;
            try {
                iArr[IM2.b.e1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IM2.b.i1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IM2.b.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IM2.b.d1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IM2.b.l1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IM2.b.c1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IM2.b.m1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[IM2.b.Y0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[IM2.b.k1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[IM2.b.b1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[IM2.b.j1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[IM2.b.Z0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[IM2.b.a1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[IM2.b.h1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[IM2.b.n1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[IM2.b.o1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[IM2.b.f1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C3833Oi1(int[] iArr, Object[] objArr, int i, int i2, InterfaceC3540Li1 interfaceC3540Li1, boolean z2, boolean z3, int[] iArr2, int i3, int i4, InterfaceC4834Yp1 interfaceC4834Yp1, Q01 q01, AbstractC10645xA2<?, ?> abstractC10645xA2, AbstractC3249Ij0<?> abstractC3249Ij0, R71 r71) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = interfaceC3540Li1 instanceof IC0;
        this.h = z2;
        this.f = abstractC3249Ij0 != null && abstractC3249Ij0.e(interfaceC3540Li1);
        this.i = z3;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = interfaceC4834Yp1;
        this.n = q01;
        this.f578o = abstractC10645xA2;
        this.p = abstractC3249Ij0;
        this.e = interfaceC3540Li1;
        this.q = r71;
    }

    public static <T> int B(T t2, long j) {
        return TB2.I(t2, j);
    }

    public static boolean C(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean F(Object obj, int i, InterfaceC9026qY1 interfaceC9026qY1) {
        return interfaceC9026qY1.e(TB2.O(obj, W(i)));
    }

    public static boolean K(int i) {
        if ((i & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static List<?> L(Object obj, long j) {
        return (List) TB2.O(obj, j);
    }

    public static <T> long M(T t2, long j) {
        return TB2.L(t2, j);
    }

    public static <T> C3833Oi1<T> S(Class<T> cls, InterfaceC3344Ji1 interfaceC3344Ji1, InterfaceC4834Yp1 interfaceC4834Yp1, Q01 q01, AbstractC10645xA2<?, ?> abstractC10645xA2, AbstractC3249Ij0<?> abstractC3249Ij0, R71 r71) {
        if (interfaceC3344Ji1 instanceof C7513kO1) {
            return U((C7513kO1) interfaceC3344Ji1, interfaceC4834Yp1, q01, abstractC10645xA2, abstractC3249Ij0, r71);
        }
        return T((C4504Vf2) interfaceC3344Ji1, interfaceC4834Yp1, q01, abstractC10645xA2, abstractC3249Ij0, r71);
    }

    public static <T> C3833Oi1<T> T(C4504Vf2 c4504Vf2, InterfaceC4834Yp1 interfaceC4834Yp1, Q01 q01, AbstractC10645xA2<?, ?> abstractC10645xA2, AbstractC3249Ij0<?> abstractC3249Ij0, R71 r71) {
        boolean z2;
        int u2;
        int u3;
        int[] iArr;
        int i;
        if (c4504Vf2.f() == WJ1.PROTO3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C5415bo0[] d = c4504Vf2.d();
        if (d.length == 0) {
            u2 = 0;
            u3 = 0;
        } else {
            u2 = d[0].u();
            u3 = d[d.length - 1].u();
        }
        int length = d.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i2 = 0;
        int i3 = 0;
        for (C5415bo0 c5415bo0 : d) {
            if (c5415bo0.C() == EnumC11283zo0.Y1) {
                i2++;
            } else if (c5415bo0.C().j() >= 18 && c5415bo0.C().j() <= 49) {
                i3++;
            }
        }
        int[] iArr3 = null;
        if (i2 > 0) {
            iArr = new int[i2];
        } else {
            iArr = null;
        }
        if (i3 > 0) {
            iArr3 = new int[i3];
        }
        int[] c = c4504Vf2.c();
        if (c == null) {
            c = x;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < d.length) {
            C5415bo0 c5415bo02 = d[i4];
            int u4 = c5415bo02.u();
            s0(c5415bo02, iArr2, i5, z2, objArr);
            if (i6 < c.length && c[i6] == u4) {
                c[i6] = i5;
                i6++;
            }
            if (c5415bo02.C() == EnumC11283zo0.Y1) {
                iArr[i7] = i5;
                i7++;
            } else if (c5415bo02.C().j() >= 18 && c5415bo02.C().j() <= 49) {
                i = i5;
                iArr3[i8] = (int) TB2.W(c5415bo02.t());
                i8++;
                i4++;
                i5 = i + 3;
            }
            i = i5;
            i4++;
            i5 = i + 3;
        }
        if (iArr == null) {
            iArr = x;
        }
        if (iArr3 == null) {
            iArr3 = x;
        }
        int[] iArr4 = new int[c.length + iArr.length + iArr3.length];
        System.arraycopy(c, 0, iArr4, 0, c.length);
        System.arraycopy(iArr, 0, iArr4, c.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, c.length + iArr.length, iArr3.length);
        return new C3833Oi1<>(iArr2, objArr, u2, u3, c4504Vf2.b(), z2, true, iArr4, c.length, c.length + iArr.length, interfaceC4834Yp1, q01, abstractC10645xA2, abstractC3249Ij0, r71);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C3833Oi1<T> U(C7513kO1 c7513kO1, InterfaceC4834Yp1 interfaceC4834Yp1, Q01 q01, AbstractC10645xA2<?, ?> abstractC10645xA2, AbstractC3249Ij0<?> abstractC3249Ij0, R71 r71) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char charAt4;
        int i6;
        char charAt5;
        int i7;
        char charAt6;
        int i8;
        char charAt7;
        int i9;
        char charAt8;
        int i10;
        char charAt9;
        int i11;
        char charAt10;
        int i12;
        char charAt11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int objectFieldOffset;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field o0;
        char charAt12;
        int i24;
        int i25;
        Object obj;
        Field o02;
        Object obj2;
        Field o03;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        char charAt17;
        int i31 = 0;
        boolean z2 = c7513kO1.f() == WJ1.PROTO3;
        String d = c7513kO1.d();
        int length = d.length();
        int charAt18 = d.charAt(0);
        if (charAt18 >= 55296) {
            int i32 = charAt18 & 8191;
            int i33 = 1;
            int i34 = 13;
            while (true) {
                i = i33 + 1;
                charAt17 = d.charAt(i33);
                if (charAt17 < 55296) {
                    break;
                }
                i32 |= (charAt17 & 8191) << i34;
                i34 += 13;
                i33 = i;
            }
            charAt18 = i32 | (charAt17 << i34);
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt19 = d.charAt(i);
        if (charAt19 >= 55296) {
            int i36 = charAt19 & 8191;
            int i37 = 13;
            while (true) {
                i30 = i35 + 1;
                charAt16 = d.charAt(i35);
                if (charAt16 < 55296) {
                    break;
                }
                i36 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i35 = i30;
            }
            charAt19 = i36 | (charAt16 << i37);
            i35 = i30;
        }
        if (charAt19 == 0) {
            charAt = 0;
            i4 = 0;
            charAt2 = 0;
            i2 = 0;
            charAt3 = 0;
            iArr = x;
            i3 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt20 = d.charAt(i35);
            if (charAt20 >= 55296) {
                int i39 = charAt20 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt11 = d.charAt(i38);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i39 |= (charAt11 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt20 = i39 | (charAt11 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            int charAt21 = d.charAt(i38);
            if (charAt21 >= 55296) {
                int i42 = charAt21 & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt10 = d.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt21 = i42 | (charAt10 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            charAt = d.charAt(i41);
            if (charAt >= 55296) {
                int i45 = charAt & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt9 = d.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt = i45 | (charAt9 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            int charAt22 = d.charAt(i44);
            if (charAt22 >= 55296) {
                int i48 = charAt22 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt8 = d.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt22 = i48 | (charAt8 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt23 = d.charAt(i47);
            if (charAt23 >= 55296) {
                int i51 = charAt23 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt7 = d.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt23 = i51 | (charAt7 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            charAt2 = d.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt6 = d.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt2 = i54 | (charAt6 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            int charAt24 = d.charAt(i53);
            if (charAt24 >= 55296) {
                int i57 = charAt24 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt5 = d.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt24 = i57 | (charAt5 << i58);
                i56 = i6;
            }
            int i59 = i56 + 1;
            charAt3 = d.charAt(i56);
            if (charAt3 >= 55296) {
                int i60 = charAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i5 = i61 + 1;
                    charAt4 = d.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i5;
                }
                charAt3 = i60 | (charAt4 << i62);
                i59 = i5;
            }
            i2 = (charAt20 * 2) + charAt21;
            i3 = charAt22;
            i4 = charAt23;
            iArr = new int[charAt3 + charAt2 + charAt24];
            i31 = charAt20;
            i35 = i59;
        }
        Unsafe unsafe = z;
        Object[] c = c7513kO1.c();
        Class<?> cls = c7513kO1.b().getClass();
        int[] iArr2 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i63 = charAt2 + charAt3;
        int i64 = i63;
        int i65 = charAt3;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int charAt25 = d.charAt(i35);
            int i69 = length;
            if (charAt25 >= 55296) {
                int i70 = charAt25 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i29 = i71 + 1;
                    charAt15 = d.charAt(i71);
                    i13 = i31;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i70 |= (charAt15 & 8191) << i72;
                    i72 += 13;
                    i71 = i29;
                    i31 = i13;
                }
                charAt25 = i70 | (charAt15 << i72);
                i14 = i29;
            } else {
                i13 = i31;
                i14 = i68;
            }
            int i73 = i14 + 1;
            int charAt26 = d.charAt(i14);
            if (charAt26 >= 55296) {
                int i74 = charAt26 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i27 = i75 + 1;
                    charAt14 = d.charAt(i75);
                    i28 = i74;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i74 = i28 | ((charAt14 & 8191) << i76);
                    i76 += 13;
                    i75 = i27;
                }
                charAt26 = i28 | (charAt14 << i76);
                i15 = i27;
            } else {
                i15 = i73;
            }
            int i77 = charAt18;
            int i78 = charAt26 & 255;
            int[] iArr3 = iArr2;
            if ((charAt26 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i79 = charAt25;
            if (i78 >= 51) {
                int i80 = i15 + 1;
                int charAt27 = d.charAt(i15);
                char c2 = 55296;
                if (charAt27 >= 55296) {
                    int i81 = charAt27 & 8191;
                    int i82 = 13;
                    while (true) {
                        i26 = i80 + 1;
                        charAt13 = d.charAt(i80);
                        if (charAt13 < c2) {
                            break;
                        }
                        i81 |= (charAt13 & 8191) << i82;
                        i82 += 13;
                        i80 = i26;
                        c2 = 55296;
                    }
                    charAt27 = i81 | (charAt13 << i82);
                    i80 = i26;
                }
                int i83 = i78 - 51;
                int i84 = charAt27;
                if (i83 == 9 || i83 == 17) {
                    i25 = i2 + 1;
                    objArr[((i67 / 3) * 2) + 1] = c[i2];
                } else {
                    if (i83 == 12 && (i77 & 1) == 1) {
                        i25 = i2 + 1;
                        objArr[((i67 / 3) * 2) + 1] = c[i2];
                    }
                    int i85 = i84 * 2;
                    obj = c[i85];
                    if (!(obj instanceof Field)) {
                        o02 = (Field) obj;
                    } else {
                        o02 = o0(cls, (String) obj);
                        c[i85] = o02;
                    }
                    int i86 = i80;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(o02);
                    int i87 = i85 + 1;
                    obj2 = c[i87];
                    if (!(obj2 instanceof Field)) {
                        o03 = (Field) obj2;
                    } else {
                        o03 = o0(cls, (String) obj2);
                        c[i87] = o03;
                    }
                    str = d;
                    i20 = (int) unsafe.objectFieldOffset(o03);
                    i35 = i86;
                    i23 = objectFieldOffset2;
                    i21 = 0;
                    i16 = i3;
                    i22 = i2;
                    i17 = charAt;
                }
                i2 = i25;
                int i852 = i84 * 2;
                obj = c[i852];
                if (!(obj instanceof Field)) {
                }
                int i862 = i80;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(o02);
                int i872 = i852 + 1;
                obj2 = c[i872];
                if (!(obj2 instanceof Field)) {
                }
                str = d;
                i20 = (int) unsafe.objectFieldOffset(o03);
                i35 = i862;
                i23 = objectFieldOffset22;
                i21 = 0;
                i16 = i3;
                i22 = i2;
                i17 = charAt;
            } else {
                int i88 = i2 + 1;
                Field o04 = o0(cls, (String) c[i2]);
                if (i78 == 9 || i78 == 17) {
                    i16 = i3;
                    objArr[((i67 / 3) * 2) + 1] = o04.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i16 = i3;
                        i24 = i2 + 2;
                        objArr[((i67 / 3) * 2) + 1] = c[i88];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i16 = i3;
                        if ((i77 & 1) == 1) {
                            i24 = i2 + 2;
                            objArr[((i67 / 3) * 2) + 1] = c[i88];
                        }
                    } else if (i78 == 50) {
                        int i89 = i65 + 1;
                        iArr[i65] = i67;
                        int i90 = (i67 / 3) * 2;
                        int i91 = i2 + 2;
                        objArr[i90] = c[i88];
                        if ((charAt26 & 2048) != 0) {
                            i18 = i2 + 3;
                            objArr[i90 + 1] = c[i91];
                            i16 = i3;
                            i17 = charAt;
                            i65 = i89;
                        } else {
                            i17 = charAt;
                            i18 = i91;
                            i65 = i89;
                            i16 = i3;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(o04);
                        if ((i77 & 1) == 1 || i78 > 17) {
                            str = d;
                            i19 = i15;
                            i20 = 0;
                            i21 = 0;
                        } else {
                            int i92 = i15 + 1;
                            int charAt28 = d.charAt(i15);
                            if (charAt28 >= 55296) {
                                int i93 = charAt28 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i19 = i92 + 1;
                                    charAt12 = d.charAt(i92);
                                    if (charAt12 < 55296) {
                                        break;
                                    }
                                    i93 |= (charAt12 & 8191) << i94;
                                    i94 += 13;
                                    i92 = i19;
                                }
                                charAt28 = i93 | (charAt12 << i94);
                            } else {
                                i19 = i92;
                            }
                            int i95 = (i13 * 2) + (charAt28 / 32);
                            Object obj3 = c[i95];
                            str = d;
                            if (obj3 instanceof Field) {
                                o0 = (Field) obj3;
                            } else {
                                o0 = o0(cls, (String) obj3);
                                c[i95] = o0;
                            }
                            i20 = (int) unsafe.objectFieldOffset(o0);
                            i21 = charAt28 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i64] = objectFieldOffset;
                            i64++;
                        }
                        i22 = i18;
                        i23 = objectFieldOffset;
                        i35 = i19;
                    } else {
                        i16 = i3;
                    }
                    i18 = i24;
                    i17 = charAt;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(o04);
                    if ((i77 & 1) == 1) {
                    }
                    str = d;
                    i19 = i15;
                    i20 = 0;
                    i21 = 0;
                    if (i78 >= 18) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                    i22 = i18;
                    i23 = objectFieldOffset;
                    i35 = i19;
                }
                i17 = charAt;
                i18 = i88;
                objectFieldOffset = (int) unsafe.objectFieldOffset(o04);
                if ((i77 & 1) == 1) {
                }
                str = d;
                i19 = i15;
                i20 = 0;
                i21 = 0;
                if (i78 >= 18) {
                }
                i22 = i18;
                i23 = objectFieldOffset;
                i35 = i19;
            }
            int i96 = i67 + 1;
            iArr3[i67] = i79;
            int i97 = i67 + 2;
            int i98 = i20;
            iArr3[i96] = ((charAt26 & 512) != 0 ? 536870912 : 0) | ((charAt26 & 256) != 0 ? 268435456 : 0) | (i78 << 20) | i23;
            i67 += 3;
            iArr3[i97] = (i21 << 20) | i98;
            charAt = i17;
            charAt18 = i77;
            length = i69;
            iArr2 = iArr3;
            i31 = i13;
            d = str;
            i2 = i22;
            i3 = i16;
        }
        return new C3833Oi1<>(iArr2, objArr, charAt, i3, c7513kO1.b(), z2, false, iArr, charAt3, i63, interfaceC4834Yp1, q01, abstractC10645xA2, abstractC3249Ij0, r71);
    }

    public static long W(int i) {
        return i & t;
    }

    public static <T> boolean X(T t2, long j) {
        return ((Boolean) TB2.O(t2, j)).booleanValue();
    }

    public static <T> double Y(T t2, long j) {
        return ((Double) TB2.O(t2, j)).doubleValue();
    }

    public static <T> float Z(T t2, long j) {
        return ((Float) TB2.O(t2, j)).floatValue();
    }

    public static <T> int a0(T t2, long j) {
        return ((Integer) TB2.O(t2, j)).intValue();
    }

    public static <T> long b0(T t2, long j) {
        return ((Long) TB2.O(t2, j)).longValue();
    }

    public static <T> boolean l(T t2, long j) {
        return TB2.u(t2, j);
    }

    public static <T> double o(T t2, long j) {
        return TB2.D(t2, j);
    }

    public static Field o0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static <T> float s(T t2, long j) {
        return TB2.F(t2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s0(C5415bo0 c5415bo0, int[] iArr, int i, boolean z2, Object[] objArr) {
        int W;
        int W2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C11312zv1 y2 = c5415bo0.y();
        int i7 = 0;
        if (y2 != null) {
            i2 = c5415bo0.C().j() + 51;
            W = (int) TB2.W(y2.c());
            W2 = (int) TB2.W(y2.a());
        } else {
            EnumC11283zo0 C = c5415bo0.C();
            W = (int) TB2.W(c5415bo0.t());
            int j = C.j();
            if (!z2 && !C.l() && !C.m()) {
                i3 = Integer.numberOfTrailingZeros(c5415bo0.B());
                i2 = j;
                i4 = W;
                i5 = (int) TB2.W(c5415bo0.A());
            } else if (c5415bo0.r() == null) {
                i3 = 0;
                i2 = j;
                i4 = W;
                i5 = 0;
            } else {
                W2 = (int) TB2.W(c5415bo0.r());
                i2 = j;
            }
            iArr[i] = c5415bo0.u();
            int i8 = i + 1;
            if (!c5415bo0.D()) {
                i6 = 536870912;
            } else {
                i6 = 0;
            }
            if (c5415bo0.F()) {
                i7 = 268435456;
            }
            iArr[i8] = (i2 << 20) | i7 | i6 | i4;
            iArr[i + 2] = (i3 << 20) | i5;
            Class<?> x2 = c5415bo0.x();
            if (c5415bo0.w() == null) {
                int i9 = (i / 3) * 2;
                objArr[i9] = c5415bo0.w();
                if (x2 != null) {
                    objArr[i9 + 1] = x2;
                    return;
                } else if (c5415bo0.s() != null) {
                    objArr[i9 + 1] = c5415bo0.s();
                    return;
                } else {
                    return;
                }
            } else if (x2 != null) {
                objArr[((i / 3) * 2) + 1] = x2;
                return;
            } else if (c5415bo0.s() != null) {
                objArr[((i / 3) * 2) + 1] = c5415bo0.s();
                return;
            } else {
                return;
            }
        }
        i4 = W;
        i5 = W2;
        i3 = 0;
        iArr[i] = c5415bo0.u();
        int i82 = i + 1;
        if (!c5415bo0.D()) {
        }
        if (c5415bo0.F()) {
        }
        iArr[i82] = (i2 << 20) | i7 | i6 | i4;
        iArr[i + 2] = (i3 << 20) | i5;
        Class<?> x22 = c5415bo0.x();
        if (c5415bo0.w() == null) {
        }
    }

    public static int t0(int i) {
        return (i & u) >>> 20;
    }

    public static C10888yA2 w(Object obj) {
        IC0 ic0 = (IC0) obj;
        C10888yA2 c10888yA2 = ic0.unknownFields;
        if (c10888yA2 == C10888yA2.e()) {
            C10888yA2 p = C10888yA2.p();
            ic0.unknownFields = p;
            return p;
        }
        return c10888yA2;
    }

    public final <UT, UB> int A(AbstractC10645xA2<UT, UB> abstractC10645xA2, T t2) {
        return abstractC10645xA2.h(abstractC10645xA2.g(t2));
    }

    public final <UT, UB> void A0(AbstractC10645xA2<UT, UB> abstractC10645xA2, T t2, NN2 nn2) throws IOException {
        abstractC10645xA2.t(abstractC10645xA2.g(t2), nn2);
    }

    public final boolean D(T t2, int i) {
        boolean equals;
        if (this.h) {
            int u0 = u0(i);
            long W = W(u0);
            switch (t0(u0)) {
                case 0:
                    if (TB2.D(t2, W) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (TB2.F(t2, W) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (TB2.L(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (TB2.L(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (TB2.I(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (TB2.L(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (TB2.I(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return TB2.u(t2, W);
                case 8:
                    Object O = TB2.O(t2, W);
                    if (O instanceof String) {
                        equals = ((String) O).isEmpty();
                        break;
                    } else if (O instanceof AbstractC8616os) {
                        equals = AbstractC8616os.Z0.equals(O);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (TB2.O(t2, W) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = AbstractC8616os.Z0.equals(TB2.O(t2, W));
                    break;
                case 11:
                    if (TB2.I(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (TB2.I(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (TB2.I(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (TB2.L(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (TB2.I(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (TB2.L(t2, W) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (TB2.O(t2, W) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int j0 = j0(i);
        if ((TB2.I(t2, j0 & t) & (1 << (j0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean E(T t2, int i, int i2, int i3) {
        if (this.h) {
            return D(t2, i);
        }
        if ((i2 & i3) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <N> boolean G(Object obj, int i, int i2) {
        List list = (List) TB2.O(obj, W(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC9026qY1 v2 = v(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!v2.e(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [o.qY1] */
    public final boolean H(T t2, int i, int i2) {
        Map<?, ?> e = this.q.e(TB2.O(t2, W(i)));
        if (e.isEmpty()) {
            return true;
        }
        if (this.q.b(u(i2)).c.e() != IM2.c.MESSAGE) {
            return true;
        }
        InterfaceC9026qY1<T> interfaceC9026qY1 = 0;
        for (Object obj : e.values()) {
            if (interfaceC9026qY1 == null) {
                interfaceC9026qY1 = XJ1.a().i(obj.getClass());
            }
            boolean e2 = interfaceC9026qY1.e(obj);
            interfaceC9026qY1 = interfaceC9026qY1;
            if (!e2) {
                return false;
            }
        }
        return true;
    }

    public final boolean I(T t2, T t3, int i) {
        long j0 = j0(i) & t;
        if (TB2.I(t2, j0) == TB2.I(t3, j0)) {
            return true;
        }
        return false;
    }

    public final boolean J(T t2, int i, int i2) {
        if (TB2.I(t2, j0(i2) & t) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        r0 = r14.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (r0 >= r14.l) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
        r7 = q(r9, r14.j[r0], r7, r15);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
        if (r7 == null) goto L297;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0638 A[LOOP:3: B:197:0x0634->B:199:0x0638, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x060f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <UT, UB, ET extends C11040yo0.c<ET>> void N(AbstractC10645xA2<UT, UB> abstractC10645xA2, AbstractC3249Ij0<ET> abstractC3249Ij0, T t2, EO1 eo1, C3151Hj0 c3151Hj0) throws IOException {
        int i;
        AbstractC3249Ij0<ET> abstractC3249Ij02;
        Object b;
        Object obj;
        T t3 = t2;
        C3151Hj0 c3151Hj02 = c3151Hj0;
        Object obj2 = null;
        C11040yo0<ET> c11040yo0 = null;
        while (true) {
            try {
                int I = eo1.I();
                int h0 = h0(I);
                if (h0 < 0) {
                    if (I == Integer.MAX_VALUE) {
                        for (int i2 = this.k; i2 < this.l; i2++) {
                            obj2 = q(t3, this.j[i2], obj2, abstractC10645xA2);
                        }
                        if (obj2 == null) {
                            return;
                        }
                    } else {
                        if (!this.f) {
                            abstractC3249Ij02 = abstractC3249Ij0;
                            b = null;
                        } else {
                            abstractC3249Ij02 = abstractC3249Ij0;
                            b = abstractC3249Ij02.b(c3151Hj02, this.e, I);
                        }
                        if (b != null) {
                            if (c11040yo0 == null) {
                                try {
                                    c11040yo0 = abstractC3249Ij0.d(t2);
                                } catch (Throwable th) {
                                    th = th;
                                    while (i < this.l) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            C11040yo0<ET> c11040yo02 = c11040yo0;
                            obj2 = abstractC3249Ij02.g(eo1, b, c3151Hj02, c11040yo02, obj2, abstractC10645xA2);
                            c11040yo0 = c11040yo02;
                        } else {
                            obj = obj2;
                            try {
                                if (abstractC10645xA2.q(eo1)) {
                                    if (!eo1.M()) {
                                        obj2 = obj;
                                    }
                                    obj2 = obj;
                                } else {
                                    if (obj == null) {
                                        obj2 = abstractC10645xA2.f(t3);
                                    } else {
                                        obj2 = obj;
                                    }
                                    if (abstractC10645xA2.m(obj2, eo1)) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj;
                                while (i < this.l) {
                                }
                                if (obj2 != null) {
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    EO1 eo12 = eo1;
                    obj = obj2;
                    int u0 = u0(h0);
                    try {
                        switch (t0(u0)) {
                            case 0:
                                TB2.g0(t3, W(u0), eo12.readDouble());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 1:
                                TB2.i0(t3, W(u0), eo12.readFloat());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 2:
                                TB2.o0(t3, W(u0), eo12.Q());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 3:
                                TB2.o0(t3, W(u0), eo12.x());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 4:
                                TB2.l0(t3, W(u0), eo12.u());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 5:
                                TB2.o0(t3, W(u0), eo12.c());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 6:
                                TB2.l0(t3, W(u0), eo12.B());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 7:
                                TB2.X(t3, W(u0), eo12.f());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 8:
                                m0(t3, u0, eo12);
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 9:
                                if (D(t3, h0)) {
                                    TB2.q0(t3, W(u0), C9740tS0.v(TB2.O(t3, W(u0)), eo12.z(v(h0), c3151Hj02)));
                                } else {
                                    TB2.q0(t3, W(u0), eo12.z(v(h0), c3151Hj02));
                                    p0(t3, h0);
                                }
                                obj2 = obj;
                                break;
                            case 10:
                                TB2.q0(t3, W(u0), eo12.t());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 11:
                                TB2.l0(t3, W(u0), eo12.j());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 12:
                                int p = eo12.p();
                                C9740tS0.e t4 = t(h0);
                                if (t4 != null && !t4.a(p)) {
                                    obj2 = C11222zY1.Q(I, p, obj, abstractC10645xA2);
                                    break;
                                }
                                TB2.l0(t3, W(u0), p);
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 13:
                                TB2.l0(t3, W(u0), eo12.N());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 14:
                                TB2.o0(t3, W(u0), eo12.g());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 15:
                                TB2.l0(t3, W(u0), eo12.q());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 16:
                                TB2.o0(t3, W(u0), eo12.F());
                                p0(t3, h0);
                                obj2 = obj;
                                break;
                            case 17:
                                if (D(t3, h0)) {
                                    TB2.q0(t3, W(u0), C9740tS0.v(TB2.O(t3, W(u0)), eo12.A(v(h0), c3151Hj02)));
                                } else {
                                    TB2.q0(t3, W(u0), eo12.A(v(h0), c3151Hj02));
                                    p0(t3, h0);
                                }
                                obj2 = obj;
                                break;
                            case 18:
                                eo12.P(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 19:
                                eo12.K(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 20:
                                eo12.l(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 21:
                                eo12.h(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 22:
                                eo12.D(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 23:
                                eo12.v(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 24:
                                eo12.E(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 25:
                                eo12.r(this.n.e(t3, W(u0)));
                                obj2 = obj;
                                break;
                            case 26:
                                n0(t3, u0, eo12);
                                obj2 = obj;
                                break;
                            case 27:
                                T t5 = t3;
                                try {
                                    l0(t5, u0, eo12, v(h0), c3151Hj0);
                                    t3 = t5;
                                    c3151Hj02 = c3151Hj0;
                                    obj2 = obj;
                                    break;
                                } catch (C9258rT0.a unused) {
                                    t3 = t5;
                                    c3151Hj02 = c3151Hj0;
                                    obj2 = obj;
                                    if (abstractC10645xA2.q(eo12)) {
                                    }
                                }
                                break;
                            case 28:
                                eo12.O(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 29:
                                eo12.y(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 30:
                                List<Integer> e = this.n.e(t3, W(u0));
                                eo12.o(e);
                                obj2 = C11222zY1.C(I, e, t(h0), obj, abstractC10645xA2);
                                c3151Hj02 = c3151Hj0;
                                break;
                            case 31:
                                eo12.d(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 32:
                                eo12.C(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 33:
                                eo12.w(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 34:
                                eo12.e(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 35:
                                eo12.P(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 36:
                                eo12.K(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 37:
                                eo12.l(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 38:
                                eo12.h(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 39:
                                eo12.D(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 40:
                                eo12.v(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 41:
                                eo12.E(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 42:
                                eo12.r(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 43:
                                eo12.y(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 44:
                                List<Integer> e2 = this.n.e(t3, W(u0));
                                eo12.o(e2);
                                obj2 = C11222zY1.C(I, e2, t(h0), obj, abstractC10645xA2);
                                c3151Hj02 = c3151Hj0;
                                break;
                            case 45:
                                eo12.d(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 46:
                                eo12.C(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 47:
                                eo12.w(this.n.e(t3, W(u0)));
                                c3151Hj02 = c3151Hj0;
                                obj2 = obj;
                                break;
                            case 48:
                                try {
                                    eo12.e(this.n.e(t3, W(u0)));
                                    c3151Hj02 = c3151Hj0;
                                    obj2 = obj;
                                } catch (C9258rT0.a unused2) {
                                    c3151Hj02 = c3151Hj0;
                                    obj2 = obj;
                                    if (abstractC10645xA2.q(eo12)) {
                                        if (!eo12.M()) {
                                            for (int i3 = this.k; i3 < this.l; i3++) {
                                                obj2 = q(t3, this.j[i3], obj2, abstractC10645xA2);
                                            }
                                            if (obj2 == null) {
                                                return;
                                            }
                                            abstractC10645xA2.o(t3, obj2);
                                            return;
                                        }
                                    } else {
                                        if (obj2 == null) {
                                            obj2 = abstractC10645xA2.f(t3);
                                        }
                                        if (!abstractC10645xA2.m(obj2, eo12)) {
                                            for (int i4 = this.k; i4 < this.l; i4++) {
                                                obj2 = q(t3, this.j[i4], obj2, abstractC10645xA2);
                                            }
                                            if (obj2 == null) {
                                                return;
                                            }
                                            abstractC10645xA2.o(t3, obj2);
                                            return;
                                        }
                                    }
                                }
                            case 49:
                                try {
                                    try {
                                        k0(t2, W(u0), eo1, v(h0), c3151Hj0);
                                        t3 = t2;
                                        c3151Hj02 = c3151Hj0;
                                        obj2 = obj;
                                        break;
                                    } catch (C9258rT0.a unused3) {
                                        t3 = t2;
                                        eo12 = eo1;
                                        obj2 = obj;
                                        c3151Hj02 = c3151Hj0;
                                        if (abstractC10645xA2.q(eo12)) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    t3 = t2;
                                    obj2 = obj;
                                    for (i = this.k; i < this.l; i++) {
                                        obj2 = q(t3, this.j[i], obj2, abstractC10645xA2);
                                    }
                                    if (obj2 != null) {
                                        abstractC10645xA2.o(t3, obj2);
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                try {
                                    O(t3, h0, u(h0), c3151Hj02, eo1);
                                    t3 = t2;
                                    c3151Hj02 = c3151Hj0;
                                    obj2 = obj;
                                    break;
                                } catch (C9258rT0.a unused4) {
                                    t3 = t2;
                                    eo12 = eo1;
                                    c3151Hj02 = c3151Hj0;
                                    obj2 = obj;
                                    if (abstractC10645xA2.q(eo12)) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    t3 = t2;
                                    obj2 = obj;
                                    while (i < this.l) {
                                    }
                                    if (obj2 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 51:
                                TB2.q0(t3, W(u0), Double.valueOf(eo12.readDouble()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 52:
                                TB2.q0(t3, W(u0), Float.valueOf(eo12.readFloat()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 53:
                                TB2.q0(t3, W(u0), Long.valueOf(eo12.Q()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 54:
                                TB2.q0(t3, W(u0), Long.valueOf(eo12.x()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 55:
                                TB2.q0(t3, W(u0), Integer.valueOf(eo12.u()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 56:
                                TB2.q0(t3, W(u0), Long.valueOf(eo12.c()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 57:
                                TB2.q0(t3, W(u0), Integer.valueOf(eo12.B()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 58:
                                TB2.q0(t3, W(u0), Boolean.valueOf(eo12.f()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 59:
                                m0(t3, u0, eo12);
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 60:
                                if (J(t3, I, h0)) {
                                    TB2.q0(t3, W(u0), C9740tS0.v(TB2.O(t3, W(u0)), eo12.z(v(h0), c3151Hj02)));
                                } else {
                                    TB2.q0(t3, W(u0), eo12.z(v(h0), c3151Hj02));
                                    p0(t3, h0);
                                }
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 61:
                                TB2.q0(t3, W(u0), eo12.t());
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 62:
                                TB2.q0(t3, W(u0), Integer.valueOf(eo12.j()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 63:
                                int p2 = eo12.p();
                                C9740tS0.e t6 = t(h0);
                                if (t6 != null && !t6.a(p2)) {
                                    obj2 = C11222zY1.Q(I, p2, obj, abstractC10645xA2);
                                    break;
                                }
                                TB2.q0(t3, W(u0), Integer.valueOf(p2));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 64:
                                TB2.q0(t3, W(u0), Integer.valueOf(eo12.N()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 65:
                                TB2.q0(t3, W(u0), Long.valueOf(eo12.g()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 66:
                                TB2.q0(t3, W(u0), Integer.valueOf(eo12.q()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 67:
                                TB2.q0(t3, W(u0), Long.valueOf(eo12.F()));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            case 68:
                                TB2.q0(t3, W(u0), eo12.A(v(h0), c3151Hj02));
                                q0(t3, I, h0);
                                obj2 = obj;
                                break;
                            default:
                                if (obj == null) {
                                    obj2 = abstractC10645xA2.n();
                                } else {
                                    obj2 = obj;
                                }
                                try {
                                    if (abstractC10645xA2.m(obj2, eo12)) {
                                        break;
                                    } else {
                                        for (int i5 = this.k; i5 < this.l; i5++) {
                                            obj2 = q(t3, this.j[i5], obj2, abstractC10645xA2);
                                        }
                                        if (obj2 == null) {
                                            return;
                                        }
                                    }
                                } catch (C9258rT0.a unused5) {
                                    if (abstractC10645xA2.q(eo12)) {
                                    }
                                }
                                break;
                        }
                    } catch (C9258rT0.a unused6) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final <K, V> void O(Object obj, int i, Object obj2, C3151Hj0 c3151Hj0, EO1 eo1) throws IOException {
        long W = W(u0(i));
        Object O = TB2.O(obj, W);
        if (O == null) {
            O = this.q.d(obj2);
            TB2.q0(obj, W, O);
        } else if (this.q.h(O)) {
            Object d = this.q.d(obj2);
            this.q.a(d, O);
            TB2.q0(obj, W, d);
            O = d;
        }
        eo1.G(this.q.c(O), this.q.b(obj2), c3151Hj0);
    }

    public final void P(T t2, T t3, int i) {
        long W = W(u0(i));
        if (D(t3, i)) {
            Object O = TB2.O(t2, W);
            Object O2 = TB2.O(t3, W);
            if (O != null && O2 != null) {
                TB2.q0(t2, W, C9740tS0.v(O, O2));
                p0(t2, i);
            } else if (O2 != null) {
                TB2.q0(t2, W, O2);
                p0(t2, i);
            }
        }
    }

    public final void Q(T t2, T t3, int i) {
        int u0 = u0(i);
        int V = V(i);
        long W = W(u0);
        if (J(t3, V, i)) {
            Object O = TB2.O(t2, W);
            Object O2 = TB2.O(t3, W);
            if (O != null && O2 != null) {
                TB2.q0(t2, W, C9740tS0.v(O, O2));
                q0(t2, V, i);
            } else if (O2 != null) {
                TB2.q0(t2, W, O2);
                q0(t2, V, i);
            }
        }
    }

    public final void R(T t2, T t3, int i) {
        int u0 = u0(i);
        long W = W(u0);
        int V = V(i);
        switch (t0(u0)) {
            case 0:
                if (D(t3, i)) {
                    TB2.g0(t2, W, TB2.D(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 1:
                if (D(t3, i)) {
                    TB2.i0(t2, W, TB2.F(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 2:
                if (D(t3, i)) {
                    TB2.o0(t2, W, TB2.L(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 3:
                if (D(t3, i)) {
                    TB2.o0(t2, W, TB2.L(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 4:
                if (D(t3, i)) {
                    TB2.l0(t2, W, TB2.I(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 5:
                if (D(t3, i)) {
                    TB2.o0(t2, W, TB2.L(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 6:
                if (D(t3, i)) {
                    TB2.l0(t2, W, TB2.I(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 7:
                if (D(t3, i)) {
                    TB2.X(t2, W, TB2.u(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 8:
                if (D(t3, i)) {
                    TB2.q0(t2, W, TB2.O(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 9:
                P(t2, t3, i);
                return;
            case 10:
                if (D(t3, i)) {
                    TB2.q0(t2, W, TB2.O(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 11:
                if (D(t3, i)) {
                    TB2.l0(t2, W, TB2.I(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 12:
                if (D(t3, i)) {
                    TB2.l0(t2, W, TB2.I(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 13:
                if (D(t3, i)) {
                    TB2.l0(t2, W, TB2.I(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 14:
                if (D(t3, i)) {
                    TB2.o0(t2, W, TB2.L(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 15:
                if (D(t3, i)) {
                    TB2.l0(t2, W, TB2.I(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 16:
                if (D(t3, i)) {
                    TB2.o0(t2, W, TB2.L(t3, W));
                    p0(t2, i);
                    return;
                }
                return;
            case 17:
                P(t2, t3, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.n.d(t2, t3, W);
                return;
            case 50:
                C11222zY1.I(this.q, t2, t3, W);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (J(t3, V, i)) {
                    TB2.q0(t2, W, TB2.O(t3, W));
                    q0(t2, V, i);
                    return;
                }
                return;
            case 60:
                Q(t2, t3, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t3, V, i)) {
                    TB2.q0(t2, W, TB2.O(t3, W));
                    q0(t2, V, i);
                    return;
                }
                return;
            case 68:
                Q(t2, t3, i);
                return;
            default:
                return;
        }
    }

    public final int V(int i) {
        return this.a[i];
    }

    @Override // o.InterfaceC9026qY1
    public void a(T t2, T t3) {
        t3.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            R(t2, t3, i);
        }
        if (!this.h) {
            C11222zY1.J(this.f578o, t2, t3);
            if (this.f) {
                C11222zY1.H(this.p, t2, t3);
            }
        }
    }

    @Override // o.InterfaceC9026qY1
    public T b() {
        return (T) this.m.a(this.e);
    }

    @Override // o.InterfaceC9026qY1
    public void c(T t2, byte[] bArr, int i, int i2, C6842he.b bVar) throws IOException {
        if (this.h) {
            f0(t2, bArr, i, i2, bVar);
        } else {
            e0(t2, bArr, i, i2, 0, bVar);
        }
    }

    public final <K, V> int c0(T t2, byte[] bArr, int i, int i2, int i3, long j, C6842he.b bVar) throws IOException {
        Unsafe unsafe = z;
        Object u2 = u(i3);
        Object object = unsafe.getObject(t2, j);
        if (this.q.h(object)) {
            Object d = this.q.d(u2);
            this.q.a(d, object);
            unsafe.putObject(t2, j, d);
            object = d;
        }
        return m(bArr, i, i2, this.q.b(u2), this.q.c(object), bVar);
    }

    @Override // o.InterfaceC9026qY1
    public void d(T t2) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long W = W(u0(this.j[i2]));
            Object O = TB2.O(t2, W);
            if (O != null) {
                TB2.q0(t2, W, this.q.f(O));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.c(t2, this.j[i]);
            i++;
        }
        this.f578o.j(t2);
        if (this.f) {
            this.p.f(t2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int d0(T t2, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C6842he.b bVar) throws IOException {
        Object object;
        Unsafe unsafe = z;
        long j2 = this.a[i8 + 2] & t;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t2, j, Double.valueOf(C6842he.d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t2, j2, i4);
                    return i9;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t2, j, Float.valueOf(C6842he.l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(t2, j2, i4);
                    return i10;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int L = C6842he.L(bArr, i, bVar);
                    unsafe.putObject(t2, j, Long.valueOf(bVar.b));
                    unsafe.putInt(t2, j2, i4);
                    return L;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    int I = C6842he.I(bArr, i, bVar);
                    unsafe.putObject(t2, j, Integer.valueOf(bVar.a));
                    unsafe.putInt(t2, j2, i4);
                    return I;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t2, j, Long.valueOf(C6842he.j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(t2, j2, i4);
                    return i11;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t2, j, Integer.valueOf(C6842he.h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(t2, j2, i4);
                    return i12;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int L2 = C6842he.L(bArr, i, bVar);
                    unsafe.putObject(t2, j, Boolean.valueOf(bVar.b != 0));
                    unsafe.putInt(t2, j2, i4);
                    return L2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int I2 = C6842he.I(bArr, i, bVar);
                    int i13 = bVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(t2, j, "");
                    } else if ((i6 & 536870912) != 0 && !BD2.u(bArr, I2, I2 + i13)) {
                        throw C9258rT0.d();
                    } else {
                        unsafe.putObject(t2, j, new String(bArr, I2, i13, C9740tS0.a));
                        I2 += i13;
                    }
                    unsafe.putInt(t2, j2, i4);
                    return I2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int p = C6842he.p(v(i8), bArr, i, i2, bVar);
                    object = unsafe.getInt(t2, j2) == i4 ? unsafe.getObject(t2, j) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j, bVar.c);
                    } else {
                        unsafe.putObject(t2, j, C9740tS0.v(object, bVar.c));
                    }
                    unsafe.putInt(t2, j2, i4);
                    return p;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int b = C6842he.b(bArr, i, bVar);
                    unsafe.putObject(t2, j, bVar.c);
                    unsafe.putInt(t2, j2, i4);
                    return b;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int I3 = C6842he.I(bArr, i, bVar);
                    int i14 = bVar.a;
                    C9740tS0.e t3 = t(i8);
                    if (t3 != null && !t3.a(i14)) {
                        w(t2).r(i3, Long.valueOf(i14));
                        return I3;
                    }
                    unsafe.putObject(t2, j, Integer.valueOf(i14));
                    unsafe.putInt(t2, j2, i4);
                    return I3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int I4 = C6842he.I(bArr, i, bVar);
                    unsafe.putObject(t2, j, Integer.valueOf(KE.b(bVar.a)));
                    unsafe.putInt(t2, j2, i4);
                    return I4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int L3 = C6842he.L(bArr, i, bVar);
                    unsafe.putObject(t2, j, Long.valueOf(KE.c(bVar.b)));
                    unsafe.putInt(t2, j2, i4);
                    return L3;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    int n = C6842he.n(v(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                    object = unsafe.getInt(t2, j2) == i4 ? unsafe.getObject(t2, j) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j, bVar.c);
                    } else {
                        unsafe.putObject(t2, j, C9740tS0.v(object, bVar.c));
                    }
                    unsafe.putInt(t2, j2, i4);
                    return n;
                }
                break;
        }
        return i;
    }

    @Override // o.InterfaceC9026qY1
    public final boolean e(T t2) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k; i4++) {
            int i5 = this.j[i4];
            int V = V(i5);
            int u0 = u0(i5);
            if (!this.h) {
                int i6 = this.a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = z.getInt(t2, i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (K(u0) && !E(t2, i5, i3, i)) {
                return false;
            }
            int t0 = t0(u0);
            if (t0 != 9 && t0 != 17) {
                if (t0 != 27) {
                    if (t0 != 60 && t0 != 68) {
                        if (t0 != 49) {
                            if (t0 == 50 && !H(t2, u0, i5)) {
                                return false;
                            }
                        }
                    } else if (J(t2, V, i5) && !F(t2, u0, v(i5))) {
                        return false;
                    }
                }
                if (!G(t2, u0, i5)) {
                    return false;
                }
            } else if (E(t2, i5, i3, i) && !F(t2, u0, v(i5))) {
                return false;
            }
        }
        if (this.f && !this.p.c(t2).E()) {
            return false;
        }
        return true;
    }

    public int e0(T t2, byte[] bArr, int i, int i2, int i3, C6842he.b bVar) throws IOException {
        T t3;
        Unsafe unsafe;
        C3833Oi1<T> c3833Oi1;
        int h0;
        int i4;
        int i5;
        int i6;
        C6842he.b bVar2;
        int i7;
        int i8;
        T t4;
        int G;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        T t5;
        Unsafe unsafe2;
        byte[] bArr2;
        int i17;
        Unsafe unsafe3;
        byte[] bArr3;
        int I;
        int i18;
        int i19;
        byte[] bArr4;
        int p;
        C3833Oi1<T> c3833Oi12 = this;
        T t6 = t2;
        byte[] bArr5 = bArr;
        int i20 = i2;
        C6842he.b bVar3 = bVar;
        Unsafe unsafe4 = z;
        int i21 = -1;
        int i22 = i;
        int i23 = -1;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                int i29 = bArr5[i22];
                if (i29 < 0) {
                    i28 = C6842he.H(i29, bArr5, i28, bVar3);
                    i29 = bVar3.a;
                }
                int i30 = i28;
                i27 = i29;
                int i31 = i27 >>> 3;
                int i32 = i27 & 7;
                if (i31 > i23) {
                    h0 = c3833Oi12.i0(i31, i25 / 3);
                } else {
                    h0 = c3833Oi12.h0(i31);
                }
                if (h0 == i21) {
                    i4 = i30;
                    unsafe = unsafe4;
                    i5 = i24;
                    i6 = i31;
                    bVar2 = bVar;
                    c3833Oi1 = c3833Oi12;
                    i7 = i27;
                    i8 = 0;
                } else {
                    int i33 = c3833Oi12.a[h0 + 1];
                    int t0 = t0(i33);
                    int i34 = i24;
                    long W = W(i33);
                    if (t0 <= 17) {
                        int i35 = c3833Oi12.a[h0 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & t;
                        i6 = i31;
                        if (i37 != i34) {
                            i12 = t0;
                            if (i34 != -1) {
                                unsafe4.putInt(t6, i34, i26);
                            }
                            i14 = i37;
                            i13 = unsafe4.getInt(t6, i37);
                        } else {
                            i12 = t0;
                            i13 = i26;
                            i14 = i34;
                        }
                        switch (i12) {
                            case 0:
                                i15 = h0;
                                i16 = i30;
                                bVar2 = bVar;
                                t5 = t6;
                                unsafe2 = unsafe4;
                                bArr2 = bArr;
                                if (i32 == 1) {
                                    TB2.g0(t5, W, C6842he.d(bArr2, i16));
                                    i22 = i16 + 8;
                                    i17 = i13 | i36;
                                    i20 = i2;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i26 = i17;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe2;
                                    t6 = t5;
                                    i21 = -1;
                                    break;
                                } else {
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 1:
                                i15 = h0;
                                i16 = i30;
                                bVar2 = bVar;
                                t5 = t6;
                                unsafe2 = unsafe4;
                                bArr2 = bArr;
                                if (i32 == 5) {
                                    TB2.i0(t5, W, C6842he.l(bArr2, i16));
                                    i22 = i16 + 4;
                                    i17 = i13 | i36;
                                    i20 = i2;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i26 = i17;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe2;
                                    t6 = t5;
                                    i21 = -1;
                                    break;
                                } else {
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 2:
                            case 3:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i16 = i30;
                                bArr2 = bArr;
                                bVar2 = bVar;
                                if (i32 == 0) {
                                    int L = C6842he.L(bArr2, i16, bVar2);
                                    T t7 = t6;
                                    unsafe2 = unsafe3;
                                    unsafe2.putLong(t7, W, bVar2.b);
                                    t5 = t7;
                                    i17 = i13 | i36;
                                    i20 = i2;
                                    i22 = L;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i26 = i17;
                                    bArr5 = bArr2;
                                    unsafe4 = unsafe2;
                                    t6 = t5;
                                    i21 = -1;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 4:
                            case 11:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i16 = i30;
                                bArr3 = bArr;
                                bVar2 = bVar;
                                if (i32 == 0) {
                                    I = C6842he.I(bArr3, i16, bVar2);
                                    unsafe3.putInt(t6, W, bVar2.a);
                                    Unsafe unsafe5 = unsafe3;
                                    i22 = I;
                                    bArr5 = bArr3;
                                    unsafe4 = unsafe5;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i21 = -1;
                                    i26 = i13 | i36;
                                    i20 = i2;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 5:
                            case 14:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                bArr3 = bArr;
                                bVar2 = bVar;
                                if (i32 == 1) {
                                    T t8 = t6;
                                    unsafe3.putLong(t8, W, C6842he.j(bArr3, i30));
                                    unsafe3 = unsafe3;
                                    t6 = t8;
                                    I = i30 + 8;
                                    Unsafe unsafe52 = unsafe3;
                                    i22 = I;
                                    bArr5 = bArr3;
                                    unsafe4 = unsafe52;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i21 = -1;
                                    i26 = i13 | i36;
                                    i20 = i2;
                                    break;
                                } else {
                                    i16 = i30;
                                    unsafe2 = unsafe3;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr3 = bArr;
                                bVar2 = bVar;
                                if (i32 == 5) {
                                    unsafe3.putInt(t6, W, C6842he.h(bArr3, i18));
                                    I = i18 + 4;
                                    Unsafe unsafe522 = unsafe3;
                                    i22 = I;
                                    bArr5 = bArr3;
                                    unsafe4 = unsafe522;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i21 = -1;
                                    i26 = i13 | i36;
                                    i20 = i2;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 7:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr3 = bArr;
                                bVar2 = bVar;
                                if (i32 == 0) {
                                    I = C6842he.L(bArr3, i18, bVar2);
                                    TB2.X(t6, W, bVar2.b != 0);
                                    Unsafe unsafe5222 = unsafe3;
                                    i22 = I;
                                    bArr5 = bArr3;
                                    unsafe4 = unsafe5222;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i21 = -1;
                                    i26 = i13 | i36;
                                    i20 = i2;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 8:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr3 = bArr;
                                bVar2 = bVar;
                                if (i32 == 2) {
                                    if ((i33 & 536870912) == 0) {
                                        I = C6842he.C(bArr3, i18, bVar2);
                                    } else {
                                        I = C6842he.F(bArr3, i18, bVar2);
                                    }
                                    unsafe3.putObject(t6, W, bVar2.c);
                                    Unsafe unsafe52222 = unsafe3;
                                    i22 = I;
                                    bArr5 = bArr3;
                                    unsafe4 = unsafe52222;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i21 = -1;
                                    i26 = i13 | i36;
                                    i20 = i2;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 9:
                                i19 = i20;
                                bVar2 = bVar;
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr4 = bArr;
                                if (i32 == 2) {
                                    p = C6842he.p(c3833Oi12.v(i15), bArr4, i18, i19, bVar2);
                                    if ((i13 & i36) == 0) {
                                        unsafe3.putObject(t6, W, bVar2.c);
                                    } else {
                                        unsafe3.putObject(t6, W, C9740tS0.v(unsafe3.getObject(t6, W), bVar2.c));
                                    }
                                    Unsafe unsafe6 = unsafe3;
                                    i22 = p;
                                    bArr5 = bArr4;
                                    unsafe4 = unsafe6;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i26 = i13 | i36;
                                    i20 = i19;
                                    i21 = -1;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 10:
                                i19 = i20;
                                bVar2 = bVar;
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr4 = bArr;
                                if (i32 == 2) {
                                    p = C6842he.b(bArr4, i18, bVar2);
                                    unsafe3.putObject(t6, W, bVar2.c);
                                    Unsafe unsafe62 = unsafe3;
                                    i22 = p;
                                    bArr5 = bArr4;
                                    unsafe4 = unsafe62;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i26 = i13 | i36;
                                    i20 = i19;
                                    i21 = -1;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 12:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr4 = bArr;
                                bVar2 = bVar;
                                i19 = i20;
                                if (i32 == 0) {
                                    p = C6842he.I(bArr4, i18, bVar2);
                                    int i38 = bVar2.a;
                                    C9740tS0.e t9 = c3833Oi12.t(i15);
                                    if (t9 != null && !t9.a(i38)) {
                                        w(t6).r(i27, Long.valueOf(i38));
                                        i22 = p;
                                        bArr5 = bArr4;
                                        unsafe4 = unsafe3;
                                        i20 = i19;
                                        bVar3 = bVar2;
                                        i24 = i14;
                                        i26 = i13;
                                        i25 = i15;
                                        i23 = i6;
                                        i21 = -1;
                                    } else {
                                        unsafe3.putInt(t6, W, i38);
                                        Unsafe unsafe622 = unsafe3;
                                        i22 = p;
                                        bArr5 = bArr4;
                                        unsafe4 = unsafe622;
                                        bVar3 = bVar2;
                                        i24 = i14;
                                        i25 = i15;
                                        i23 = i6;
                                        i26 = i13 | i36;
                                        i20 = i19;
                                        i21 = -1;
                                        break;
                                    }
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                                break;
                            case 15:
                                i15 = h0;
                                unsafe3 = unsafe4;
                                i18 = i30;
                                bArr4 = bArr;
                                bVar2 = bVar;
                                i19 = i20;
                                if (i32 == 0) {
                                    p = C6842he.I(bArr4, i18, bVar2);
                                    unsafe3.putInt(t6, W, KE.b(bVar2.a));
                                    Unsafe unsafe6222 = unsafe3;
                                    i22 = p;
                                    bArr5 = bArr4;
                                    unsafe4 = unsafe6222;
                                    bVar3 = bVar2;
                                    i24 = i14;
                                    i25 = i15;
                                    i23 = i6;
                                    i26 = i13 | i36;
                                    i20 = i19;
                                    i21 = -1;
                                    break;
                                } else {
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 16:
                                i15 = h0;
                                i18 = i30;
                                if (i32 == 0) {
                                    int L2 = C6842he.L(bArr, i18, bVar);
                                    T t10 = t6;
                                    Unsafe unsafe7 = unsafe4;
                                    unsafe7.putLong(t10, W, KE.c(bVar.b));
                                    t6 = t10;
                                    int i39 = i14;
                                    i26 = i13 | i36;
                                    bArr5 = bArr;
                                    unsafe4 = unsafe7;
                                    i22 = L2;
                                    bVar3 = bVar;
                                    i24 = i39;
                                    i20 = i2;
                                    i25 = i15;
                                    i23 = i6;
                                    i21 = -1;
                                    break;
                                } else {
                                    unsafe3 = unsafe4;
                                    bVar2 = bVar;
                                    unsafe2 = unsafe3;
                                    i16 = i18;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            case 17:
                                if (i32 == 3) {
                                    int i40 = h0;
                                    int n = C6842he.n(c3833Oi12.v(h0), bArr, i30, i20, (i6 << 3) | 4, bVar);
                                    if ((i13 & i36) == 0) {
                                        unsafe4.putObject(t6, W, bVar.c);
                                    } else {
                                        unsafe4.putObject(t6, W, C9740tS0.v(unsafe4.getObject(t6, W), bVar.c));
                                    }
                                    i22 = n;
                                    bArr5 = bArr;
                                    bVar3 = bVar;
                                    i24 = i14;
                                    i25 = i40;
                                    i21 = -1;
                                    i20 = i2;
                                    i26 = i13 | i36;
                                    i23 = i6;
                                    break;
                                } else {
                                    i15 = h0;
                                    bVar2 = bVar;
                                    unsafe2 = unsafe4;
                                    i16 = i30;
                                    c3833Oi1 = c3833Oi12;
                                    unsafe = unsafe2;
                                    i4 = i16;
                                    i5 = i14;
                                    i7 = i27;
                                    i26 = i13;
                                    i8 = i15;
                                    break;
                                }
                            default:
                                bVar2 = bVar;
                                i15 = h0;
                                unsafe2 = unsafe4;
                                i16 = i30;
                                c3833Oi1 = c3833Oi12;
                                unsafe = unsafe2;
                                i4 = i16;
                                i5 = i14;
                                i7 = i27;
                                i26 = i13;
                                i8 = i15;
                                break;
                        }
                    } else {
                        int i41 = h0;
                        i6 = i31;
                        T t11 = t6;
                        Unsafe unsafe8 = unsafe4;
                        i5 = i34;
                        if (t0 == 27) {
                            if (i32 == 2) {
                                C9740tS0.k kVar = (C9740tS0.k) unsafe8.getObject(t11, W);
                                if (!kVar.X2()) {
                                    int size = kVar.size();
                                    kVar = kVar.o(size == 0 ? 10 : size * 2);
                                    unsafe8.putObject(t11, W, kVar);
                                }
                                unsafe4 = unsafe8;
                                bArr5 = bArr;
                                i20 = i2;
                                bVar3 = bVar;
                                i22 = C6842he.q(c3833Oi12.v(i41), i27, bArr, i30, i2, kVar, bVar);
                                t6 = t11;
                                i25 = i41;
                                i23 = i6;
                                i24 = i5;
                                i21 = -1;
                            } else {
                                unsafe = unsafe8;
                                i11 = i30;
                                i9 = i26;
                                i10 = i27;
                                i8 = i41;
                                c3833Oi1 = this;
                                bVar2 = bVar;
                                i4 = i11;
                                i7 = i10;
                            }
                        } else if (t0 <= 49) {
                            unsafe = unsafe8;
                            i9 = i26;
                            int g0 = c3833Oi12.g0(t2, bArr, i30, i2, i27, i6, i32, i41, i33, t0, W, bVar);
                            i10 = i27;
                            i8 = i41;
                            if (g0 != i30) {
                                c3833Oi12 = this;
                                t6 = t2;
                                bArr5 = bArr;
                                i20 = i2;
                                i22 = g0;
                                i25 = i8;
                                i26 = i9;
                                i23 = i6;
                                i24 = i5;
                                unsafe4 = unsafe;
                                bVar3 = bVar;
                                i27 = i10;
                                i21 = -1;
                            } else {
                                c3833Oi1 = this;
                                bVar2 = bVar;
                                i4 = g0;
                                i7 = i10;
                            }
                        } else {
                            unsafe = unsafe8;
                            i9 = i26;
                            i10 = i27;
                            i8 = i41;
                            i11 = i30;
                            if (t0 != 50) {
                                int d0 = d0(t2, bArr, i11, i2, i10, i6, i32, i33, t0, W, i8, bVar);
                                c3833Oi1 = this;
                                i7 = i10;
                                bVar2 = bVar;
                                if (d0 != i11) {
                                    t6 = t2;
                                    bArr5 = bArr;
                                    i20 = i2;
                                    i22 = d0;
                                    bVar3 = bVar2;
                                    i25 = i8;
                                    i26 = i9;
                                    i23 = i6;
                                    i24 = i5;
                                    i21 = -1;
                                    i27 = i7;
                                    c3833Oi12 = c3833Oi1;
                                    unsafe4 = unsafe;
                                } else {
                                    i4 = d0;
                                }
                            } else if (i32 == 2) {
                                int c0 = c0(t2, bArr, i11, i2, i8, W, bVar);
                                if (c0 != i11) {
                                    c3833Oi12 = this;
                                    t6 = t2;
                                    bArr5 = bArr;
                                    i20 = i2;
                                    bVar3 = bVar;
                                    i22 = c0;
                                    i25 = i8;
                                    i26 = i9;
                                    i23 = i6;
                                    i24 = i5;
                                    unsafe4 = unsafe;
                                    i27 = i10;
                                    i21 = -1;
                                } else {
                                    c3833Oi1 = this;
                                    bVar2 = bVar;
                                    i4 = c0;
                                    i7 = i10;
                                }
                            } else {
                                c3833Oi1 = this;
                                bVar2 = bVar;
                                i4 = i11;
                                i7 = i10;
                            }
                        }
                        i26 = i9;
                    }
                }
                if (i7 != i3 || i3 == 0) {
                    if (c3833Oi1.f && bVar2.d != C3151Hj0.d()) {
                        G = C6842he.g(i7, bArr, i4, i2, t2, c3833Oi1.e, c3833Oi1.f578o, bVar2);
                        t4 = t2;
                        i20 = i2;
                    } else {
                        t4 = t2;
                        G = C6842he.G(i7, bArr, i4, i2, w(t4), bVar);
                        i20 = i2;
                    }
                    i22 = G;
                    bArr5 = bArr;
                    bVar3 = bVar;
                    t6 = t4;
                    i25 = i8;
                    i23 = i6;
                    i24 = i5;
                    i21 = -1;
                    i27 = i7;
                    c3833Oi12 = c3833Oi1;
                    unsafe4 = unsafe;
                } else {
                    t3 = t2;
                    i20 = i2;
                    i27 = i7;
                    i22 = i4;
                    i24 = i5;
                }
            } else {
                t3 = t6;
                unsafe = unsafe4;
                c3833Oi1 = c3833Oi12;
            }
        }
        if (i24 != -1) {
            unsafe.putInt(t3, i24, i26);
        }
        C10888yA2 c10888yA2 = null;
        for (int i42 = c3833Oi1.k; i42 < c3833Oi1.l; i42++) {
            c10888yA2 = (C10888yA2) c3833Oi1.q(t3, c3833Oi1.j[i42], c10888yA2, c3833Oi1.f578o);
        }
        if (c10888yA2 != null) {
            c3833Oi1.f578o.o(t3, c10888yA2);
        }
        if (i3 == 0) {
            if (i22 != i20) {
                throw C9258rT0.h();
            }
        } else if (i22 > i20 || i27 != i3) {
            throw C9258rT0.h();
        }
        return i22;
    }

    @Override // o.InterfaceC9026qY1
    public void f(T t2, NN2 nn2) throws IOException {
        if (nn2.y() == NN2.a.DESCENDING) {
            x0(t2, nn2);
        } else if (this.h) {
            w0(t2, nn2);
        } else {
            v0(t2, nn2);
        }
    }

    public final int f0(T t2, byte[] bArr, int i, int i2, C6842he.b bVar) throws IOException {
        int h0;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe2;
        int L;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        C3833Oi1<T> c3833Oi1 = this;
        byte[] bArr2 = bArr;
        int i10 = i2;
        C6842he.b bVar2 = bVar;
        Unsafe unsafe3 = z;
        int i11 = -1;
        int i12 = i;
        int i13 = -1;
        int i14 = 0;
        while (i12 < i10) {
            int i15 = i12 + 1;
            int i16 = bArr2[i12];
            if (i16 < 0) {
                i15 = C6842he.H(i16, bArr2, i15, bVar2);
                i16 = bVar2.a;
            }
            int i17 = i15;
            int i18 = i16;
            int i19 = i18 >>> 3;
            int i20 = i18 & 7;
            if (i19 > i13) {
                h0 = c3833Oi1.i0(i19, i14 / 3);
            } else {
                h0 = c3833Oi1.h0(i19);
            }
            int i21 = h0;
            if (i21 == i11) {
                unsafe = unsafe3;
                i3 = i17;
                i4 = i19;
                i21 = 0;
            } else {
                int i22 = c3833Oi1.a[i21 + 1];
                int t0 = t0(i22);
                long W = W(i22);
                if (t0 <= 17) {
                    switch (t0) {
                        case 0:
                            i5 = i18;
                            if (i20 == 1) {
                                TB2.g0(t2, W, C6842he.d(bArr2, i17));
                                i12 = i17 + 8;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe3;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 1:
                            i5 = i18;
                            if (i20 == 5) {
                                TB2.i0(t2, W, C6842he.l(bArr2, i17));
                                i12 = i17 + 4;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe3;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 2:
                        case 3:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 != 0) {
                                unsafe = unsafe2;
                                i6 = i17;
                                i7 = i19;
                                i8 = i5;
                                i3 = i6;
                                i4 = i7;
                                i18 = i8;
                                break;
                            } else {
                                L = C6842he.L(bArr2, i17, bVar2);
                                unsafe3 = unsafe2;
                                unsafe3.putLong(t2, W, bVar2.b);
                                i12 = L;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                        case 4:
                        case 11:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 0) {
                                i12 = C6842he.I(bArr2, i17, bVar2);
                                unsafe2.putInt(t2, W, bVar2.a);
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 5:
                        case 14:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 1) {
                                unsafe2.putLong(t2, W, C6842he.j(bArr2, i17));
                                unsafe2 = unsafe2;
                                i12 = i17 + 8;
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 6:
                        case 13:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 5) {
                                unsafe2.putInt(t2, W, C6842he.h(bArr2, i17));
                                i12 = i17 + 4;
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 7:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 0) {
                                i12 = C6842he.L(bArr2, i17, bVar2);
                                if (bVar2.b != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                TB2.X(t2, W, z2);
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 8:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 2) {
                                if ((536870912 & i22) == 0) {
                                    i12 = C6842he.C(bArr2, i17, bVar2);
                                } else {
                                    i12 = C6842he.F(bArr2, i17, bVar2);
                                }
                                unsafe2.putObject(t2, W, bVar2.c);
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 9:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 2) {
                                i12 = C6842he.p(c3833Oi1.v(i21), bArr2, i17, i10, bVar2);
                                Object object = unsafe2.getObject(t2, W);
                                if (object == null) {
                                    unsafe2.putObject(t2, W, bVar2.c);
                                } else {
                                    unsafe2.putObject(t2, W, C9740tS0.v(object, bVar2.c));
                                }
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 10:
                            i5 = i18;
                            unsafe2 = unsafe3;
                            if (i20 == 2) {
                                i12 = C6842he.b(bArr2, i17, bVar2);
                                unsafe2.putObject(t2, W, bVar2.c);
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i5;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 12:
                            unsafe2 = unsafe3;
                            if (i20 == 0) {
                                i12 = C6842he.I(bArr2, i17, bVar2);
                                unsafe2.putInt(t2, W, bVar2.a);
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i18;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 15:
                            unsafe2 = unsafe3;
                            if (i20 == 0) {
                                i12 = C6842he.I(bArr2, i17, bVar2);
                                unsafe2.putInt(t2, W, KE.b(bVar2.a));
                                unsafe3 = unsafe2;
                                i13 = i19;
                                i14 = i21;
                                break;
                            }
                            unsafe = unsafe2;
                            i6 = i17;
                            i7 = i19;
                            i8 = i18;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                        case 16:
                            if (i20 == 0) {
                                L = C6842he.L(bArr2, i17, bVar2);
                                unsafe3.putLong(t2, W, KE.c(bVar2.b));
                                unsafe3 = unsafe3;
                                i12 = L;
                                i13 = i19;
                                i14 = i21;
                                break;
                            } else {
                                unsafe2 = unsafe3;
                                unsafe = unsafe2;
                                i6 = i17;
                                i7 = i19;
                                i8 = i18;
                                i3 = i6;
                                i4 = i7;
                                i18 = i8;
                                break;
                            }
                        default:
                            unsafe = unsafe3;
                            i6 = i17;
                            i7 = i19;
                            i8 = i18;
                            i3 = i6;
                            i4 = i7;
                            i18 = i8;
                            break;
                    }
                } else {
                    i5 = i18;
                    if (t0 == 27) {
                        if (i20 == 2) {
                            C9740tS0.k kVar = (C9740tS0.k) unsafe3.getObject(t2, W);
                            if (!kVar.X2()) {
                                int size = kVar.size();
                                if (size == 0) {
                                    i9 = 10;
                                } else {
                                    i9 = size * 2;
                                }
                                kVar = kVar.o(i9);
                                unsafe3.putObject(t2, W, kVar);
                            }
                            unsafe = unsafe3;
                            i12 = C6842he.q(c3833Oi1.v(i21), i5, bArr2, i17, i10, kVar, bVar2);
                            bArr2 = bArr;
                            i10 = i2;
                            bVar2 = bVar;
                            i13 = i19;
                        }
                        unsafe = unsafe3;
                        i6 = i17;
                        i7 = i19;
                        i8 = i5;
                        i3 = i6;
                        i4 = i7;
                        i18 = i8;
                    } else {
                        unsafe = unsafe3;
                        if (t0 <= 49) {
                            int g0 = c3833Oi1.g0(t2, bArr, i17, i2, i5, i19, i20, i21, i22, t0, W, bVar);
                            i8 = i5;
                            i7 = i19;
                            i21 = i21;
                            if (g0 != i17) {
                                c3833Oi1 = this;
                                i10 = i2;
                                bVar2 = bVar;
                                i12 = g0;
                                i13 = i7;
                                i14 = i21;
                                unsafe3 = unsafe;
                                i11 = -1;
                                bArr2 = bArr;
                            } else {
                                i3 = g0;
                                i4 = i7;
                                i18 = i8;
                            }
                        } else {
                            i7 = i19;
                            i8 = i5;
                            i6 = i17;
                            if (t0 == 50) {
                                if (i20 == 2) {
                                    int c0 = c0(t2, bArr, i6, i2, i21, W, bVar);
                                    if (c0 != i6) {
                                        c3833Oi1 = this;
                                        bArr2 = bArr;
                                        i10 = i2;
                                        bVar2 = bVar;
                                        i12 = c0;
                                        i13 = i7;
                                    } else {
                                        i3 = c0;
                                        i4 = i7;
                                        i18 = i8;
                                    }
                                }
                                i3 = i6;
                                i4 = i7;
                                i18 = i8;
                            } else {
                                i4 = i7;
                                i18 = i8;
                                int d0 = d0(t2, bArr, i6, i2, i18, i4, i20, i22, t0, W, i21, bVar);
                                if (d0 != i6) {
                                    c3833Oi1 = this;
                                    i10 = i2;
                                    bVar2 = bVar;
                                    i13 = i4;
                                    i12 = d0;
                                    i14 = i21;
                                    unsafe3 = unsafe;
                                    i11 = -1;
                                    bArr2 = bArr;
                                } else {
                                    i3 = d0;
                                }
                            }
                        }
                    }
                    i14 = i21;
                    unsafe3 = unsafe;
                }
                i11 = -1;
            }
            i12 = C6842he.G(i18, bArr, i3, i2, w(t2), bVar);
            c3833Oi1 = this;
            bArr2 = bArr;
            bVar2 = bVar;
            i10 = i2;
            i13 = i4;
            i14 = i21;
            unsafe3 = unsafe;
            i11 = -1;
        }
        if (i12 == i10) {
            return i12;
        }
        throw C9258rT0.h();
    }

    @Override // o.InterfaceC9026qY1
    public int g(T t2) {
        if (this.h) {
            return z(t2);
        }
        return y(t2);
    }

    public final int g0(T t2, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C6842he.b bVar) throws IOException {
        int J;
        Unsafe unsafe = z;
        C9740tS0.k kVar = (C9740tS0.k) unsafe.getObject(t2, j2);
        if (!kVar.X2()) {
            int size = kVar.size();
            kVar = kVar.o(size == 0 ? 10 : size * 2);
            unsafe.putObject(t2, j2, kVar);
        }
        C9740tS0.k kVar2 = kVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C6842he.s(bArr, i, kVar2, bVar);
                }
                if (i5 == 1) {
                    return C6842he.e(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C6842he.v(bArr, i, kVar2, bVar);
                }
                if (i5 == 5) {
                    return C6842he.m(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C6842he.z(bArr, i, kVar2, bVar);
                }
                if (i5 == 0) {
                    return C6842he.M(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C6842he.y(bArr, i, kVar2, bVar);
                }
                if (i5 == 0) {
                    return C6842he.J(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C6842he.u(bArr, i, kVar2, bVar);
                }
                if (i5 == 1) {
                    return C6842he.k(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C6842he.t(bArr, i, kVar2, bVar);
                }
                if (i5 == 5) {
                    return C6842he.i(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C6842he.r(bArr, i, kVar2, bVar);
                }
                if (i5 == 0) {
                    return C6842he.a(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return C6842he.D(i3, bArr, i, i2, kVar2, bVar);
                    }
                    return C6842he.E(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return C6842he.q(v(i6), i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return C6842he.c(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    J = C6842he.y(bArr, i, kVar2, bVar);
                } else if (i5 == 0) {
                    J = C6842he.J(i3, bArr, i, i2, kVar2, bVar);
                }
                IC0 ic0 = (IC0) t2;
                C10888yA2 c10888yA2 = ic0.unknownFields;
                if (c10888yA2 == C10888yA2.e()) {
                    c10888yA2 = null;
                }
                C10888yA2 c10888yA22 = (C10888yA2) C11222zY1.C(i4, kVar2, t(i6), c10888yA2, this.f578o);
                if (c10888yA22 != null) {
                    ic0.unknownFields = c10888yA22;
                }
                return J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C6842he.w(bArr, i, kVar2, bVar);
                }
                if (i5 == 0) {
                    return C6842he.A(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C6842he.x(bArr, i, kVar2, bVar);
                }
                if (i5 == 0) {
                    return C6842he.B(i3, bArr, i, i2, kVar2, bVar);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return C6842he.o(v(i6), i3, bArr, i, i2, kVar2, bVar);
                }
                break;
        }
        return i;
    }

    @Override // o.InterfaceC9026qY1
    public int h(T t2) {
        int i;
        int s2;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int u0 = u0(i3);
            int V = V(i3);
            long W = W(u0);
            int i4 = 37;
            switch (t0(u0)) {
                case 0:
                    i = i2 * 53;
                    s2 = C9740tS0.s(Double.doubleToLongBits(TB2.D(t2, W)));
                    i2 = i + s2;
                    break;
                case 1:
                    i = i2 * 53;
                    s2 = Float.floatToIntBits(TB2.F(t2, W));
                    i2 = i + s2;
                    break;
                case 2:
                    i = i2 * 53;
                    s2 = C9740tS0.s(TB2.L(t2, W));
                    i2 = i + s2;
                    break;
                case 3:
                    i = i2 * 53;
                    s2 = C9740tS0.s(TB2.L(t2, W));
                    i2 = i + s2;
                    break;
                case 4:
                    i = i2 * 53;
                    s2 = TB2.I(t2, W);
                    i2 = i + s2;
                    break;
                case 5:
                    i = i2 * 53;
                    s2 = C9740tS0.s(TB2.L(t2, W));
                    i2 = i + s2;
                    break;
                case 6:
                    i = i2 * 53;
                    s2 = TB2.I(t2, W);
                    i2 = i + s2;
                    break;
                case 7:
                    i = i2 * 53;
                    s2 = C9740tS0.k(TB2.u(t2, W));
                    i2 = i + s2;
                    break;
                case 8:
                    i = i2 * 53;
                    s2 = ((String) TB2.O(t2, W)).hashCode();
                    i2 = i + s2;
                    break;
                case 9:
                    Object O = TB2.O(t2, W);
                    if (O != null) {
                        i4 = O.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    s2 = TB2.O(t2, W).hashCode();
                    i2 = i + s2;
                    break;
                case 11:
                    i = i2 * 53;
                    s2 = TB2.I(t2, W);
                    i2 = i + s2;
                    break;
                case 12:
                    i = i2 * 53;
                    s2 = TB2.I(t2, W);
                    i2 = i + s2;
                    break;
                case 13:
                    i = i2 * 53;
                    s2 = TB2.I(t2, W);
                    i2 = i + s2;
                    break;
                case 14:
                    i = i2 * 53;
                    s2 = C9740tS0.s(TB2.L(t2, W));
                    i2 = i + s2;
                    break;
                case 15:
                    i = i2 * 53;
                    s2 = TB2.I(t2, W);
                    i2 = i + s2;
                    break;
                case 16:
                    i = i2 * 53;
                    s2 = C9740tS0.s(TB2.L(t2, W));
                    i2 = i + s2;
                    break;
                case 17:
                    Object O2 = TB2.O(t2, W);
                    if (O2 != null) {
                        i4 = O2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    s2 = TB2.O(t2, W).hashCode();
                    i2 = i + s2;
                    break;
                case 50:
                    i = i2 * 53;
                    s2 = TB2.O(t2, W).hashCode();
                    i2 = i + s2;
                    break;
                case 51:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.s(Double.doubleToLongBits(Y(t2, W)));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = Float.floatToIntBits(Z(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.s(b0(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.s(b0(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = a0(t2, W);
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.s(b0(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = a0(t2, W);
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.k(X(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = ((String) TB2.O(t2, W)).hashCode();
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = TB2.O(t2, W).hashCode();
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = TB2.O(t2, W).hashCode();
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = a0(t2, W);
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = a0(t2, W);
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = a0(t2, W);
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.s(b0(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = a0(t2, W);
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = C9740tS0.s(b0(t2, W));
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(t2, V, i3)) {
                        i = i2 * 53;
                        s2 = TB2.O(t2, W).hashCode();
                        i2 = i + s2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f578o.g(t2).hashCode();
        if (this.f) {
            return (hashCode * 53) + this.p.c(t2).hashCode();
        }
        return hashCode;
    }

    public final int h0(int i) {
        if (i >= this.c && i <= this.d) {
            return r0(i, 0);
        }
        return -1;
    }

    @Override // o.InterfaceC9026qY1
    public void i(T t2, EO1 eo1, C3151Hj0 c3151Hj0) throws IOException {
        c3151Hj0.getClass();
        N(this.f578o, this.p, t2, eo1, c3151Hj0);
    }

    public final int i0(int i, int i2) {
        if (i >= this.c && i <= this.d) {
            return r0(i, i2);
        }
        return -1;
    }

    @Override // o.InterfaceC9026qY1
    public boolean j(T t2, T t3) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            if (!p(t2, t3, i)) {
                return false;
            }
        }
        if (!this.f578o.g(t2).equals(this.f578o.g(t3))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t2).equals(this.p.c(t3));
        }
        return true;
    }

    public final int j0(int i) {
        return this.a[i + 2];
    }

    public final boolean k(T t2, T t3, int i) {
        if (D(t2, i) == D(t3, i)) {
            return true;
        }
        return false;
    }

    public final <E> void k0(Object obj, long j, EO1 eo1, InterfaceC9026qY1<E> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        eo1.m(this.n.e(obj, j), interfaceC9026qY1, c3151Hj0);
    }

    public final <E> void l0(Object obj, int i, EO1 eo1, InterfaceC9026qY1<E> interfaceC9026qY1, C3151Hj0 c3151Hj0) throws IOException {
        eo1.i(this.n.e(obj, W(i)), interfaceC9026qY1, c3151Hj0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int m(byte[] bArr, int i, int i2, O71.b<K, V> bVar, Map<K, V> map, C6842he.b bVar2) throws IOException {
        int I = C6842he.I(bArr, i, bVar2);
        int i3 = bVar2.a;
        if (i3 >= 0 && i3 <= i2 - I) {
            int i4 = I + i3;
            Object obj = bVar.b;
            Object obj2 = bVar.d;
            while (I < i4) {
                int i5 = I + 1;
                int i6 = bArr[I];
                if (i6 < 0) {
                    i5 = C6842he.H(i6, bArr, i5, bVar2);
                    i6 = bVar2.a;
                }
                int i7 = i5;
                int i8 = i6 >>> 3;
                int i9 = i6 & 7;
                if (i8 != 1) {
                    if (i8 == 2 && i9 == bVar.c.g()) {
                        I = n(bArr, i7, i2, bVar.c, bVar.d.getClass(), bVar2);
                        obj2 = bVar2.c;
                    }
                    I = C6842he.N(i6, bArr, i7, i2, bVar2);
                } else if (i9 == bVar.a.g()) {
                    I = n(bArr, i7, i2, bVar.a, null, bVar2);
                    obj = bVar2.c;
                } else {
                    I = C6842he.N(i6, bArr, i7, i2, bVar2);
                }
            }
            if (I == i4) {
                map.put(obj, obj2);
                return i4;
            }
            throw C9258rT0.h();
        }
        throw C9258rT0.l();
    }

    public final void m0(Object obj, int i, EO1 eo1) throws IOException {
        if (C(i)) {
            TB2.q0(obj, W(i), eo1.R());
        } else if (this.g) {
            TB2.q0(obj, W(i), eo1.H());
        } else {
            TB2.q0(obj, W(i), eo1.t());
        }
    }

    public final int n(byte[] bArr, int i, int i2, IM2.b bVar, Class<?> cls, C6842he.b bVar2) throws IOException {
        boolean z2;
        switch (a.a[bVar.ordinal()]) {
            case 1:
                int L = C6842he.L(bArr, i, bVar2);
                if (bVar2.b != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bVar2.c = Boolean.valueOf(z2);
                return L;
            case 2:
                return C6842he.b(bArr, i, bVar2);
            case 3:
                bVar2.c = Double.valueOf(C6842he.d(bArr, i));
                return i + 8;
            case 4:
            case 5:
                bVar2.c = Integer.valueOf(C6842he.h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                bVar2.c = Long.valueOf(C6842he.j(bArr, i));
                return i + 8;
            case 8:
                bVar2.c = Float.valueOf(C6842he.l(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int I = C6842he.I(bArr, i, bVar2);
                bVar2.c = Integer.valueOf(bVar2.a);
                return I;
            case 12:
            case 13:
                int L2 = C6842he.L(bArr, i, bVar2);
                bVar2.c = Long.valueOf(bVar2.b);
                return L2;
            case 14:
                return C6842he.p(XJ1.a().i(cls), bArr, i, i2, bVar2);
            case 15:
                int I2 = C6842he.I(bArr, i, bVar2);
                bVar2.c = Integer.valueOf(KE.b(bVar2.a));
                return I2;
            case 16:
                int L3 = C6842he.L(bArr, i, bVar2);
                bVar2.c = Long.valueOf(KE.c(bVar2.b));
                return L3;
            case 17:
                return C6842he.F(bArr, i, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final void n0(Object obj, int i, EO1 eo1) throws IOException {
        if (C(i)) {
            eo1.s(this.n.e(obj, W(i)));
        } else {
            eo1.J(this.n.e(obj, W(i)));
        }
    }

    public final boolean p(T t2, T t3, int i) {
        int u0 = u0(i);
        long W = W(u0);
        switch (t0(u0)) {
            case 0:
                if (!k(t2, t3, i) || Double.doubleToLongBits(TB2.D(t2, W)) != Double.doubleToLongBits(TB2.D(t3, W))) {
                    return false;
                }
                return true;
            case 1:
                if (!k(t2, t3, i) || Float.floatToIntBits(TB2.F(t2, W)) != Float.floatToIntBits(TB2.F(t3, W))) {
                    return false;
                }
                return true;
            case 2:
                if (!k(t2, t3, i) || TB2.L(t2, W) != TB2.L(t3, W)) {
                    return false;
                }
                return true;
            case 3:
                if (!k(t2, t3, i) || TB2.L(t2, W) != TB2.L(t3, W)) {
                    return false;
                }
                return true;
            case 4:
                if (!k(t2, t3, i) || TB2.I(t2, W) != TB2.I(t3, W)) {
                    return false;
                }
                return true;
            case 5:
                if (!k(t2, t3, i) || TB2.L(t2, W) != TB2.L(t3, W)) {
                    return false;
                }
                return true;
            case 6:
                if (!k(t2, t3, i) || TB2.I(t2, W) != TB2.I(t3, W)) {
                    return false;
                }
                return true;
            case 7:
                if (!k(t2, t3, i) || TB2.u(t2, W) != TB2.u(t3, W)) {
                    return false;
                }
                return true;
            case 8:
                if (!k(t2, t3, i) || !C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W))) {
                    return false;
                }
                return true;
            case 9:
                if (!k(t2, t3, i) || !C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W))) {
                    return false;
                }
                return true;
            case 10:
                if (!k(t2, t3, i) || !C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W))) {
                    return false;
                }
                return true;
            case 11:
                if (!k(t2, t3, i) || TB2.I(t2, W) != TB2.I(t3, W)) {
                    return false;
                }
                return true;
            case 12:
                if (!k(t2, t3, i) || TB2.I(t2, W) != TB2.I(t3, W)) {
                    return false;
                }
                return true;
            case 13:
                if (!k(t2, t3, i) || TB2.I(t2, W) != TB2.I(t3, W)) {
                    return false;
                }
                return true;
            case 14:
                if (!k(t2, t3, i) || TB2.L(t2, W) != TB2.L(t3, W)) {
                    return false;
                }
                return true;
            case 15:
                if (!k(t2, t3, i) || TB2.I(t2, W) != TB2.I(t3, W)) {
                    return false;
                }
                return true;
            case 16:
                if (!k(t2, t3, i) || TB2.L(t2, W) != TB2.L(t3, W)) {
                    return false;
                }
                return true;
            case 17:
                if (!k(t2, t3, i) || !C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W));
            case 50:
                return C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!I(t2, t3, i) || !C11222zY1.N(TB2.O(t2, W), TB2.O(t3, W))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    public final void p0(T t2, int i) {
        if (this.h) {
            return;
        }
        int j0 = j0(i);
        long j = j0 & t;
        TB2.l0(t2, j, TB2.I(t2, j) | (1 << (j0 >>> 20)));
    }

    public final <UT, UB> UB q(Object obj, int i, UB ub, AbstractC10645xA2<UT, UB> abstractC10645xA2) {
        C9740tS0.e t2;
        int V = V(i);
        Object O = TB2.O(obj, W(u0(i)));
        if (O == null || (t2 = t(i)) == null) {
            return ub;
        }
        return (UB) r(i, V, this.q.c(O), t2, ub, abstractC10645xA2);
    }

    public final void q0(T t2, int i, int i2) {
        TB2.l0(t2, j0(i2) & t, i);
    }

    public final <K, V, UT, UB> UB r(int i, int i2, Map<K, V> map, C9740tS0.e eVar, UB ub, AbstractC10645xA2<UT, UB> abstractC10645xA2) {
        O71.b<?, ?> b = this.q.b(u(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC10645xA2.n();
                }
                AbstractC8616os.h b0 = AbstractC8616os.b0(O71.b(b, next.getKey(), next.getValue()));
                try {
                    O71.l(b0.b(), b, next.getKey(), next.getValue());
                    abstractC10645xA2.d(ub, i2, b0.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    public final int r0(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int V = V(i4);
            if (i == V) {
                return i4;
            }
            if (i < V) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final C9740tS0.e t(int i) {
        return (C9740tS0.e) this.b[((i / 3) * 2) + 1];
    }

    public final Object u(int i) {
        return this.b[(i / 3) * 2];
    }

    public final int u0(int i) {
        return this.a[i + 1];
    }

    public final InterfaceC9026qY1 v(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC9026qY1 interfaceC9026qY1 = (InterfaceC9026qY1) this.b[i2];
        if (interfaceC9026qY1 != null) {
            return interfaceC9026qY1;
        }
        InterfaceC9026qY1<T> i3 = XJ1.a().i((Class) this.b[i2 + 1]);
        this.b[i2] = i3;
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(T t2, NN2 nn2) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        if (this.f) {
            C11040yo0<?> c = this.p.c(t2);
            if (!c.C()) {
                it = c.H();
                entry = it.next();
                length = this.a.length;
                Unsafe unsafe = z;
                int i3 = -1;
                i = 0;
                int i4 = 0;
                while (i < length) {
                    int u0 = u0(i);
                    int V = V(i);
                    int t0 = t0(u0);
                    if (!this.h && t0 <= 17) {
                        int i5 = this.a[i + 2];
                        int i6 = i5 & t;
                        Map.Entry<?, ?> entry2 = entry;
                        z2 = true;
                        if (i6 != i3) {
                            i4 = unsafe.getInt(t2, i6);
                            i3 = i6;
                        }
                        i2 = 1 << (i5 >>> 20);
                        entry = entry2;
                    } else {
                        z2 = true;
                        entry = entry;
                        i2 = 0;
                    }
                    while (entry != null && this.p.a(entry) <= V) {
                        this.p.j(nn2, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    Iterator<Map.Entry<?, Object>> it2 = it;
                    int i7 = i2;
                    long W = W(u0);
                    switch (t0) {
                        case 0:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.u(V, o(t2, W));
                                break;
                            }
                        case 1:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.L(V, s(t2, W));
                                break;
                            }
                        case 2:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.B(V, unsafe.getLong(t2, W));
                                break;
                            }
                        case 3:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.h(V, unsafe.getLong(t2, W));
                                break;
                            }
                        case 4:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.l(V, unsafe.getInt(t2, W));
                                break;
                            }
                        case 5:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.x(V, unsafe.getLong(t2, W));
                                break;
                            }
                        case 6:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.c(V, unsafe.getInt(t2, W));
                                break;
                            }
                        case 7:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.C(V, l(t2, W));
                                break;
                            }
                        case 8:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                z0(V, unsafe.getObject(t2, W), nn2);
                                break;
                            }
                        case 9:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.i(V, unsafe.getObject(t2, W), v(i));
                                break;
                            }
                        case 10:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.e(V, (AbstractC8616os) unsafe.getObject(t2, W));
                                break;
                            }
                        case 11:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.s(V, unsafe.getInt(t2, W));
                                break;
                            }
                        case 12:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.O(V, unsafe.getInt(t2, W));
                                break;
                            }
                        case 13:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.E(V, unsafe.getInt(t2, W));
                                break;
                            }
                        case 14:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.m(V, unsafe.getLong(t2, W));
                                break;
                            }
                        case 15:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.R(V, unsafe.getInt(t2, W));
                                break;
                            }
                        case 16:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.q(V, unsafe.getLong(t2, W));
                                break;
                            }
                        case 17:
                            if ((i4 & i7) == 0) {
                                break;
                            } else {
                                nn2.t(V, unsafe.getObject(t2, W), v(i));
                                break;
                            }
                        case 18:
                            C11222zY1.Y(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 19:
                            C11222zY1.g0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 20:
                            C11222zY1.m0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 21:
                            C11222zY1.F0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 22:
                            C11222zY1.k0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 23:
                            C11222zY1.e0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 24:
                            C11222zY1.c0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 25:
                            C11222zY1.U(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 26:
                            C11222zY1.B0(V(i), (List) unsafe.getObject(t2, W), nn2);
                            break;
                        case 27:
                            C11222zY1.q0(V(i), (List) unsafe.getObject(t2, W), nn2, v(i));
                            break;
                        case 28:
                            C11222zY1.W(V(i), (List) unsafe.getObject(t2, W), nn2);
                            break;
                        case 29:
                            z3 = false;
                            C11222zY1.D0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 30:
                            z3 = false;
                            C11222zY1.a0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 31:
                            z3 = false;
                            C11222zY1.s0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 32:
                            z3 = false;
                            C11222zY1.u0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 33:
                            z3 = false;
                            C11222zY1.w0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 34:
                            z3 = false;
                            C11222zY1.y0(V(i), (List) unsafe.getObject(t2, W), nn2, false);
                            break;
                        case 35:
                            C11222zY1.Y(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 36:
                            C11222zY1.g0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 37:
                            C11222zY1.m0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 38:
                            C11222zY1.F0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 39:
                            C11222zY1.k0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 40:
                            C11222zY1.e0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 41:
                            C11222zY1.c0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 42:
                            C11222zY1.U(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 43:
                            C11222zY1.D0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 44:
                            C11222zY1.a0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 45:
                            C11222zY1.s0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 46:
                            C11222zY1.u0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 47:
                            C11222zY1.w0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 48:
                            C11222zY1.y0(V(i), (List) unsafe.getObject(t2, W), nn2, z2);
                            break;
                        case 49:
                            C11222zY1.i0(V(i), (List) unsafe.getObject(t2, W), nn2, v(i));
                            break;
                        case 50:
                            y0(nn2, V, unsafe.getObject(t2, W), i);
                            break;
                        case 51:
                            if (J(t2, V, i)) {
                                nn2.u(V, Y(t2, W));
                            }
                            break;
                        case 52:
                            if (J(t2, V, i)) {
                                nn2.L(V, Z(t2, W));
                            }
                            break;
                        case 53:
                            if (J(t2, V, i)) {
                                nn2.B(V, b0(t2, W));
                            }
                            break;
                        case 54:
                            if (J(t2, V, i)) {
                                nn2.h(V, b0(t2, W));
                            }
                            break;
                        case 55:
                            if (J(t2, V, i)) {
                                nn2.l(V, a0(t2, W));
                            }
                            break;
                        case 56:
                            if (J(t2, V, i)) {
                                nn2.x(V, b0(t2, W));
                            }
                            break;
                        case 57:
                            if (J(t2, V, i)) {
                                nn2.c(V, a0(t2, W));
                            }
                            break;
                        case 58:
                            if (J(t2, V, i)) {
                                nn2.C(V, X(t2, W));
                            }
                            break;
                        case 59:
                            if (J(t2, V, i)) {
                                z0(V, unsafe.getObject(t2, W), nn2);
                            }
                            break;
                        case 60:
                            if (J(t2, V, i)) {
                                nn2.i(V, unsafe.getObject(t2, W), v(i));
                            }
                            break;
                        case 61:
                            if (J(t2, V, i)) {
                                nn2.e(V, (AbstractC8616os) unsafe.getObject(t2, W));
                            }
                            break;
                        case 62:
                            if (J(t2, V, i)) {
                                nn2.s(V, a0(t2, W));
                            }
                            break;
                        case 63:
                            if (J(t2, V, i)) {
                                nn2.O(V, a0(t2, W));
                            }
                            break;
                        case 64:
                            if (J(t2, V, i)) {
                                nn2.E(V, a0(t2, W));
                            }
                            break;
                        case 65:
                            if (J(t2, V, i)) {
                                nn2.m(V, b0(t2, W));
                            }
                            break;
                        case 66:
                            if (J(t2, V, i)) {
                                nn2.R(V, a0(t2, W));
                            }
                            break;
                        case 67:
                            if (J(t2, V, i)) {
                                nn2.q(V, b0(t2, W));
                            }
                            break;
                        case 68:
                            if (J(t2, V, i)) {
                                nn2.t(V, unsafe.getObject(t2, W), v(i));
                            }
                            break;
                    }
                    i += 3;
                    it = it2;
                }
                Iterator<Map.Entry<?, Object>> it3 = it;
                while (entry != null) {
                    this.p.j(nn2, entry);
                    if (it3.hasNext()) {
                        entry = it3.next();
                    } else {
                        entry = null;
                    }
                }
                A0(this.f578o, t2, nn2);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        Unsafe unsafe2 = z;
        int i32 = -1;
        i = 0;
        int i42 = 0;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it32 = it;
        while (entry != null) {
        }
        A0(this.f578o, t2, nn2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(T t2, NN2 nn2) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        if (this.f) {
            C11040yo0<?> c = this.p.c(t2);
            if (!c.C()) {
                it = c.H();
                entry = it.next();
                length = this.a.length;
                for (i = 0; i < length; i += 3) {
                    int u0 = u0(i);
                    int V = V(i);
                    while (entry != null && this.p.a(entry) <= V) {
                        this.p.j(nn2, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (t0(u0)) {
                        case 0:
                            if (D(t2, i)) {
                                nn2.u(V, o(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (D(t2, i)) {
                                nn2.L(V, s(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (D(t2, i)) {
                                nn2.B(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (D(t2, i)) {
                                nn2.h(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (D(t2, i)) {
                                nn2.l(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (D(t2, i)) {
                                nn2.x(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (D(t2, i)) {
                                nn2.c(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (D(t2, i)) {
                                nn2.C(V, l(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (D(t2, i)) {
                                z0(V, TB2.O(t2, W(u0)), nn2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (D(t2, i)) {
                                nn2.i(V, TB2.O(t2, W(u0)), v(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (D(t2, i)) {
                                nn2.e(V, (AbstractC8616os) TB2.O(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (D(t2, i)) {
                                nn2.s(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (D(t2, i)) {
                                nn2.O(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (D(t2, i)) {
                                nn2.E(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (D(t2, i)) {
                                nn2.m(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (D(t2, i)) {
                                nn2.R(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (D(t2, i)) {
                                nn2.q(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (D(t2, i)) {
                                nn2.t(V, TB2.O(t2, W(u0)), v(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C11222zY1.Y(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 19:
                            C11222zY1.g0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 20:
                            C11222zY1.m0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 21:
                            C11222zY1.F0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 22:
                            C11222zY1.k0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 23:
                            C11222zY1.e0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 24:
                            C11222zY1.c0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 25:
                            C11222zY1.U(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 26:
                            C11222zY1.B0(V(i), (List) TB2.O(t2, W(u0)), nn2);
                            break;
                        case 27:
                            C11222zY1.q0(V(i), (List) TB2.O(t2, W(u0)), nn2, v(i));
                            break;
                        case 28:
                            C11222zY1.W(V(i), (List) TB2.O(t2, W(u0)), nn2);
                            break;
                        case 29:
                            C11222zY1.D0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 30:
                            C11222zY1.a0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 31:
                            C11222zY1.s0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 32:
                            C11222zY1.u0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 33:
                            C11222zY1.w0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 34:
                            C11222zY1.y0(V(i), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 35:
                            C11222zY1.Y(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 36:
                            C11222zY1.g0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 37:
                            C11222zY1.m0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 38:
                            C11222zY1.F0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 39:
                            C11222zY1.k0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 40:
                            C11222zY1.e0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 41:
                            C11222zY1.c0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 42:
                            C11222zY1.U(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 43:
                            C11222zY1.D0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 44:
                            C11222zY1.a0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 45:
                            C11222zY1.s0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 46:
                            C11222zY1.u0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 47:
                            C11222zY1.w0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 48:
                            C11222zY1.y0(V(i), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 49:
                            C11222zY1.i0(V(i), (List) TB2.O(t2, W(u0)), nn2, v(i));
                            break;
                        case 50:
                            y0(nn2, V, TB2.O(t2, W(u0)), i);
                            break;
                        case 51:
                            if (J(t2, V, i)) {
                                nn2.u(V, Y(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (J(t2, V, i)) {
                                nn2.L(V, Z(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (J(t2, V, i)) {
                                nn2.B(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (J(t2, V, i)) {
                                nn2.h(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (J(t2, V, i)) {
                                nn2.l(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (J(t2, V, i)) {
                                nn2.x(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (J(t2, V, i)) {
                                nn2.c(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (J(t2, V, i)) {
                                nn2.C(V, X(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (J(t2, V, i)) {
                                z0(V, TB2.O(t2, W(u0)), nn2);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (J(t2, V, i)) {
                                nn2.i(V, TB2.O(t2, W(u0)), v(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (J(t2, V, i)) {
                                nn2.e(V, (AbstractC8616os) TB2.O(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (J(t2, V, i)) {
                                nn2.s(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (J(t2, V, i)) {
                                nn2.O(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (J(t2, V, i)) {
                                nn2.E(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (J(t2, V, i)) {
                                nn2.m(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (J(t2, V, i)) {
                                nn2.R(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (J(t2, V, i)) {
                                nn2.q(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (J(t2, V, i)) {
                                nn2.t(V, TB2.O(t2, W(u0)), v(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.p.j(nn2, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                A0(this.f578o, t2, nn2);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        A0(this.f578o, t2, nn2);
    }

    public int x() {
        return this.a.length * 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(T t2, NN2 nn2) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        A0(this.f578o, t2, nn2);
        if (this.f) {
            C11040yo0<?> c = this.p.c(t2);
            if (!c.C()) {
                it = c.r();
                entry = it.next();
                for (length = this.a.length - 3; length >= 0; length -= 3) {
                    int u0 = u0(length);
                    int V = V(length);
                    while (entry != null && this.p.a(entry) > V) {
                        this.p.j(nn2, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (t0(u0)) {
                        case 0:
                            if (D(t2, length)) {
                                nn2.u(V, o(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (D(t2, length)) {
                                nn2.L(V, s(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (D(t2, length)) {
                                nn2.B(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (D(t2, length)) {
                                nn2.h(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (D(t2, length)) {
                                nn2.l(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (D(t2, length)) {
                                nn2.x(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (D(t2, length)) {
                                nn2.c(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (D(t2, length)) {
                                nn2.C(V, l(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (D(t2, length)) {
                                z0(V, TB2.O(t2, W(u0)), nn2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (D(t2, length)) {
                                nn2.i(V, TB2.O(t2, W(u0)), v(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (D(t2, length)) {
                                nn2.e(V, (AbstractC8616os) TB2.O(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (D(t2, length)) {
                                nn2.s(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (D(t2, length)) {
                                nn2.O(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (D(t2, length)) {
                                nn2.E(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (D(t2, length)) {
                                nn2.m(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (D(t2, length)) {
                                nn2.R(V, B(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (D(t2, length)) {
                                nn2.q(V, M(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (D(t2, length)) {
                                nn2.t(V, TB2.O(t2, W(u0)), v(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C11222zY1.Y(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 19:
                            C11222zY1.g0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 20:
                            C11222zY1.m0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 21:
                            C11222zY1.F0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 22:
                            C11222zY1.k0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 23:
                            C11222zY1.e0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 24:
                            C11222zY1.c0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 25:
                            C11222zY1.U(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 26:
                            C11222zY1.B0(V(length), (List) TB2.O(t2, W(u0)), nn2);
                            break;
                        case 27:
                            C11222zY1.q0(V(length), (List) TB2.O(t2, W(u0)), nn2, v(length));
                            break;
                        case 28:
                            C11222zY1.W(V(length), (List) TB2.O(t2, W(u0)), nn2);
                            break;
                        case 29:
                            C11222zY1.D0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 30:
                            C11222zY1.a0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 31:
                            C11222zY1.s0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 32:
                            C11222zY1.u0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 33:
                            C11222zY1.w0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 34:
                            C11222zY1.y0(V(length), (List) TB2.O(t2, W(u0)), nn2, false);
                            break;
                        case 35:
                            C11222zY1.Y(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 36:
                            C11222zY1.g0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 37:
                            C11222zY1.m0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 38:
                            C11222zY1.F0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 39:
                            C11222zY1.k0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 40:
                            C11222zY1.e0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 41:
                            C11222zY1.c0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 42:
                            C11222zY1.U(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 43:
                            C11222zY1.D0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 44:
                            C11222zY1.a0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 45:
                            C11222zY1.s0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 46:
                            C11222zY1.u0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 47:
                            C11222zY1.w0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 48:
                            C11222zY1.y0(V(length), (List) TB2.O(t2, W(u0)), nn2, true);
                            break;
                        case 49:
                            C11222zY1.i0(V(length), (List) TB2.O(t2, W(u0)), nn2, v(length));
                            break;
                        case 50:
                            y0(nn2, V, TB2.O(t2, W(u0)), length);
                            break;
                        case 51:
                            if (J(t2, V, length)) {
                                nn2.u(V, Y(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (J(t2, V, length)) {
                                nn2.L(V, Z(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (J(t2, V, length)) {
                                nn2.B(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (J(t2, V, length)) {
                                nn2.h(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (J(t2, V, length)) {
                                nn2.l(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (J(t2, V, length)) {
                                nn2.x(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (J(t2, V, length)) {
                                nn2.c(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (J(t2, V, length)) {
                                nn2.C(V, X(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (J(t2, V, length)) {
                                z0(V, TB2.O(t2, W(u0)), nn2);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (J(t2, V, length)) {
                                nn2.i(V, TB2.O(t2, W(u0)), v(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (J(t2, V, length)) {
                                nn2.e(V, (AbstractC8616os) TB2.O(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (J(t2, V, length)) {
                                nn2.s(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (J(t2, V, length)) {
                                nn2.O(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (J(t2, V, length)) {
                                nn2.E(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (J(t2, V, length)) {
                                nn2.m(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (J(t2, V, length)) {
                                nn2.R(V, a0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (J(t2, V, length)) {
                                nn2.q(V, b0(t2, W(u0)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (J(t2, V, length)) {
                                nn2.t(V, TB2.O(t2, W(u0)), v(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.p.j(nn2, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int y(T t2) {
        int i;
        int i2;
        int i0;
        int a0;
        boolean z2;
        int f;
        int i3;
        int X0;
        int Z0;
        Unsafe unsafe = z;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.a.length) {
            int u0 = u0(i5);
            int V = V(i5);
            int t0 = t0(u0);
            if (t0 <= 17) {
                i = this.a[i5 + 2];
                int i8 = 1048575 & i;
                int i9 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t2, i8);
                    i4 = i8;
                }
                i2 = i9;
            } else {
                i = (!this.i || t0 < EnumC11283zo0.J1.j() || t0 > EnumC11283zo0.W1.j()) ? 0 : this.a[i5 + 2] & t;
                i2 = 0;
            }
            long W = W(u0);
            int i10 = i4;
            switch (t0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        i0 = ME.i0(V, 0.0d);
                        i6 += i0;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        i0 = ME.q0(V, 0.0f);
                        i6 += i0;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        i0 = ME.y0(V, unsafe.getLong(t2, W));
                        i6 += i0;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        i0 = ME.a1(V, unsafe.getLong(t2, W));
                        i6 += i0;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        i0 = ME.w0(V, unsafe.getInt(t2, W));
                        i6 += i0;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        i0 = ME.o0(V, 0L);
                        i6 += i0;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        i0 = ME.m0(V, 0);
                        i6 += i0;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        a0 = ME.a0(V, true);
                        i6 += a0;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t2, W);
                        if (object instanceof AbstractC8616os) {
                            a0 = ME.g0(V, (AbstractC8616os) object);
                        } else {
                            a0 = ME.V0(V, (String) object);
                        }
                        i6 += a0;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        a0 = C11222zY1.p(V, unsafe.getObject(t2, W), v(i5));
                        i6 += a0;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        a0 = ME.g0(V, (AbstractC8616os) unsafe.getObject(t2, W));
                        i6 += a0;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        a0 = ME.Y0(V, unsafe.getInt(t2, W));
                        i6 += a0;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        a0 = ME.k0(V, unsafe.getInt(t2, W));
                        i6 += a0;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        a0 = ME.N0(V, 0);
                        i6 += a0;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        a0 = ME.P0(V, 0L);
                        i6 += a0;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        a0 = ME.R0(V, unsafe.getInt(t2, W));
                        i6 += a0;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        a0 = ME.T0(V, unsafe.getLong(t2, W));
                        i6 += a0;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        a0 = ME.t0(V, (InterfaceC3540Li1) unsafe.getObject(t2, W), v(i5));
                        i6 += a0;
                    }
                    break;
                case 18:
                    a0 = C11222zY1.h(V, (List) unsafe.getObject(t2, W), false);
                    i6 += a0;
                    break;
                case 19:
                    z2 = false;
                    f = C11222zY1.f(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 20:
                    z2 = false;
                    f = C11222zY1.n(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 21:
                    z2 = false;
                    f = C11222zY1.z(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 22:
                    z2 = false;
                    f = C11222zY1.l(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 23:
                    z2 = false;
                    f = C11222zY1.h(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 24:
                    z2 = false;
                    f = C11222zY1.f(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 25:
                    z2 = false;
                    f = C11222zY1.a(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 26:
                    a0 = C11222zY1.w(V, (List) unsafe.getObject(t2, W));
                    i6 += a0;
                    break;
                case 27:
                    a0 = C11222zY1.r(V, (List) unsafe.getObject(t2, W), v(i5));
                    i6 += a0;
                    break;
                case 28:
                    a0 = C11222zY1.c(V, (List) unsafe.getObject(t2, W));
                    i6 += a0;
                    break;
                case 29:
                    a0 = C11222zY1.x(V, (List) unsafe.getObject(t2, W), false);
                    i6 += a0;
                    break;
                case 30:
                    z2 = false;
                    f = C11222zY1.d(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 31:
                    z2 = false;
                    f = C11222zY1.f(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 32:
                    z2 = false;
                    f = C11222zY1.h(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 33:
                    z2 = false;
                    f = C11222zY1.s(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 34:
                    z2 = false;
                    f = C11222zY1.u(V, (List) unsafe.getObject(t2, W), false);
                    i6 += f;
                    break;
                case 35:
                    i3 = C11222zY1.i((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 36:
                    i3 = C11222zY1.g((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 37:
                    i3 = C11222zY1.o((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 38:
                    i3 = C11222zY1.A((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 39:
                    i3 = C11222zY1.m((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 40:
                    i3 = C11222zY1.i((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 41:
                    i3 = C11222zY1.g((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 42:
                    i3 = C11222zY1.b((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 43:
                    i3 = C11222zY1.y((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 44:
                    i3 = C11222zY1.e((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 45:
                    i3 = C11222zY1.g((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 46:
                    i3 = C11222zY1.i((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 47:
                    i3 = C11222zY1.t((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 48:
                    i3 = C11222zY1.v((List) unsafe.getObject(t2, W));
                    if (i3 > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i, i3);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i3);
                        i6 += X0 + Z0 + i3;
                    }
                    break;
                case 49:
                    a0 = C11222zY1.k(V, (List) unsafe.getObject(t2, W), v(i5));
                    i6 += a0;
                    break;
                case 50:
                    a0 = this.q.g(V, unsafe.getObject(t2, W), u(i5));
                    i6 += a0;
                    break;
                case 51:
                    if (J(t2, V, i5)) {
                        a0 = ME.i0(V, 0.0d);
                        i6 += a0;
                    }
                    break;
                case 52:
                    if (J(t2, V, i5)) {
                        a0 = ME.q0(V, 0.0f);
                        i6 += a0;
                    }
                    break;
                case 53:
                    if (J(t2, V, i5)) {
                        a0 = ME.y0(V, b0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 54:
                    if (J(t2, V, i5)) {
                        a0 = ME.a1(V, b0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 55:
                    if (J(t2, V, i5)) {
                        a0 = ME.w0(V, a0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 56:
                    if (J(t2, V, i5)) {
                        a0 = ME.o0(V, 0L);
                        i6 += a0;
                    }
                    break;
                case 57:
                    if (J(t2, V, i5)) {
                        a0 = ME.m0(V, 0);
                        i6 += a0;
                    }
                    break;
                case 58:
                    if (J(t2, V, i5)) {
                        a0 = ME.a0(V, true);
                        i6 += a0;
                    }
                    break;
                case 59:
                    if (J(t2, V, i5)) {
                        Object object2 = unsafe.getObject(t2, W);
                        if (object2 instanceof AbstractC8616os) {
                            a0 = ME.g0(V, (AbstractC8616os) object2);
                        } else {
                            a0 = ME.V0(V, (String) object2);
                        }
                        i6 += a0;
                    }
                    break;
                case 60:
                    if (J(t2, V, i5)) {
                        a0 = C11222zY1.p(V, unsafe.getObject(t2, W), v(i5));
                        i6 += a0;
                    }
                    break;
                case 61:
                    if (J(t2, V, i5)) {
                        a0 = ME.g0(V, (AbstractC8616os) unsafe.getObject(t2, W));
                        i6 += a0;
                    }
                    break;
                case 62:
                    if (J(t2, V, i5)) {
                        a0 = ME.Y0(V, a0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 63:
                    if (J(t2, V, i5)) {
                        a0 = ME.k0(V, a0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 64:
                    if (J(t2, V, i5)) {
                        a0 = ME.N0(V, 0);
                        i6 += a0;
                    }
                    break;
                case 65:
                    if (J(t2, V, i5)) {
                        a0 = ME.P0(V, 0L);
                        i6 += a0;
                    }
                    break;
                case 66:
                    if (J(t2, V, i5)) {
                        a0 = ME.R0(V, a0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 67:
                    if (J(t2, V, i5)) {
                        a0 = ME.T0(V, b0(t2, W));
                        i6 += a0;
                    }
                    break;
                case 68:
                    if (J(t2, V, i5)) {
                        a0 = ME.t0(V, (InterfaceC3540Li1) unsafe.getObject(t2, W), v(i5));
                        i6 += a0;
                    }
                    break;
            }
            i5 += 3;
            i4 = i10;
        }
        int A = i6 + A(this.f578o, t2);
        return this.f ? A + this.p.c(t2).z() : A;
    }

    public final <K, V> void y0(NN2 nn2, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            nn2.K(i, this.q.b(u(i2)), this.q.e(obj));
        }
    }

    public final int z(T t2) {
        int i0;
        int i;
        int X0;
        int Z0;
        Unsafe unsafe = z;
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.length; i3 += 3) {
            int u0 = u0(i3);
            int t0 = t0(u0);
            int V = V(i3);
            long W = W(u0);
            int i4 = (t0 < EnumC11283zo0.J1.j() || t0 > EnumC11283zo0.W1.j()) ? 0 : this.a[i3 + 2] & t;
            switch (t0) {
                case 0:
                    if (D(t2, i3)) {
                        i0 = ME.i0(V, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (D(t2, i3)) {
                        i0 = ME.q0(V, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (D(t2, i3)) {
                        i0 = ME.y0(V, TB2.L(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (D(t2, i3)) {
                        i0 = ME.a1(V, TB2.L(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (D(t2, i3)) {
                        i0 = ME.w0(V, TB2.I(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (D(t2, i3)) {
                        i0 = ME.o0(V, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (D(t2, i3)) {
                        i0 = ME.m0(V, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (D(t2, i3)) {
                        i0 = ME.a0(V, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (D(t2, i3)) {
                        Object O = TB2.O(t2, W);
                        if (O instanceof AbstractC8616os) {
                            i0 = ME.g0(V, (AbstractC8616os) O);
                            break;
                        } else {
                            i0 = ME.V0(V, (String) O);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (D(t2, i3)) {
                        i0 = C11222zY1.p(V, TB2.O(t2, W), v(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (D(t2, i3)) {
                        i0 = ME.g0(V, (AbstractC8616os) TB2.O(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (D(t2, i3)) {
                        i0 = ME.Y0(V, TB2.I(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (D(t2, i3)) {
                        i0 = ME.k0(V, TB2.I(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (D(t2, i3)) {
                        i0 = ME.N0(V, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (D(t2, i3)) {
                        i0 = ME.P0(V, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (D(t2, i3)) {
                        i0 = ME.R0(V, TB2.I(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (D(t2, i3)) {
                        i0 = ME.T0(V, TB2.L(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (D(t2, i3)) {
                        i0 = ME.t0(V, (InterfaceC3540Li1) TB2.O(t2, W), v(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i0 = C11222zY1.h(V, L(t2, W), false);
                    break;
                case 19:
                    i0 = C11222zY1.f(V, L(t2, W), false);
                    break;
                case 20:
                    i0 = C11222zY1.n(V, L(t2, W), false);
                    break;
                case 21:
                    i0 = C11222zY1.z(V, L(t2, W), false);
                    break;
                case 22:
                    i0 = C11222zY1.l(V, L(t2, W), false);
                    break;
                case 23:
                    i0 = C11222zY1.h(V, L(t2, W), false);
                    break;
                case 24:
                    i0 = C11222zY1.f(V, L(t2, W), false);
                    break;
                case 25:
                    i0 = C11222zY1.a(V, L(t2, W), false);
                    break;
                case 26:
                    i0 = C11222zY1.w(V, L(t2, W));
                    break;
                case 27:
                    i0 = C11222zY1.r(V, L(t2, W), v(i3));
                    break;
                case 28:
                    i0 = C11222zY1.c(V, L(t2, W));
                    break;
                case 29:
                    i0 = C11222zY1.x(V, L(t2, W), false);
                    break;
                case 30:
                    i0 = C11222zY1.d(V, L(t2, W), false);
                    break;
                case 31:
                    i0 = C11222zY1.f(V, L(t2, W), false);
                    break;
                case 32:
                    i0 = C11222zY1.h(V, L(t2, W), false);
                    break;
                case 33:
                    i0 = C11222zY1.s(V, L(t2, W), false);
                    break;
                case 34:
                    i0 = C11222zY1.u(V, L(t2, W), false);
                    break;
                case 35:
                    i = C11222zY1.i((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i = C11222zY1.g((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i = C11222zY1.o((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i = C11222zY1.A((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i = C11222zY1.m((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i = C11222zY1.i((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i = C11222zY1.g((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i = C11222zY1.b((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i = C11222zY1.y((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i = C11222zY1.e((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i = C11222zY1.g((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i = C11222zY1.i((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i = C11222zY1.t((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i = C11222zY1.v((List) unsafe.getObject(t2, W));
                    if (i > 0) {
                        if (this.i) {
                            unsafe.putInt(t2, i4, i);
                        }
                        X0 = ME.X0(V);
                        Z0 = ME.Z0(i);
                        i0 = X0 + Z0 + i;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i0 = C11222zY1.k(V, L(t2, W), v(i3));
                    break;
                case 50:
                    i0 = this.q.g(V, TB2.O(t2, W), u(i3));
                    break;
                case 51:
                    if (J(t2, V, i3)) {
                        i0 = ME.i0(V, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (J(t2, V, i3)) {
                        i0 = ME.q0(V, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (J(t2, V, i3)) {
                        i0 = ME.y0(V, b0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (J(t2, V, i3)) {
                        i0 = ME.a1(V, b0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (J(t2, V, i3)) {
                        i0 = ME.w0(V, a0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (J(t2, V, i3)) {
                        i0 = ME.o0(V, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (J(t2, V, i3)) {
                        i0 = ME.m0(V, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (J(t2, V, i3)) {
                        i0 = ME.a0(V, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (J(t2, V, i3)) {
                        Object O2 = TB2.O(t2, W);
                        if (O2 instanceof AbstractC8616os) {
                            i0 = ME.g0(V, (AbstractC8616os) O2);
                            break;
                        } else {
                            i0 = ME.V0(V, (String) O2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (J(t2, V, i3)) {
                        i0 = C11222zY1.p(V, TB2.O(t2, W), v(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (J(t2, V, i3)) {
                        i0 = ME.g0(V, (AbstractC8616os) TB2.O(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (J(t2, V, i3)) {
                        i0 = ME.Y0(V, a0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (J(t2, V, i3)) {
                        i0 = ME.k0(V, a0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (J(t2, V, i3)) {
                        i0 = ME.N0(V, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (J(t2, V, i3)) {
                        i0 = ME.P0(V, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (J(t2, V, i3)) {
                        i0 = ME.R0(V, a0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (J(t2, V, i3)) {
                        i0 = ME.T0(V, b0(t2, W));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (J(t2, V, i3)) {
                        i0 = ME.t0(V, (InterfaceC3540Li1) TB2.O(t2, W), v(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += i0;
        }
        return i2 + A(this.f578o, t2);
    }

    public final void z0(int i, Object obj, NN2 nn2) throws IOException {
        if (obj instanceof String) {
            nn2.g(i, (String) obj);
        } else {
            nn2.e(i, (AbstractC8616os) obj);
        }
    }
}
