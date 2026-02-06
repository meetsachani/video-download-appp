package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C3833Oi1;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhag<T> implements zzhaw<T> {
    public static final int[] m = new int[0];
    public static final Unsafe n = zzhbp.q();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzhad e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final zzhbi k;
    public final zzgyd l;

    public zzhag(int[] iArr, Object[] objArr, int i, int i2, zzhad zzhadVar, boolean z, int[] iArr2, int i3, int i4, zzhaj zzhajVar, zzgzq zzgzqVar, zzhbi zzhbiVar, zzgyd zzgydVar, zzgzy zzgzyVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzhadVar instanceof zzgys;
        boolean z2 = false;
        if (zzgydVar != null && (zzhadVar instanceof zzgyo)) {
            z2 = true;
        }
        this.f = z2;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = zzhbiVar;
        this.l = zzgydVar;
        this.e = zzhadVar;
    }

    public static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgys) {
            return ((zzgys) obj).i2();
        }
        return true;
    }

    public static boolean C(Object obj, long j) {
        return ((Boolean) zzhbp.p(obj, j)).booleanValue();
    }

    public static final void D(int i, Object obj, zzhbx zzhbxVar) throws IOException {
        if (obj instanceof String) {
            zzhbxVar.k(i, (String) obj);
        } else {
            zzhbxVar.F(i, (zzgxk) obj);
        }
    }

    public static zzhbj F(Object obj) {
        zzgys zzgysVar = (zzgys) obj;
        zzhbj zzhbjVar = zzgysVar.zzt;
        if (zzhbjVar == zzhbj.c()) {
            zzhbj f = zzhbj.f();
            zzgysVar.zzt = f;
            return f;
        }
        return zzhbjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzhag G(Class cls, zzhaa zzhaaVar, zzhaj zzhajVar, zzgzq zzgzqVar, zzhbi zzhbiVar, zzgyd zzgydVar, zzgzy zzgzyVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int objectFieldOffset;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field m2;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field m3;
        Object obj2;
        Field m4;
        int i33;
        char charAt11;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        if (zzhaaVar instanceof zzhap) {
            zzhap zzhapVar = (zzhap) zzhaaVar;
            String d = zzhapVar.d();
            int length = d.length();
            char c2 = 55296;
            if (d.charAt(0) >= 55296) {
                int i37 = 1;
                while (true) {
                    i = i37 + 1;
                    if (d.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i;
                }
            } else {
                i = 1;
            }
            int i38 = i + 1;
            int charAt15 = d.charAt(i);
            if (charAt15 >= 55296) {
                int i39 = charAt15 & 8191;
                int i40 = 13;
                while (true) {
                    i36 = i38 + 1;
                    charAt14 = d.charAt(i38);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i39 |= (charAt14 & 8191) << i40;
                    i40 += 13;
                    i38 = i36;
                }
                charAt15 = i39 | (charAt14 << i40);
                i38 = i36;
            }
            if (charAt15 == 0) {
                i3 = 0;
                i6 = 0;
                charAt = 0;
                i2 = 0;
                i4 = 0;
                i5 = 0;
                iArr = m;
                i7 = 0;
            } else {
                int i41 = i38 + 1;
                int charAt16 = d.charAt(i38);
                if (charAt16 >= 55296) {
                    int i42 = charAt16 & 8191;
                    int i43 = 13;
                    while (true) {
                        i15 = i41 + 1;
                        charAt9 = d.charAt(i41);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i42 |= (charAt9 & 8191) << i43;
                        i43 += 13;
                        i41 = i15;
                    }
                    charAt16 = i42 | (charAt9 << i43);
                    i41 = i15;
                }
                int i44 = i41 + 1;
                int charAt17 = d.charAt(i41);
                if (charAt17 >= 55296) {
                    int i45 = charAt17 & 8191;
                    int i46 = 13;
                    while (true) {
                        i14 = i44 + 1;
                        charAt8 = d.charAt(i44);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i45 |= (charAt8 & 8191) << i46;
                        i46 += 13;
                        i44 = i14;
                    }
                    charAt17 = i45 | (charAt8 << i46);
                    i44 = i14;
                }
                int i47 = i44 + 1;
                int charAt18 = d.charAt(i44);
                if (charAt18 >= 55296) {
                    int i48 = charAt18 & 8191;
                    int i49 = 13;
                    while (true) {
                        i13 = i47 + 1;
                        charAt7 = d.charAt(i47);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i48 |= (charAt7 & 8191) << i49;
                        i49 += 13;
                        i47 = i13;
                    }
                    charAt18 = i48 | (charAt7 << i49);
                    i47 = i13;
                }
                int i50 = i47 + 1;
                int charAt19 = d.charAt(i47);
                if (charAt19 >= 55296) {
                    int i51 = charAt19 & 8191;
                    int i52 = 13;
                    while (true) {
                        i12 = i50 + 1;
                        charAt6 = d.charAt(i50);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i51 |= (charAt6 & 8191) << i52;
                        i52 += 13;
                        i50 = i12;
                    }
                    charAt19 = i51 | (charAt6 << i52);
                    i50 = i12;
                }
                int i53 = i50 + 1;
                charAt = d.charAt(i50);
                if (charAt >= 55296) {
                    int i54 = charAt & 8191;
                    int i55 = 13;
                    while (true) {
                        i11 = i53 + 1;
                        charAt5 = d.charAt(i53);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i54 |= (charAt5 & 8191) << i55;
                        i55 += 13;
                        i53 = i11;
                    }
                    charAt = i54 | (charAt5 << i55);
                    i53 = i11;
                }
                int i56 = i53 + 1;
                int charAt20 = d.charAt(i53);
                if (charAt20 >= 55296) {
                    int i57 = charAt20 & 8191;
                    int i58 = 13;
                    while (true) {
                        i10 = i56 + 1;
                        charAt4 = d.charAt(i56);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i57 |= (charAt4 & 8191) << i58;
                        i58 += 13;
                        i56 = i10;
                    }
                    charAt20 = i57 | (charAt4 << i58);
                    i56 = i10;
                }
                int i59 = i56 + 1;
                int charAt21 = d.charAt(i56);
                if (charAt21 >= 55296) {
                    int i60 = charAt21 & 8191;
                    int i61 = 13;
                    while (true) {
                        i9 = i59 + 1;
                        charAt3 = d.charAt(i59);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i60 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i59 = i9;
                    }
                    charAt21 = i60 | (charAt3 << i61);
                    i59 = i9;
                }
                int i62 = i59 + 1;
                int charAt22 = d.charAt(i59);
                if (charAt22 >= 55296) {
                    int i63 = charAt22 & 8191;
                    int i64 = 13;
                    while (true) {
                        i8 = i62 + 1;
                        charAt2 = d.charAt(i62);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i63 |= (charAt2 & 8191) << i64;
                        i64 += 13;
                        i62 = i8;
                    }
                    charAt22 = i63 | (charAt2 << i64);
                    i62 = i8;
                }
                int i65 = charAt16 + charAt16 + charAt17;
                int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
                int i66 = charAt20;
                i2 = charAt18;
                i3 = i66;
                i4 = charAt19;
                i5 = charAt22;
                i6 = i65;
                iArr = iArr2;
                i7 = charAt16;
                i38 = i62;
            }
            Unsafe unsafe = n;
            Object[] e = zzhapVar.e();
            Class<?> cls2 = zzhapVar.a().getClass();
            int i67 = i5 + i3;
            int i68 = charAt + charAt;
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr = new Object[i68];
            int i69 = i5;
            int i70 = i67;
            int i71 = 0;
            int i72 = 0;
            while (i38 < length) {
                int i73 = i38 + 1;
                int charAt23 = d.charAt(i38);
                if (charAt23 >= c2) {
                    int i74 = charAt23 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i35 = i75 + 1;
                        charAt13 = d.charAt(i75);
                        if (charAt13 < c2) {
                            break;
                        }
                        i74 |= (charAt13 & 8191) << i76;
                        i76 += 13;
                        i75 = i35;
                    }
                    charAt23 = i74 | (charAt13 << i76);
                    i16 = i35;
                } else {
                    i16 = i73;
                }
                int i77 = i16 + 1;
                int charAt24 = d.charAt(i16);
                if (charAt24 >= c2) {
                    int i78 = charAt24 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i34 = i79 + 1;
                        charAt12 = d.charAt(i79);
                        if (charAt12 < c2) {
                            break;
                        }
                        i78 |= (charAt12 & 8191) << i80;
                        i80 += 13;
                        i79 = i34;
                    }
                    charAt24 = i78 | (charAt12 << i80);
                    i17 = i34;
                } else {
                    i17 = i77;
                }
                if ((charAt24 & 1024) != 0) {
                    iArr[i71] = i72;
                    i71++;
                }
                int i81 = charAt24 & 255;
                zzhap zzhapVar2 = zzhapVar;
                int i82 = charAt24 & 2048;
                if (i81 >= 51) {
                    int i83 = i17 + 1;
                    int charAt25 = d.charAt(i17);
                    char c3 = 55296;
                    if (charAt25 >= 55296) {
                        int i84 = charAt25 & 8191;
                        int i85 = i83;
                        int i86 = 13;
                        while (true) {
                            i33 = i85 + 1;
                            charAt11 = d.charAt(i85);
                            if (charAt11 < c3) {
                                break;
                            }
                            i84 |= (charAt11 & 8191) << i86;
                            i86 += 13;
                            i85 = i33;
                            c3 = 55296;
                        }
                        charAt25 = i84 | (charAt11 << i86);
                        i30 = i33;
                    } else {
                        i30 = i83;
                    }
                    int i87 = i30;
                    int i88 = i81 - 51;
                    i18 = length;
                    if (i88 != 9 && i88 != 17) {
                        if (i88 == 12) {
                            if (zzhapVar2.c() != 1 && i82 == 0) {
                                i32 = 0;
                                int i89 = charAt25 + charAt25;
                                obj = e[i89];
                                int i90 = i32;
                                if (obj instanceof Field) {
                                    m3 = (Field) obj;
                                } else {
                                    m3 = m(cls2, (String) obj);
                                    e[i89] = m3;
                                }
                                int i91 = i7;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(m3);
                                int i92 = i89 + 1;
                                obj2 = e[i92];
                                i19 = i91;
                                if (obj2 instanceof Field) {
                                    m4 = (Field) obj2;
                                } else {
                                    m4 = m(cls2, (String) obj2);
                                    e[i92] = m4;
                                }
                                i21 = (int) unsafe.objectFieldOffset(m4);
                                str = d;
                                i23 = i90;
                                i17 = i87;
                                i22 = 0;
                                c = 55296;
                            } else {
                                i31 = i6 + 1;
                                int i93 = i72 / 3;
                                objArr[i93 + i93 + 1] = e[i6];
                            }
                        }
                        i32 = i82;
                        int i892 = charAt25 + charAt25;
                        obj = e[i892];
                        int i902 = i32;
                        if (obj instanceof Field) {
                        }
                        int i912 = i7;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m3);
                        int i922 = i892 + 1;
                        obj2 = e[i922];
                        i19 = i912;
                        if (obj2 instanceof Field) {
                        }
                        i21 = (int) unsafe.objectFieldOffset(m4);
                        str = d;
                        i23 = i902;
                        i17 = i87;
                        i22 = 0;
                        c = 55296;
                    } else {
                        i31 = i6 + 1;
                        int i94 = i72 / 3;
                        objArr[i94 + i94 + 1] = e[i6];
                    }
                    i6 = i31;
                    i32 = i82;
                    int i8922 = charAt25 + charAt25;
                    obj = e[i8922];
                    int i9022 = i32;
                    if (obj instanceof Field) {
                    }
                    int i9122 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m3);
                    int i9222 = i8922 + 1;
                    obj2 = e[i9222];
                    i19 = i9122;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(m4);
                    str = d;
                    i23 = i9022;
                    i17 = i87;
                    i22 = 0;
                    c = 55296;
                } else {
                    i18 = length;
                    i19 = i7;
                    int i95 = i6 + 1;
                    Field m5 = m(cls2, (String) e[i6]);
                    if (i81 == 9 || i81 == 17) {
                        i20 = i95;
                        int i96 = i72 / 3;
                        objArr[i96 + i96 + 1] = m5.getType();
                    } else {
                        if (i81 != 27) {
                            if (i81 == 49) {
                                i6 += 2;
                                i25 = i95;
                                i26 = 1;
                            } else if (i81 != 12 && i81 != 30 && i81 != 44) {
                                if (i81 == 50) {
                                    int i97 = i6 + 2;
                                    int i98 = i69 + 1;
                                    iArr[i69] = i72;
                                    int i99 = i72 / 3;
                                    int i100 = i99 + i99;
                                    objArr[i100] = e[i95];
                                    if (i82 != 0) {
                                        objArr[i100 + 1] = e[i97];
                                        i6 += 3;
                                        str = d;
                                        i69 = i98;
                                        objectFieldOffset = (int) unsafe.objectFieldOffset(m5);
                                        if ((charAt24 & 4096) == 0) {
                                        }
                                        c = 55296;
                                        i21 = 1048575;
                                        i22 = 0;
                                        if (i81 >= 18) {
                                        }
                                        i23 = i82;
                                    } else {
                                        i6 = i97;
                                        i69 = i98;
                                        i82 = 0;
                                        str = d;
                                        objectFieldOffset = (int) unsafe.objectFieldOffset(m5);
                                        if ((charAt24 & 4096) == 0) {
                                        }
                                        c = 55296;
                                        i21 = 1048575;
                                        i22 = 0;
                                        if (i81 >= 18) {
                                        }
                                        i23 = i82;
                                    }
                                } else {
                                    i20 = i95;
                                }
                            } else if (zzhapVar2.c() != 1 && i82 == 0) {
                                str = d;
                                i6 = i95;
                                i82 = 0;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(m5);
                                if ((charAt24 & 4096) == 0) {
                                }
                                c = 55296;
                                i21 = 1048575;
                                i22 = 0;
                                if (i81 >= 18) {
                                    iArr[i70] = objectFieldOffset;
                                    i70++;
                                }
                                i23 = i82;
                            } else {
                                i6 += 2;
                                int i101 = i72 / 3;
                                objArr[i101 + i101 + 1] = e[i95];
                                str = d;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(m5);
                                if ((charAt24 & 4096) == 0 && i81 <= 17) {
                                    int i102 = i17 + 1;
                                    int charAt26 = str.charAt(i17);
                                    if (charAt26 >= 55296) {
                                        int i103 = charAt26 & 8191;
                                        int i104 = 13;
                                        while (true) {
                                            i24 = i102 + 1;
                                            charAt10 = str.charAt(i102);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i103 |= (charAt10 & 8191) << i104;
                                            i104 += 13;
                                            i102 = i24;
                                        }
                                        charAt26 = i103 | (charAt10 << i104);
                                    } else {
                                        i24 = i102;
                                    }
                                    int i105 = i19 + i19 + (charAt26 / 32);
                                    Object obj3 = e[i105];
                                    if (obj3 instanceof Field) {
                                        m2 = (Field) obj3;
                                    } else {
                                        m2 = m(cls2, (String) obj3);
                                        e[i105] = m2;
                                    }
                                    i22 = charAt26 % 32;
                                    i17 = i24;
                                    c = 55296;
                                    i21 = (int) unsafe.objectFieldOffset(m2);
                                } else {
                                    c = 55296;
                                    i21 = 1048575;
                                    i22 = 0;
                                }
                                if (i81 >= 18 && i81 <= 49) {
                                    iArr[i70] = objectFieldOffset;
                                    i70++;
                                }
                                i23 = i82;
                            }
                        } else {
                            i25 = i95;
                            i26 = 1;
                            i6 += 2;
                        }
                        int i106 = i72 / 3;
                        objArr[i106 + i106 + i26] = e[i25];
                        str = d;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m5);
                        if ((charAt24 & 4096) == 0) {
                        }
                        c = 55296;
                        i21 = 1048575;
                        i22 = 0;
                        if (i81 >= 18) {
                        }
                        i23 = i82;
                    }
                    str = d;
                    i6 = i20;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m5);
                    if ((charAt24 & 4096) == 0) {
                    }
                    c = 55296;
                    i21 = 1048575;
                    i22 = 0;
                    if (i81 >= 18) {
                    }
                    i23 = i82;
                }
                int i107 = i72 + 1;
                iArr3[i72] = charAt23;
                int i108 = i72 + 2;
                int i109 = i23;
                if ((charAt24 & 512) != 0) {
                    i27 = 536870912;
                } else {
                    i27 = 0;
                }
                if ((charAt24 & 256) != 0) {
                    i28 = 268435456;
                } else {
                    i28 = 0;
                }
                if (i109 != 0) {
                    i29 = Integer.MIN_VALUE;
                } else {
                    i29 = 0;
                }
                iArr3[i107] = i27 | i28 | i29 | (i81 << 20) | objectFieldOffset;
                i72 += 3;
                iArr3[i108] = (i22 << 20) | i21;
                i38 = i17;
                d = str;
                c2 = c;
                zzhapVar = zzhapVar2;
                length = i18;
                i7 = i19;
            }
            return new zzhag(iArr3, objArr, i2, i4, zzhapVar.a(), false, iArr, i5, i67, zzhajVar, zzgzqVar, zzhbiVar, zzgydVar, zzgzyVar);
        }
        zzhbf zzhbfVar = (zzhbf) zzhaaVar;
        throw null;
    }

    public static double H(Object obj, long j) {
        return ((Double) zzhbp.p(obj, j)).doubleValue();
    }

    public static float I(Object obj, long j) {
        return ((Float) zzhbp.p(obj, j)).floatValue();
    }

    public static int J(Object obj, long j) {
        return ((Integer) zzhbp.p(obj, j)).intValue();
    }

    public static int N(int i) {
        return (i >>> 20) & 255;
    }

    public static long P(Object obj, long j) {
        return ((Long) zzhbp.p(obj, j)).longValue();
    }

    public static Field m(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    public static void n(Object obj) {
        if (A(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean w(int i) {
        return (i & 536870912) != 0;
    }

    public static boolean z(Object obj, int i, zzhaw zzhawVar) {
        return zzhawVar.j(zzhbp.p(obj, i & C3833Oi1.t));
    }

    public final boolean B(Object obj, int i, int i2) {
        if (zzhbp.l(obj, L(i2) & C3833Oi1.t) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:509:0x0d74, code lost:
        r6 = r5;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0dd3, code lost:
        if (r1 == 1048575) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0dd5, code lost:
        r13.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0dd9, code lost:
        r7 = r0.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0dde, code lost:
        if (r7 >= r0.j) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0de0, code lost:
        r0.S(r9, r0.h[r7], null, r0.k, r32);
        r7 = r7 + 1;
        r0 = r31;
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0df6, code lost:
        if (r10 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0df8, code lost:
        if (r6 != r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0e00, code lost:
        throw new com.google.android.gms.internal.ads.zzgzh("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0e01, code lost:
        if (r6 > r11) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0e03, code lost:
        if (r15 != r10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0e05, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0e0b, code lost:
        throw new com.google.android.gms.internal.ads.zzgzh("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x075d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x0623 -> B:205:0x0624). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:239:0x06fa -> B:240:0x06fb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:260:0x0759 -> B:261:0x075b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E(Object obj, byte[] bArr, int i, int i2, int i3, zzgwy zzgwyVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        Object obj2;
        int K;
        int i7;
        int i8;
        Throwable th;
        int i9;
        int g;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        int i14;
        int i15;
        zzgwy zzgwyVar2;
        Object obj3;
        int i16;
        Unsafe unsafe3;
        int i17;
        Object obj4;
        int h;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe4;
        byte[] bArr2;
        zzgwy zzgwyVar3;
        int i21;
        int i22;
        int a;
        Unsafe unsafe5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int a2;
        int i28;
        long j;
        byte[] bArr3;
        zzgwy zzgwyVar4;
        Unsafe unsafe6;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int h2;
        byte[] bArr4;
        int i34;
        int i35;
        zzgwy zzgwyVar5;
        int i36;
        int h3;
        int i37;
        int i38;
        zzgze zzgzeVar;
        int i39;
        int i40;
        zzgwy zzgwyVar6;
        int i41;
        int i42;
        Unsafe unsafe7;
        int i43;
        int i44;
        int i45;
        zzgwy zzgwyVar7;
        zzhag<T> zzhagVar = this;
        Object obj5 = obj;
        byte[] bArr5 = bArr;
        int i46 = i2;
        zzgwy zzgwyVar8 = zzgwyVar;
        n(obj5);
        Unsafe unsafe8 = n;
        int i47 = -1;
        int i48 = i;
        int i49 = -1;
        int i50 = 0;
        int i51 = C3833Oi1.t;
        int i52 = 0;
        int i53 = 0;
        while (true) {
            if (i48 < i46) {
                int i54 = i48 + 1;
                int i55 = bArr5[i48];
                if (i55 < 0) {
                    i54 = zzgwz.i(i55, bArr5, i54, zzgwyVar8);
                    i55 = zzgwyVar8.a;
                }
                int i56 = i54;
                i53 = i55;
                int i57 = i53 >>> 3;
                if (i57 > i49) {
                    K = (i57 < zzhagVar.c || i57 > zzhagVar.d) ? i47 : zzhagVar.M(i57, i50 / 3);
                } else {
                    K = zzhagVar.K(i57);
                }
                if (K == i47) {
                    i4 = i3;
                    unsafe = unsafe8;
                    i7 = i57;
                    i48 = i56;
                    i6 = i51;
                    i8 = i53;
                    th = null;
                    i50 = 0;
                    zzgwyVar8 = zzgwyVar;
                    obj2 = obj5;
                } else {
                    th = null;
                    int i58 = i53 & 7;
                    int[] iArr = zzhagVar.a;
                    int i59 = iArr[K + 1];
                    int N = N(i59);
                    long j2 = i59 & C3833Oi1.t;
                    if (N <= 17) {
                        int i60 = iArr[K + 2];
                        int i61 = 1 << (i60 >>> 20);
                        int i62 = i60 & C3833Oi1.t;
                        if (i62 != i51) {
                            int i63 = 1048575;
                            i11 = K;
                            if (i51 != 1048575) {
                                unsafe8.putInt(obj5, i51, i52);
                                i63 = C3833Oi1.t;
                            }
                            i12 = i62 == i63 ? 0 : unsafe8.getInt(obj5, i62);
                            i13 = i62;
                        } else {
                            i11 = K;
                            i12 = i52;
                            i13 = i51;
                        }
                        switch (N) {
                            case 0:
                                unsafe3 = unsafe8;
                                obj3 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 != 1) {
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    int i64 = i15 + 8;
                                    i17 = i14 | i61;
                                    zzhbp.z(obj3, j2, Double.longBitsToDouble(zzgwz.n(bArr, i15)));
                                    bArr5 = bArr;
                                    i46 = i2;
                                    obj5 = obj3;
                                    unsafe8 = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i51 = i13;
                                    i49 = i57;
                                    i47 = -1;
                                    i48 = i64;
                                    i52 = i17;
                                    i50 = i11;
                                    break;
                                }
                            case 1:
                                unsafe3 = unsafe8;
                                obj3 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 != 5) {
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    int i65 = i15 + 4;
                                    i17 = i14 | i61;
                                    zzhbp.A(obj3, j2, Float.intBitsToFloat(zzgwz.b(bArr, i15)));
                                    i46 = i2;
                                    obj5 = obj3;
                                    unsafe8 = unsafe3;
                                    i48 = i65;
                                    bArr5 = bArr;
                                    zzgwyVar8 = zzgwyVar2;
                                    i51 = i13;
                                    i49 = i57;
                                    i47 = -1;
                                    i52 = i17;
                                    i50 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                unsafe2 = unsafe8;
                                obj3 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 != 0) {
                                    unsafe3 = unsafe2;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    i17 = i14 | i61;
                                    int k = zzgwz.k(bArr, i15, zzgwyVar2);
                                    obj5 = obj3;
                                    unsafe8 = unsafe2;
                                    unsafe8.putLong(obj5, j2, zzgwyVar2.b);
                                    i46 = i2;
                                    bArr5 = bArr;
                                    i48 = k;
                                    zzgwyVar8 = zzgwyVar2;
                                    i51 = i13;
                                    i49 = i57;
                                    i47 = -1;
                                    i52 = i17;
                                    i50 = i11;
                                    break;
                                }
                            case 4:
                            case 11:
                                unsafe2 = unsafe8;
                                obj3 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 == 0) {
                                    int h4 = zzgwz.h(bArr, i15, zzgwyVar2);
                                    unsafe2.putInt(obj3, j2, zzgwyVar2.a);
                                    obj5 = obj3;
                                    unsafe8 = unsafe2;
                                    i51 = i13;
                                    i52 = i14 | i61;
                                    i48 = h4;
                                    i46 = i2;
                                    bArr5 = bArr;
                                    zzgwyVar8 = zzgwyVar2;
                                    i49 = i57;
                                    i50 = i11;
                                    i47 = -1;
                                    break;
                                }
                                unsafe3 = unsafe2;
                                i4 = i3;
                                obj2 = obj3;
                                unsafe = unsafe3;
                                zzgwyVar8 = zzgwyVar2;
                                i6 = i13;
                                i8 = i53;
                                i52 = i14;
                                i7 = i57;
                                i50 = i11;
                                i48 = i15;
                                break;
                            case 5:
                            case 14:
                                unsafe2 = unsafe8;
                                Object obj6 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 != 1) {
                                    obj3 = obj6;
                                    unsafe3 = unsafe2;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    int i66 = i15 + 8;
                                    i16 = i14 | i61;
                                    long n2 = zzgwz.n(bArr, i15);
                                    obj5 = obj6;
                                    unsafe8 = unsafe2;
                                    unsafe8.putLong(obj5, j2, n2);
                                    i46 = i2;
                                    bArr5 = bArr;
                                    i48 = i66;
                                    zzgwyVar8 = zzgwyVar2;
                                    i51 = i13;
                                    i49 = i57;
                                    i50 = i11;
                                    i47 = -1;
                                    i52 = i16;
                                    break;
                                }
                            case 6:
                            case 13:
                                unsafe2 = unsafe8;
                                obj4 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 != 5) {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    int i67 = i14 | i61;
                                    unsafe2.putInt(obj4, j2, zzgwz.b(bArr, i15));
                                    i48 = i15 + 4;
                                    obj5 = obj4;
                                    zzgwyVar8 = zzgwyVar2;
                                    i49 = i57;
                                    i50 = i11;
                                    i47 = -1;
                                    bArr5 = bArr;
                                    unsafe8 = unsafe2;
                                    i51 = i13;
                                    i52 = i67;
                                    i46 = i2;
                                    break;
                                }
                            case 7:
                                unsafe2 = unsafe8;
                                obj4 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 != 0) {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    int i68 = i14 | i61;
                                    int k2 = zzgwz.k(bArr, i15, zzgwyVar2);
                                    zzhbp.x(obj4, j2, zzgwyVar2.b != 0);
                                    bArr5 = bArr;
                                    i48 = k2;
                                    obj5 = obj4;
                                    unsafe8 = unsafe2;
                                    zzgwyVar8 = zzgwyVar2;
                                    i51 = i13;
                                    i49 = i57;
                                    i50 = i11;
                                    i47 = -1;
                                    i52 = i68;
                                    i46 = i2;
                                    break;
                                }
                            case 8:
                                unsafe2 = unsafe8;
                                obj4 = obj5;
                                i14 = i12;
                                i15 = i56;
                                zzgwyVar2 = zzgwyVar;
                                if (i58 == 2) {
                                    if (w(i59)) {
                                        h = zzgwz.h(bArr, i15, zzgwyVar2);
                                        int i69 = zzgwyVar2.a;
                                        if (i69 < 0) {
                                            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i18 = i14 | i61;
                                        if (i69 == 0) {
                                            zzgwyVar2.c = "";
                                        } else {
                                            zzgwyVar2.c = zzhbu.h(bArr, h, i69);
                                            h += i69;
                                        }
                                    } else {
                                        int i70 = i14 | i61;
                                        h = zzgwz.h(bArr, i15, zzgwyVar2);
                                        int i71 = zzgwyVar2.a;
                                        if (i71 < 0) {
                                            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i71 == 0) {
                                            zzgwyVar2.c = "";
                                        } else {
                                            zzgwyVar2.c = new String(bArr, h, i71, zzgzf.a);
                                            h += i71;
                                        }
                                        i18 = i70;
                                    }
                                    unsafe2.putObject(obj4, j2, zzgwyVar2.c);
                                    int i72 = i18;
                                    bArr5 = bArr;
                                    unsafe8 = unsafe2;
                                    i51 = i13;
                                    i52 = i72;
                                    i46 = i2;
                                    i48 = h;
                                    obj5 = obj4;
                                    zzgwyVar8 = zzgwyVar2;
                                    i49 = i57;
                                    i50 = i11;
                                    i47 = -1;
                                    break;
                                }
                                obj3 = obj4;
                                unsafe3 = unsafe2;
                                i4 = i3;
                                obj2 = obj3;
                                unsafe = unsafe3;
                                zzgwyVar8 = zzgwyVar2;
                                i6 = i13;
                                i8 = i53;
                                i52 = i14;
                                i7 = i57;
                                i50 = i11;
                                i48 = i15;
                                break;
                            case 9:
                                Object obj7 = obj5;
                                Unsafe unsafe9 = unsafe8;
                                i14 = i12;
                                i19 = i11;
                                if (i58 != 2) {
                                    i15 = i56;
                                    zzgwyVar2 = zzgwyVar;
                                    obj3 = obj7;
                                    unsafe3 = unsafe9;
                                    i11 = i19;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    i20 = i14 | i61;
                                    Object k3 = zzhagVar.k(obj7, i19);
                                    int m2 = zzgwz.m(k3, zzhagVar.R(i19), bArr, i56, i2, zzgwyVar);
                                    zzhagVar.t(obj7, i19, k3);
                                    i46 = i2;
                                    zzgwyVar8 = zzgwyVar;
                                    bArr5 = bArr;
                                    i48 = m2;
                                    obj5 = obj7;
                                    unsafe8 = unsafe9;
                                    i51 = i13;
                                    i49 = i57;
                                    i47 = -1;
                                    i52 = i20;
                                    i50 = i19;
                                    break;
                                }
                            case 10:
                                Object obj8 = obj5;
                                unsafe4 = unsafe8;
                                obj3 = obj8;
                                bArr2 = bArr;
                                zzgwyVar3 = zzgwyVar;
                                i14 = i12;
                                i21 = i56;
                                i19 = i11;
                                if (i58 != 2) {
                                    unsafe3 = unsafe4;
                                    i15 = i21;
                                    zzgwyVar2 = zzgwyVar3;
                                    i11 = i19;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    i22 = i14 | i61;
                                    a = zzgwz.a(bArr2, i21, zzgwyVar3);
                                    unsafe4.putObject(obj3, j2, zzgwyVar3.c);
                                    Unsafe unsafe10 = unsafe4;
                                    obj5 = obj3;
                                    unsafe8 = unsafe10;
                                    i48 = a;
                                    zzgwyVar8 = zzgwyVar3;
                                    i50 = i19;
                                    i51 = i13;
                                    i47 = -1;
                                    i46 = i2;
                                    i52 = i22;
                                    bArr5 = bArr2;
                                    i49 = i57;
                                    break;
                                }
                            case 12:
                                Object obj9 = obj5;
                                unsafe4 = unsafe8;
                                obj3 = obj9;
                                zzgwyVar3 = zzgwyVar;
                                i14 = i12;
                                i21 = i56;
                                i19 = i11;
                                if (i58 != 0) {
                                    unsafe3 = unsafe4;
                                    i15 = i21;
                                    zzgwyVar2 = zzgwyVar3;
                                    i11 = i19;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    int h5 = zzgwz.h(bArr, i21, zzgwyVar3);
                                    int i73 = zzgwyVar3.a;
                                    zzgyy Q = zzhagVar.Q(i19);
                                    if ((i59 & Integer.MIN_VALUE) != 0 && Q != null && !Q.u(i73)) {
                                        F(obj3).j(i53, Long.valueOf(i73));
                                        obj5 = obj3;
                                        unsafe8 = unsafe4;
                                        i46 = i2;
                                        i48 = h5;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar3;
                                        i50 = i19;
                                        i51 = i13;
                                        i52 = i14;
                                        i49 = i57;
                                        i47 = -1;
                                        break;
                                    } else {
                                        i20 = i14 | i61;
                                        unsafe4.putInt(obj3, j2, i73);
                                        obj5 = obj3;
                                        unsafe8 = unsafe4;
                                        i46 = i2;
                                        i48 = h5;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar3;
                                        i51 = i13;
                                        i49 = i57;
                                        i47 = -1;
                                        i52 = i20;
                                        i50 = i19;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                Object obj10 = obj5;
                                unsafe4 = unsafe8;
                                obj3 = obj10;
                                bArr2 = bArr;
                                zzgwyVar3 = zzgwyVar;
                                i14 = i12;
                                i21 = i56;
                                i19 = i11;
                                if (i58 != 0) {
                                    unsafe3 = unsafe4;
                                    i15 = i21;
                                    zzgwyVar2 = zzgwyVar3;
                                    i11 = i19;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    i22 = i14 | i61;
                                    a = zzgwz.h(bArr2, i21, zzgwyVar3);
                                    unsafe4.putInt(obj3, j2, zzgxq.c(zzgwyVar3.a));
                                    Unsafe unsafe102 = unsafe4;
                                    obj5 = obj3;
                                    unsafe8 = unsafe102;
                                    i48 = a;
                                    zzgwyVar8 = zzgwyVar3;
                                    i50 = i19;
                                    i51 = i13;
                                    i47 = -1;
                                    i46 = i2;
                                    i52 = i22;
                                    bArr5 = bArr2;
                                    i49 = i57;
                                    break;
                                }
                            case 16:
                                zzgwyVar3 = zzgwyVar;
                                i19 = i11;
                                if (i58 != 0) {
                                    Object obj11 = obj5;
                                    Unsafe unsafe11 = unsafe8;
                                    obj3 = obj11;
                                    unsafe3 = unsafe11;
                                    i15 = i56;
                                    i14 = i12;
                                    zzgwyVar2 = zzgwyVar3;
                                    i11 = i19;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    i20 = i12 | i61;
                                    int k4 = zzgwz.k(bArr, i56, zzgwyVar3);
                                    unsafe8.putLong(obj5, j2, zzgxq.e(zzgwyVar3.b));
                                    obj5 = obj5;
                                    unsafe8 = unsafe8;
                                    i46 = i2;
                                    bArr5 = bArr;
                                    zzgwyVar8 = zzgwyVar3;
                                    i48 = k4;
                                    i51 = i13;
                                    i49 = i57;
                                    i47 = -1;
                                    i52 = i20;
                                    i50 = i19;
                                    break;
                                }
                            default:
                                if (i58 != 3) {
                                    zzgwyVar2 = zzgwyVar;
                                    unsafe3 = unsafe8;
                                    obj3 = obj5;
                                    i14 = i12;
                                    i15 = i56;
                                    i4 = i3;
                                    obj2 = obj3;
                                    unsafe = unsafe3;
                                    zzgwyVar8 = zzgwyVar2;
                                    i6 = i13;
                                    i8 = i53;
                                    i52 = i14;
                                    i7 = i57;
                                    i50 = i11;
                                    i48 = i15;
                                    break;
                                } else {
                                    i16 = i12 | i61;
                                    int i74 = i11;
                                    Object k5 = zzhagVar.k(obj5, i74);
                                    int l = zzgwz.l(k5, zzhagVar.R(i74), bArr, i56, i2, (i57 << 3) | 4, zzgwyVar);
                                    zzhagVar.t(obj5, i74, k5);
                                    i48 = l;
                                    bArr5 = bArr;
                                    zzgwyVar8 = zzgwyVar;
                                    i50 = i74;
                                    i51 = i13;
                                    i49 = i57;
                                    i47 = -1;
                                    i46 = i2;
                                    i52 = i16;
                                    break;
                                }
                        }
                    } else {
                        Unsafe unsafe12 = unsafe8;
                        Object obj12 = obj5;
                        int i75 = K;
                        int i76 = i52;
                        if (N == 27) {
                            if (i58 == 2) {
                                zzgze zzgzeVar2 = (zzgze) unsafe12.getObject(obj12, j2);
                                if (!zzgzeVar2.c()) {
                                    int size = zzgzeVar2.size();
                                    zzgzeVar2 = zzgzeVar2.S(size == 0 ? 10 : size + size);
                                    unsafe12.putObject(obj12, j2, zzgzeVar2);
                                }
                                bArr5 = bArr;
                                i11 = i75;
                                int e = zzgwz.e(zzhagVar.R(i75), i53, bArr5, i56, i2, zzgzeVar2, zzgwyVar);
                                i46 = i2;
                                zzgwyVar8 = zzgwyVar;
                                i48 = e;
                                i53 = i53;
                                unsafe8 = unsafe12;
                                obj5 = obj;
                                i52 = i76;
                                i49 = i57;
                                i50 = i11;
                                i47 = -1;
                            } else {
                                unsafe5 = unsafe12;
                                i7 = i57;
                                i23 = i53;
                                i6 = i51;
                                obj2 = obj12;
                            }
                        } else if (N <= 49) {
                            long j3 = i59;
                            zzgze zzgzeVar3 = (zzgze) unsafe12.getObject(obj12, j2);
                            if (zzgzeVar3.c()) {
                                j = j3;
                            } else {
                                int size2 = zzgzeVar3.size();
                                j = j3;
                                zzgzeVar3 = zzgzeVar3.S(size2 + size2);
                                unsafe12.putObject(obj12, j2, zzgzeVar3);
                            }
                            switch (N) {
                                case 18:
                                case 35:
                                    bArr3 = bArr;
                                    zzgwyVar4 = zzgwyVar;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar4 = zzgzeVar3;
                                    i30 = i53;
                                    i31 = i56;
                                    i32 = i2;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 1) {
                                            i33 = i31 + 8;
                                            int i77 = zzgwz.b;
                                            zzgxz zzgxzVar = (zzgxz) zzgzeVar4;
                                            zzgxzVar.h(Double.longBitsToDouble(zzgwz.n(bArr3, i31)));
                                            while (i33 < i32) {
                                                int h6 = zzgwz.h(bArr3, i33, zzgwyVar4);
                                                if (i30 != zzgwyVar4.a) {
                                                    h2 = i33;
                                                    break;
                                                } else {
                                                    zzgxzVar.h(Double.longBitsToDouble(zzgwz.n(bArr3, h6)));
                                                    i33 = h6 + 8;
                                                }
                                            }
                                            h2 = i33;
                                        }
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i78 = zzgwz.b;
                                        zzgxz zzgxzVar2 = (zzgxz) zzgzeVar4;
                                        h2 = zzgwz.h(bArr3, i31, zzgwyVar4);
                                        int i79 = zzgwyVar4.a;
                                        int i80 = h2 + i79;
                                        if (i80 <= bArr3.length) {
                                            zzgxzVar2.N(zzgxzVar2.size() + (i79 / 8));
                                            while (h2 < i80) {
                                                zzgxzVar2.h(Double.longBitsToDouble(zzgwz.n(bArr3, h2)));
                                                h2 += 8;
                                            }
                                            if (h2 != i80) {
                                                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 19:
                                case 36:
                                    bArr3 = bArr;
                                    zzgwyVar4 = zzgwyVar;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar5 = zzgzeVar3;
                                    i30 = i53;
                                    i31 = i56;
                                    i32 = i2;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 5) {
                                            i33 = i31 + 4;
                                            int i81 = zzgwz.b;
                                            zzgyj zzgyjVar = (zzgyj) zzgzeVar5;
                                            zzgyjVar.h(Float.intBitsToFloat(zzgwz.b(bArr3, i31)));
                                            while (i33 < i32) {
                                                int h7 = zzgwz.h(bArr3, i33, zzgwyVar4);
                                                if (i30 != zzgwyVar4.a) {
                                                    h2 = i33;
                                                    break;
                                                } else {
                                                    zzgyjVar.h(Float.intBitsToFloat(zzgwz.b(bArr3, h7)));
                                                    i33 = h7 + 4;
                                                }
                                            }
                                            h2 = i33;
                                        }
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i82 = zzgwz.b;
                                        zzgyj zzgyjVar2 = (zzgyj) zzgzeVar5;
                                        h2 = zzgwz.h(bArr3, i31, zzgwyVar4);
                                        int i83 = zzgwyVar4.a;
                                        int i84 = h2 + i83;
                                        if (i84 <= bArr3.length) {
                                            zzgyjVar2.N(zzgyjVar2.size() + (i83 / 4));
                                            while (h2 < i84) {
                                                zzgyjVar2.h(Float.intBitsToFloat(zzgwz.b(bArr3, h2)));
                                                h2 += 4;
                                            }
                                            if (h2 != i84) {
                                                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 20:
                                case 21:
                                case 37:
                                case 38:
                                    bArr3 = bArr;
                                    zzgwyVar4 = zzgwyVar;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar6 = zzgzeVar3;
                                    i30 = i53;
                                    i31 = i56;
                                    i32 = i2;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 0) {
                                            int i85 = zzgwz.b;
                                            zzgzs zzgzsVar = (zzgzs) zzgzeVar6;
                                            h2 = zzgwz.k(bArr3, i31, zzgwyVar4);
                                            zzgzsVar.t(zzgwyVar4.b);
                                            while (h2 < i32) {
                                                int h8 = zzgwz.h(bArr3, h2, zzgwyVar4);
                                                if (i30 != zzgwyVar4.a) {
                                                    break;
                                                } else {
                                                    h2 = zzgwz.k(bArr3, h8, zzgwyVar4);
                                                    zzgzsVar.t(zzgwyVar4.b);
                                                }
                                            }
                                            break;
                                        }
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i86 = zzgwz.b;
                                        zzgzs zzgzsVar2 = (zzgzs) zzgzeVar6;
                                        h2 = zzgwz.h(bArr3, i31, zzgwyVar4);
                                        int i87 = zzgwyVar4.a + h2;
                                        while (h2 < i87) {
                                            h2 = zzgwz.k(bArr3, h2, zzgwyVar4);
                                            zzgzsVar2.t(zzgwyVar4.b);
                                        }
                                        if (h2 != i87) {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 22:
                                case 29:
                                case 39:
                                case 43:
                                    bArr4 = bArr;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar7 = zzgzeVar3;
                                    i34 = i53;
                                    i35 = i56;
                                    i32 = i2;
                                    zzgwyVar5 = zzgwyVar;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 0) {
                                            bArr3 = bArr4;
                                            i30 = i34;
                                            i31 = i35;
                                            h2 = zzgwz.j(i30, bArr3, i35, i32, zzgzeVar7, zzgwyVar5);
                                            i32 = i32;
                                            zzgwyVar4 = zzgwyVar5;
                                            break;
                                        }
                                        bArr3 = bArr4;
                                        i30 = i34;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar5;
                                        h2 = i31;
                                        break;
                                    } else {
                                        h2 = zzgwz.f(bArr4, i35, zzgzeVar7, zzgwyVar5);
                                        bArr3 = bArr4;
                                        i30 = i34;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar5;
                                        break;
                                    }
                                case 23:
                                case 32:
                                case 40:
                                case 46:
                                    bArr4 = bArr;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar8 = zzgzeVar3;
                                    i34 = i53;
                                    i35 = i56;
                                    i32 = i2;
                                    zzgwyVar5 = zzgwyVar;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 1) {
                                            i36 = i35 + 8;
                                            int i88 = zzgwz.b;
                                            zzgzs zzgzsVar3 = (zzgzs) zzgzeVar8;
                                            zzgzsVar3.t(zzgwz.n(bArr4, i35));
                                            while (i36 < i32) {
                                                int h9 = zzgwz.h(bArr4, i36, zzgwyVar5);
                                                if (i34 == zzgwyVar5.a) {
                                                    zzgzsVar3.t(zzgwz.n(bArr4, h9));
                                                    i36 = h9 + 8;
                                                } else {
                                                    h2 = i36;
                                                    bArr3 = bArr4;
                                                    i30 = i34;
                                                    i31 = i35;
                                                    zzgwyVar4 = zzgwyVar5;
                                                }
                                            }
                                            h2 = i36;
                                            bArr3 = bArr4;
                                            i30 = i34;
                                            i31 = i35;
                                            zzgwyVar4 = zzgwyVar5;
                                        }
                                        bArr3 = bArr4;
                                        i30 = i34;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar5;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i89 = zzgwz.b;
                                        zzgzs zzgzsVar4 = (zzgzs) zzgzeVar8;
                                        h3 = zzgwz.h(bArr4, i35, zzgwyVar5);
                                        int i90 = zzgwyVar5.a;
                                        int i91 = h3 + i90;
                                        if (i91 <= bArr4.length) {
                                            zzgzsVar4.N(zzgzsVar4.size() + (i90 / 8));
                                            while (h3 < i91) {
                                                zzgzsVar4.t(zzgwz.n(bArr4, h3));
                                                h3 += 8;
                                            }
                                            if (h3 != i91) {
                                                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            h2 = h3;
                                            bArr3 = bArr4;
                                            i30 = i34;
                                            i31 = i35;
                                            zzgwyVar4 = zzgwyVar5;
                                            break;
                                        } else {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                case 24:
                                case 31:
                                case 41:
                                case 45:
                                    bArr4 = bArr;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar9 = zzgzeVar3;
                                    i34 = i53;
                                    i35 = i56;
                                    i32 = i2;
                                    zzgwyVar5 = zzgwyVar;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 5) {
                                            i36 = i35 + 4;
                                            int i92 = zzgwz.b;
                                            zzgyt zzgytVar = (zzgyt) zzgzeVar9;
                                            zzgytVar.N(zzgwz.b(bArr4, i35));
                                            while (i36 < i32) {
                                                int h10 = zzgwz.h(bArr4, i36, zzgwyVar5);
                                                if (i34 == zzgwyVar5.a) {
                                                    zzgytVar.N(zzgwz.b(bArr4, h10));
                                                    i36 = h10 + 4;
                                                } else {
                                                    h2 = i36;
                                                    bArr3 = bArr4;
                                                    i30 = i34;
                                                    i31 = i35;
                                                    zzgwyVar4 = zzgwyVar5;
                                                }
                                            }
                                            h2 = i36;
                                            bArr3 = bArr4;
                                            i30 = i34;
                                            i31 = i35;
                                            zzgwyVar4 = zzgwyVar5;
                                        }
                                        bArr3 = bArr4;
                                        i30 = i34;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar5;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i93 = zzgwz.b;
                                        zzgyt zzgytVar2 = (zzgyt) zzgzeVar9;
                                        h3 = zzgwz.h(bArr4, i35, zzgwyVar5);
                                        int i94 = zzgwyVar5.a;
                                        int i95 = h3 + i94;
                                        if (i95 <= bArr4.length) {
                                            zzgytVar2.f(zzgytVar2.size() + (i94 / 4));
                                            while (h3 < i95) {
                                                zzgytVar2.N(zzgwz.b(bArr4, h3));
                                                h3 += 4;
                                            }
                                            if (h3 != i95) {
                                                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            h2 = h3;
                                            bArr3 = bArr4;
                                            i30 = i34;
                                            i31 = i35;
                                            zzgwyVar4 = zzgwyVar5;
                                            break;
                                        } else {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                case 25:
                                case 42:
                                    bArr4 = bArr;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    zzgze zzgzeVar10 = zzgzeVar3;
                                    i34 = i53;
                                    i35 = i56;
                                    i32 = i2;
                                    zzgwyVar5 = zzgwyVar;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        if (i58 == 0) {
                                            int i96 = zzgwz.b;
                                            zzgxa zzgxaVar = (zzgxa) zzgzeVar10;
                                            h3 = zzgwz.k(bArr4, i35, zzgwyVar5);
                                            zzgxaVar.f(zzgwyVar5.b != 0);
                                            while (h3 < i32) {
                                                int h11 = zzgwz.h(bArr4, h3, zzgwyVar5);
                                                if (i34 == zzgwyVar5.a) {
                                                    h3 = zzgwz.k(bArr4, h11, zzgwyVar5);
                                                    zzgxaVar.f(zzgwyVar5.b != 0);
                                                }
                                            }
                                        }
                                        bArr3 = bArr4;
                                        i30 = i34;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar5;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i97 = zzgwz.b;
                                        zzgxa zzgxaVar2 = (zzgxa) zzgzeVar10;
                                        h3 = zzgwz.h(bArr4, i35, zzgwyVar5);
                                        int i98 = zzgwyVar5.a + h3;
                                        while (h3 < i98) {
                                            h3 = zzgwz.k(bArr4, h3, zzgwyVar5);
                                            zzgxaVar2.f(zzgwyVar5.b != 0);
                                        }
                                        if (h3 != i98) {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    h2 = h3;
                                    bArr3 = bArr4;
                                    i30 = i34;
                                    i31 = i35;
                                    zzgwyVar4 = zzgwyVar5;
                                    break;
                                case 26:
                                    unsafe6 = unsafe12;
                                    zzgze zzgzeVar11 = zzgzeVar3;
                                    i32 = i2;
                                    i6 = i51;
                                    obj2 = obj12;
                                    i7 = i57;
                                    if (i58 != 2) {
                                        i29 = i75;
                                        bArr3 = bArr;
                                        zzgwyVar4 = zzgwyVar;
                                        i30 = i53;
                                        i31 = i56;
                                        h2 = i31;
                                        break;
                                    } else if ((j & 536870912) == 0) {
                                        int h12 = zzgwz.h(bArr, i56, zzgwyVar);
                                        int i99 = zzgwyVar.a;
                                        if (i99 < 0) {
                                            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i99 == 0) {
                                            zzgzeVar11.add("");
                                            i29 = i75;
                                            while (h12 < i32) {
                                                int h13 = zzgwz.h(bArr, h12, zzgwyVar);
                                                if (i53 != zzgwyVar.a) {
                                                    h2 = h12;
                                                    bArr3 = bArr;
                                                    zzgwyVar4 = zzgwyVar;
                                                    i30 = i53;
                                                    i31 = i56;
                                                    break;
                                                } else {
                                                    h12 = zzgwz.h(bArr, h13, zzgwyVar);
                                                    i99 = zzgwyVar.a;
                                                    if (i99 < 0) {
                                                        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i99 == 0) {
                                                        zzgzeVar11.add("");
                                                    } else {
                                                        zzgzeVar11.add(new String(bArr, h12, i99, zzgzf.a));
                                                        h12 += i99;
                                                        while (h12 < i32) {
                                                        }
                                                    }
                                                }
                                            }
                                            h2 = h12;
                                            bArr3 = bArr;
                                            zzgwyVar4 = zzgwyVar;
                                            i30 = i53;
                                            i31 = i56;
                                        } else {
                                            i29 = i75;
                                            zzgzeVar11.add(new String(bArr, h12, i99, zzgzf.a));
                                            h12 += i99;
                                            while (h12 < i32) {
                                            }
                                            h2 = h12;
                                            bArr3 = bArr;
                                            zzgwyVar4 = zzgwyVar;
                                            i30 = i53;
                                            i31 = i56;
                                        }
                                    } else {
                                        i29 = i75;
                                        int h14 = zzgwz.h(bArr, i56, zzgwyVar);
                                        int i100 = zzgwyVar.a;
                                        if (i100 < 0) {
                                            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i100 == 0) {
                                            zzgzeVar11.add("");
                                            i37 = i56;
                                            while (h14 < i32) {
                                                int h15 = zzgwz.h(bArr, h14, zzgwyVar);
                                                if (i53 != zzgwyVar.a) {
                                                    h2 = h14;
                                                    bArr3 = bArr;
                                                    zzgwyVar4 = zzgwyVar;
                                                    i30 = i53;
                                                    i31 = i37;
                                                    break;
                                                } else {
                                                    h14 = zzgwz.h(bArr, h15, zzgwyVar);
                                                    int i101 = zzgwyVar.a;
                                                    if (i101 < 0) {
                                                        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i101 == 0) {
                                                        zzgzeVar11.add("");
                                                    } else {
                                                        int i102 = h14 + i101;
                                                        if (zzhbu.i(bArr, h14, i102)) {
                                                            i38 = i102;
                                                            zzgzeVar11.add(new String(bArr, h14, i101, zzgzf.a));
                                                            h14 = i38;
                                                            while (h14 < i32) {
                                                            }
                                                        } else {
                                                            throw new zzgzh("Protocol message had invalid UTF-8.");
                                                        }
                                                    }
                                                }
                                            }
                                            h2 = h14;
                                            bArr3 = bArr;
                                            zzgwyVar4 = zzgwyVar;
                                            i30 = i53;
                                            i31 = i37;
                                        } else {
                                            int i103 = h14 + i100;
                                            if (zzhbu.i(bArr, h14, i103)) {
                                                i37 = i56;
                                                i38 = i103;
                                                zzgzeVar11.add(new String(bArr, h14, i100, zzgzf.a));
                                                h14 = i38;
                                                while (h14 < i32) {
                                                }
                                                h2 = h14;
                                                bArr3 = bArr;
                                                zzgwyVar4 = zzgwyVar;
                                                i30 = i53;
                                                i31 = i37;
                                            } else {
                                                throw new zzgzh("Protocol message had invalid UTF-8.");
                                            }
                                        }
                                    }
                                case 27:
                                    zzgze zzgzeVar12 = zzgzeVar3;
                                    i34 = i53;
                                    i35 = i56;
                                    i7 = i57;
                                    i6 = i51;
                                    if (i58 != 2) {
                                        i32 = i2;
                                        zzgwyVar5 = zzgwyVar;
                                        obj2 = obj;
                                        bArr3 = bArr;
                                        unsafe6 = unsafe12;
                                        i29 = i75;
                                        i30 = i34;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar5;
                                        h2 = i31;
                                        break;
                                    } else {
                                        i32 = i2;
                                        obj2 = obj;
                                        h2 = zzgwz.e(zzhagVar.R(i75), i34, bArr, i35, i32, zzgzeVar12, zzgwyVar);
                                        i30 = i34;
                                        bArr3 = bArr;
                                        i31 = i35;
                                        zzgwyVar4 = zzgwyVar;
                                        unsafe6 = unsafe12;
                                        i29 = i75;
                                        break;
                                    }
                                case 28:
                                    zzgze zzgzeVar13 = zzgzeVar3;
                                    i7 = i57;
                                    i6 = i51;
                                    if (i58 != 2) {
                                        i31 = i56;
                                        zzgwyVar4 = zzgwyVar;
                                        bArr3 = bArr;
                                        i32 = i2;
                                        unsafe6 = unsafe12;
                                        i29 = i75;
                                        i30 = i53;
                                        obj2 = obj;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int h16 = zzgwz.h(bArr, i56, zzgwyVar);
                                        int i104 = zzgwyVar.a;
                                        if (i104 >= 0) {
                                            if (i104 > bArr.length - h16) {
                                                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i104 == 0) {
                                                zzgzeVar13.add(zzgxk.Y);
                                                while (h16 < i2) {
                                                    int h17 = zzgwz.h(bArr, h16, zzgwyVar);
                                                    if (i53 != zzgwyVar.a) {
                                                        i31 = i56;
                                                        zzgwyVar4 = zzgwyVar;
                                                        h2 = h16;
                                                        bArr3 = bArr;
                                                        i32 = i2;
                                                        unsafe6 = unsafe12;
                                                        i29 = i75;
                                                        i30 = i53;
                                                        obj2 = obj;
                                                        break;
                                                    } else {
                                                        h16 = zzgwz.h(bArr, h17, zzgwyVar);
                                                        i104 = zzgwyVar.a;
                                                        if (i104 >= 0) {
                                                            if (i104 > bArr.length - h16) {
                                                                throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i104 == 0) {
                                                                zzgzeVar13.add(zzgxk.Y);
                                                            } else {
                                                                zzgzeVar13.add(zzgxk.U(bArr, h16, i104));
                                                                h16 += i104;
                                                                while (h16 < i2) {
                                                                }
                                                            }
                                                        } else {
                                                            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                    }
                                                }
                                                i31 = i56;
                                                zzgwyVar4 = zzgwyVar;
                                                h2 = h16;
                                                bArr3 = bArr;
                                                i32 = i2;
                                                unsafe6 = unsafe12;
                                                i29 = i75;
                                                i30 = i53;
                                                obj2 = obj;
                                            } else {
                                                zzgzeVar13.add(zzgxk.U(bArr, h16, i104));
                                                h16 += i104;
                                                while (h16 < i2) {
                                                }
                                                i31 = i56;
                                                zzgwyVar4 = zzgwyVar;
                                                h2 = h16;
                                                bArr3 = bArr;
                                                i32 = i2;
                                                unsafe6 = unsafe12;
                                                i29 = i75;
                                                i30 = i53;
                                                obj2 = obj;
                                            }
                                        } else {
                                            throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                    }
                                case 30:
                                case 44:
                                    bArr3 = bArr;
                                    i6 = i51;
                                    if (i58 != 2) {
                                        if (i58 != 0) {
                                            i7 = i57;
                                            obj2 = obj;
                                            i32 = i2;
                                            unsafe6 = unsafe12;
                                            i29 = i75;
                                            i31 = i56;
                                            zzgwyVar4 = zzgwyVar;
                                            i30 = i53;
                                            h2 = i31;
                                            break;
                                        } else {
                                            zzgzeVar = zzgzeVar3;
                                            int j4 = zzgwz.j(i53, bArr3, i56, i2, zzgzeVar, zzgwyVar);
                                            i39 = i53;
                                            i40 = i56;
                                            zzgwyVar6 = zzgwyVar;
                                            i41 = j4;
                                        }
                                    } else {
                                        i41 = zzgwz.f(bArr3, i56, zzgzeVar3, zzgwyVar);
                                        zzgzeVar = zzgzeVar3;
                                        i40 = i56;
                                        i39 = i53;
                                        zzgwyVar6 = zzgwyVar;
                                    }
                                    zzhay.x(obj12, i57, zzgzeVar, zzhagVar.Q(i75), null, zzhagVar.k);
                                    i7 = i57;
                                    zzgwyVar4 = zzgwyVar6;
                                    h2 = i41;
                                    bArr3 = bArr3;
                                    i32 = i2;
                                    unsafe6 = unsafe12;
                                    i29 = i75;
                                    i30 = i39;
                                    i31 = i40;
                                    obj2 = obj;
                                    break;
                                case 33:
                                case 47:
                                    bArr3 = bArr;
                                    i42 = i2;
                                    unsafe7 = unsafe12;
                                    i43 = i75;
                                    i44 = i53;
                                    i45 = i56;
                                    zzgwyVar7 = zzgwyVar;
                                    i6 = i51;
                                    if (i58 != 2) {
                                        if (i58 == 0) {
                                            int i105 = zzgwz.b;
                                            zzgyt zzgytVar3 = (zzgyt) zzgzeVar3;
                                            h2 = zzgwz.h(bArr3, i45, zzgwyVar7);
                                            zzgytVar3.N(zzgxq.c(zzgwyVar7.a));
                                            while (h2 < i42) {
                                                int h18 = zzgwz.h(bArr3, h2, zzgwyVar7);
                                                if (i44 == zzgwyVar7.a) {
                                                    h2 = zzgwz.h(bArr3, h18, zzgwyVar7);
                                                    zzgytVar3.N(zzgxq.c(zzgwyVar7.a));
                                                }
                                            }
                                        }
                                        i32 = i42;
                                        obj2 = obj12;
                                        unsafe6 = unsafe7;
                                        i29 = i43;
                                        i7 = i57;
                                        zzgwyVar4 = zzgwyVar7;
                                        i30 = i44;
                                        i31 = i45;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i106 = zzgwz.b;
                                        zzgyt zzgytVar4 = (zzgyt) zzgzeVar3;
                                        h2 = zzgwz.h(bArr3, i45, zzgwyVar7);
                                        int i107 = zzgwyVar7.a + h2;
                                        while (h2 < i107) {
                                            h2 = zzgwz.h(bArr3, h2, zzgwyVar7);
                                            zzgytVar4.N(zzgxq.c(zzgwyVar7.a));
                                        }
                                        if (h2 != i107) {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    i32 = i42;
                                    obj2 = obj12;
                                    unsafe6 = unsafe7;
                                    i29 = i43;
                                    i7 = i57;
                                    zzgwyVar4 = zzgwyVar7;
                                    i30 = i44;
                                    i31 = i45;
                                    break;
                                case 34:
                                case 48:
                                    bArr3 = bArr;
                                    i42 = i2;
                                    unsafe7 = unsafe12;
                                    i43 = i75;
                                    i44 = i53;
                                    i45 = i56;
                                    zzgwyVar7 = zzgwyVar;
                                    if (i58 != 2) {
                                        i6 = i51;
                                        if (i58 == 0) {
                                            int i108 = zzgwz.b;
                                            zzgzs zzgzsVar5 = (zzgzs) zzgzeVar3;
                                            h2 = zzgwz.k(bArr3, i45, zzgwyVar7);
                                            zzgzsVar5.t(zzgxq.e(zzgwyVar7.b));
                                            while (h2 < i42) {
                                                int h19 = zzgwz.h(bArr3, h2, zzgwyVar7);
                                                if (i44 == zzgwyVar7.a) {
                                                    h2 = zzgwz.k(bArr3, h19, zzgwyVar7);
                                                    zzgzsVar5.t(zzgxq.e(zzgwyVar7.b));
                                                }
                                            }
                                        }
                                        i32 = i42;
                                        obj2 = obj12;
                                        unsafe6 = unsafe7;
                                        i29 = i43;
                                        i7 = i57;
                                        zzgwyVar4 = zzgwyVar7;
                                        i30 = i44;
                                        i31 = i45;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i109 = zzgwz.b;
                                        zzgzs zzgzsVar6 = (zzgzs) zzgzeVar3;
                                        h2 = zzgwz.h(bArr3, i45, zzgwyVar7);
                                        int i110 = zzgwyVar7.a + h2;
                                        while (h2 < i110) {
                                            h2 = zzgwz.k(bArr3, h2, zzgwyVar7);
                                            zzgzsVar6.t(zzgxq.e(zzgwyVar7.b));
                                            i51 = i51;
                                        }
                                        i6 = i51;
                                        if (h2 != i110) {
                                            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    i32 = i42;
                                    obj2 = obj12;
                                    unsafe6 = unsafe7;
                                    i29 = i43;
                                    i7 = i57;
                                    zzgwyVar4 = zzgwyVar7;
                                    i30 = i44;
                                    i31 = i45;
                                    break;
                                default:
                                    if (i58 != 3) {
                                        bArr3 = bArr;
                                        zzgwyVar4 = zzgwyVar;
                                        unsafe6 = unsafe12;
                                        i29 = i75;
                                        i30 = i53;
                                        i31 = i56;
                                        i32 = i2;
                                        i6 = i51;
                                        obj2 = obj12;
                                        i7 = i57;
                                        h2 = i31;
                                        break;
                                    } else {
                                        int i111 = (i53 & (-8)) | 4;
                                        zzhaw R = zzhagVar.R(i75);
                                        i43 = i75;
                                        unsafe7 = unsafe12;
                                        i44 = i53;
                                        bArr3 = bArr;
                                        int c = zzgwz.c(R, bArr3, i56, i2, i111, zzgwyVar);
                                        i45 = i56;
                                        zzgzeVar3.add(zzgwyVar.c);
                                        while (c < i2) {
                                            int h20 = zzgwz.h(bArr3, c, zzgwyVar);
                                            zzhaw zzhawVar = R;
                                            if (i44 != zzgwyVar.a) {
                                                zzgwyVar7 = zzgwyVar;
                                                i32 = i2;
                                                h2 = c;
                                                i6 = i51;
                                                obj2 = obj12;
                                                unsafe6 = unsafe7;
                                                i29 = i43;
                                                i7 = i57;
                                                zzgwyVar4 = zzgwyVar7;
                                                i30 = i44;
                                                i31 = i45;
                                                break;
                                            } else {
                                                c = zzgwz.c(zzhawVar, bArr3, h20, i2, i111, zzgwyVar);
                                                zzgzeVar3.add(zzgwyVar.c);
                                                R = zzhawVar;
                                            }
                                        }
                                        zzgwyVar7 = zzgwyVar;
                                        i32 = i2;
                                        h2 = c;
                                        i6 = i51;
                                        obj2 = obj12;
                                        unsafe6 = unsafe7;
                                        i29 = i43;
                                        i7 = i57;
                                        zzgwyVar4 = zzgwyVar7;
                                        i30 = i44;
                                        i31 = i45;
                                    }
                            }
                            if (h2 != i31) {
                                i53 = i30;
                                zzgwyVar8 = zzgwyVar4;
                                i46 = i32;
                                i49 = i7;
                                unsafe8 = unsafe6;
                                i52 = i76;
                                i50 = i29;
                                i47 = -1;
                                i48 = h2;
                                bArr5 = bArr3;
                                obj5 = obj2;
                                i51 = i6;
                            } else {
                                i4 = i3;
                                i8 = i30;
                                i48 = h2;
                                zzgwyVar8 = zzgwyVar4;
                                unsafe = unsafe6;
                                i52 = i76;
                                i50 = i29;
                            }
                        } else {
                            i6 = i51;
                            obj2 = obj12;
                            i7 = i57;
                            i23 = i53;
                            unsafe5 = unsafe12;
                            i75 = i75;
                            if (N != 50) {
                                long j5 = iArr[i75 + 2] & C3833Oi1.t;
                                switch (N) {
                                    case 51:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 1) {
                                            i25 = i24 + 8;
                                            unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzgwz.n(bArr5, i24))));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 52:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 5) {
                                            i25 = i24 + 4;
                                            unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzgwz.b(bArr5, i24))));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 53:
                                    case 54:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 0) {
                                            i25 = zzgwz.k(bArr5, i24, zzgwyVar8);
                                            unsafe.putObject(obj2, j2, Long.valueOf(zzgwyVar8.b));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 55:
                                    case 62:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 0) {
                                            i25 = zzgwz.h(bArr5, i24, zzgwyVar8);
                                            unsafe.putObject(obj2, j2, Integer.valueOf(zzgwyVar8.a));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 56:
                                    case 65:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 1) {
                                            i25 = i24 + 8;
                                            unsafe.putObject(obj2, j2, Long.valueOf(zzgwz.n(bArr5, i24)));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 57:
                                    case 64:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 5) {
                                            i25 = i24 + 4;
                                            unsafe.putObject(obj2, j2, Integer.valueOf(zzgwz.b(bArr5, i24)));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 58:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 0) {
                                            i25 = zzgwz.k(bArr5, i24, zzgwyVar8);
                                            unsafe.putObject(obj2, j2, Boolean.valueOf(zzgwyVar8.b != 0));
                                            unsafe.putInt(obj2, j5, i7);
                                            i48 = i25;
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 59:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 2) {
                                            i48 = zzgwz.h(bArr5, i24, zzgwyVar8);
                                            int i112 = zzgwyVar8.a;
                                            if (i112 == 0) {
                                                unsafe.putObject(obj2, j2, "");
                                            } else {
                                                int i113 = i48 + i112;
                                                if ((i59 & 536870912) != 0 && !zzhbu.i(bArr5, i48, i113)) {
                                                    throw new zzgzh("Protocol message had invalid UTF-8.");
                                                }
                                                unsafe.putObject(obj2, j2, new String(bArr5, i48, i112, zzgzf.a));
                                                i48 = i113;
                                            }
                                            unsafe.putInt(obj2, j5, i7);
                                            break;
                                        }
                                        i48 = i24;
                                        break;
                                    case 60:
                                        unsafe = unsafe5;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 != 2) {
                                            i24 = i56;
                                            i11 = i75;
                                            i8 = i23;
                                            i48 = i24;
                                            break;
                                        } else {
                                            Object l2 = zzhagVar.l(obj2, i7, i75);
                                            int m3 = zzgwz.m(l2, zzhagVar.R(i75), bArr5, i56, i2, zzgwyVar8);
                                            i24 = i56;
                                            zzhagVar.u(obj2, i7, i75, l2);
                                            i48 = m3;
                                            i11 = i75;
                                            i8 = i23;
                                            break;
                                        }
                                    case 61:
                                        unsafe = unsafe5;
                                        i26 = i75;
                                        i27 = i56;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 2) {
                                            a2 = zzgwz.a(bArr5, i27, zzgwyVar8);
                                            unsafe.putObject(obj2, j2, zzgwyVar8.c);
                                            unsafe.putInt(obj2, j5, i7);
                                            i11 = i26;
                                            i48 = a2;
                                            i24 = i27;
                                            i8 = i23;
                                            break;
                                        }
                                        i11 = i26;
                                        i24 = i27;
                                        i8 = i23;
                                        i48 = i24;
                                        break;
                                    case 63:
                                        unsafe = unsafe5;
                                        i26 = i75;
                                        i27 = i56;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 0) {
                                            int h21 = zzgwz.h(bArr5, i27, zzgwyVar8);
                                            int i114 = zzgwyVar8.a;
                                            zzgyy Q2 = zzhagVar.Q(i26);
                                            if (Q2 != null && !Q2.u(i114)) {
                                                i28 = i23;
                                                F(obj2).j(i28, Long.valueOf(i114));
                                            } else {
                                                i28 = i23;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(i114));
                                                unsafe.putInt(obj2, j5, i7);
                                            }
                                            i11 = i26;
                                            i48 = h21;
                                            i24 = i27;
                                            i8 = i28;
                                            break;
                                        }
                                        i11 = i26;
                                        i24 = i27;
                                        i8 = i23;
                                        i48 = i24;
                                        break;
                                    case 66:
                                        unsafe = unsafe5;
                                        i26 = i75;
                                        i27 = i56;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 == 0) {
                                            a2 = zzgwz.h(bArr5, i27, zzgwyVar8);
                                            unsafe.putObject(obj2, j2, Integer.valueOf(zzgxq.c(zzgwyVar8.a)));
                                            unsafe.putInt(obj2, j5, i7);
                                            i11 = i26;
                                            i48 = a2;
                                            i24 = i27;
                                            i8 = i23;
                                            break;
                                        }
                                        i11 = i26;
                                        i24 = i27;
                                        i8 = i23;
                                        i48 = i24;
                                        break;
                                    case 67:
                                        unsafe = unsafe5;
                                        i26 = i75;
                                        i27 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        if (i58 != 0) {
                                            i11 = i26;
                                            i24 = i27;
                                            i48 = i24;
                                            break;
                                        } else {
                                            a2 = zzgwz.k(bArr5, i27, zzgwyVar8);
                                            i23 = i8;
                                            unsafe.putObject(obj2, j2, Long.valueOf(zzgxq.e(zzgwyVar8.b)));
                                            unsafe.putInt(obj2, j5, i7);
                                            i11 = i26;
                                            i48 = a2;
                                            i24 = i27;
                                            i8 = i23;
                                            break;
                                        }
                                    case 68:
                                        if (i58 != 3) {
                                            unsafe = unsafe5;
                                            bArr5 = bArr;
                                            i11 = i75;
                                            i24 = i56;
                                            i8 = i23;
                                            zzgwyVar8 = zzgwyVar;
                                            i48 = i24;
                                            break;
                                        } else {
                                            Object l3 = zzhagVar.l(obj2, i7, i75);
                                            unsafe = unsafe5;
                                            bArr5 = bArr;
                                            int l4 = zzgwz.l(l3, zzhagVar.R(i75), bArr5, i56, i2, (i23 & (-8)) | 4, zzgwyVar);
                                            zzgwyVar8 = zzgwyVar;
                                            zzhagVar.u(obj2, i7, i75, l3);
                                            i48 = l4;
                                            i24 = i56;
                                            i11 = i75;
                                            i8 = i23;
                                            break;
                                        }
                                    default:
                                        unsafe = unsafe5;
                                        i11 = i75;
                                        i24 = i56;
                                        i8 = i23;
                                        bArr5 = bArr;
                                        zzgwyVar8 = zzgwyVar;
                                        i48 = i24;
                                        break;
                                }
                                if (i48 != i24) {
                                    i46 = i2;
                                    i53 = i8;
                                    obj5 = obj2;
                                    i49 = i7;
                                    unsafe8 = unsafe;
                                    i51 = i6;
                                    i52 = i76;
                                    i50 = i11;
                                    i47 = -1;
                                } else {
                                    i4 = i3;
                                    i52 = i76;
                                    i50 = i11;
                                }
                            } else if (i58 == 2) {
                                Object T = zzhagVar.T(i75);
                                Object object = unsafe5.getObject(obj2, j2);
                                if (zzgzy.a(object)) {
                                    zzgzx c2 = zzgzx.b().c();
                                    zzgzy.b(c2, object);
                                    unsafe5.putObject(obj2, j2, c2);
                                }
                                zzgzw zzgzwVar = (zzgzw) T;
                                throw null;
                            }
                        }
                        i4 = i3;
                        unsafe = unsafe5;
                        i50 = i75;
                        i52 = i76;
                        i48 = i56;
                        i8 = i23;
                        zzgwyVar8 = zzgwyVar;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (zzhagVar.f) {
                        zzgyc zzgycVar = zzgwyVar8.d;
                        int i115 = zzgyc.e;
                        int i116 = zzhan.d;
                        if (zzgycVar != zzgyc.d) {
                            zzhad zzhadVar = zzhagVar.e;
                            int i117 = zzgwz.b;
                            if (zzgycVar.c(zzhadVar, i7) == null) {
                                i9 = i8;
                                g = zzgwz.g(i9, bArr, i48, i2, F(obj2), zzgwyVar8);
                                i10 = i2;
                                i48 = g;
                                bArr5 = bArr;
                                zzgwyVar8 = zzgwyVar;
                                i53 = i9;
                                obj5 = obj2;
                                i46 = i10;
                                i49 = i7;
                                unsafe8 = unsafe;
                                i51 = i6;
                                i47 = -1;
                            } else {
                                zzgyo zzgyoVar = (zzgyo) obj2;
                                throw th;
                            }
                        }
                    }
                    i9 = i8;
                    g = zzgwz.g(i9, bArr, i48, i2, F(obj2), zzgwyVar);
                    i10 = i2;
                    i48 = g;
                    bArr5 = bArr;
                    zzgwyVar8 = zzgwyVar;
                    i53 = i9;
                    obj5 = obj2;
                    i46 = i10;
                    i49 = i7;
                    unsafe8 = unsafe;
                    i51 = i6;
                    i47 = -1;
                } else {
                    i5 = i2;
                    i53 = i8;
                }
            } else {
                i4 = i3;
                unsafe = unsafe8;
                i5 = i46;
                i6 = i51;
                obj2 = obj5;
            }
        }
    }

    public final int K(int i) {
        if (i >= this.c && i <= this.d) {
            return M(i, 0);
        }
        return -1;
    }

    public final int L(int i) {
        return this.a[i + 2];
    }

    public final int M(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int O(int i) {
        return this.a[i + 1];
    }

    public final zzgyy Q(int i) {
        int i2 = i / 3;
        return (zzgyy) this.b[i2 + i2 + 1];
    }

    public final zzhaw R(int i) {
        Object[] objArr = this.b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhaw zzhawVar = (zzhaw) objArr[i3];
        if (zzhawVar != null) {
            return zzhawVar;
        }
        zzhaw b = zzhan.a().b((Class) objArr[i3 + 1]);
        objArr[i3] = b;
        return b;
    }

    public final Object S(Object obj, int i, Object obj2, zzhbi zzhbiVar, Object obj3) {
        int i2 = this.a[i];
        Object p = zzhbp.p(obj, O(i) & C3833Oi1.t);
        if (p == null || Q(i) == null) {
            return obj2;
        }
        zzgzx zzgzxVar = (zzgzx) p;
        zzgzw zzgzwVar = (zzgzw) T(i);
        throw null;
    }

    public final Object T(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final boolean a(Object obj, Object obj2) {
        boolean j;
        for (int i = 0; i < this.a.length; i += 3) {
            int O = O(i);
            long j2 = O & C3833Oi1.t;
            switch (N(O)) {
                case 0:
                    if (v(obj, obj2, i) && Double.doubleToLongBits(zzhbp.j(obj, j2)) == Double.doubleToLongBits(zzhbp.j(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (v(obj, obj2, i) && Float.floatToIntBits(zzhbp.k(obj, j2)) == Float.floatToIntBits(zzhbp.k(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (v(obj, obj2, i) && zzhbp.n(obj, j2) == zzhbp.n(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (v(obj, obj2, i) && zzhbp.n(obj, j2) == zzhbp.n(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (v(obj, obj2, i) && zzhbp.l(obj, j2) == zzhbp.l(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (v(obj, obj2, i) && zzhbp.n(obj, j2) == zzhbp.n(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (v(obj, obj2, i) && zzhbp.l(obj, j2) == zzhbp.l(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (v(obj, obj2, i) && zzhbp.H(obj, j2) == zzhbp.H(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (v(obj, obj2, i) && zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (v(obj, obj2, i) && zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (v(obj, obj2, i) && zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (v(obj, obj2, i) && zzhbp.l(obj, j2) == zzhbp.l(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (v(obj, obj2, i) && zzhbp.l(obj, j2) == zzhbp.l(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (v(obj, obj2, i) && zzhbp.l(obj, j2) == zzhbp.l(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (v(obj, obj2, i) && zzhbp.n(obj, j2) == zzhbp.n(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (v(obj, obj2, i) && zzhbp.l(obj, j2) == zzhbp.l(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (v(obj, obj2, i) && zzhbp.n(obj, j2) == zzhbp.n(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (v(obj, obj2, i) && zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2))) {
                        continue;
                    }
                    return false;
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
                    j = zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2));
                    break;
                case 50:
                    j = zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2));
                    break;
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
                    long L = L(i) & C3833Oi1.t;
                    if (zzhbp.l(obj, L) == zzhbp.l(obj2, L) && zzhay.j(zzhbp.p(obj, j2), zzhbp.p(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!j) {
                return false;
            }
        }
        if (!((zzgys) obj).zzt.equals(((zzgys) obj2).zzt)) {
            return false;
        }
        if (this.f) {
            return ((zzgyo) obj).zza.equals(((zzgyo) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final int b(Object obj) {
        int i;
        int e;
        int e2;
        int f;
        int e3;
        int e4;
        int e5;
        int i2;
        int e6;
        int r;
        int q;
        int size;
        int v;
        int e7;
        int e8;
        int e9;
        int i3;
        int o2;
        int e10;
        int e11;
        int i4;
        int e12;
        int e13;
        int e14;
        int i5;
        int e15;
        zzhag<T> zzhagVar = this;
        Object obj2 = obj;
        Unsafe unsafe = n;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (true) {
            int[] iArr = zzhagVar.a;
            if (i6 < iArr.length) {
                int O = zzhagVar.O(i6);
                int N = N(O);
                int i10 = iArr[i6];
                int i11 = iArr[i6 + 2];
                int i12 = i11 & C3833Oi1.t;
                if (N <= 17) {
                    if (i12 != i9) {
                        i7 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                        i9 = i12;
                    }
                    i = 1 << (i11 >>> 20);
                } else {
                    i = 0;
                }
                int i13 = O & C3833Oi1.t;
                if (N >= zzgyi.F1.a()) {
                    zzgyi.S1.a();
                }
                long j = i13;
                switch (N) {
                    case 0:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            i8 += zzgxx.e(i10 << 3) + 8;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e = zzgxx.e(i10 << 3);
                            e4 = e + 4;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 2:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            long j2 = unsafe.getLong(obj2, j);
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.f(j2);
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 3:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            long j3 = unsafe.getLong(obj2, j);
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.f(j3);
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 4:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.f(unsafe.getInt(obj2, j));
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 5:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e3 = zzgxx.e(i10 << 3);
                            e4 = e3 + 8;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 6:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e = zzgxx.e(i10 << 3);
                            e4 = e + 4;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 7:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e4 = zzgxx.e(i10 << 3) + 1;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 8:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            int i14 = i10 << 3;
                            Object object = unsafe.getObject(obj2, j);
                            if (object instanceof zzgxk) {
                                e5 = zzgxx.e(i14);
                                i2 = ((zzgxk) object).i();
                                e6 = zzgxx.e(i2);
                                e4 = e5 + e6 + i2;
                                i8 += e4;
                            } else {
                                e2 = zzgxx.e(i14);
                                f = zzgxx.d((String) object);
                                e4 = e2 + f;
                                i8 += e4;
                            }
                        }
                        zzhagVar = this;
                        break;
                    case 9:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            r = zzhay.r(i10, unsafe.getObject(obj2, j), zzhagVar.R(i6));
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e5 = zzgxx.e(i10 << 3);
                            i2 = ((zzgxk) unsafe.getObject(obj2, j)).i();
                            e6 = zzgxx.e(i2);
                            e4 = e5 + e6 + i2;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 11:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            int i15 = unsafe.getInt(obj2, j);
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.e(i15);
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 12:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.f(unsafe.getInt(obj2, j));
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 13:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e = zzgxx.e(i10 << 3);
                            e4 = e + 4;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 14:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            e3 = zzgxx.e(i10 << 3);
                            e4 = e3 + 8;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 15:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            int i16 = unsafe.getInt(obj2, j);
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.e((i16 >> 31) ^ (i16 + i16));
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 16:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            long j4 = unsafe.getLong(obj2, j);
                            e2 = zzgxx.e(i10 << 3);
                            f = zzgxx.f((j4 >> 63) ^ (j4 + j4));
                            e4 = e2 + f;
                            i8 += e4;
                        }
                        zzhagVar = this;
                        break;
                    case 17:
                        if (zzhagVar.y(obj2, i6, i9, i7, i)) {
                            r = zzgxx.D(i10, (zzhad) unsafe.getObject(obj2, j), zzhagVar.R(i6));
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        r = zzhay.n(i10, (List) unsafe.getObject(obj2, j), false);
                        i8 += r;
                        break;
                    case 19:
                        r = zzhay.l(i10, (List) unsafe.getObject(obj2, j), false);
                        i8 += r;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(obj2, j);
                        int i17 = zzhay.b;
                        if (list.size() != 0) {
                            q = zzhay.q(list) + (list.size() * zzgxx.e(i10 << 3));
                            i8 += q;
                            break;
                        }
                        q = 0;
                        i8 += q;
                    case 21:
                        List list2 = (List) unsafe.getObject(obj2, j);
                        int i18 = zzhay.b;
                        size = list2.size();
                        if (size != 0) {
                            v = zzhay.v(list2);
                            e7 = zzgxx.e(i10 << 3);
                            i3 = size * e7;
                            r = v + i3;
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 22:
                        List list3 = (List) unsafe.getObject(obj2, j);
                        int i19 = zzhay.b;
                        size = list3.size();
                        if (size != 0) {
                            v = zzhay.p(list3);
                            e7 = zzgxx.e(i10 << 3);
                            i3 = size * e7;
                            r = v + i3;
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 23:
                        r = zzhay.n(i10, (List) unsafe.getObject(obj2, j), false);
                        i8 += r;
                        break;
                    case 24:
                        r = zzhay.l(i10, (List) unsafe.getObject(obj2, j), false);
                        i8 += r;
                        break;
                    case 25:
                        int i20 = zzhay.b;
                        int size2 = ((List) unsafe.getObject(obj2, j)).size();
                        if (size2 != 0) {
                            r = size2 * (zzgxx.e(i10 << 3) + 1);
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 26:
                        List list4 = (List) unsafe.getObject(obj2, j);
                        int i21 = zzhay.b;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            q = zzgxx.e(i10 << 3) * size3;
                            if (list4 instanceof zzgzp) {
                                zzgzp zzgzpVar = (zzgzp) list4;
                                for (int i22 = 0; i22 < size3; i22++) {
                                    Object c = zzgzpVar.c();
                                    if (c instanceof zzgxk) {
                                        int i23 = ((zzgxk) c).i();
                                        q += zzgxx.e(i23) + i23;
                                    } else {
                                        q += zzgxx.d((String) c);
                                    }
                                }
                            } else {
                                for (int i24 = 0; i24 < size3; i24++) {
                                    Object obj3 = list4.get(i24);
                                    if (obj3 instanceof zzgxk) {
                                        int i25 = ((zzgxk) obj3).i();
                                        q += zzgxx.e(i25) + i25;
                                    } else {
                                        q += zzgxx.d((String) obj3);
                                    }
                                }
                            }
                            i8 += q;
                            break;
                        }
                        q = 0;
                        i8 += q;
                    case 27:
                        List list5 = (List) unsafe.getObject(obj2, j);
                        zzhaw R = zzhagVar.R(i6);
                        int i26 = zzhay.b;
                        int size4 = list5.size();
                        if (size4 == 0) {
                            e8 = 0;
                        } else {
                            e8 = zzgxx.e(i10 << 3) * size4;
                            for (int i27 = 0; i27 < size4; i27++) {
                                Object obj4 = list5.get(i27);
                                if (obj4 instanceof zzgzo) {
                                    int a = ((zzgzo) obj4).a();
                                    e8 += zzgxx.e(a) + a;
                                } else {
                                    e8 += zzgxx.b((zzhad) obj4, R);
                                }
                            }
                        }
                        i8 += e8;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(obj2, j);
                        int i28 = zzhay.b;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            e9 = 0;
                        } else {
                            e9 = size5 * zzgxx.e(i10 << 3);
                            for (int i29 = 0; i29 < list6.size(); i29++) {
                                int i30 = ((zzgxk) list6.get(i29)).i();
                                e9 += zzgxx.e(i30) + i30;
                            }
                        }
                        i8 += e9;
                        break;
                    case 29:
                        List list7 = (List) unsafe.getObject(obj2, j);
                        int i31 = zzhay.b;
                        size = list7.size();
                        if (size != 0) {
                            v = zzhay.u(list7);
                            e7 = zzgxx.e(i10 << 3);
                            i3 = size * e7;
                            r = v + i3;
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 30:
                        List list8 = (List) unsafe.getObject(obj2, j);
                        int i32 = zzhay.b;
                        size = list8.size();
                        if (size != 0) {
                            v = zzhay.k(list8);
                            e7 = zzgxx.e(i10 << 3);
                            i3 = size * e7;
                            r = v + i3;
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 31:
                        r = zzhay.l(i10, (List) unsafe.getObject(obj2, j), false);
                        i8 += r;
                        break;
                    case 32:
                        r = zzhay.n(i10, (List) unsafe.getObject(obj2, j), false);
                        i8 += r;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(obj2, j);
                        int i33 = zzhay.b;
                        size = list9.size();
                        if (size != 0) {
                            v = zzhay.s(list9);
                            e7 = zzgxx.e(i10 << 3);
                            i3 = size * e7;
                            r = v + i3;
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 34:
                        List list10 = (List) unsafe.getObject(obj2, j);
                        int i34 = zzhay.b;
                        size = list10.size();
                        if (size != 0) {
                            v = zzhay.t(list10);
                            e7 = zzgxx.e(i10 << 3);
                            i3 = size * e7;
                            r = v + i3;
                            i8 += r;
                            break;
                        }
                        r = 0;
                        i8 += r;
                    case 35:
                        o2 = zzhay.o((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        o2 = zzhay.m((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        o2 = zzhay.q((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        o2 = zzhay.v((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        o2 = zzhay.p((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        o2 = zzhay.o((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        o2 = zzhay.m((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i35 = zzhay.b;
                        o2 = ((List) unsafe.getObject(obj2, j)).size();
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        o2 = zzhay.u((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        o2 = zzhay.k((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        o2 = zzhay.m((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        o2 = zzhay.o((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        o2 = zzhay.s((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        o2 = zzhay.t((List) unsafe.getObject(obj2, j));
                        if (o2 > 0) {
                            e10 = zzgxx.e(i10 << 3);
                            e11 = zzgxx.e(o2);
                            e9 = e10 + e11 + o2;
                            i8 += e9;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(obj2, j);
                        zzhaw R2 = zzhagVar.R(i6);
                        int i36 = zzhay.b;
                        int size6 = list11.size();
                        if (size6 == 0) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            for (int i37 = 0; i37 < size6; i37++) {
                                i4 += zzgxx.D(i10, (zzhad) list11.get(i37), R2);
                            }
                        }
                        i8 += i4;
                        break;
                    case 50:
                        zzgzx zzgzxVar = (zzgzx) unsafe.getObject(obj2, j);
                        zzgzw zzgzwVar = (zzgzw) zzhagVar.T(i6);
                        if (zzgzxVar.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = zzgzxVar.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                            break;
                        }
                    case 51:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e12 = zzgxx.e(i10 << 3);
                            r = e12 + 8;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e13 = zzgxx.e(i10 << 3);
                            r = e13 + 4;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            long P = P(obj2, j);
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.f(P);
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            long P2 = P(obj2, j);
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.f(P2);
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.f(J(obj2, j));
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e12 = zzgxx.e(i10 << 3);
                            r = e12 + 8;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e13 = zzgxx.e(i10 << 3);
                            r = e13 + 4;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            r = zzgxx.e(i10 << 3) + 1;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!zzhagVar.B(obj2, i10, i6)) {
                            break;
                        } else {
                            int i38 = i10 << 3;
                            Object object2 = unsafe.getObject(obj2, j);
                            if (object2 instanceof zzgxk) {
                                e14 = zzgxx.e(i38);
                                i5 = ((zzgxk) object2).i();
                                e15 = zzgxx.e(i5);
                                r = e14 + e15 + i5;
                                i8 += r;
                                break;
                            } else {
                                v = zzgxx.e(i38);
                                i3 = zzgxx.d((String) object2);
                                r = v + i3;
                                i8 += r;
                            }
                        }
                    case 60:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            r = zzhay.r(i10, unsafe.getObject(obj2, j), zzhagVar.R(i6));
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e14 = zzgxx.e(i10 << 3);
                            i5 = ((zzgxk) unsafe.getObject(obj2, j)).i();
                            e15 = zzgxx.e(i5);
                            r = e14 + e15 + i5;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            int J = J(obj2, j);
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.e(J);
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.f(J(obj2, j));
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e13 = zzgxx.e(i10 << 3);
                            r = e13 + 4;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            e12 = zzgxx.e(i10 << 3);
                            r = e12 + 8;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            int J2 = J(obj2, j);
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.e((J2 >> 31) ^ (J2 + J2));
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            long P3 = P(obj2, j);
                            v = zzgxx.e(i10 << 3);
                            i3 = zzgxx.f((P3 >> 63) ^ (P3 + P3));
                            r = v + i3;
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzhagVar.B(obj2, i10, i6)) {
                            r = zzgxx.D(i10, (zzhad) unsafe.getObject(obj2, j), zzhagVar.R(i6));
                            i8 += r;
                            break;
                        } else {
                            break;
                        }
                }
                i6 += 3;
                obj2 = obj;
            } else {
                int a2 = i8 + ((zzgys) obj).zzt.a();
                if (zzhagVar.f) {
                    zzhbe zzhbeVar = ((zzgyo) obj).zza.a;
                    int c2 = zzhbeVar.c();
                    int i39 = 0;
                    for (int i40 = 0; i40 < c2; i40++) {
                        Map.Entry g = zzhbeVar.g(i40);
                        i39 += zzgyh.c((zzgyg) ((zzhba) g).e(), g.getValue());
                    }
                    for (Map.Entry entry2 : zzhbeVar.d()) {
                        i39 += zzgyh.c((zzgyg) entry2.getKey(), entry2.getValue());
                    }
                    return a2 + i39;
                }
                return a2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final int c(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 < iArr.length) {
                int O = O(i3);
                int i5 = 1048575 & O;
                int N = N(O);
                int i6 = iArr[i3];
                long j = i5;
                int i7 = 37;
                switch (N) {
                    case 0:
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzhbp.j(obj, j));
                        byte[] bArr = zzgzf.b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    case 1:
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzhbp.k(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    case 2:
                        i = i4 * 53;
                        doubleToLongBits = zzhbp.n(obj, j);
                        byte[] bArr2 = zzgzf.b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    case 3:
                        i = i4 * 53;
                        doubleToLongBits = zzhbp.n(obj, j);
                        byte[] bArr3 = zzgzf.b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    case 4:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.l(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    case 5:
                        i = i4 * 53;
                        doubleToLongBits = zzhbp.n(obj, j);
                        byte[] bArr4 = zzgzf.b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    case 6:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.l(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    case 7:
                        i = i4 * 53;
                        floatToIntBits = zzgzf.a(zzhbp.H(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    case 8:
                        i = i4 * 53;
                        floatToIntBits = ((String) zzhbp.p(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    case 9:
                        i2 = i4 * 53;
                        Object p = zzhbp.p(obj, j);
                        if (p != null) {
                            i7 = p.hashCode();
                        }
                        i4 = i2 + i7;
                        break;
                    case 10:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.p(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    case 11:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.l(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    case 12:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.l(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    case 13:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.l(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    case 14:
                        i = i4 * 53;
                        doubleToLongBits = zzhbp.n(obj, j);
                        byte[] bArr5 = zzgzf.b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    case 15:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.l(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    case 16:
                        i = i4 * 53;
                        doubleToLongBits = zzhbp.n(obj, j);
                        byte[] bArr6 = zzgzf.b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    case 17:
                        i2 = i4 * 53;
                        Object p2 = zzhbp.p(obj, j);
                        if (p2 != null) {
                            i7 = p2.hashCode();
                        }
                        i4 = i2 + i7;
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
                        i = i4 * 53;
                        floatToIntBits = zzhbp.p(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    case 50:
                        i = i4 * 53;
                        floatToIntBits = zzhbp.p(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    case 51:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            doubleToLongBits = Double.doubleToLongBits(H(obj, j));
                            byte[] bArr7 = zzgzf.b;
                            floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 52:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = Float.floatToIntBits(I(obj, j));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 53:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            doubleToLongBits = P(obj, j);
                            byte[] bArr8 = zzgzf.b;
                            floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 54:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            doubleToLongBits = P(obj, j);
                            byte[] bArr9 = zzgzf.b;
                            floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 55:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = J(obj, j);
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 56:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            doubleToLongBits = P(obj, j);
                            byte[] bArr10 = zzgzf.b;
                            floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 57:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = J(obj, j);
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 58:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = zzgzf.a(C(obj, j));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 59:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = ((String) zzhbp.p(obj, j)).hashCode();
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 60:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = zzhbp.p(obj, j).hashCode();
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 61:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = zzhbp.p(obj, j).hashCode();
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 62:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = J(obj, j);
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 63:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = J(obj, j);
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 64:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = J(obj, j);
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 65:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            doubleToLongBits = P(obj, j);
                            byte[] bArr11 = zzgzf.b;
                            floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 66:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = J(obj, j);
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 67:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            doubleToLongBits = P(obj, j);
                            byte[] bArr12 = zzgzf.b;
                            floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                            i4 = i + floatToIntBits;
                            break;
                        }
                    case 68:
                        if (!B(obj, i6, i3)) {
                            break;
                        } else {
                            i = i4 * 53;
                            floatToIntBits = zzhbp.p(obj, j).hashCode();
                            i4 = i + floatToIntBits;
                            break;
                        }
                }
                i3 += 3;
            } else {
                int hashCode = (i4 * 53) + ((zzgys) obj).zzt.hashCode();
                if (this.f) {
                    return (hashCode * 53) + ((zzgyo) obj).zza.a.hashCode();
                }
                return hashCode;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final Object d() {
        return ((zzgys) this.e).P1();
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void e(Object obj) {
        if (A(obj)) {
            if (obj instanceof zzgys) {
                zzgys zzgysVar = (zzgys) obj;
                zzgysVar.z1();
                zzgysVar.y1();
                zzgysVar.B1();
            }
            int[] iArr = this.a;
            for (int i = 0; i < iArr.length; i += 3) {
                int O = O(i);
                int i2 = 1048575 & O;
                int N = N(O);
                long j = i2;
                if (N != 9) {
                    if (N != 60 && N != 68) {
                        switch (N) {
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
                                ((zzgze) zzhbp.p(obj, j)).b();
                                break;
                            case 50:
                                Unsafe unsafe = n;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgzx) object).d();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (B(obj, iArr[i], i)) {
                        R(i).e(n.getObject(obj, j));
                    }
                }
                if (x(obj, i)) {
                    R(i).e(n.getObject(obj, j));
                }
            }
            this.k.i(obj);
            if (this.f) {
                this.l.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void f(Object obj, byte[] bArr, int i, int i2, zzgwy zzgwyVar) throws IOException {
        E(obj, bArr, i, i2, 0, zzgwyVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04bd  */
    @Override // com.google.android.gms.internal.ads.zzhaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, zzhbx zzhbxVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        boolean z;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        zzhag<T> zzhagVar = this;
        if (zzhagVar.f) {
            zzgyh zzgyhVar = ((zzgyo) obj).zza;
            if (!zzgyhVar.a.isEmpty()) {
                Iterator f = zzgyhVar.f();
                entry = (Map.Entry) f.next();
                it = f;
                iArr = zzhagVar.a;
                Unsafe unsafe = n;
                int i6 = C3833Oi1.t;
                int i7 = 1048575;
                i = 0;
                int i8 = 0;
                while (i < iArr.length) {
                    int O = zzhagVar.O(i);
                    int N = N(O);
                    int i9 = iArr[i];
                    if (N <= 17) {
                        int i10 = iArr[i + 2];
                        z = true;
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        int i12 = 1 << (i10 >>> 20);
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = i12;
                    } else {
                        z = true;
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzgyd zzgydVar = zzhagVar.l;
                            i5 = i6;
                            if (((zzgyp) entry2.getKey()).X <= i9) {
                                zzgydVar.b(zzhbxVar, entry2);
                                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                                i6 = i5;
                            }
                        } else {
                            i5 = i6;
                        }
                    }
                    long j = O & i5;
                    switch (N) {
                        case 0:
                            if (!zzhagVar.y(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzhbxVar.p(i9, zzhbp.j(obj, j));
                                break;
                            }
                        case 1:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.G(i9, zzhbp.k(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 2:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.m(i9, unsafe.getLong(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 3:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.M(i9, unsafe.getLong(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 4:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.d(i9, unsafe.getInt(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 5:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.K(i9, unsafe.getLong(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 6:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.z(i9, unsafe.getInt(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 7:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.l(i9, zzhbp.H(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 8:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                D(i9, unsafe.getObject(obj, j), zzhbxVar);
                            }
                            zzhagVar = this;
                            break;
                        case 9:
                            if (!zzhagVar.y(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzhbxVar.A(i9, unsafe.getObject(obj, j), zzhagVar.R(i));
                                break;
                            }
                        case 10:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.F(i9, (zzgxk) unsafe.getObject(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 11:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.x(i9, unsafe.getInt(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 12:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.D(i9, unsafe.getInt(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 13:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.s(i9, unsafe.getInt(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 14:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.C(i9, unsafe.getLong(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 15:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.u(i9, unsafe.getInt(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 16:
                            if (zzhagVar.y(obj, i, i2, i3, i4)) {
                                zzhbxVar.q(i9, unsafe.getLong(obj, j));
                            }
                            zzhagVar = this;
                            break;
                        case 17:
                            if (!zzhagVar.y(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzhbxVar.v(i9, unsafe.getObject(obj, j), zzhagVar.R(i));
                                break;
                            }
                        case 18:
                            zzhay.D(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 19:
                            zzhay.H(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 20:
                            zzhay.a(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 21:
                            zzhay.i(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 22:
                            zzhay.J(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 23:
                            zzhay.G(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 24:
                            zzhay.F(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 25:
                            zzhay.B(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 26:
                            zzhay.g(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar);
                            break;
                        case 27:
                            zzhay.b(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, zzhagVar.R(i));
                            break;
                        case 28:
                            zzhay.C(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar);
                            break;
                        case 29:
                            zzhay.h(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 30:
                            zzhay.E(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 31:
                            zzhay.c(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 32:
                            zzhay.d(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 33:
                            zzhay.e(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 34:
                            zzhay.f(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, false);
                            break;
                        case 35:
                            zzhay.D(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 36:
                            zzhay.H(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 37:
                            zzhay.a(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 38:
                            zzhay.i(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 39:
                            zzhay.J(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 40:
                            zzhay.G(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 41:
                            zzhay.F(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 42:
                            zzhay.B(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 43:
                            zzhay.h(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 44:
                            zzhay.E(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 45:
                            zzhay.c(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 46:
                            zzhay.d(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 47:
                            zzhay.e(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 48:
                            zzhay.f(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, z);
                            break;
                        case 49:
                            zzhay.I(iArr[i], (List) unsafe.getObject(obj, j), zzhbxVar, zzhagVar.R(i));
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                zzgzw zzgzwVar = (zzgzw) zzhagVar.T(i);
                                throw null;
                            }
                            break;
                        case 51:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.p(i9, H(obj, j));
                            }
                            break;
                        case 52:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.G(i9, I(obj, j));
                            }
                            break;
                        case 53:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.m(i9, P(obj, j));
                            }
                            break;
                        case 54:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.M(i9, P(obj, j));
                            }
                            break;
                        case 55:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.d(i9, J(obj, j));
                            }
                            break;
                        case 56:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.K(i9, P(obj, j));
                            }
                            break;
                        case 57:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.z(i9, J(obj, j));
                            }
                            break;
                        case 58:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.l(i9, C(obj, j));
                            }
                            break;
                        case 59:
                            if (zzhagVar.B(obj, i9, i)) {
                                D(i9, unsafe.getObject(obj, j), zzhbxVar);
                            }
                            break;
                        case 60:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.A(i9, unsafe.getObject(obj, j), zzhagVar.R(i));
                            }
                            break;
                        case 61:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.F(i9, (zzgxk) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.x(i9, J(obj, j));
                            }
                            break;
                        case 63:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.D(i9, J(obj, j));
                            }
                            break;
                        case 64:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.s(i9, J(obj, j));
                            }
                            break;
                        case 65:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.C(i9, P(obj, j));
                            }
                            break;
                        case 66:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.u(i9, J(obj, j));
                            }
                            break;
                        case 67:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.q(i9, P(obj, j));
                            }
                            break;
                        case 68:
                            if (zzhagVar.B(obj, i9, i)) {
                                zzhbxVar.v(i9, unsafe.getObject(obj, j), zzhagVar.R(i));
                            }
                            break;
                    }
                    i += 3;
                    i8 = i3;
                    i6 = i5;
                    i7 = i2;
                    entry = entry2;
                }
                while (entry != null) {
                    zzhagVar.l.b(zzhbxVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzgys) obj).zzt.l(zzhbxVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzhagVar.a;
        Unsafe unsafe2 = n;
        int i62 = C3833Oi1.t;
        int i72 = 1048575;
        i = 0;
        int i82 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzgys) obj).zzt.l(zzhbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void h(Object obj, Object obj2) {
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int O = O(i);
                int i2 = 1048575 & O;
                int N = N(O);
                int i3 = iArr[i];
                long j = i2;
                switch (N) {
                    case 0:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.z(obj, j, zzhbp.j(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 1:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.A(obj, j, zzhbp.k(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 2:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.C(obj, j, zzhbp.n(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 3:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.C(obj, j, zzhbp.n(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 4:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.B(obj, j, zzhbp.l(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 5:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.C(obj, j, zzhbp.n(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 6:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.B(obj, j, zzhbp.l(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 7:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.x(obj, j, zzhbp.H(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 8:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.D(obj, j, zzhbp.p(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 9:
                        o(obj, obj2, i);
                        break;
                    case 10:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.D(obj, j, zzhbp.p(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 11:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.B(obj, j, zzhbp.l(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 12:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.B(obj, j, zzhbp.l(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 13:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.B(obj, j, zzhbp.l(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 14:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.C(obj, j, zzhbp.n(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 15:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.B(obj, j, zzhbp.l(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 16:
                        if (!x(obj2, i)) {
                            break;
                        } else {
                            zzhbp.C(obj, j, zzhbp.n(obj2, j));
                            r(obj, i);
                            break;
                        }
                    case 17:
                        o(obj, obj2, i);
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
                        zzgze zzgzeVar = (zzgze) zzhbp.p(obj, j);
                        zzgze zzgzeVar2 = (zzgze) zzhbp.p(obj2, j);
                        int size = zzgzeVar.size();
                        int size2 = zzgzeVar2.size();
                        if (size > 0 && size2 > 0) {
                            if (!zzgzeVar.c()) {
                                zzgzeVar = zzgzeVar.S(size2 + size);
                            }
                            zzgzeVar.addAll(zzgzeVar2);
                        }
                        if (size > 0) {
                            zzgzeVar2 = zzgzeVar;
                        }
                        zzhbp.D(obj, j, zzgzeVar2);
                        break;
                    case 50:
                        int i4 = zzhay.b;
                        zzhbp.D(obj, j, zzgzy.b(zzhbp.p(obj, j), zzhbp.p(obj2, j)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!B(obj2, i3, i)) {
                            break;
                        } else {
                            zzhbp.D(obj, j, zzhbp.p(obj2, j));
                            s(obj, i3, i);
                            break;
                        }
                    case 60:
                        p(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!B(obj2, i3, i)) {
                            break;
                        } else {
                            zzhbp.D(obj, j, zzhbp.p(obj2, j));
                            s(obj, i3, i);
                            break;
                        }
                    case 68:
                        p(obj, obj2, i);
                        break;
                }
                i += 3;
            } else {
                zzhay.A(this.k, obj, obj2);
                if (this.f) {
                    zzhay.z(this.l, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0610 A[LOOP:3: B:202:0x060c->B:204:0x0610, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, zzhaq zzhaqVar, zzgyc zzgycVar) throws IOException {
        Object obj2;
        Object obj3;
        zzhag<T> zzhagVar;
        Throwable th;
        int i;
        zzhbi zzhbiVar;
        Object obj4;
        Object obj5;
        zzgyq c;
        zzgycVar.getClass();
        n(obj);
        zzhbi zzhbiVar2 = this.k;
        Object obj6 = null;
        while (true) {
            try {
                int c2 = zzhaqVar.c();
                int K = K(c2);
                if (K < 0) {
                    if (c2 == Integer.MAX_VALUE) {
                        int i2 = this.i;
                        while (i2 < this.j) {
                            S(obj, this.h[i2], obj6, zzhbiVar2, obj);
                            i2++;
                            zzhbiVar2 = zzhbiVar2;
                        }
                        obj2 = obj;
                        zzhbiVar2 = zzhbiVar2;
                    } else {
                        zzhbiVar = zzhbiVar2;
                        obj4 = obj6;
                        try {
                            if (!this.f) {
                                c = null;
                            } else {
                                c = zzgycVar.c(this.e, c2);
                            }
                            if (c == null) {
                                if (obj4 == null) {
                                    try {
                                        obj6 = zzhbiVar.a(obj);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj;
                                        zzhagVar = this;
                                        obj3 = obj4;
                                        zzhbiVar2 = zzhbiVar;
                                        obj6 = obj3;
                                        i = zzhagVar.i;
                                        while (i < zzhagVar.j) {
                                        }
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj6 = obj4;
                                }
                                try {
                                    if (!zzhbiVar.k(obj6, zzhaqVar, 0)) {
                                        int i3 = this.i;
                                        while (i3 < this.j) {
                                            zzhbi zzhbiVar3 = zzhbiVar;
                                            Object obj7 = obj;
                                            S(obj7, this.h[i3], obj6, zzhbiVar3, obj);
                                            zzhbiVar = zzhbiVar3;
                                            i3++;
                                            obj = obj7;
                                        }
                                        obj5 = obj;
                                    } else {
                                        obj5 = obj;
                                        obj = obj5;
                                        zzhbiVar2 = zzhbiVar;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj5 = obj;
                                    zzhagVar = this;
                                    th = th;
                                    obj2 = obj5;
                                    zzhbiVar2 = zzhbiVar;
                                    i = zzhagVar.i;
                                    while (i < zzhagVar.j) {
                                        zzhagVar.S(obj2, zzhagVar.h[i], obj6, zzhbiVar2, obj2);
                                        i++;
                                        zzhagVar = this;
                                    }
                                    if (obj6 != null) {
                                        zzhbiVar2.j(obj2, obj6);
                                    }
                                    throw th;
                                }
                            } else {
                                zzgyo zzgyoVar = (zzgyo) obj;
                                throw null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj5 = obj;
                            zzhagVar = this;
                            th = th;
                            obj2 = obj5;
                            obj3 = obj4;
                            zzhbiVar2 = zzhbiVar;
                            obj6 = obj3;
                            i = zzhagVar.i;
                            while (i < zzhagVar.j) {
                            }
                            if (obj6 != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    obj5 = obj;
                    zzhbiVar = zzhbiVar2;
                    zzhagVar = this;
                    obj4 = obj6;
                    try {
                        int O = O(K);
                        try {
                        } catch (zzgzg unused) {
                            obj2 = obj5;
                        }
                        switch (N(O)) {
                            case 0:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.z(obj2, O & C3833Oi1.t, zzhaqVar.a());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 1:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.A(obj2, O & C3833Oi1.t, zzhaqVar.b());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 2:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.C(obj2, O & C3833Oi1.t, zzhaqVar.l());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 3:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.C(obj2, O & C3833Oi1.t, zzhaqVar.p());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 4:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.B(obj2, O & C3833Oi1.t, zzhaqVar.g());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 5:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.C(obj2, O & C3833Oi1.t, zzhaqVar.k());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 6:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.B(obj2, O & C3833Oi1.t, zzhaqVar.e());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 7:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.x(obj2, O & C3833Oi1.t, zzhaqVar.M());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 8:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                q(obj2, O, zzhaqVar);
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 9:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhad zzhadVar = (zzhad) k(obj2, K);
                                zzhaqVar.A(zzhadVar, R(K), zzgycVar);
                                t(obj2, K, zzhadVar);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 10:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.D(obj2, O & C3833Oi1.t, zzhaqVar.o());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 11:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.B(obj2, O & C3833Oi1.t, zzhaqVar.j());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 12:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                int d = zzhaqVar.d();
                                zzgyy Q = Q(K);
                                if (Q != null && !Q.u(d)) {
                                    obj6 = zzhay.y(obj2, c2, d, obj3, zzhbiVar2);
                                    obj = obj2;
                                    break;
                                }
                                zzhbp.B(obj2, O & C3833Oi1.t, d);
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.B(obj2, O & C3833Oi1.t, zzhaqVar.h());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 14:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.C(obj2, O & C3833Oi1.t, zzhaqVar.m());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 15:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.B(obj2, O & C3833Oi1.t, zzhaqVar.i());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 16:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhbp.C(obj2, O & C3833Oi1.t, zzhaqVar.n());
                                r(obj2, K);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 17:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhad zzhadVar2 = (zzhad) k(obj2, K);
                                zzhaqVar.I(zzhadVar2, R(K), zzgycVar);
                                t(obj2, K, zzhadVar2);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 18:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.t(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 19:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.E(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 20:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.r(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 21:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.F(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 22:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.v(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 23:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.B(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 24:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.z(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 25:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.D(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 26:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                if (w(O)) {
                                    ((zzgxr) zzhaqVar).L(zzgzq.a(obj2, O & C3833Oi1.t), true);
                                } else {
                                    ((zzgxr) zzhaqVar).L(zzgzq.a(obj2, O & C3833Oi1.t), false);
                                }
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 27:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.C(zzgzq.a(obj2, O & C3833Oi1.t), R(K), zzgycVar);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 28:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.u(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 29:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.K(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 30:
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                try {
                                    List a = zzgzq.a(obj5, O & C3833Oi1.t);
                                    zzhaqVar.q(a);
                                    obj6 = zzhay.x(obj5, c2, a, Q(K), obj3, zzhbiVar2);
                                    obj2 = obj5;
                                    zzhbiVar2 = zzhbiVar2;
                                } catch (zzgzg unused2) {
                                    obj2 = obj5;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                        try {
                                            obj6 = zzhbiVar2.a(obj2);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            i = zzhagVar.i;
                                            while (i < zzhagVar.j) {
                                            }
                                            if (obj6 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    if (!zzhbiVar2.k(obj6, zzhaqVar, 0)) {
                                        for (int i4 = zzhagVar.i; i4 < zzhagVar.j; i4++) {
                                            zzhagVar.S(obj2, zzhagVar.h[i4], obj6, zzhbiVar2, obj2);
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                    obj = obj2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj5;
                                    th = th;
                                    obj6 = obj3;
                                    i = zzhagVar.i;
                                    while (i < zzhagVar.j) {
                                    }
                                    if (obj6 != null) {
                                    }
                                    throw th;
                                }
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.y(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 32:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.w(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 33:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.J(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 34:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.H(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 35:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.t(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 36:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.E(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 37:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.r(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 38:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.F(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 39:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.v(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 40:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.B(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 41:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.z(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 42:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                zzhaqVar.D(zzgzq.a(obj2, O & C3833Oi1.t));
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 43:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                try {
                                    zzhaqVar.K(zzgzq.a(obj2, O & C3833Oi1.t));
                                    obj6 = obj3;
                                } catch (zzgzg unused3) {
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzhbiVar2.k(obj6, zzhaqVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    th = th;
                                    obj6 = obj3;
                                    i = zzhagVar.i;
                                    while (i < zzhagVar.j) {
                                    }
                                    if (obj6 != null) {
                                    }
                                    throw th;
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List a2 = zzgzq.a(obj5, O & C3833Oi1.t);
                                zzhaqVar.q(a2);
                                try {
                                    obj6 = zzhay.x(obj5, c2, a2, Q(K), obj4, zzhbiVar);
                                    obj2 = obj5;
                                    zzhbiVar2 = zzhbiVar;
                                } catch (zzgzg unused4) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbiVar2 = zzhbiVar;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzhbiVar2.k(obj6, zzhaqVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbiVar2 = zzhbiVar;
                                    th = th;
                                    obj6 = obj3;
                                    i = zzhagVar.i;
                                    while (i < zzhagVar.j) {
                                    }
                                    if (obj6 != null) {
                                    }
                                    throw th;
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzhaqVar.y(zzgzq.a(obj5, O & C3833Oi1.t));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 46:
                                zzhaqVar.w(zzgzq.a(obj5, O & C3833Oi1.t));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 47:
                                zzhaqVar.J(zzgzq.a(obj5, O & C3833Oi1.t));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 48:
                                zzhaqVar.H(zzgzq.a(obj5, O & C3833Oi1.t));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 49:
                                zzhaqVar.G(zzgzq.a(obj5, O & C3833Oi1.t), R(K), zzgycVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 50:
                                Object T = T(K);
                                long O2 = O(K) & C3833Oi1.t;
                                Object p = zzhbp.p(obj5, O2);
                                if (p != null) {
                                    if (zzgzy.a(p)) {
                                        Object c3 = zzgzx.b().c();
                                        zzgzy.b(c3, p);
                                        zzhbp.D(obj5, O2, c3);
                                        p = c3;
                                    }
                                } else {
                                    p = zzgzx.b().c();
                                    zzhbp.D(obj5, O2, p);
                                }
                                zzgzx zzgzxVar = (zzgzx) p;
                                zzgzw zzgzwVar = (zzgzw) T;
                                throw null;
                                break;
                            case 51:
                                zzhbp.D(obj5, O & C3833Oi1.t, Double.valueOf(zzhaqVar.a()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 52:
                                zzhbp.D(obj5, O & C3833Oi1.t, Float.valueOf(zzhaqVar.b()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 53:
                                zzhbp.D(obj5, O & C3833Oi1.t, Long.valueOf(zzhaqVar.l()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 54:
                                zzhbp.D(obj5, O & C3833Oi1.t, Long.valueOf(zzhaqVar.p()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 55:
                                zzhbp.D(obj5, O & C3833Oi1.t, Integer.valueOf(zzhaqVar.g()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 56:
                                zzhbp.D(obj5, O & C3833Oi1.t, Long.valueOf(zzhaqVar.k()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 57:
                                zzhbp.D(obj5, O & C3833Oi1.t, Integer.valueOf(zzhaqVar.e()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 58:
                                zzhbp.D(obj5, O & C3833Oi1.t, Boolean.valueOf(zzhaqVar.M()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 59:
                                q(obj5, O, zzhaqVar);
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 60:
                                zzhad zzhadVar3 = (zzhad) l(obj5, c2, K);
                                zzhaqVar.A(zzhadVar3, R(K), zzgycVar);
                                u(obj5, c2, K, zzhadVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 61:
                                zzhbp.D(obj5, O & C3833Oi1.t, zzhaqVar.o());
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 62:
                                zzhbp.D(obj5, O & C3833Oi1.t, Integer.valueOf(zzhaqVar.j()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 63:
                                int d2 = zzhaqVar.d();
                                zzgyy Q2 = Q(K);
                                if (Q2 != null && !Q2.u(d2)) {
                                    obj6 = zzhay.y(obj5, c2, d2, obj4, zzhbiVar);
                                    obj = obj5;
                                    zzhbiVar2 = zzhbiVar;
                                    break;
                                }
                                zzhbp.D(obj5, O & C3833Oi1.t, Integer.valueOf(d2));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 64:
                                zzhbp.D(obj5, O & C3833Oi1.t, Integer.valueOf(zzhaqVar.h()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 65:
                                zzhbp.D(obj5, O & C3833Oi1.t, Long.valueOf(zzhaqVar.m()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 66:
                                zzhbp.D(obj5, O & C3833Oi1.t, Integer.valueOf(zzhaqVar.i()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 67:
                                zzhbp.D(obj5, O & C3833Oi1.t, Long.valueOf(zzhaqVar.n()));
                                s(obj5, c2, K);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 68:
                                zzhad zzhadVar4 = (zzhad) l(obj5, c2, K);
                                zzhaqVar.I(zzhadVar4, R(K), zzgycVar);
                                u(obj5, c2, K, zzhadVar4);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzhbiVar2 = zzhbiVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            default:
                                if (obj4 == null) {
                                    try {
                                        obj6 = zzhbiVar.a(obj5);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        th = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzhbiVar2 = zzhbiVar;
                                        obj6 = obj3;
                                        i = zzhagVar.i;
                                        while (i < zzhagVar.j) {
                                        }
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj6 = obj4;
                                }
                                try {
                                    if (!zzhbiVar.k(obj6, zzhaqVar, 0)) {
                                        for (int i5 = zzhagVar.i; i5 < zzhagVar.j; i5++) {
                                            zzhbi zzhbiVar4 = zzhbiVar;
                                            Object obj8 = obj5;
                                            zzhagVar.S(obj8, zzhagVar.h[i5], obj6, zzhbiVar4, obj5);
                                            obj5 = obj8;
                                            zzhbiVar = zzhbiVar4;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    zzhbiVar2 = zzhbiVar;
                                } catch (zzgzg unused5) {
                                    obj2 = obj5;
                                    zzhbiVar2 = zzhbiVar;
                                    if (obj6 == null) {
                                    }
                                    if (!zzhbiVar2.k(obj6, zzhaqVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    obj2 = obj5;
                                    zzhbiVar2 = zzhbiVar;
                                    i = zzhagVar.i;
                                    while (i < zzhagVar.j) {
                                    }
                                    if (obj6 != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj2 = obj5;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                obj2 = obj;
                obj3 = obj6;
                zzhagVar = this;
            }
        }
        if (obj6 == null) {
            zzhbiVar2.j(obj2, obj6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final boolean j(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.i) {
            int[] iArr = this.h;
            int[] iArr2 = this.a;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int O = O(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & C3833Oi1.t;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = n.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & O) != 0 && !y(obj, i2, i, i3, i11)) {
                return false;
            }
            int N = N(O);
            if (N != 9 && N != 17) {
                if (N != 27) {
                    if (N != 60 && N != 68) {
                        if (N != 49) {
                            if (N == 50 && !((zzgzx) zzhbp.p(obj, O & C3833Oi1.t)).isEmpty()) {
                                zzgzw zzgzwVar = (zzgzw) T(i2);
                                throw null;
                            }
                        }
                    } else if (B(obj, i8, i2) && !z(obj, O, R(i2))) {
                        return false;
                    }
                }
                List list = (List) zzhbp.p(obj, O & C3833Oi1.t);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhaw R = R(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!R.j(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (y(obj, i2, i, i3, i11) && !z(obj, O, R(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        if (this.f && !((zzgyo) obj).zza.i()) {
            return false;
        }
        return true;
    }

    public final Object k(Object obj, int i) {
        zzhaw R = R(i);
        int O = O(i) & C3833Oi1.t;
        if (!x(obj, i)) {
            return R.d();
        }
        Object object = n.getObject(obj, O);
        if (A(object)) {
            return object;
        }
        Object d = R.d();
        if (object != null) {
            R.h(d, object);
        }
        return d;
    }

    public final Object l(Object obj, int i, int i2) {
        zzhaw R = R(i2);
        if (!B(obj, i, i2)) {
            return R.d();
        }
        Object object = n.getObject(obj, O(i2) & C3833Oi1.t);
        if (A(object)) {
            return object;
        }
        Object d = R.d();
        if (object != null) {
            R.h(d, object);
        }
        return d;
    }

    public final void o(Object obj, Object obj2, int i) {
        if (!x(obj2, i)) {
            return;
        }
        int O = O(i) & C3833Oi1.t;
        Unsafe unsafe = n;
        long j = O;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            zzhaw R = R(i);
            if (!x(obj, i)) {
                if (!A(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    Object d = R.d();
                    R.h(d, object);
                    unsafe.putObject(obj, j, d);
                }
                r(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!A(object2)) {
                Object d2 = R.d();
                R.h(d2, object2);
                unsafe.putObject(obj, j, d2);
                object2 = d2;
            }
            R.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
    }

    public final void p(Object obj, Object obj2, int i) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (!B(obj2, i2, i)) {
            return;
        }
        int O = O(i) & C3833Oi1.t;
        Unsafe unsafe = n;
        long j = O;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            zzhaw R = R(i);
            if (!B(obj, i2, i)) {
                if (!A(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    Object d = R.d();
                    R.h(d, object);
                    unsafe.putObject(obj, j, d);
                }
                s(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!A(object2)) {
                Object d2 = R.d();
                R.h(d2, object2);
                unsafe.putObject(obj, j, d2);
                object2 = d2;
            }
            R.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
    }

    public final void q(Object obj, int i, zzhaq zzhaqVar) throws IOException {
        boolean w = w(i);
        long j = i & C3833Oi1.t;
        if (w) {
            zzhbp.D(obj, j, zzhaqVar.s());
        } else if (this.g) {
            zzhbp.D(obj, j, zzhaqVar.x());
        } else {
            zzhbp.D(obj, j, zzhaqVar.o());
        }
    }

    public final void r(Object obj, int i) {
        int L = L(i);
        long j = 1048575 & L;
        if (j == 1048575) {
            return;
        }
        zzhbp.B(obj, j, (1 << (L >>> 20)) | zzhbp.l(obj, j));
    }

    public final void s(Object obj, int i, int i2) {
        zzhbp.B(obj, L(i2) & C3833Oi1.t, i);
    }

    public final void t(Object obj, int i, Object obj2) {
        n.putObject(obj, O(i) & C3833Oi1.t, obj2);
        r(obj, i);
    }

    public final void u(Object obj, int i, int i2, Object obj2) {
        n.putObject(obj, O(i2) & C3833Oi1.t, obj2);
        s(obj, i, i2);
    }

    public final boolean v(Object obj, Object obj2, int i) {
        if (x(obj, i) == x(obj2, i)) {
            return true;
        }
        return false;
    }

    public final boolean x(Object obj, int i) {
        int L = L(i);
        long j = L & C3833Oi1.t;
        if (j == 1048575) {
            int O = O(i);
            long j2 = O & C3833Oi1.t;
            switch (N(O)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhbp.j(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhbp.k(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhbp.n(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhbp.n(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhbp.l(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhbp.n(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhbp.l(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzhbp.H(obj, j2);
                case 8:
                    Object p = zzhbp.p(obj, j2);
                    if (p instanceof String) {
                        if (((String) p).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (p instanceof zzgxk) {
                        if (zzgxk.Y.equals(p)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzhbp.p(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgxk.Y.equals(zzhbp.p(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzhbp.l(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzhbp.l(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhbp.l(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhbp.n(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhbp.l(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzhbp.n(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhbp.p(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzhbp.l(obj, j) & (1 << (L >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean y(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return x(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }
}
