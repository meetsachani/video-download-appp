package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C3833Oi1;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkn<T> implements zzlb<T> {
    public static final int[] r = new int[0];
    public static final Unsafe s = zzmg.p();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzkj e;
    public final boolean f;
    public final boolean g;
    public final zzky h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final zzkr m;
    public final zzjs n;

    /* renamed from: o  reason: collision with root package name */
    public final zzma<?, ?> f306o;
    public final zzim<?> p;
    public final zzkg q;

    public zzkn(int[] iArr, Object[] objArr, int i, int i2, zzkj zzkjVar, zzky zzkyVar, boolean z, int[] iArr2, int i3, int i4, zzkr zzkrVar, zzjs zzjsVar, zzma<?, ?> zzmaVar, zzim<?> zzimVar, zzkg zzkgVar) {
        boolean z2;
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzkjVar instanceof zzix;
        this.h = zzkyVar;
        if (zzimVar != null && zzimVar.h(zzkjVar)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.i = false;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = zzkrVar;
        this.n = zzjsVar;
        this.f306o = zzmaVar;
        this.p = zzimVar;
        this.e = zzkjVar;
        this.q = zzkgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(Object obj, int i, zzlb zzlbVar) {
        return zzlbVar.d(zzmg.B(obj, i & C3833Oi1.t));
    }

    public static <T> float E(T t, long j) {
        return ((Float) zzmg.B(t, j)).floatValue();
    }

    public static <T> int K(T t, long j) {
        return ((Integer) zzmg.B(t, j)).intValue();
    }

    public static <T> long O(T t, long j) {
        return ((Long) zzmg.B(t, j)).longValue();
    }

    public static zzlz R(Object obj) {
        zzix zzixVar = (zzix) obj;
        zzlz zzlzVar = zzixVar.zzb;
        if (zzlzVar == zzlz.k()) {
            zzlz l = zzlz.l();
            zzixVar.zzb = l;
            return l;
        }
        return zzlzVar;
    }

    public static <T> boolean S(T t, long j) {
        return ((Boolean) zzmg.B(t, j)).booleanValue();
    }

    public static void U(Object obj) {
        if (W(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
    }

    public static boolean V(int i) {
        return (i & 536870912) != 0;
    }

    public static boolean W(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzix) {
            return ((zzix) obj).E();
        }
        return true;
    }

    public static <T> double k(T t, long j) {
        return ((Double) zzmg.B(t, j)).doubleValue();
    }

    public static int o(byte[] bArr, int i, int i2, zzmn zzmnVar, Class<?> cls, zzhl zzhlVar) throws IOException {
        boolean z;
        switch (zzkq.a[zzmnVar.ordinal()]) {
            case 1:
                int q = zzhi.q(bArr, i, zzhlVar);
                if (zzhlVar.b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                zzhlVar.c = Boolean.valueOf(z);
                return q;
            case 2:
                return zzhi.k(bArr, i, zzhlVar);
            case 3:
                zzhlVar.c = Double.valueOf(zzhi.a(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzhlVar.c = Integer.valueOf(zzhi.o(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzhlVar.c = Long.valueOf(zzhi.r(bArr, i));
                return i + 8;
            case 8:
                zzhlVar.c = Float.valueOf(zzhi.m(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int p = zzhi.p(bArr, i, zzhlVar);
                zzhlVar.c = Integer.valueOf(zzhlVar.a);
                return p;
            case 12:
            case 13:
                int q2 = zzhi.q(bArr, i, zzhlVar);
                zzhlVar.c = Long.valueOf(zzhlVar.b);
                return q2;
            case 14:
                return zzhi.h(zzkx.a().b(cls), bArr, i, i2, zzhlVar);
            case 15:
                int p2 = zzhi.p(bArr, i, zzhlVar);
                zzhlVar.c = Integer.valueOf(zzib.l(zzhlVar.a));
                return p2;
            case 16:
                int q3 = zzhi.q(bArr, i, zzhlVar);
                zzhlVar.c = Long.valueOf(zzib.c(zzhlVar.b));
                return q3;
            case 17:
                return zzhi.n(bArr, i, zzhlVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzkn<T> p(Class<T> cls, zzkh zzkhVar, zzkr zzkrVar, zzjs zzjsVar, zzma<?, ?> zzmaVar, zzim<?> zzimVar, zzkg zzkgVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
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
        boolean z;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        Field u;
        char charAt10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field u2;
        Object obj2;
        Field u3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        if (zzkhVar instanceof zzkz) {
            zzkz zzkzVar = (zzkz) zzkhVar;
            String d = zzkzVar.d();
            int length = d.length();
            char c = 55296;
            boolean z2 = true;
            if (d.charAt(0) >= 55296) {
                int i32 = 1;
                while (true) {
                    i = i32 + 1;
                    if (d.charAt(i32) < 55296) {
                        break;
                    }
                    i32 = i;
                }
            } else {
                i = 1;
            }
            int i33 = i + 1;
            int charAt15 = d.charAt(i);
            if (charAt15 >= 55296) {
                int i34 = charAt15 & 8191;
                int i35 = 13;
                while (true) {
                    i31 = i33 + 1;
                    charAt14 = d.charAt(i33);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i34 |= (charAt14 & 8191) << i35;
                    i35 += 13;
                    i33 = i31;
                }
                charAt15 = i34 | (charAt14 << i35);
                i33 = i31;
            }
            if (charAt15 == 0) {
                i4 = 0;
                charAt = 0;
                i3 = 0;
                i7 = 0;
                i2 = 0;
                i6 = 0;
                iArr = r;
                i5 = 0;
            } else {
                int i36 = i33 + 1;
                int charAt16 = d.charAt(i33);
                if (charAt16 >= 55296) {
                    int i37 = charAt16 & 8191;
                    int i38 = 13;
                    while (true) {
                        i15 = i36 + 1;
                        charAt9 = d.charAt(i36);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i37 |= (charAt9 & 8191) << i38;
                        i38 += 13;
                        i36 = i15;
                    }
                    charAt16 = i37 | (charAt9 << i38);
                    i36 = i15;
                }
                int i39 = i36 + 1;
                int charAt17 = d.charAt(i36);
                if (charAt17 >= 55296) {
                    int i40 = charAt17 & 8191;
                    int i41 = 13;
                    while (true) {
                        i14 = i39 + 1;
                        charAt8 = d.charAt(i39);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i40 |= (charAt8 & 8191) << i41;
                        i41 += 13;
                        i39 = i14;
                    }
                    charAt17 = i40 | (charAt8 << i41);
                    i39 = i14;
                }
                int i42 = i39 + 1;
                int charAt18 = d.charAt(i39);
                if (charAt18 >= 55296) {
                    int i43 = charAt18 & 8191;
                    int i44 = 13;
                    while (true) {
                        i13 = i42 + 1;
                        charAt7 = d.charAt(i42);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i43 |= (charAt7 & 8191) << i44;
                        i44 += 13;
                        i42 = i13;
                    }
                    charAt18 = i43 | (charAt7 << i44);
                    i42 = i13;
                }
                int i45 = i42 + 1;
                int charAt19 = d.charAt(i42);
                if (charAt19 >= 55296) {
                    int i46 = charAt19 & 8191;
                    int i47 = 13;
                    while (true) {
                        i12 = i45 + 1;
                        charAt6 = d.charAt(i45);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i46 |= (charAt6 & 8191) << i47;
                        i47 += 13;
                        i45 = i12;
                    }
                    charAt19 = i46 | (charAt6 << i47);
                    i45 = i12;
                }
                int i48 = i45 + 1;
                charAt = d.charAt(i45);
                if (charAt >= 55296) {
                    int i49 = charAt & 8191;
                    int i50 = 13;
                    while (true) {
                        i11 = i48 + 1;
                        charAt5 = d.charAt(i48);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i49 |= (charAt5 & 8191) << i50;
                        i50 += 13;
                        i48 = i11;
                    }
                    charAt = i49 | (charAt5 << i50);
                    i48 = i11;
                }
                int i51 = i48 + 1;
                int charAt20 = d.charAt(i48);
                if (charAt20 >= 55296) {
                    int i52 = charAt20 & 8191;
                    int i53 = 13;
                    while (true) {
                        i10 = i51 + 1;
                        charAt4 = d.charAt(i51);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i52 |= (charAt4 & 8191) << i53;
                        i53 += 13;
                        i51 = i10;
                    }
                    charAt20 = i52 | (charAt4 << i53);
                    i51 = i10;
                }
                int i54 = i51 + 1;
                int charAt21 = d.charAt(i51);
                if (charAt21 >= 55296) {
                    int i55 = charAt21 & 8191;
                    int i56 = 13;
                    while (true) {
                        i9 = i54 + 1;
                        charAt3 = d.charAt(i54);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i55 |= (charAt3 & 8191) << i56;
                        i56 += 13;
                        i54 = i9;
                    }
                    charAt21 = i55 | (charAt3 << i56);
                    i54 = i9;
                }
                int i57 = i54 + 1;
                int charAt22 = d.charAt(i54);
                if (charAt22 >= 55296) {
                    int i58 = charAt22 & 8191;
                    int i59 = 13;
                    while (true) {
                        i8 = i57 + 1;
                        charAt2 = d.charAt(i57);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i58 |= (charAt2 & 8191) << i59;
                        i59 += 13;
                        i57 = i8;
                    }
                    charAt22 = i58 | (charAt2 << i59);
                    i57 = i8;
                }
                i2 = (charAt16 << 1) + charAt17;
                int i60 = charAt20;
                i3 = charAt18;
                i4 = i60;
                i5 = charAt16;
                iArr = new int[charAt22 + charAt20 + charAt21];
                i6 = charAt22;
                i33 = i57;
                i7 = charAt19;
            }
            Unsafe unsafe = s;
            Object[] e = zzkzVar.e();
            Class<?> cls2 = zzkzVar.a().getClass();
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i61 = i6 + i4;
            int i62 = i6;
            int i63 = i61;
            int i64 = 0;
            int i65 = 0;
            while (i33 < length) {
                int i66 = i33 + 1;
                int charAt23 = d.charAt(i33);
                if (charAt23 >= c) {
                    int i67 = charAt23 & 8191;
                    z = z2;
                    int i68 = i66;
                    int i69 = 13;
                    while (true) {
                        i30 = i68 + 1;
                        charAt13 = d.charAt(i68);
                        if (charAt13 < c) {
                            break;
                        }
                        i67 |= (charAt13 & 8191) << i69;
                        i69 += 13;
                        i68 = i30;
                    }
                    charAt23 = i67 | (charAt13 << i69);
                    i16 = i30;
                } else {
                    z = z2;
                    i16 = i66;
                }
                int i70 = i16 + 1;
                int charAt24 = d.charAt(i16);
                if (charAt24 >= c) {
                    int i71 = charAt24 & 8191;
                    int i72 = i70;
                    int i73 = 13;
                    while (true) {
                        i29 = i72 + 1;
                        charAt12 = d.charAt(i72);
                        if (charAt12 < c) {
                            break;
                        }
                        i71 |= (charAt12 & 8191) << i73;
                        i73 += 13;
                        i72 = i29;
                    }
                    charAt24 = i71 | (charAt12 << i73);
                    i17 = i29;
                } else {
                    i17 = i70;
                }
                int i74 = charAt24 & 255;
                zzkz zzkzVar2 = zzkzVar;
                if ((charAt24 & 1024) != 0) {
                    iArr[i65] = i64;
                    i65++;
                }
                int i75 = length;
                if (i74 >= 51) {
                    int i76 = i17 + 1;
                    int charAt25 = d.charAt(i17);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i77 = charAt25 & 8191;
                        int i78 = 13;
                        while (true) {
                            i28 = i76 + 1;
                            charAt11 = d.charAt(i76);
                            if (charAt11 < c2) {
                                break;
                            }
                            i77 |= (charAt11 & 8191) << i78;
                            i78 += 13;
                            i76 = i28;
                            c2 = 55296;
                        }
                        charAt25 = i77 | (charAt11 << i78);
                        i76 = i28;
                    }
                    int i79 = i74 - 51;
                    int i80 = i76;
                    if (i79 != 9 && i79 != 17) {
                        if (i79 == 12 && (zzkzVar2.b().equals(zzky.PROTO2) || (charAt24 & 2048) != 0)) {
                            i27 = i2 + 1;
                            objArr[((i64 / 3) << 1) + 1] = e[i2];
                        }
                        int i81 = charAt25 << 1;
                        obj = e[i81];
                        if (!(obj instanceof Field)) {
                            u2 = (Field) obj;
                        } else {
                            u2 = u(cls2, (String) obj);
                            e[i81] = u2;
                        }
                        iArr2 = iArr3;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(u2);
                        int i82 = i81 + 1;
                        obj2 = e[i82];
                        if (!(obj2 instanceof Field)) {
                            u3 = (Field) obj2;
                        } else {
                            u3 = u(cls2, (String) obj2);
                            e[i82] = u3;
                        }
                        objectFieldOffset = objectFieldOffset2;
                        i20 = (int) unsafe.objectFieldOffset(u3);
                        str = d;
                        i21 = i80;
                        i22 = 0;
                    } else {
                        i27 = i2 + 1;
                        objArr[((i64 / 3) << 1) + 1] = e[i2];
                    }
                    i2 = i27;
                    int i812 = charAt25 << 1;
                    obj = e[i812];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr3;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(u2);
                    int i822 = i812 + 1;
                    obj2 = e[i822];
                    if (!(obj2 instanceof Field)) {
                    }
                    objectFieldOffset = objectFieldOffset22;
                    i20 = (int) unsafe.objectFieldOffset(u3);
                    str = d;
                    i21 = i80;
                    i22 = 0;
                } else {
                    iArr2 = iArr3;
                    int i83 = i2 + 1;
                    Field u4 = u(cls2, (String) e[i2]);
                    if (i74 == 9 || i74 == 17) {
                        i18 = i83;
                        objArr[((i64 / 3) << 1) + 1] = u4.getType();
                    } else {
                        if (i74 != 27 && i74 != 49) {
                            if (i74 != 12 && i74 != 30 && i74 != 44) {
                                if (i74 == 50) {
                                    int i84 = i62 + 1;
                                    iArr[i62] = i64;
                                    int i85 = (i64 / 3) << 1;
                                    i18 = i2 + 2;
                                    objArr[i85] = e[i83];
                                    if ((charAt24 & 2048) != 0) {
                                        i19 = i2 + 3;
                                        objArr[i85 + 1] = e[i18];
                                        i62 = i84;
                                        objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                                        if ((charAt24 & 4096) == 0 && i74 <= 17) {
                                            int i86 = i17 + 1;
                                            int charAt26 = d.charAt(i17);
                                            i2 = i19;
                                            if (charAt26 >= 55296) {
                                                int i87 = charAt26 & 8191;
                                                int i88 = 13;
                                                while (true) {
                                                    i21 = i86 + 1;
                                                    charAt10 = d.charAt(i86);
                                                    if (charAt10 < 55296) {
                                                        break;
                                                    }
                                                    i87 |= (charAt10 & 8191) << i88;
                                                    i88 += 13;
                                                    i86 = i21;
                                                }
                                                charAt26 = i87 | (charAt10 << i88);
                                            } else {
                                                i21 = i86;
                                            }
                                            int i89 = (i5 << 1) + (charAt26 / 32);
                                            Object obj3 = e[i89];
                                            str = d;
                                            if (obj3 instanceof Field) {
                                                u = (Field) obj3;
                                            } else {
                                                u = u(cls2, (String) obj3);
                                                e[i89] = u;
                                            }
                                            i20 = (int) unsafe.objectFieldOffset(u);
                                            i22 = charAt26 % 32;
                                        } else {
                                            i2 = i19;
                                            str = d;
                                            i20 = C3833Oi1.t;
                                            i21 = i17;
                                            i22 = 0;
                                        }
                                        if (i74 >= 18 && i74 <= 49) {
                                            iArr[i63] = objectFieldOffset;
                                            i63++;
                                        }
                                    } else {
                                        i62 = i84;
                                    }
                                } else {
                                    i18 = i83;
                                }
                            } else {
                                i18 = i83;
                                if (zzkzVar2.b() == zzky.PROTO2 || (charAt24 & 2048) != 0) {
                                    i23 = i2 + 2;
                                    objArr[((i64 / 3) << 1) + 1] = e[i18];
                                }
                            }
                        } else {
                            i23 = i2 + 2;
                            objArr[((i64 / 3) << 1) + 1] = e[i83];
                        }
                        i19 = i23;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                        if ((charAt24 & 4096) == 0) {
                        }
                        i2 = i19;
                        str = d;
                        i20 = C3833Oi1.t;
                        i21 = i17;
                        i22 = 0;
                        if (i74 >= 18) {
                            iArr[i63] = objectFieldOffset;
                            i63++;
                        }
                    }
                    i19 = i18;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                    if ((charAt24 & 4096) == 0) {
                    }
                    i2 = i19;
                    str = d;
                    i20 = C3833Oi1.t;
                    i21 = i17;
                    i22 = 0;
                    if (i74 >= 18) {
                    }
                }
                int i90 = i64 + 1;
                iArr2[i64] = charAt23;
                int i91 = i64 + 2;
                if ((charAt24 & 512) != 0) {
                    i24 = 536870912;
                } else {
                    i24 = 0;
                }
                int i92 = i20;
                if ((charAt24 & 256) != 0) {
                    i25 = 268435456;
                } else {
                    i25 = 0;
                }
                int i93 = i25 | i24;
                if ((charAt24 & 2048) != 0) {
                    i26 = Integer.MIN_VALUE;
                } else {
                    i26 = 0;
                }
                iArr2[i90] = i93 | i26 | (i74 << 20) | objectFieldOffset;
                i64 += 3;
                iArr2[i91] = (i22 << 20) | i92;
                z2 = z;
                zzkzVar = zzkzVar2;
                i33 = i21;
                d = str;
                length = i75;
                iArr3 = iArr2;
                c = 55296;
            }
            zzkz zzkzVar3 = zzkzVar;
            return new zzkn<>(iArr3, objArr, i3, i7, zzkzVar3.a(), zzkzVar3.b(), false, iArr, i6, i61, zzkrVar, zzjsVar, zzmaVar, zzimVar, zzkgVar);
        }
        zzlt zzltVar = (zzlt) zzkhVar;
        throw new NoSuchMethodError();
    }

    public static Field u(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void v(int i, Object obj, zzmw zzmwVar) throws IOException {
        if (obj instanceof String) {
            zzmwVar.g(i, (String) obj);
        } else {
            zzmwVar.w(i, (zzhm) obj);
        }
    }

    public static <UT, UB> void w(zzma<UT, UB> zzmaVar, T t, zzmw zzmwVar) throws IOException {
        zzmaVar.m(zzmaVar.q(t), zzmwVar);
    }

    public final void A(T t, int i, Object obj) {
        s.putObject(t, J(i) & C3833Oi1.t, obj);
        G(t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(T t, T t2, int i) {
        if (!L(t2, i)) {
            return;
        }
        long J = J(i) & C3833Oi1.t;
        Unsafe unsafe = s;
        Object object = unsafe.getObject(t2, J);
        if (object != null) {
            zzlb Q = Q(i);
            if (!L(t, i)) {
                if (!W(object)) {
                    unsafe.putObject(t, J, object);
                } else {
                    Object a = Q.a();
                    Q.g(a, object);
                    unsafe.putObject(t, J, a);
                }
                G(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, J);
            if (!W(object2)) {
                Object a2 = Q.a();
                Q.g(a2, object2);
                unsafe.putObject(t, J, a2);
                object2 = a2;
            }
            Q.g(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(t2));
    }

    public final boolean C(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return L(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final int F(int i) {
        return this.a[i + 2];
    }

    public final void G(T t, int i) {
        int F = F(i);
        long j = 1048575 & F;
        if (j == 1048575) {
            return;
        }
        zzmg.h(t, j, (1 << (F >>> 20)) | zzmg.t(t, j));
    }

    public final void H(T t, int i, int i2) {
        zzmg.h(t, F(i2) & C3833Oi1.t, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(T t, T t2, int i) {
        int i2 = this.a[i];
        if (!M(t2, i2, i)) {
            return;
        }
        long J = J(i) & C3833Oi1.t;
        Unsafe unsafe = s;
        Object object = unsafe.getObject(t2, J);
        if (object != null) {
            zzlb Q = Q(i);
            if (!M(t, i2, i)) {
                if (!W(object)) {
                    unsafe.putObject(t, J, object);
                } else {
                    Object a = Q.a();
                    Q.g(a, object);
                    unsafe.putObject(t, J, a);
                }
                H(t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, J);
            if (!W(object2)) {
                Object a2 = Q.a();
                Q.g(a2, object2);
                unsafe.putObject(t, J, a2);
                object2 = a2;
            }
            Q.g(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(t2));
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    public final boolean L(T t, int i) {
        int F = F(i);
        long j = F & C3833Oi1.t;
        if (j == 1048575) {
            int J = J(i);
            long j2 = J & C3833Oi1.t;
            switch ((J & C3833Oi1.u) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(zzmg.a(t, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzmg.n(t, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzmg.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzmg.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzmg.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzmg.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzmg.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzmg.F(t, j2);
                case 8:
                    Object B = zzmg.B(t, j2);
                    if (B instanceof String) {
                        if (((String) B).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (B instanceof zzhm) {
                        if (zzhm.Y.equals(B)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzmg.B(t, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzhm.Y.equals(zzmg.B(t, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzmg.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzmg.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzmg.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzmg.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzmg.t(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzmg.x(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzmg.B(t, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzmg.t(t, j) & (1 << (F >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean M(T t, int i, int i2) {
        if (zzmg.t(t, F(i2) & C3833Oi1.t) == i) {
            return true;
        }
        return false;
    }

    public final boolean N(T t, T t2, int i) {
        if (L(t, i) == L(t2, i)) {
            return true;
        }
        return false;
    }

    public final zzje P(int i) {
        return (zzje) this.b[((i / 3) << 1) + 1];
    }

    public final zzlb Q(int i) {
        int i2 = (i / 3) << 1;
        zzlb zzlbVar = (zzlb) this.b[i2];
        if (zzlbVar != null) {
            return zzlbVar;
        }
        zzlb<T> b = zzkx.a().b((Class) this.b[i2 + 1]);
        this.b[i2] = b;
        return b;
    }

    public final Object T(int i) {
        return this.b[(i / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final T a() {
        return (T) this.m.b(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int b(T t) {
        int i;
        int e;
        int f;
        int d0;
        int D;
        int x0;
        int A0;
        zzkn<T> zzknVar = this;
        T t2 = t;
        Unsafe unsafe = s;
        int i2 = C3833Oi1.t;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < zzknVar.a.length) {
            int J = zzknVar.J(i3);
            int i7 = (267386880 & J) >>> 20;
            int[] iArr = zzknVar.a;
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (i7 <= 17) {
                if (i10 != i6) {
                    if (i10 == i2) {
                        i4 = 0;
                    } else {
                        i4 = unsafe.getInt(t2, i10);
                    }
                    i6 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = J & i2;
            if (i7 >= zzir.J1.a()) {
                zzir.W1.a();
            }
            int i11 = i5;
            switch (i7) {
                case 0:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        e = zzig.e(i8, 0.0d);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 1:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        f = zzig.f(i8, 0.0f);
                        i5 = i11 + f;
                        zzknVar = this;
                        t2 = t;
                        break;
                    }
                    zzknVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 2:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.d0(i8, unsafe.getLong(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 3:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.r0(i8, unsafe.getLong(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 4:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.q0(i8, unsafe.getInt(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 5:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        f = zzig.U(i8, 0L);
                        i5 = i11 + f;
                        zzknVar = this;
                        t2 = t;
                        break;
                    }
                    zzknVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 6:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        f = zzig.m0(i8, 0);
                        i5 = i11 + f;
                        zzknVar = this;
                        t2 = t;
                        break;
                    }
                    zzknVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 7:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        f = zzig.D(i8, true);
                        i5 = i11 + f;
                        zzknVar = this;
                        t2 = t;
                        break;
                    }
                    zzknVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 8:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, j);
                        if (object instanceof zzhm) {
                            d0 = zzig.V(i8, (zzhm) object);
                        } else {
                            d0 = zzig.C(i8, (String) object);
                        }
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 9:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        e = zzld.a(i8, unsafe.getObject(t2, j), zzknVar.Q(i3));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 10:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.V(i8, (zzhm) unsafe.getObject(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 11:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.B0(i8, unsafe.getInt(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 12:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.i0(i8, unsafe.getInt(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 13:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        f = zzig.u0(i8, 0);
                        i5 = i11 + f;
                        zzknVar = this;
                        t2 = t;
                        break;
                    }
                    zzknVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 14:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        f = zzig.j0(i8, 0L);
                        i5 = i11 + f;
                        zzknVar = this;
                        t2 = t;
                        break;
                    }
                    zzknVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 15:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.y0(i8, unsafe.getInt(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 16:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        d0 = zzig.n0(i8, unsafe.getLong(t2, j));
                        i5 = i11 + d0;
                        zzknVar = this;
                        break;
                    }
                    zzknVar = this;
                    i5 = i11;
                    break;
                case 17:
                    if (zzknVar.C(t2, i3, i6, i4, i)) {
                        e = zzig.B(i8, (zzkj) unsafe.getObject(t2, j), zzknVar.Q(i3));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 18:
                    e = zzld.C(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 19:
                    e = zzld.y(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 20:
                    e = zzld.K(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 21:
                    e = zzld.W(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 22:
                    e = zzld.G(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 23:
                    e = zzld.C(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 24:
                    e = zzld.y(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 25:
                    e = zzld.d(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 26:
                    e = zzld.q(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + e;
                    break;
                case 27:
                    e = zzld.r(i8, (List) unsafe.getObject(t2, j), zzknVar.Q(i3));
                    i5 = i11 + e;
                    break;
                case 28:
                    e = zzld.b(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + e;
                    break;
                case 29:
                    e = zzld.T(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 30:
                    e = zzld.s(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 31:
                    e = zzld.y(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 32:
                    e = zzld.C(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 33:
                    e = zzld.N(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 34:
                    e = zzld.Q(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + e;
                    break;
                case 35:
                    D = zzld.D((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 36:
                    D = zzld.z((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 37:
                    D = zzld.L((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 38:
                    D = zzld.X((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 39:
                    D = zzld.H((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 40:
                    D = zzld.D((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 41:
                    D = zzld.z((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 42:
                    D = zzld.e((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 43:
                    D = zzld.U((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 44:
                    D = zzld.t((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 45:
                    D = zzld.z((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 46:
                    D = zzld.D((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 47:
                    D = zzld.O((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 48:
                    D = zzld.R((List) unsafe.getObject(t2, j));
                    if (D > 0) {
                        x0 = zzig.x0(i8);
                        A0 = zzig.A0(D);
                        i5 = i11 + x0 + A0 + D;
                        break;
                    }
                    i5 = i11;
                    break;
                case 49:
                    e = zzld.c(i8, (List) unsafe.getObject(t2, j), zzknVar.Q(i3));
                    i5 = i11 + e;
                    break;
                case 50:
                    e = zzknVar.q.i(i8, unsafe.getObject(t2, j), zzknVar.T(i3));
                    i5 = i11 + e;
                    break;
                case 51:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.e(i8, 0.0d);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 52:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.f(i8, 0.0f);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 53:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.d0(i8, O(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 54:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.r0(i8, O(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 55:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.q0(i8, K(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 56:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.U(i8, 0L);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 57:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.m0(i8, 0);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 58:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.D(i8, true);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 59:
                    if (zzknVar.M(t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        if (object2 instanceof zzhm) {
                            e = zzig.V(i8, (zzhm) object2);
                        } else {
                            e = zzig.C(i8, (String) object2);
                        }
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 60:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzld.a(i8, unsafe.getObject(t2, j), zzknVar.Q(i3));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 61:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.V(i8, (zzhm) unsafe.getObject(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 62:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.B0(i8, K(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 63:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.i0(i8, K(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 64:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.u0(i8, 0);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 65:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.j0(i8, 0L);
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 66:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.y0(i8, K(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 67:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.n0(i8, O(t2, j));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                case 68:
                    if (zzknVar.M(t2, i8, i3)) {
                        e = zzig.B(i8, (zzkj) unsafe.getObject(t2, j), zzknVar.Q(i3));
                        i5 = i11 + e;
                        break;
                    }
                    i5 = i11;
                    break;
                default:
                    i5 = i11;
                    break;
            }
            i3 += 3;
            i2 = C3833Oi1.t;
        }
        zzma<?, ?> zzmaVar = zzknVar.f306o;
        int a = i5 + zzmaVar.a(zzmaVar.q(t2));
        if (zzknVar.f) {
            zziq<?> b = zzknVar.p.b(t2);
            int i12 = 0;
            for (int i13 = 0; i13 < b.a.g(); i13++) {
                Map.Entry<?, Object> i14 = b.a.i(i13);
                i12 += zziq.b((zzis) i14.getKey(), i14.getValue());
            }
            for (Map.Entry<?, Object> entry : b.a.k()) {
                i12 += zziq.b((zzis) entry.getKey(), entry.getValue());
            }
            return a + i12;
        }
        return a;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int c(T t) {
        int i;
        int b;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int J = J(i3);
            int i4 = this.a[i3];
            long j = 1048575 & J;
            int i5 = 37;
            switch ((J & C3833Oi1.u) >>> 20) {
                case 0:
                    i = i2 * 53;
                    b = zziz.b(Double.doubleToLongBits(zzmg.a(t, j)));
                    i2 = i + b;
                    break;
                case 1:
                    i = i2 * 53;
                    b = Float.floatToIntBits(zzmg.n(t, j));
                    i2 = i + b;
                    break;
                case 2:
                    i = i2 * 53;
                    b = zziz.b(zzmg.x(t, j));
                    i2 = i + b;
                    break;
                case 3:
                    i = i2 * 53;
                    b = zziz.b(zzmg.x(t, j));
                    i2 = i + b;
                    break;
                case 4:
                    i = i2 * 53;
                    b = zzmg.t(t, j);
                    i2 = i + b;
                    break;
                case 5:
                    i = i2 * 53;
                    b = zziz.b(zzmg.x(t, j));
                    i2 = i + b;
                    break;
                case 6:
                    i = i2 * 53;
                    b = zzmg.t(t, j);
                    i2 = i + b;
                    break;
                case 7:
                    i = i2 * 53;
                    b = zziz.c(zzmg.F(t, j));
                    i2 = i + b;
                    break;
                case 8:
                    i = i2 * 53;
                    b = ((String) zzmg.B(t, j)).hashCode();
                    i2 = i + b;
                    break;
                case 9:
                    Object B = zzmg.B(t, j);
                    if (B != null) {
                        i5 = B.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    b = zzmg.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 11:
                    i = i2 * 53;
                    b = zzmg.t(t, j);
                    i2 = i + b;
                    break;
                case 12:
                    i = i2 * 53;
                    b = zzmg.t(t, j);
                    i2 = i + b;
                    break;
                case 13:
                    i = i2 * 53;
                    b = zzmg.t(t, j);
                    i2 = i + b;
                    break;
                case 14:
                    i = i2 * 53;
                    b = zziz.b(zzmg.x(t, j));
                    i2 = i + b;
                    break;
                case 15:
                    i = i2 * 53;
                    b = zzmg.t(t, j);
                    i2 = i + b;
                    break;
                case 16:
                    i = i2 * 53;
                    b = zziz.b(zzmg.x(t, j));
                    i2 = i + b;
                    break;
                case 17:
                    Object B2 = zzmg.B(t, j);
                    if (B2 != null) {
                        i5 = B2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    b = zzmg.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 50:
                    i = i2 * 53;
                    b = zzmg.B(t, j).hashCode();
                    i2 = i + b;
                    break;
                case 51:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.b(Double.doubleToLongBits(k(t, j)));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = Float.floatToIntBits(E(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.b(O(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.b(O(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = K(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.b(O(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = K(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.c(S(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = ((String) zzmg.B(t, j)).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zzmg.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zzmg.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = K(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = K(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = K(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.b(O(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = K(t, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zziz.b(O(t, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (M(t, i4, i3)) {
                        i = i2 * 53;
                        b = zzmg.B(t, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f306o.q(t).hashCode();
        if (this.f) {
            return (hashCode * 53) + this.p.b(t).hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.measurement.zzlb] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.measurement.zzlb] */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final boolean d(T t) {
        int i;
        int i2;
        zzkn<T> zzknVar;
        T t2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.k) {
            int i6 = this.j[i4];
            int i7 = this.a[i6];
            int J = J(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & C3833Oi1.t;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = s.getInt(t, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & J) != 0) {
                zzknVar = this;
                t2 = t;
                if (!zzknVar.C(t2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                zzknVar = this;
                t2 = t;
            }
            int i11 = (267386880 & J) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 != 60 && i11 != 68) {
                        if (i11 != 49) {
                            if (i11 != 50) {
                                continue;
                            } else {
                                Map<?, ?> d = zzknVar.q.d(zzmg.B(t2, J & C3833Oi1.t));
                                if (d.isEmpty()) {
                                    continue;
                                } else {
                                    if (zzknVar.q.b(T(i6)).c.e() == zzmx.MESSAGE) {
                                        zzlb<T> zzlbVar = 0;
                                        for (Object obj : d.values()) {
                                            if (zzlbVar == null) {
                                                zzlbVar = zzkx.a().b(obj.getClass());
                                            }
                                            boolean d2 = zzlbVar.d(obj);
                                            zzlbVar = zzlbVar;
                                            if (!d2) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (M(t2, i7, i6) && !D(t2, J, Q(i6))) {
                        return false;
                    }
                }
                List list = (List) zzmg.B(t2, J & C3833Oi1.t);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? Q = Q(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!Q.d(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzknVar.C(t2, i6, i, i2, i10) && !D(t2, J, Q(i6))) {
                return false;
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        T t3 = t;
        if (this.f && !this.p.b(t3).t()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0784 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:23:0x0058, B:185:0x077f, B:187:0x0784, B:188:0x0789, B:82:0x013a, B:83:0x014c, B:84:0x0164, B:85:0x017c, B:86:0x0194, B:87:0x01ac, B:89:0x01bc, B:92:0x01c3, B:93:0x01c9, B:94:0x01d7, B:95:0x01ef, B:96:0x0203, B:97:0x021b, B:98:0x0229, B:99:0x0241, B:100:0x0259, B:101:0x0271, B:102:0x0289, B:103:0x02a1, B:104:0x02b9, B:105:0x02d1, B:106:0x02e9, B:108:0x02ff, B:112:0x0320, B:109:0x0309, B:111:0x0311, B:113:0x0331, B:114:0x0349, B:115:0x035d, B:116:0x0371, B:117:0x0385, B:118:0x0399, B:127:0x03cc, B:128:0x03da, B:129:0x03ee, B:130:0x0402, B:131:0x0416, B:132:0x042a, B:133:0x043e, B:134:0x0452, B:135:0x0466, B:136:0x047a, B:137:0x048e, B:138:0x04a2, B:139:0x04b6, B:140:0x04ca, B:145:0x04f1, B:146:0x04ff, B:147:0x0513, B:148:0x052b, B:150:0x0537, B:151:0x0545, B:152:0x0553, B:153:0x0567, B:154:0x057b, B:155:0x058f, B:156:0x05a3, B:157:0x05b7, B:158:0x05cb, B:159:0x05df, B:160:0x05f3, B:161:0x060b, B:162:0x0620, B:163:0x0635, B:164:0x064a, B:165:0x065f, B:167:0x066f, B:170:0x0676, B:171:0x067c, B:172:0x0687, B:173:0x069c, B:174:0x06b1, B:175:0x06c9, B:176:0x06d7, B:177:0x06ec, B:178:0x0701, B:179:0x0716, B:180:0x072b, B:181:0x0740, B:182:0x0755, B:183:0x076a), top: B:214:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07bc A[LOOP:1: B:202:0x07b8->B:204:0x07bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x078f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(T t, zzlc zzlcVar, zzik zzikVar) throws IOException {
        T t2;
        int i;
        Object obj;
        int c;
        int l;
        zzim<?> zzimVar;
        zzik zzikVar2;
        zzma zzmaVar;
        T t3;
        zzkn<T> zzknVar;
        Object h;
        T t4;
        zzma zzmaVar2;
        zzma zzmaVar3;
        zzkn<T> zzknVar2;
        zzkn<T> zzknVar3 = this;
        zzik zzikVar3 = zzikVar;
        zzikVar3.getClass();
        U(t);
        zzma zzmaVar4 = zzknVar3.f306o;
        zzim<?> zzimVar2 = zzknVar3.p;
        Object obj2 = null;
        zziq<?> zziqVar = null;
        while (true) {
            try {
                c = zzlcVar.c();
                l = zzknVar3.l(c);
            } catch (Throwable th) {
                th = th;
                t2 = t;
            }
            if (l >= 0) {
                zzimVar = zzimVar2;
                zzikVar2 = zzikVar3;
                zzmaVar = zzmaVar4;
                t3 = t;
                try {
                    int J = zzknVar3.J(l);
                    switch ((267386880 & J) >>> 20) {
                        case 0:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.f(t3, J & C3833Oi1.t, zzlcVar.a());
                            zzknVar.G(t3, l);
                            break;
                        case 1:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.g(t3, J & C3833Oi1.t, zzlcVar.b());
                            zzknVar.G(t3, l);
                            break;
                        case 2:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.i(t3, J & C3833Oi1.t, zzlcVar.l());
                            zzknVar.G(t3, l);
                            break;
                        case 3:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.i(t3, J & C3833Oi1.t, zzlcVar.p());
                            zzknVar.G(t3, l);
                            break;
                        case 4:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.h(t3, J & C3833Oi1.t, zzlcVar.g());
                            zzknVar.G(t3, l);
                            break;
                        case 5:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.i(t3, J & C3833Oi1.t, zzlcVar.k());
                            zzknVar.G(t3, l);
                            break;
                        case 6:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.h(t3, J & C3833Oi1.t, zzlcVar.e());
                            zzknVar.G(t3, l);
                            break;
                        case 7:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.v(t3, J & C3833Oi1.t, zzlcVar.s());
                            zzknVar.G(t3, l);
                            break;
                        case 8:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzknVar.z(t3, J, zzlcVar);
                            zzknVar.G(t3, l);
                            break;
                        case 9:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzkj zzkjVar = (zzkj) zzknVar.r(t3, l);
                            zzlcVar.B(zzkjVar, zzknVar.Q(l), zzikVar2);
                            zzknVar.A(t3, l, zzkjVar);
                            break;
                        case 10:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, zzlcVar.o());
                            zzknVar.G(t3, l);
                            break;
                        case 11:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.h(t3, J & C3833Oi1.t, zzlcVar.j());
                            zzknVar.G(t3, l);
                            break;
                        case 12:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            int d = zzlcVar.d();
                            zzje P = zzknVar.P(l);
                            if (P != null && !P.u(d)) {
                                obj2 = zzld.g(t3, c, d, obj2, zzmaVar4);
                                break;
                            }
                            zzmg.h(t3, J & C3833Oi1.t, d);
                            zzknVar.G(t3, l);
                            break;
                        case 13:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.h(t3, J & C3833Oi1.t, zzlcVar.h());
                            zzknVar.G(t3, l);
                            break;
                        case 14:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.i(t3, J & C3833Oi1.t, zzlcVar.m());
                            zzknVar.G(t3, l);
                            break;
                        case 15:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.h(t3, J & C3833Oi1.t, zzlcVar.i());
                            zzknVar.G(t3, l);
                            break;
                        case 16:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.i(t3, J & C3833Oi1.t, zzlcVar.n());
                            zzknVar.G(t3, l);
                            break;
                        case 17:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzkj zzkjVar2 = (zzkj) zzknVar.r(t3, l);
                            zzlcVar.D(zzkjVar2, zzknVar.Q(l), zzikVar2);
                            zzknVar.A(t3, l, zzkjVar2);
                            break;
                        case 18:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.C(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 19:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.t(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 20:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.z(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 21:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.J(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 22:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.q(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 23:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.A0(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 24:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.E(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 25:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.I(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 26:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            if (V(J)) {
                                zzlcVar.H(zzknVar.n.b(t3, J & C3833Oi1.t));
                                break;
                            } else {
                                zzlcVar.M(zzknVar.n.b(t3, J & C3833Oi1.t));
                                break;
                            }
                        case 27:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.u(zzknVar.n.b(t3, J & C3833Oi1.t), zzknVar.Q(l), zzikVar2);
                            break;
                        case 28:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.K0(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 29:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.G(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 30:
                            zzknVar = zzknVar3;
                            List<Integer> b = zzknVar.n.b(t3, J & C3833Oi1.t);
                            zzlcVar.F(b);
                            h = zzld.h(t3, c, b, zzknVar.P(l), obj2, zzmaVar);
                            zzmaVar4 = zzmaVar;
                            obj2 = h;
                            break;
                        case 31:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.y(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 32:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.L(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 33:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.K(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 34:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.N(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 35:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.C(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 36:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.t(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 37:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.z(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 38:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.J(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 39:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.q(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 40:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.A0(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 41:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.E(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 42:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.I(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 43:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.G(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 44:
                            zzknVar = zzknVar3;
                            t4 = t3;
                            List<Integer> b2 = zzknVar.n.b(t4, J & C3833Oi1.t);
                            zzlcVar.F(b2);
                            zzje P2 = zzknVar.P(l);
                            Object obj3 = obj2;
                            try {
                                h = zzld.h(t4, c, b2, P2, obj3, zzmaVar);
                                zzmaVar4 = zzmaVar;
                                obj2 = h;
                                break;
                            } catch (zzjh unused) {
                                zzmaVar3 = zzmaVar;
                                obj2 = obj3;
                                zzmaVar4 = zzmaVar3;
                                zzmaVar4.i(zzlcVar);
                                if (obj2 == null) {
                                }
                                if (!zzmaVar4.j(obj2, zzlcVar)) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                zzmaVar2 = zzmaVar;
                                obj2 = obj3;
                                zzmaVar4 = zzmaVar2;
                                t2 = t4;
                                zzknVar3 = zzknVar;
                                i = zzknVar3.k;
                                obj = obj2;
                                while (i < zzknVar3.l) {
                                }
                                T t5 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                        case 45:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.y(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 46:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.L(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 47:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.K(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 48:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.N(zzknVar.n.b(t3, J & C3833Oi1.t));
                            break;
                        case 49:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzlcVar.A(zzknVar.n.b(t3, J & C3833Oi1.t), zzknVar.Q(l), zzikVar2);
                            break;
                        case 50:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            Object T = zzknVar.T(l);
                            long J2 = zzknVar.J(l) & C3833Oi1.t;
                            Object B = zzmg.B(t3, J2);
                            if (B == null) {
                                B = zzknVar.q.c(T);
                                zzmg.j(t3, J2, B);
                            } else if (zzknVar.q.e(B)) {
                                Object c2 = zzknVar.q.c(T);
                                zzknVar.q.g(c2, B);
                                zzmg.j(t3, J2, c2);
                                B = c2;
                            }
                            zzlcVar.w(zzknVar.q.h(B), zzknVar.q.b(T), zzikVar2);
                            break;
                        case 51:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Double.valueOf(zzlcVar.a()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 52:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Float.valueOf(zzlcVar.b()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 53:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Long.valueOf(zzlcVar.l()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 54:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Long.valueOf(zzlcVar.p()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 55:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Integer.valueOf(zzlcVar.g()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 56:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Long.valueOf(zzlcVar.k()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 57:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Integer.valueOf(zzlcVar.e()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 58:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Boolean.valueOf(zzlcVar.s()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 59:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzknVar.z(t3, J, zzlcVar);
                            zzknVar.H(t3, c, l);
                            break;
                        case 60:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzkj zzkjVar3 = (zzkj) zzknVar.s(t3, c, l);
                            zzlcVar.B(zzkjVar3, zzknVar.Q(l), zzikVar2);
                            zzknVar.y(t3, c, l, zzkjVar3);
                            break;
                        case 61:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, zzlcVar.o());
                            zzknVar.H(t3, c, l);
                            break;
                        case 62:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Integer.valueOf(zzlcVar.j()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 63:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            int d2 = zzlcVar.d();
                            zzje P3 = zzknVar.P(l);
                            if (P3 != null && !P3.u(d2)) {
                                obj2 = zzld.g(t3, c, d2, obj2, zzmaVar4);
                                break;
                            }
                            zzmg.j(t3, J & C3833Oi1.t, Integer.valueOf(d2));
                            zzknVar.H(t3, c, l);
                            break;
                        case 64:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Integer.valueOf(zzlcVar.h()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 65:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Long.valueOf(zzlcVar.m()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 66:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Integer.valueOf(zzlcVar.i()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 67:
                            zzknVar = zzknVar3;
                            zzmaVar4 = zzmaVar;
                            zzmg.j(t3, J & C3833Oi1.t, Long.valueOf(zzlcVar.n()));
                            zzknVar.H(t3, c, l);
                            break;
                        case 68:
                            zzknVar = zzknVar3;
                            t4 = t3;
                            zzmaVar4 = zzmaVar;
                            try {
                                zzkj zzkjVar4 = (zzkj) zzknVar.s(t4, c, l);
                                zzlcVar.D(zzkjVar4, zzknVar.Q(l), zzikVar2);
                                zzknVar.y(t4, c, l, zzkjVar4);
                            } catch (zzjh unused2) {
                                zzmaVar4.i(zzlcVar);
                                if (obj2 == null) {
                                    obj2 = zzmaVar4.o(t4);
                                }
                                if (!zzmaVar4.j(obj2, zzlcVar)) {
                                    int i2 = zzknVar.k;
                                    Object obj4 = obj2;
                                    while (i2 < zzknVar.l) {
                                        T t6 = t4;
                                        obj4 = zzknVar.t(t6, zzknVar.j[i2], obj4, zzmaVar4, t);
                                        i2++;
                                        t4 = t6;
                                    }
                                    T t7 = t4;
                                    if (obj4 != null) {
                                        zzmaVar4.n(t7, obj4);
                                        return;
                                    }
                                    return;
                                }
                                zzknVar3 = zzknVar;
                                zzikVar3 = zzikVar2;
                                zzimVar2 = zzimVar;
                            }
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = zzmaVar.o(t3);
                                } catch (zzjh unused3) {
                                    zzmaVar3 = zzmaVar;
                                    zzknVar = zzknVar3;
                                    t4 = t3;
                                    zzmaVar4 = zzmaVar3;
                                    zzmaVar4.i(zzlcVar);
                                    if (obj2 == null) {
                                    }
                                    if (!zzmaVar4.j(obj2, zzlcVar)) {
                                    }
                                }
                            }
                            try {
                                if (!zzmaVar.j(obj2, zzlcVar)) {
                                    int i3 = zzknVar3.k;
                                    Object obj5 = obj2;
                                    while (i3 < zzknVar3.l) {
                                        T t8 = t3;
                                        zzma zzmaVar5 = zzmaVar;
                                        obj5 = zzknVar3.t(t8, zzknVar3.j[i3], obj5, zzmaVar5, t);
                                        i3++;
                                        t3 = t8;
                                        zzknVar3 = zzknVar3;
                                        zzmaVar = zzmaVar5;
                                    }
                                    zzma zzmaVar6 = zzmaVar;
                                    zzknVar2 = zzknVar3;
                                    T t9 = t3;
                                    if (obj5 != null) {
                                        zzmaVar6.n(t9, obj5);
                                        break;
                                    }
                                } else {
                                    zzknVar = zzknVar3;
                                    zzmaVar4 = zzmaVar;
                                    break;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zzmaVar2 = zzmaVar;
                                zzknVar = zzknVar3;
                                t4 = t3;
                                zzmaVar4 = zzmaVar2;
                                t2 = t4;
                                zzknVar3 = zzknVar;
                                i = zzknVar3.k;
                                obj = obj2;
                                while (i < zzknVar3.l) {
                                }
                                T t52 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                    }
                    zzknVar3 = zzknVar;
                } catch (Throwable th4) {
                    th = th4;
                    t2 = t3;
                    zzmaVar4 = zzmaVar;
                    i = zzknVar3.k;
                    obj = obj2;
                    while (i < zzknVar3.l) {
                    }
                    T t522 = t2;
                    if (obj != null) {
                    }
                    throw th;
                }
            } else if (c == Integer.MAX_VALUE) {
                int i4 = zzknVar3.k;
                Object obj6 = obj2;
                while (i4 < zzknVar3.l) {
                    obj6 = zzknVar3.t(t, zzknVar3.j[i4], obj6, zzmaVar4, t);
                    i4++;
                    zzknVar3 = zzknVar3;
                }
                zzknVar2 = zzknVar3;
                if (obj6 != null) {
                    zzmaVar4.n(t, obj6);
                }
            } else {
                zzknVar = zzknVar3;
                t4 = t;
                try {
                    Object c3 = !zzknVar.f ? null : zzimVar2.c(zzikVar3, zzknVar.e, c);
                    if (c3 != null) {
                        if (zziqVar == null) {
                            try {
                                zziqVar = zzimVar2.i(t4);
                            } catch (Throwable th5) {
                                th = th5;
                                t2 = t4;
                                zzknVar3 = zzknVar;
                                i = zzknVar3.k;
                                obj = obj2;
                                while (i < zzknVar3.l) {
                                }
                                T t5222 = t2;
                                if (obj != null) {
                                }
                                throw th;
                            }
                        }
                        zziq<?> zziqVar2 = zziqVar;
                        zzma zzmaVar7 = zzmaVar4;
                        try {
                            obj2 = zzimVar2.d(t4, zzlcVar, c3, zzikVar3, zziqVar2, obj2, zzmaVar7);
                            zziqVar = zziqVar2;
                            zzmaVar4 = zzmaVar7;
                            zzimVar = zzimVar2;
                            zzikVar2 = zzikVar3;
                            zzknVar3 = zzknVar;
                        } catch (Throwable th6) {
                            th = th6;
                            t2 = t4;
                            zzmaVar4 = zzmaVar7;
                        }
                    } else {
                        zzimVar = zzimVar2;
                        t2 = t4;
                        zzikVar2 = zzikVar3;
                        try {
                            zzmaVar4.i(zzlcVar);
                            if (obj2 == null) {
                                try {
                                    obj2 = zzmaVar4.o(t2);
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                            if (!zzmaVar4.j(obj2, zzlcVar)) {
                                int i5 = zzknVar.k;
                                Object obj7 = obj2;
                                while (i5 < zzknVar.l) {
                                    zzkn<T> zzknVar4 = zzknVar;
                                    obj7 = zzknVar4.t(t2, zzknVar.j[i5], obj7, zzmaVar4, t);
                                    i5++;
                                    zzmaVar4 = zzmaVar4;
                                    zzknVar = zzknVar4;
                                }
                                zzma zzmaVar8 = zzmaVar4;
                                if (obj7 != null) {
                                    zzmaVar8.n(t2, obj7);
                                    return;
                                }
                                return;
                            }
                            zzknVar3 = zzknVar;
                            zzmaVar4 = zzmaVar4;
                        } catch (Throwable th8) {
                            th = th8;
                            zzknVar3 = zzknVar;
                            zzmaVar = zzmaVar4;
                            zzmaVar4 = zzmaVar;
                            i = zzknVar3.k;
                            obj = obj2;
                            while (i < zzknVar3.l) {
                            }
                            T t52222 = t2;
                            if (obj != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    zzma zzmaVar9 = zzmaVar4;
                    t3 = t4;
                    zzknVar3 = zzknVar;
                    zzmaVar = zzmaVar9;
                    t2 = t3;
                    zzmaVar4 = zzmaVar;
                    i = zzknVar3.k;
                    obj = obj2;
                    while (i < zzknVar3.l) {
                    }
                    T t522222 = t2;
                    if (obj != null) {
                    }
                    throw th;
                }
                zzknVar3 = zzknVar;
                i = zzknVar3.k;
                obj = obj2;
                while (i < zzknVar3.l) {
                    obj = zzknVar3.t(t2, zzknVar3.j[i], obj, zzmaVar4, t);
                    i++;
                    zzknVar3 = this;
                }
                T t5222222 = t2;
                if (obj != null) {
                    zzmaVar4.n(t5222222, obj);
                }
                throw th;
            }
            zzikVar3 = zzikVar2;
            zzimVar2 = zzimVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void f(T t) {
        if (W(t)) {
            if (t instanceof zzix) {
                zzix zzixVar = (zzix) t;
                zzixVar.l(Integer.MAX_VALUE);
                zzixVar.zza = 0;
                zzixVar.D();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int J = J(i);
                long j = 1048575 & J;
                int i2 = (J & C3833Oi1.u) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
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
                                this.n.e(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = s;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.q.f(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (M(t, this.a[i], i)) {
                        Q(i).f(s.getObject(t, j));
                    }
                }
                if (L(t, i)) {
                    Q(i).f(s.getObject(t, j));
                }
            }
            this.f306o.s(t);
            if (this.f) {
                this.p.j(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void g(T t, T t2) {
        U(t);
        t2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int J = J(i);
            long j = 1048575 & J;
            int i2 = this.a[i];
            switch ((J & C3833Oi1.u) >>> 20) {
                case 0:
                    if (L(t2, i)) {
                        zzmg.f(t, j, zzmg.a(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (L(t2, i)) {
                        zzmg.g(t, j, zzmg.n(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (L(t2, i)) {
                        zzmg.i(t, j, zzmg.x(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (L(t2, i)) {
                        zzmg.i(t, j, zzmg.x(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (L(t2, i)) {
                        zzmg.h(t, j, zzmg.t(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (L(t2, i)) {
                        zzmg.i(t, j, zzmg.x(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (L(t2, i)) {
                        zzmg.h(t, j, zzmg.t(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (L(t2, i)) {
                        zzmg.v(t, j, zzmg.F(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (L(t2, i)) {
                        zzmg.j(t, j, zzmg.B(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    B(t, t2, i);
                    break;
                case 10:
                    if (L(t2, i)) {
                        zzmg.j(t, j, zzmg.B(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (L(t2, i)) {
                        zzmg.h(t, j, zzmg.t(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (L(t2, i)) {
                        zzmg.h(t, j, zzmg.t(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (L(t2, i)) {
                        zzmg.h(t, j, zzmg.t(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (L(t2, i)) {
                        zzmg.i(t, j, zzmg.x(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (L(t2, i)) {
                        zzmg.h(t, j, zzmg.t(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (L(t2, i)) {
                        zzmg.i(t, j, zzmg.x(t2, j));
                        G(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    B(t, t2, i);
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
                    this.n.c(t, t2, j);
                    break;
                case 50:
                    zzld.m(this.q, t, t2, j);
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
                    if (M(t2, i2, i)) {
                        zzmg.j(t, j, zzmg.B(t2, j));
                        H(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    I(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (M(t2, i2, i)) {
                        zzmg.j(t, j, zzmg.B(t2, j));
                        H(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    I(t, t2, i);
                    break;
            }
        }
        zzld.n(this.f306o, t, t2);
        if (this.f) {
            zzld.l(this.p, t, t2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a61  */
    @Override // com.google.android.gms.internal.measurement.zzlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(T t, zzmw zzmwVar) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        Map.Entry<?, Object> entry2;
        int i2;
        int i3;
        int i4;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        zzkn<T> zzknVar = this;
        int a = zzmwVar.a();
        int i5 = zzmz.b;
        int i6 = C3833Oi1.u;
        int i7 = 1;
        int i8 = C3833Oi1.t;
        if (a == i5) {
            w(zzknVar.f306o, t, zzmwVar);
            if (zzknVar.f) {
                zziq<?> b = zzknVar.p.b(t);
                if (!b.a.isEmpty()) {
                    it2 = b.n();
                    entry3 = it2.next();
                    for (length2 = zzknVar.a.length - 3; length2 >= 0; length2 -= 3) {
                        int J = zzknVar.J(length2);
                        int i9 = zzknVar.a[length2];
                        while (entry3 != null && zzknVar.p.a(entry3) > i9) {
                            zzknVar.p.g(zzmwVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((J & C3833Oi1.u) >>> 20) {
                            case 0:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.s(i9, zzmg.a(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.t(i9, zzmg.n(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.k(i9, zzmg.x(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.d(i9, zzmg.x(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.n(i9, zzmg.t(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.b(i9, zzmg.x(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.l(i9, zzmg.t(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.j(i9, zzmg.F(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzknVar.L(t, length2)) {
                                    v(i9, zzmg.B(t, J & C3833Oi1.t), zzmwVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.v(i9, zzmg.B(t, J & C3833Oi1.t), zzknVar.Q(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.w(i9, (zzhm) zzmg.B(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.x(i9, zzmg.t(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.r(i9, zzmg.t(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.B(i9, zzmg.t(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.o(i9, zzmg.x(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.g0(i9, zzmg.t(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.c0(i9, zzmg.x(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzknVar.L(t, length2)) {
                                    zzmwVar.D(i9, zzmg.B(t, J & C3833Oi1.t), zzknVar.Q(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzld.x(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 19:
                                zzld.M(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 20:
                                zzld.S(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 21:
                                zzld.c0(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 22:
                                zzld.P(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 23:
                                zzld.J(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 24:
                                zzld.F(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 25:
                                zzld.k(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 26:
                                zzld.v(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar);
                                break;
                            case 27:
                                zzld.w(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, zzknVar.Q(length2));
                                break;
                            case 28:
                                zzld.i(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar);
                                break;
                            case 29:
                                zzld.b0(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 30:
                                zzld.B(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 31:
                                zzld.V(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 32:
                                zzld.Y(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 33:
                                zzld.Z(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 34:
                                zzld.a0(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, false);
                                break;
                            case 35:
                                zzld.x(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 36:
                                zzld.M(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 37:
                                zzld.S(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 38:
                                zzld.c0(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 39:
                                zzld.P(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 40:
                                zzld.J(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 41:
                                zzld.F(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 42:
                                zzld.k(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 43:
                                zzld.b0(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 44:
                                zzld.B(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 45:
                                zzld.V(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 46:
                                zzld.Y(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 47:
                                zzld.Z(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 48:
                                zzld.a0(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, true);
                                break;
                            case 49:
                                zzld.j(zzknVar.a[length2], (List) zzmg.B(t, J & C3833Oi1.t), zzmwVar, zzknVar.Q(length2));
                                break;
                            case 50:
                                zzknVar.x(zzmwVar, i9, zzmg.B(t, J & C3833Oi1.t), length2);
                                break;
                            case 51:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.s(i9, k(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.t(i9, E(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.k(i9, O(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.d(i9, O(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.n(i9, K(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.b(i9, O(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.l(i9, K(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.j(i9, S(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzknVar.M(t, i9, length2)) {
                                    v(i9, zzmg.B(t, J & C3833Oi1.t), zzmwVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.v(i9, zzmg.B(t, J & C3833Oi1.t), zzknVar.Q(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.w(i9, (zzhm) zzmg.B(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.x(i9, K(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.r(i9, K(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.B(i9, K(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.o(i9, O(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.g0(i9, K(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.c0(i9, O(t, J & C3833Oi1.t));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzknVar.M(t, i9, length2)) {
                                    zzmwVar.D(i9, zzmg.B(t, J & C3833Oi1.t), zzknVar.Q(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzknVar.p.g(zzmwVar, entry3);
                        entry3 = it2.hasNext() ? it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry3 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (zzknVar.f) {
            zziq<?> b2 = zzknVar.p.b(t);
            if (!b2.a.isEmpty()) {
                Iterator<Map.Entry<?, Object>> q = b2.q();
                entry = q.next();
                it = q;
                length = zzknVar.a.length;
                Unsafe unsafe = s;
                i = 0;
                int i10 = 0;
                int i11 = 1048575;
                while (i < length) {
                    int J2 = zzknVar.J(i);
                    int i12 = i6;
                    int[] iArr = zzknVar.a;
                    int i13 = iArr[i];
                    int i14 = (J2 & i12) >>> 20;
                    int i15 = i7;
                    if (i14 <= 17) {
                        int i16 = iArr[i + 2];
                        int i17 = i16 & i8;
                        if (i17 != i11) {
                            i10 = i17 == i8 ? 0 : unsafe.getInt(t, i17);
                            i11 = i17;
                        }
                        int i18 = i15 << (i16 >>> 20);
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = i18;
                    } else {
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = 0;
                    }
                    while (entry2 != null && zzknVar.p.a(entry2) <= i13) {
                        zzknVar.p.g(zzmwVar, entry2);
                        entry2 = it.hasNext() ? it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j = J2 & i8;
                    switch (i14) {
                        case 0:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.s(i13, zzmg.a(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.t(i13, zzmg.n(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 2:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.k(i13, unsafe.getLong(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 3:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.d(i13, unsafe.getLong(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 4:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.n(i13, unsafe.getInt(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 5:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.b(i13, unsafe.getLong(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 6:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.l(i13, unsafe.getInt(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 7:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.j(i13, zzmg.F(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 8:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                v(i13, unsafe.getObject(t, j), zzmwVar);
                            }
                            zzknVar = this;
                            break;
                        case 9:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.v(i13, unsafe.getObject(t, j), zzknVar.Q(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.w(i13, (zzhm) unsafe.getObject(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 11:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.x(i13, unsafe.getInt(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 12:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.r(i13, unsafe.getInt(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 13:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.B(i13, unsafe.getInt(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 14:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.o(i13, unsafe.getLong(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 15:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.g0(i13, unsafe.getInt(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 16:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.c0(i13, unsafe.getLong(t, j));
                            }
                            zzknVar = this;
                            break;
                        case 17:
                            i7 = i15;
                            if (zzknVar.C(t, i, i2, i3, i4)) {
                                zzmwVar.D(i13, unsafe.getObject(t, j), zzknVar.Q(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i7 = i15;
                            zzld.x(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 19:
                            i7 = i15;
                            zzld.M(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 20:
                            i7 = i15;
                            zzld.S(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 21:
                            i7 = i15;
                            zzld.c0(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 22:
                            i7 = i15;
                            zzld.P(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 23:
                            i7 = i15;
                            zzld.J(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 24:
                            i7 = i15;
                            zzld.F(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 25:
                            i7 = i15;
                            zzld.k(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 26:
                            i7 = i15;
                            zzld.v(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar);
                            break;
                        case 27:
                            i7 = i15;
                            zzld.w(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, zzknVar.Q(i));
                            break;
                        case 28:
                            i7 = i15;
                            zzld.i(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar);
                            break;
                        case 29:
                            i7 = i15;
                            zzld.b0(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 30:
                            i7 = i15;
                            zzld.B(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 31:
                            i7 = i15;
                            zzld.V(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 32:
                            i7 = i15;
                            zzld.Y(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 33:
                            i7 = i15;
                            zzld.Z(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 34:
                            i7 = i15;
                            zzld.a0(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, false);
                            break;
                        case 35:
                            boolean z = i15;
                            zzld.x(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z);
                            i7 = z;
                            break;
                        case 36:
                            boolean z2 = i15;
                            zzld.M(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z2);
                            i7 = z2;
                            break;
                        case 37:
                            boolean z3 = i15;
                            zzld.S(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z3);
                            i7 = z3;
                            break;
                        case 38:
                            boolean z4 = i15;
                            zzld.c0(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z4);
                            i7 = z4;
                            break;
                        case 39:
                            boolean z5 = i15;
                            zzld.P(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z5);
                            i7 = z5;
                            break;
                        case 40:
                            boolean z6 = i15;
                            zzld.J(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z6);
                            i7 = z6;
                            break;
                        case 41:
                            boolean z7 = i15;
                            zzld.F(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z7);
                            i7 = z7;
                            break;
                        case 42:
                            boolean z8 = i15;
                            zzld.k(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z8);
                            i7 = z8;
                            break;
                        case 43:
                            boolean z9 = i15;
                            zzld.b0(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z9);
                            i7 = z9;
                            break;
                        case 44:
                            boolean z10 = i15;
                            zzld.B(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z10);
                            i7 = z10;
                            break;
                        case 45:
                            boolean z11 = i15;
                            zzld.V(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z11);
                            i7 = z11;
                            break;
                        case 46:
                            boolean z12 = i15;
                            zzld.Y(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z12);
                            i7 = z12;
                            break;
                        case 47:
                            boolean z13 = i15;
                            zzld.Z(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z13);
                            i7 = z13;
                            break;
                        case 48:
                            boolean z14 = i15;
                            zzld.a0(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, z14);
                            i7 = z14;
                            break;
                        case 49:
                            zzld.j(zzknVar.a[i], (List) unsafe.getObject(t, j), zzmwVar, zzknVar.Q(i));
                            i7 = i15;
                            break;
                        case 50:
                            zzknVar.x(zzmwVar, i13, unsafe.getObject(t, j), i);
                            i7 = i15;
                            break;
                        case 51:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.s(i13, k(t, j));
                            }
                            i7 = i15;
                            break;
                        case 52:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.t(i13, E(t, j));
                            }
                            i7 = i15;
                            break;
                        case 53:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.k(i13, O(t, j));
                            }
                            i7 = i15;
                            break;
                        case 54:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.d(i13, O(t, j));
                            }
                            i7 = i15;
                            break;
                        case 55:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.n(i13, K(t, j));
                            }
                            i7 = i15;
                            break;
                        case 56:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.b(i13, O(t, j));
                            }
                            i7 = i15;
                            break;
                        case 57:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.l(i13, K(t, j));
                            }
                            i7 = i15;
                            break;
                        case 58:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.j(i13, S(t, j));
                            }
                            i7 = i15;
                            break;
                        case 59:
                            if (zzknVar.M(t, i13, i)) {
                                v(i13, unsafe.getObject(t, j), zzmwVar);
                            }
                            i7 = i15;
                            break;
                        case 60:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.v(i13, unsafe.getObject(t, j), zzknVar.Q(i));
                            }
                            i7 = i15;
                            break;
                        case 61:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.w(i13, (zzhm) unsafe.getObject(t, j));
                            }
                            i7 = i15;
                            break;
                        case 62:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.x(i13, K(t, j));
                            }
                            i7 = i15;
                            break;
                        case 63:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.r(i13, K(t, j));
                            }
                            i7 = i15;
                            break;
                        case 64:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.B(i13, K(t, j));
                            }
                            i7 = i15;
                            break;
                        case 65:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.o(i13, O(t, j));
                            }
                            i7 = i15;
                            break;
                        case 66:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.g0(i13, K(t, j));
                            }
                            i7 = i15;
                            break;
                        case 67:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.c0(i13, O(t, j));
                            }
                            i7 = i15;
                            break;
                        case 68:
                            if (zzknVar.M(t, i13, i)) {
                                zzmwVar.D(i13, unsafe.getObject(t, j), zzknVar.Q(i));
                            }
                            i7 = i15;
                            break;
                        default:
                            i7 = i15;
                            break;
                    }
                    i += 3;
                    i10 = i3;
                    it = it3;
                    i8 = C3833Oi1.t;
                    i11 = i2;
                    entry = entry2;
                    i6 = i12;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    zzknVar.p.g(zzmwVar, entry);
                    entry = it4.hasNext() ? it4.next() : null;
                }
                w(zzknVar.f306o, t, zzmwVar);
            }
        }
        entry = null;
        it = null;
        length = zzknVar.a.length;
        Unsafe unsafe2 = s;
        i = 0;
        int i102 = 0;
        int i112 = 1048575;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        w(zzknVar.f306o, t, zzmwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final void i(T t, byte[] bArr, int i, int i2, zzhl zzhlVar) throws IOException {
        n(t, bArr, i, i2, 0, zzhlVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmg.a(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmg.a(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzld.p(com.google.android.gms.internal.measurement.zzmg.B(r10, r6), com.google.android.gms.internal.measurement.zzmg.B(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (com.google.android.gms.internal.measurement.zzld.p(com.google.android.gms.internal.measurement.zzmg.B(r10, r6), com.google.android.gms.internal.measurement.zzmg.B(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.x(r10, r6) == com.google.android.gms.internal.measurement.zzmg.x(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.t(r10, r6) == com.google.android.gms.internal.measurement.zzmg.t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.x(r10, r6) == com.google.android.gms.internal.measurement.zzmg.x(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.t(r10, r6) == com.google.android.gms.internal.measurement.zzmg.t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.t(r10, r6) == com.google.android.gms.internal.measurement.zzmg.t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.t(r10, r6) == com.google.android.gms.internal.measurement.zzmg.t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (com.google.android.gms.internal.measurement.zzld.p(com.google.android.gms.internal.measurement.zzmg.B(r10, r6), com.google.android.gms.internal.measurement.zzmg.B(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (com.google.android.gms.internal.measurement.zzld.p(com.google.android.gms.internal.measurement.zzmg.B(r10, r6), com.google.android.gms.internal.measurement.zzmg.B(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
        if (com.google.android.gms.internal.measurement.zzld.p(com.google.android.gms.internal.measurement.zzmg.B(r10, r6), com.google.android.gms.internal.measurement.zzmg.B(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.F(r10, r6) == com.google.android.gms.internal.measurement.zzmg.F(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.t(r10, r6) == com.google.android.gms.internal.measurement.zzmg.t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.x(r10, r6) == com.google.android.gms.internal.measurement.zzmg.x(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.t(r10, r6) == com.google.android.gms.internal.measurement.zzmg.t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.x(r10, r6) == com.google.android.gms.internal.measurement.zzmg.x(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018a, code lost:
        if (com.google.android.gms.internal.measurement.zzmg.x(r10, r6) == com.google.android.gms.internal.measurement.zzmg.x(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmg.n(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmg.n(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.measurement.zzlb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(T t, T t2) {
        int length = this.a.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int J = J(i);
                long j = J & C3833Oi1.t;
                switch ((J & C3833Oi1.u) >>> 20) {
                    case 0:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (N(t, t2, i)) {
                            break;
                        }
                        z = false;
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
                        z = zzld.p(zzmg.B(t, j), zzmg.B(t2, j));
                        break;
                    case 50:
                        z = zzld.p(zzmg.B(t, j), zzmg.B(t2, j));
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
                        long F = F(i) & C3833Oi1.t;
                        if (zzmg.t(t, F) == zzmg.t(t2, F)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else if (!this.f306o.q(t).equals(this.f306o.q(t2))) {
                return false;
            } else {
                if (!this.f) {
                    return true;
                }
                return this.p.b(t).equals(this.p.b(t2));
            }
        }
    }

    public final int l(int i) {
        if (i >= this.c && i <= this.d) {
            return m(i, 0);
        }
        return -1;
    }

    public final int m(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
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

    /* JADX WARN: Code restructure failed: missing block: B:440:0x0aa4, code lost:
        throw com.google.android.gms.internal.measurement.zzji.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d15, code lost:
        if (r9 == 1048575) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d17, code lost:
        r1.putInt(r8, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0d1b, code lost:
        r9 = r29.k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0d22, code lost:
        if (r9 >= r29.l) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0d24, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzlz) t(r8, r29.j[r9], r3, r29.f306o, r30);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0d37, code lost:
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0d38, code lost:
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0d3a, code lost:
        r29.f306o.n(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0d3f, code lost:
        if (r7 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0d41, code lost:
        if (r6 != r13) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0d48, code lost:
        throw com.google.android.gms.internal.measurement.zzji.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0d49, code lost:
        if (r6 > r13) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0d4b, code lost:
        if (r15 != r7) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d4d, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d52, code lost:
        throw com.google.android.gms.internal.measurement.zzji.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x05a8 -> B:204:0x05a9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(T t, byte[] bArr, int i, int i2, int i3, zzhl zzhlVar) throws IOException {
        int i4;
        T t2;
        int i5;
        int i6;
        int l;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        zzhl zzhlVar2;
        int i10;
        zzik zzikVar;
        int i11;
        int i12;
        byte[] bArr2;
        Unsafe unsafe2;
        int i13;
        int i14;
        zzhl zzhlVar3;
        T t3;
        int i15;
        zzhl zzhlVar4;
        int i16;
        byte[] bArr3;
        Unsafe unsafe3;
        T t4;
        int i17;
        zzhl zzhlVar5;
        int i18;
        int i19;
        T t5;
        int q;
        int k;
        byte[] bArr4;
        int i20;
        zzhl zzhlVar6;
        byte[] bArr5;
        int i21;
        int i22;
        int i23;
        int i24;
        int p;
        int i25;
        int i26;
        zzhl zzhlVar7;
        int i27;
        int l2;
        int i28;
        int i29;
        zzjf zzjfVar;
        int i30;
        int i31;
        byte[] bArr6;
        int i32;
        zzhl zzhlVar8;
        int i33;
        int p2;
        int i34;
        int i35;
        int i36;
        int q2;
        int i37;
        int j;
        int k2;
        int i38;
        zzhl zzhlVar9;
        int i39;
        int i40;
        int i41;
        T t6 = t;
        byte[] bArr7 = bArr;
        int i42 = i2;
        zzhl zzhlVar10 = zzhlVar;
        U(t6);
        Unsafe unsafe4 = s;
        int i43 = -1;
        int i44 = i;
        int i45 = -1;
        int i46 = 0;
        int i47 = C3833Oi1.t;
        int i48 = 0;
        int i49 = 0;
        while (true) {
            if (i44 < i42) {
                int i50 = i44 + 1;
                int i51 = bArr7[i44];
                if (i51 < 0) {
                    i50 = zzhi.e(i51, bArr7, i50, zzhlVar10);
                    i51 = zzhlVar10.a;
                }
                int i52 = i50;
                i49 = i51;
                int i53 = i49 >>> 3;
                int i54 = i49 & 7;
                if (i53 > i45) {
                    l = (i53 < this.c || i53 > this.d) ? i43 : m(i53, i46 / 3);
                } else {
                    l = l(i53);
                }
                if (l == i43) {
                    i4 = i3;
                    unsafe = unsafe4;
                    t2 = t6;
                    i7 = i47;
                    i8 = i48;
                    i9 = 0;
                    zzhlVar2 = zzhlVar;
                    i10 = i53;
                    i44 = i52;
                } else {
                    int[] iArr = this.a;
                    int i55 = iArr[l + 1];
                    int i56 = (i55 & C3833Oi1.u) >>> 20;
                    long j2 = i55 & C3833Oi1.t;
                    if (i56 <= 17) {
                        int i57 = iArr[l + 2];
                        int i58 = 1 << (i57 >>> 20);
                        int i59 = i57 & C3833Oi1.t;
                        if (i59 != i47) {
                            int i60 = 1048575;
                            if (i47 != 1048575) {
                                unsafe4.putInt(t6, i47, i48);
                                i60 = C3833Oi1.t;
                            }
                            i12 = i59;
                            i11 = i59 == i60 ? 0 : unsafe4.getInt(t6, i59);
                        } else {
                            i11 = i48;
                            i12 = i47;
                        }
                        switch (i56) {
                            case 0:
                                T t7 = t6;
                                unsafe3 = unsafe4;
                                t4 = t7;
                                bArr2 = bArr;
                                i13 = i53;
                                i18 = i52;
                                i14 = l;
                                zzhlVar5 = zzhlVar;
                                if (i54 == 1) {
                                    zzmg.f(t4, j2, zzhi.a(bArr2, i18));
                                    i44 = i18 + 8;
                                    i19 = i11 | i58;
                                    Unsafe unsafe5 = unsafe3;
                                    t6 = t4;
                                    unsafe4 = unsafe5;
                                    int i61 = i12;
                                    i48 = i19;
                                    bArr7 = bArr2;
                                    i47 = i61;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar5;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                            case 1:
                                T t8 = t6;
                                unsafe3 = unsafe4;
                                t4 = t8;
                                bArr2 = bArr;
                                i13 = i53;
                                i18 = i52;
                                i14 = l;
                                zzhlVar5 = zzhlVar;
                                if (i54 == 5) {
                                    zzmg.g(t4, j2, zzhi.m(bArr2, i18));
                                    i44 = i18 + 4;
                                    i19 = i11 | i58;
                                    Unsafe unsafe52 = unsafe3;
                                    t6 = t4;
                                    unsafe4 = unsafe52;
                                    int i612 = i12;
                                    i48 = i19;
                                    bArr7 = bArr2;
                                    i47 = i612;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar5;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i13 = i53;
                                i18 = i52;
                                i14 = l;
                                zzhlVar5 = zzhlVar;
                                if (i54 == 0) {
                                    int q3 = zzhi.q(bArr2, i18, zzhlVar5);
                                    unsafe4.putLong(t6, j2, zzhlVar5.b);
                                    t6 = t6;
                                    unsafe4 = unsafe4;
                                    int i62 = i12;
                                    i48 = i11 | i58;
                                    bArr7 = bArr2;
                                    i47 = i62;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar5;
                                    i44 = q3;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                                t5 = t6;
                                unsafe3 = unsafe4;
                                t4 = t5;
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i13 = i53;
                                i18 = i52;
                                i14 = l;
                                zzhlVar5 = zzhlVar;
                                if (i54 == 0) {
                                    i44 = zzhi.p(bArr2, i18, zzhlVar5);
                                    unsafe4.putInt(t6, j2, zzhlVar5.a);
                                    i19 = i11 | i58;
                                    int i6122 = i12;
                                    i48 = i19;
                                    bArr7 = bArr2;
                                    i47 = i6122;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar5;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                                t5 = t6;
                                unsafe3 = unsafe4;
                                t4 = t5;
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                Unsafe unsafe6 = unsafe4;
                                i13 = i53;
                                i14 = l;
                                T t9 = t6;
                                if (i54 != 1) {
                                    t5 = t9;
                                    zzhlVar5 = zzhlVar;
                                    unsafe4 = unsafe6;
                                    i18 = i52;
                                    unsafe3 = unsafe4;
                                    t4 = t5;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzhlVar5 = zzhlVar;
                                    unsafe4 = unsafe6;
                                    t6 = t9;
                                    unsafe4.putLong(t6, j2, zzhi.r(bArr2, i52));
                                    i44 = i52 + 8;
                                    i19 = i11 | i58;
                                    int i61222 = i12;
                                    i48 = i19;
                                    bArr7 = bArr2;
                                    i47 = i61222;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar5;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i53;
                                i14 = l;
                                zzhlVar3 = zzhlVar;
                                t3 = t6;
                                i15 = i52;
                                if (i54 != 5) {
                                    T t10 = t3;
                                    zzhlVar5 = zzhlVar3;
                                    t4 = t10;
                                    Unsafe unsafe7 = unsafe2;
                                    i18 = i15;
                                    unsafe3 = unsafe7;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(t3, j2, zzhi.o(bArr2, i15));
                                    i44 = i15 + 4;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar3;
                                    unsafe4 = unsafe2;
                                    bArr7 = bArr2;
                                    i46 = i14;
                                    i47 = i12;
                                    i43 = -1;
                                    i48 = i11 | i58;
                                    t6 = t3;
                                    i45 = i13;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i53;
                                i14 = l;
                                zzhlVar3 = zzhlVar;
                                t3 = t6;
                                i15 = i52;
                                if (i54 == 0) {
                                    q = zzhi.q(bArr2, i15, zzhlVar3);
                                    zzmg.v(t3, j2, zzhlVar3.b != 0);
                                    int i63 = i12;
                                    i48 = i11 | i58;
                                    bArr7 = bArr2;
                                    i47 = i63;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar3;
                                    i44 = q;
                                    t6 = t3;
                                    unsafe4 = unsafe2;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                                T t102 = t3;
                                zzhlVar5 = zzhlVar3;
                                t4 = t102;
                                Unsafe unsafe72 = unsafe2;
                                i18 = i15;
                                unsafe3 = unsafe72;
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                            case 8:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i13 = i53;
                                i14 = l;
                                zzhlVar3 = zzhlVar;
                                t3 = t6;
                                i15 = i52;
                                if (i54 == 2) {
                                    if (V(i55)) {
                                        q = zzhi.n(bArr2, i15, zzhlVar3);
                                    } else {
                                        q = zzhi.p(bArr2, i15, zzhlVar3);
                                        int i64 = zzhlVar3.a;
                                        if (i64 < 0) {
                                            throw zzji.f();
                                        }
                                        if (i64 == 0) {
                                            zzhlVar3.c = "";
                                        } else {
                                            zzhlVar3.c = new String(bArr2, q, i64, zziz.b);
                                            q += i64;
                                        }
                                    }
                                    unsafe2.putObject(t3, j2, zzhlVar3.c);
                                    int i632 = i12;
                                    i48 = i11 | i58;
                                    bArr7 = bArr2;
                                    i47 = i632;
                                    i42 = i2;
                                    zzhlVar10 = zzhlVar3;
                                    i44 = q;
                                    t6 = t3;
                                    unsafe4 = unsafe2;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                                T t1022 = t3;
                                zzhlVar5 = zzhlVar3;
                                t4 = t1022;
                                Unsafe unsafe722 = unsafe2;
                                i18 = i15;
                                unsafe3 = unsafe722;
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                            case 9:
                                T t11 = t6;
                                Unsafe unsafe8 = unsafe4;
                                i13 = i53;
                                i16 = i52;
                                i14 = l;
                                if (i54 != 2) {
                                    bArr2 = bArr;
                                    zzhlVar5 = zzhlVar;
                                    t4 = t11;
                                    unsafe3 = unsafe8;
                                    i18 = i16;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    Object r2 = r(t11, i14);
                                    t3 = t11;
                                    unsafe2 = unsafe8;
                                    zzhlVar10 = zzhlVar;
                                    q = zzhi.j(r2, Q(i14), bArr, i16, i2, zzhlVar10);
                                    A(t3, i14, r2);
                                    int i65 = i12;
                                    i48 = i11 | i58;
                                    bArr7 = bArr;
                                    i47 = i65;
                                    i42 = i2;
                                    i44 = q;
                                    t6 = t3;
                                    unsafe4 = unsafe2;
                                    i46 = i14;
                                    i45 = i13;
                                    break;
                                }
                            case 10:
                                T t12 = t6;
                                unsafe3 = unsafe4;
                                t4 = t12;
                                zzhlVar4 = zzhlVar;
                                i13 = i53;
                                i16 = i52;
                                i14 = l;
                                bArr3 = bArr;
                                if (i54 != 2) {
                                    zzhl zzhlVar11 = zzhlVar4;
                                    bArr2 = bArr3;
                                    zzhlVar5 = zzhlVar11;
                                    i18 = i16;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    k = zzhi.k(bArr3, i16, zzhlVar4);
                                    unsafe3.putObject(t4, j2, zzhlVar4.c);
                                    Unsafe unsafe9 = unsafe3;
                                    t6 = t4;
                                    unsafe4 = unsafe9;
                                    i44 = k;
                                    bArr7 = bArr3;
                                    zzhlVar10 = zzhlVar4;
                                    i46 = i14;
                                    i47 = i12;
                                    i45 = i13;
                                    i43 = -1;
                                    i48 = i11 | i58;
                                    i42 = i2;
                                    break;
                                }
                            case 12:
                                T t13 = t6;
                                unsafe3 = unsafe4;
                                t4 = t13;
                                zzhlVar4 = zzhlVar;
                                i13 = i53;
                                i16 = i52;
                                i14 = l;
                                bArr3 = bArr;
                                if (i54 != 0) {
                                    zzhl zzhlVar112 = zzhlVar4;
                                    bArr2 = bArr3;
                                    zzhlVar5 = zzhlVar112;
                                    i18 = i16;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    k = zzhi.p(bArr3, i16, zzhlVar4);
                                    int i66 = zzhlVar4.a;
                                    zzje P = P(i14);
                                    if ((Integer.MIN_VALUE & i55) != 0 && P != null && !P.u(i66)) {
                                        R(t4).e(i49, Long.valueOf(i66));
                                        t6 = t4;
                                        unsafe4 = unsafe3;
                                        i42 = i2;
                                        i44 = k;
                                        bArr7 = bArr3;
                                        zzhlVar10 = zzhlVar4;
                                        i46 = i14;
                                        i47 = i12;
                                        i48 = i11;
                                        i45 = i13;
                                        break;
                                    } else {
                                        unsafe3.putInt(t4, j2, i66);
                                        Unsafe unsafe92 = unsafe3;
                                        t6 = t4;
                                        unsafe4 = unsafe92;
                                        i44 = k;
                                        bArr7 = bArr3;
                                        zzhlVar10 = zzhlVar4;
                                        i46 = i14;
                                        i47 = i12;
                                        i45 = i13;
                                        i43 = -1;
                                        i48 = i11 | i58;
                                        i42 = i2;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                T t14 = t6;
                                unsafe3 = unsafe4;
                                t4 = t14;
                                zzhlVar4 = zzhlVar;
                                i13 = i53;
                                i16 = i52;
                                i14 = l;
                                bArr3 = bArr;
                                if (i54 != 0) {
                                    zzhl zzhlVar1122 = zzhlVar4;
                                    bArr2 = bArr3;
                                    zzhlVar5 = zzhlVar1122;
                                    i18 = i16;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    k = zzhi.p(bArr3, i16, zzhlVar4);
                                    unsafe3.putInt(t4, j2, zzib.l(zzhlVar4.a));
                                    Unsafe unsafe922 = unsafe3;
                                    t6 = t4;
                                    unsafe4 = unsafe922;
                                    i44 = k;
                                    bArr7 = bArr3;
                                    zzhlVar10 = zzhlVar4;
                                    i46 = i14;
                                    i47 = i12;
                                    i45 = i13;
                                    i43 = -1;
                                    i48 = i11 | i58;
                                    i42 = i2;
                                    break;
                                }
                            case 16:
                                zzhlVar4 = zzhlVar;
                                i13 = i53;
                                i16 = i52;
                                i14 = l;
                                bArr3 = bArr;
                                if (i54 != 0) {
                                    T t15 = t6;
                                    unsafe3 = unsafe4;
                                    t4 = t15;
                                    zzhl zzhlVar11222 = zzhlVar4;
                                    bArr2 = bArr3;
                                    zzhlVar5 = zzhlVar11222;
                                    i18 = i16;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    int q4 = zzhi.q(bArr3, i16, zzhlVar4);
                                    unsafe4.putLong(t6, j2, zzib.c(zzhlVar4.b));
                                    i17 = i11 | i58;
                                    t6 = t6;
                                    unsafe4 = unsafe4;
                                    i42 = i2;
                                    i44 = q4;
                                    zzhlVar10 = zzhlVar4;
                                    i46 = i14;
                                    i47 = i12;
                                    i43 = -1;
                                    i48 = i17;
                                    bArr7 = bArr3;
                                    i45 = i13;
                                    break;
                                }
                            case 17:
                                if (i54 != 3) {
                                    i13 = i53;
                                    i14 = l;
                                    T t16 = t6;
                                    unsafe3 = unsafe4;
                                    t4 = t16;
                                    bArr2 = bArr;
                                    zzhlVar5 = zzhlVar;
                                    i18 = i52;
                                    unsafe = unsafe3;
                                    i44 = i18;
                                    i9 = i14;
                                    i8 = i11;
                                    t2 = t4;
                                    zzhlVar2 = zzhlVar5;
                                    i7 = i12;
                                    i10 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    Object r3 = r(t6, l);
                                    i13 = i53;
                                    int i67 = l;
                                    int i68 = zzhi.i(r3, Q(l), bArr, i52, i2, (i53 << 3) | 4, zzhlVar);
                                    bArr3 = bArr;
                                    A(t6, i67, r3);
                                    i17 = i11 | i58;
                                    i44 = i68;
                                    zzhlVar10 = zzhlVar;
                                    i46 = i67;
                                    i47 = i12;
                                    i43 = -1;
                                    i42 = i2;
                                    i48 = i17;
                                    bArr7 = bArr3;
                                    i45 = i13;
                                    break;
                                }
                            default:
                                T t17 = t6;
                                unsafe3 = unsafe4;
                                t4 = t17;
                                bArr2 = bArr;
                                i13 = i53;
                                i18 = i52;
                                i14 = l;
                                zzhlVar5 = zzhlVar;
                                unsafe = unsafe3;
                                i44 = i18;
                                i9 = i14;
                                i8 = i11;
                                t2 = t4;
                                zzhlVar2 = zzhlVar5;
                                i7 = i12;
                                i10 = i13;
                                i4 = i3;
                                break;
                        }
                    } else {
                        T t18 = t6;
                        Unsafe unsafe10 = unsafe4;
                        i13 = i53;
                        int i69 = l;
                        if (i56 != 27) {
                            t2 = t18;
                            Unsafe unsafe11 = unsafe10;
                            if (i56 <= 49) {
                                long j3 = i55;
                                Unsafe unsafe12 = s;
                                zzjf zzjfVar2 = (zzjf) unsafe12.getObject(t2, j2);
                                if (!zzjfVar2.c()) {
                                    int size = zzjfVar2.size();
                                    zzjfVar2 = zzjfVar2.u(size != 0 ? size << 1 : 10);
                                    unsafe12.putObject(t2, j2, zzjfVar2);
                                }
                                zzjf zzjfVar3 = zzjfVar2;
                                switch (i56) {
                                    case 18:
                                    case 35:
                                        bArr5 = bArr;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i22 = i52;
                                        i10 = i13;
                                        zzhlVar2 = zzhlVar;
                                        unsafe = unsafe11;
                                        i49 = i49;
                                        i23 = i2;
                                        if (i54 != 2) {
                                            if (i54 == 1) {
                                                zzii zziiVar = (zzii) zzjfVar3;
                                                zziiVar.e(zzhi.a(bArr5, i22));
                                                i24 = i22 + 8;
                                                while (i24 < i23) {
                                                    int p3 = zzhi.p(bArr5, i24, zzhlVar2);
                                                    if (i49 != zzhlVar2.a) {
                                                        i44 = i24;
                                                        break;
                                                    } else {
                                                        zziiVar.e(zzhi.a(bArr5, p3));
                                                        i24 = p3 + 8;
                                                    }
                                                }
                                                i44 = i24;
                                            }
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzii zziiVar2 = (zzii) zzjfVar3;
                                            p = zzhi.p(bArr5, i22, zzhlVar2);
                                            int i70 = zzhlVar2.a + p;
                                            while (p < i70) {
                                                zziiVar2.e(zzhi.a(bArr5, p));
                                                p += 8;
                                            }
                                            if (p != i70) {
                                                throw zzji.h();
                                            }
                                            i44 = p;
                                            break;
                                        }
                                    case 19:
                                    case 36:
                                        bArr5 = bArr;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i22 = i52;
                                        i10 = i13;
                                        zzhlVar2 = zzhlVar;
                                        unsafe = unsafe11;
                                        i49 = i49;
                                        i23 = i2;
                                        if (i54 != 2) {
                                            if (i54 == 5) {
                                                zziw zziwVar = (zziw) zzjfVar3;
                                                zziwVar.e(zzhi.m(bArr5, i22));
                                                i24 = i22 + 4;
                                                while (i24 < i23) {
                                                    int p4 = zzhi.p(bArr5, i24, zzhlVar2);
                                                    if (i49 != zzhlVar2.a) {
                                                        i44 = i24;
                                                        break;
                                                    } else {
                                                        zziwVar.e(zzhi.m(bArr5, p4));
                                                        i24 = p4 + 4;
                                                    }
                                                }
                                                i44 = i24;
                                            }
                                            i44 = i22;
                                            break;
                                        } else {
                                            zziw zziwVar2 = (zziw) zzjfVar3;
                                            p = zzhi.p(bArr5, i22, zzhlVar2);
                                            int i71 = zzhlVar2.a + p;
                                            while (p < i71) {
                                                zziwVar2.e(zzhi.m(bArr5, p));
                                                p += 4;
                                            }
                                            if (p != i71) {
                                                throw zzji.h();
                                            }
                                            i44 = p;
                                            break;
                                        }
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr5 = bArr;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i22 = i52;
                                        i10 = i13;
                                        zzhlVar2 = zzhlVar;
                                        unsafe = unsafe11;
                                        i49 = i49;
                                        i23 = i2;
                                        if (i54 != 2) {
                                            if (i54 == 0) {
                                                zzjy zzjyVar = (zzjy) zzjfVar3;
                                                p = zzhi.q(bArr5, i22, zzhlVar2);
                                                zzjyVar.e(zzhlVar2.b);
                                                while (p < i23) {
                                                    int p5 = zzhi.p(bArr5, p, zzhlVar2);
                                                    if (i49 == zzhlVar2.a) {
                                                        p = zzhi.q(bArr5, p5, zzhlVar2);
                                                        zzjyVar.e(zzhlVar2.b);
                                                    }
                                                }
                                            }
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzjy zzjyVar2 = (zzjy) zzjfVar3;
                                            p = zzhi.p(bArr5, i22, zzhlVar2);
                                            int i72 = zzhlVar2.a + p;
                                            while (p < i72) {
                                                p = zzhi.q(bArr5, p, zzhlVar2);
                                                zzjyVar2.e(zzhlVar2.b);
                                            }
                                            if (p != i72) {
                                                throw zzji.h();
                                            }
                                        }
                                        i44 = p;
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe = unsafe11;
                                        i25 = i52;
                                        bArr5 = bArr;
                                        i26 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i10 = i13;
                                        if (i54 != 2) {
                                            if (i54 == 0) {
                                                i27 = i26;
                                                i44 = zzhi.c(i49, bArr5, i25, i27, zzjfVar3, zzhlVar7);
                                                i49 = i49;
                                                i22 = i25;
                                                i23 = i27;
                                                zzhlVar2 = zzhlVar7;
                                            }
                                            zzhlVar2 = zzhlVar7;
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i26;
                                            i44 = i22;
                                            break;
                                        } else {
                                            l2 = zzhi.l(bArr5, i25, zzjfVar3, zzhlVar7);
                                            int i73 = i26;
                                            i44 = l2;
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i73;
                                            zzhlVar2 = zzhlVar7;
                                            break;
                                        }
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe = unsafe11;
                                        i25 = i52;
                                        bArr5 = bArr;
                                        i26 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i10 = i13;
                                        if (i54 != 2) {
                                            if (i54 == 1) {
                                                zzjy zzjyVar3 = (zzjy) zzjfVar3;
                                                zzjyVar3.e(zzhi.r(bArr5, i25));
                                                l2 = i25 + 8;
                                                while (l2 < i26) {
                                                    int p6 = zzhi.p(bArr5, l2, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        zzjyVar3.e(zzhi.r(bArr5, p6));
                                                        l2 = p6 + 8;
                                                    }
                                                }
                                            }
                                            zzhlVar2 = zzhlVar7;
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i26;
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzjy zzjyVar4 = (zzjy) zzjfVar3;
                                            l2 = zzhi.p(bArr5, i25, zzhlVar7);
                                            int i74 = zzhlVar7.a + l2;
                                            while (l2 < i74) {
                                                zzjyVar4.e(zzhi.r(bArr5, l2));
                                                l2 += 8;
                                            }
                                            if (l2 != i74) {
                                                throw zzji.h();
                                            }
                                        }
                                        int i732 = i26;
                                        i44 = l2;
                                        i22 = i25;
                                        i49 = i49;
                                        i23 = i732;
                                        zzhlVar2 = zzhlVar7;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe = unsafe11;
                                        i25 = i52;
                                        bArr5 = bArr;
                                        i26 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i10 = i13;
                                        if (i54 != 2) {
                                            if (i54 == 5) {
                                                zzja zzjaVar = (zzja) zzjfVar3;
                                                zzjaVar.h(zzhi.o(bArr5, i25));
                                                l2 = i25 + 4;
                                                while (l2 < i26) {
                                                    int p7 = zzhi.p(bArr5, l2, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        zzjaVar.h(zzhi.o(bArr5, p7));
                                                        l2 = p7 + 4;
                                                    }
                                                }
                                            }
                                            zzhlVar2 = zzhlVar7;
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i26;
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzja zzjaVar2 = (zzja) zzjfVar3;
                                            l2 = zzhi.p(bArr5, i25, zzhlVar7);
                                            int i75 = zzhlVar7.a + l2;
                                            while (l2 < i75) {
                                                zzjaVar2.h(zzhi.o(bArr5, l2));
                                                l2 += 4;
                                            }
                                            if (l2 != i75) {
                                                throw zzji.h();
                                            }
                                        }
                                        int i7322 = i26;
                                        i44 = l2;
                                        i22 = i25;
                                        i49 = i49;
                                        i23 = i7322;
                                        zzhlVar2 = zzhlVar7;
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe = unsafe11;
                                        i25 = i52;
                                        bArr5 = bArr;
                                        i26 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i10 = i13;
                                        if (i54 != 2) {
                                            if (i54 == 0) {
                                                zzhk zzhkVar = (zzhk) zzjfVar3;
                                                l2 = zzhi.q(bArr5, i25, zzhlVar7);
                                                zzhkVar.e(zzhlVar7.b != 0);
                                                while (l2 < i26) {
                                                    int p8 = zzhi.p(bArr5, l2, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        l2 = zzhi.q(bArr5, p8, zzhlVar7);
                                                        zzhkVar.e(zzhlVar7.b != 0);
                                                    }
                                                }
                                            }
                                            zzhlVar2 = zzhlVar7;
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i26;
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzhk zzhkVar2 = (zzhk) zzjfVar3;
                                            l2 = zzhi.p(bArr5, i25, zzhlVar7);
                                            int i76 = zzhlVar7.a + l2;
                                            while (l2 < i76) {
                                                l2 = zzhi.q(bArr5, l2, zzhlVar7);
                                                zzhkVar2.e(zzhlVar7.b != 0);
                                            }
                                            if (l2 != i76) {
                                                throw zzji.h();
                                            }
                                        }
                                        int i73222 = i26;
                                        i44 = l2;
                                        i22 = i25;
                                        i49 = i49;
                                        i23 = i73222;
                                        zzhlVar2 = zzhlVar7;
                                        break;
                                    case 26:
                                        unsafe = unsafe11;
                                        i25 = i52;
                                        bArr5 = bArr;
                                        i26 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i8 = i48;
                                        i10 = i13;
                                        if (i54 != 2) {
                                            i7 = i47;
                                            i21 = i69;
                                            zzhlVar2 = zzhlVar7;
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i26;
                                            i44 = i22;
                                            break;
                                        } else {
                                            if ((j3 & 536870912) == 0) {
                                                p = zzhi.p(bArr5, i25, zzhlVar7);
                                                int i77 = zzhlVar7.a;
                                                if (i77 < 0) {
                                                    throw zzji.f();
                                                }
                                                if (i77 == 0) {
                                                    zzjfVar3.add("");
                                                    i7 = i47;
                                                } else {
                                                    i7 = i47;
                                                    zzjfVar3.add(new String(bArr5, p, i77, zziz.b));
                                                    p += i77;
                                                }
                                                while (p < i26) {
                                                    int p9 = zzhi.p(bArr5, p, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        p = zzhi.p(bArr5, p9, zzhlVar7);
                                                        int i78 = zzhlVar7.a;
                                                        if (i78 < 0) {
                                                            throw zzji.f();
                                                        }
                                                        if (i78 == 0) {
                                                            zzjfVar3.add("");
                                                        } else {
                                                            zzjfVar3.add(new String(bArr5, p, i78, zziz.b));
                                                            p += i78;
                                                        }
                                                    } else {
                                                        zzhlVar2 = zzhlVar7;
                                                        i21 = i69;
                                                    }
                                                }
                                                zzhlVar2 = zzhlVar7;
                                                i21 = i69;
                                            } else {
                                                i7 = i47;
                                                p = zzhi.p(bArr5, i25, zzhlVar7);
                                                int i79 = zzhlVar7.a;
                                                if (i79 < 0) {
                                                    throw zzji.f();
                                                }
                                                if (i79 == 0) {
                                                    zzjfVar3.add("");
                                                    i21 = i69;
                                                } else {
                                                    int i80 = p + i79;
                                                    if (zzmh.f(bArr5, p, i80)) {
                                                        i21 = i69;
                                                        zzjfVar3.add(new String(bArr5, p, i79, zziz.b));
                                                        p = i80;
                                                    } else {
                                                        throw zzji.d();
                                                    }
                                                }
                                                while (p < i26) {
                                                    int p10 = zzhi.p(bArr5, p, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        p = zzhi.p(bArr5, p10, zzhlVar7);
                                                        int i81 = zzhlVar7.a;
                                                        if (i81 < 0) {
                                                            throw zzji.f();
                                                        }
                                                        if (i81 == 0) {
                                                            zzjfVar3.add("");
                                                        } else {
                                                            int i82 = p + i81;
                                                            if (zzmh.f(bArr5, p, i82)) {
                                                                zzjfVar3.add(new String(bArr5, p, i81, zziz.b));
                                                                p = i82;
                                                            } else {
                                                                throw zzji.d();
                                                            }
                                                        }
                                                    } else {
                                                        zzhlVar2 = zzhlVar7;
                                                    }
                                                }
                                                zzhlVar2 = zzhlVar7;
                                            }
                                            i22 = i25;
                                            i49 = i49;
                                            i23 = i26;
                                            i44 = p;
                                            break;
                                        }
                                    case 27:
                                        unsafe = unsafe11;
                                        i8 = i48;
                                        if (i54 != 2) {
                                            bArr5 = bArr;
                                            i10 = i13;
                                            t2 = t;
                                            i7 = i47;
                                            i21 = i69;
                                            i22 = i52;
                                            zzhlVar2 = zzhlVar;
                                            i49 = i49;
                                            i23 = i2;
                                            i44 = i22;
                                            break;
                                        } else {
                                            i10 = i13;
                                            t2 = t;
                                            int f = zzhi.f(Q(i69), i49, bArr, i52, i2, zzjfVar3, zzhlVar);
                                            zzhlVar7 = zzhlVar;
                                            i49 = i49;
                                            bArr5 = bArr;
                                            i23 = i2;
                                            i7 = i47;
                                            i21 = i69;
                                            i44 = f;
                                            i22 = i52;
                                            zzhlVar2 = zzhlVar7;
                                            break;
                                        }
                                    case 28:
                                        unsafe = unsafe11;
                                        i8 = i48;
                                        if (i54 != 2) {
                                            bArr5 = bArr;
                                            i7 = i47;
                                            i21 = i69;
                                            i22 = i52;
                                            t2 = t;
                                            zzhlVar2 = zzhlVar;
                                            i23 = i2;
                                            i49 = i49;
                                            i10 = i13;
                                            i44 = i22;
                                            break;
                                        } else {
                                            int p11 = zzhi.p(bArr, i52, zzhlVar);
                                            int i83 = zzhlVar.a;
                                            if (i83 >= 0) {
                                                if (i83 > bArr.length - p11) {
                                                    throw zzji.h();
                                                }
                                                if (i83 == 0) {
                                                    zzjfVar3.add(zzhm.Y);
                                                    while (p11 < i2) {
                                                        int p12 = zzhi.p(bArr, p11, zzhlVar);
                                                        if (i49 != zzhlVar.a) {
                                                            i44 = p11;
                                                            bArr5 = bArr;
                                                            i7 = i47;
                                                            i21 = i69;
                                                            i22 = i52;
                                                            t2 = t;
                                                            zzhlVar2 = zzhlVar;
                                                            i23 = i2;
                                                            i49 = i49;
                                                            i10 = i13;
                                                            break;
                                                        } else {
                                                            p11 = zzhi.p(bArr, p12, zzhlVar);
                                                            i83 = zzhlVar.a;
                                                            if (i83 >= 0) {
                                                                if (i83 > bArr.length - p11) {
                                                                    throw zzji.h();
                                                                }
                                                                if (i83 == 0) {
                                                                    zzjfVar3.add(zzhm.Y);
                                                                } else {
                                                                    zzjfVar3.add(zzhm.l(bArr, p11, i83));
                                                                    p11 += i83;
                                                                    while (p11 < i2) {
                                                                    }
                                                                }
                                                            } else {
                                                                throw zzji.f();
                                                            }
                                                        }
                                                    }
                                                    i44 = p11;
                                                    bArr5 = bArr;
                                                    i7 = i47;
                                                    i21 = i69;
                                                    i22 = i52;
                                                    t2 = t;
                                                    zzhlVar2 = zzhlVar;
                                                    i23 = i2;
                                                    i49 = i49;
                                                    i10 = i13;
                                                } else {
                                                    zzjfVar3.add(zzhm.l(bArr, p11, i83));
                                                    p11 += i83;
                                                    while (p11 < i2) {
                                                    }
                                                    i44 = p11;
                                                    bArr5 = bArr;
                                                    i7 = i47;
                                                    i21 = i69;
                                                    i22 = i52;
                                                    t2 = t;
                                                    zzhlVar2 = zzhlVar;
                                                    i23 = i2;
                                                    i49 = i49;
                                                    i10 = i13;
                                                }
                                            } else {
                                                throw zzji.f();
                                            }
                                        }
                                    case 30:
                                    case 44:
                                        bArr5 = bArr;
                                        i27 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i28 = i69;
                                        i8 = i48;
                                        i29 = i52;
                                        unsafe = unsafe11;
                                        if (i54 != 2) {
                                            if (i54 == 0) {
                                                zzjfVar = zzjfVar3;
                                                int c = zzhi.c(i49, bArr5, i29, i27, zzjfVar, zzhlVar7);
                                                i30 = i49;
                                                i31 = i29;
                                                bArr6 = bArr5;
                                                i32 = i27;
                                                zzhlVar8 = zzhlVar7;
                                                i33 = c;
                                            }
                                            i49 = i49;
                                            i22 = i29;
                                            i7 = i47;
                                            i21 = i28;
                                            i10 = i13;
                                            t2 = t;
                                            i23 = i27;
                                            zzhlVar2 = zzhlVar7;
                                            i44 = i22;
                                            break;
                                        } else {
                                            i30 = i49;
                                            i31 = i29;
                                            zzjfVar = zzjfVar3;
                                            i33 = zzhi.l(bArr5, i29, zzjfVar3, zzhlVar7);
                                            bArr6 = bArr5;
                                            i32 = i27;
                                            zzhlVar8 = zzhlVar7;
                                        }
                                        zzld.h(t, i13, zzjfVar, P(i28), null, this.f306o);
                                        i7 = i47;
                                        i21 = i28;
                                        i44 = i33;
                                        i22 = i31;
                                        zzhlVar2 = zzhlVar8;
                                        i23 = i32;
                                        i49 = i30;
                                        i10 = i13;
                                        bArr5 = bArr6;
                                        t2 = t;
                                        break;
                                    case 33:
                                    case 47:
                                        bArr5 = bArr;
                                        i27 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i28 = i69;
                                        i8 = i48;
                                        i29 = i52;
                                        unsafe = unsafe11;
                                        if (i54 != 2) {
                                            if (i54 == 0) {
                                                zzja zzjaVar3 = (zzja) zzjfVar3;
                                                p2 = zzhi.p(bArr5, i29, zzhlVar7);
                                                zzjaVar3.h(zzib.l(zzhlVar7.a));
                                                while (p2 < i27) {
                                                    int p13 = zzhi.p(bArr5, p2, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        p2 = zzhi.p(bArr5, p13, zzhlVar7);
                                                        zzjaVar3.h(zzib.l(zzhlVar7.a));
                                                    }
                                                }
                                            }
                                            i49 = i49;
                                            i22 = i29;
                                            i7 = i47;
                                            i21 = i28;
                                            i10 = i13;
                                            t2 = t;
                                            i23 = i27;
                                            zzhlVar2 = zzhlVar7;
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzja zzjaVar4 = (zzja) zzjfVar3;
                                            p2 = zzhi.p(bArr5, i29, zzhlVar7);
                                            int i84 = zzhlVar7.a + p2;
                                            while (p2 < i84) {
                                                p2 = zzhi.p(bArr5, p2, zzhlVar7);
                                                zzjaVar4.h(zzib.l(zzhlVar7.a));
                                            }
                                            if (p2 != i84) {
                                                throw zzji.h();
                                            }
                                        }
                                        i44 = p2;
                                        i49 = i49;
                                        i22 = i29;
                                        i7 = i47;
                                        i21 = i28;
                                        i10 = i13;
                                        t2 = t;
                                        i23 = i27;
                                        zzhlVar2 = zzhlVar7;
                                        break;
                                    case 34:
                                    case 48:
                                        bArr5 = bArr;
                                        i27 = i2;
                                        zzhlVar7 = zzhlVar;
                                        i28 = i69;
                                        i29 = i52;
                                        if (i54 != 2) {
                                            i8 = i48;
                                            unsafe = unsafe11;
                                            if (i54 == 0) {
                                                zzjy zzjyVar5 = (zzjy) zzjfVar3;
                                                p2 = zzhi.q(bArr5, i29, zzhlVar7);
                                                zzjyVar5.e(zzib.c(zzhlVar7.b));
                                                while (p2 < i27) {
                                                    int p14 = zzhi.p(bArr5, p2, zzhlVar7);
                                                    if (i49 == zzhlVar7.a) {
                                                        p2 = zzhi.q(bArr5, p14, zzhlVar7);
                                                        zzjyVar5.e(zzib.c(zzhlVar7.b));
                                                    }
                                                }
                                            }
                                            i49 = i49;
                                            i22 = i29;
                                            i7 = i47;
                                            i21 = i28;
                                            i10 = i13;
                                            t2 = t;
                                            i23 = i27;
                                            zzhlVar2 = zzhlVar7;
                                            i44 = i22;
                                            break;
                                        } else {
                                            zzjy zzjyVar6 = (zzjy) zzjfVar3;
                                            p2 = zzhi.p(bArr5, i29, zzhlVar7);
                                            int i85 = zzhlVar7.a + p2;
                                            while (p2 < i85) {
                                                p2 = zzhi.q(bArr5, p2, zzhlVar7);
                                                zzjyVar6.e(zzib.c(zzhlVar7.b));
                                                i48 = i48;
                                                unsafe11 = unsafe11;
                                            }
                                            i8 = i48;
                                            unsafe = unsafe11;
                                            if (p2 != i85) {
                                                throw zzji.h();
                                            }
                                        }
                                        i44 = p2;
                                        i49 = i49;
                                        i22 = i29;
                                        i7 = i47;
                                        i21 = i28;
                                        i10 = i13;
                                        t2 = t;
                                        i23 = i27;
                                        zzhlVar2 = zzhlVar7;
                                        break;
                                    case 49:
                                        if (i54 == 3) {
                                            zzlb Q = Q(i69);
                                            int i86 = (i49 & (-8)) | 4;
                                            bArr5 = bArr;
                                            int i87 = i52;
                                            int g = zzhi.g(Q, bArr5, i87, i2, i86, zzhlVar);
                                            zzjfVar3.add(zzhlVar.c);
                                            while (true) {
                                                if (g < i2) {
                                                    int i88 = i87;
                                                    int p15 = zzhi.p(bArr5, g, zzhlVar);
                                                    if (i49 == zzhlVar.a) {
                                                        g = zzhi.g(Q, bArr5, p15, i2, i86, zzhlVar);
                                                        zzjfVar3.add(zzhlVar.c);
                                                        i87 = i88;
                                                    } else {
                                                        i34 = i88;
                                                    }
                                                } else {
                                                    i34 = i87;
                                                }
                                            }
                                            i22 = i34;
                                            i7 = i47;
                                            i21 = i69;
                                            i44 = g;
                                            i8 = i48;
                                            unsafe = unsafe11;
                                            i10 = i13;
                                            t2 = t;
                                            zzhlVar2 = zzhlVar;
                                            i49 = i49;
                                            i23 = i2;
                                            break;
                                        } else {
                                            t2 = t;
                                        }
                                    default:
                                        bArr5 = bArr;
                                        i21 = i69;
                                        i7 = i47;
                                        i8 = i48;
                                        i22 = i52;
                                        i10 = i13;
                                        zzhlVar2 = zzhlVar;
                                        unsafe = unsafe11;
                                        i49 = i49;
                                        i23 = i2;
                                        i44 = i22;
                                        break;
                                }
                                if (i44 == i22) {
                                    i4 = i3;
                                    i9 = i21;
                                } else {
                                    bArr7 = bArr5;
                                    i42 = i23;
                                    t6 = t2;
                                    zzhlVar10 = zzhlVar2;
                                    i45 = i10;
                                    i48 = i8;
                                    unsafe4 = unsafe;
                                    i46 = i21;
                                    i47 = i7;
                                }
                            } else {
                                i69 = i69;
                                int i89 = i52;
                                bArr4 = bArr;
                                i7 = i47;
                                i8 = i48;
                                unsafe = unsafe11;
                                i10 = i13;
                                zzhl zzhlVar12 = zzhlVar;
                                i49 = i49;
                                if (i56 != 50) {
                                    Unsafe unsafe13 = s;
                                    long j4 = iArr[i69 + 2] & C3833Oi1.t;
                                    switch (i56) {
                                        case 51:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 1) {
                                                unsafe13.putObject(t2, j2, Double.valueOf(zzhi.a(bArr, i35)));
                                                i36 = i35 + 8;
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = i36;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 52:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 5) {
                                                unsafe13.putObject(t2, j2, Float.valueOf(zzhi.m(bArr, i35)));
                                                i36 = i35 + 4;
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = i36;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 53:
                                        case 54:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 0) {
                                                q2 = zzhi.q(bArr, i35, zzhlVar2);
                                                unsafe13.putObject(t2, j2, Long.valueOf(zzhlVar2.b));
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = q2;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 55:
                                        case 62:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 0) {
                                                q2 = zzhi.p(bArr, i35, zzhlVar2);
                                                unsafe13.putObject(t2, j2, Integer.valueOf(zzhlVar2.a));
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = q2;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 56:
                                        case 65:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 1) {
                                                unsafe13.putObject(t2, j2, Long.valueOf(zzhi.r(bArr, i35)));
                                                i36 = i35 + 8;
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = i36;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 57:
                                        case 64:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 5) {
                                                unsafe13.putObject(t2, j2, Integer.valueOf(zzhi.o(bArr, i35)));
                                                i36 = i35 + 4;
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = i36;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 58:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 0) {
                                                q2 = zzhi.q(bArr, i35, zzhlVar2);
                                                unsafe13.putObject(t2, j2, Boolean.valueOf(zzhlVar2.b != 0));
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = q2;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 59:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 2) {
                                                int p16 = zzhi.p(bArr, i35, zzhlVar2);
                                                int i90 = zzhlVar2.a;
                                                if (i90 == 0) {
                                                    unsafe13.putObject(t2, j2, "");
                                                } else if ((536870912 & i55) != 0 && !zzmh.f(bArr, p16, p16 + i90)) {
                                                    throw zzji.d();
                                                } else {
                                                    unsafe13.putObject(t2, j2, new String(bArr, p16, i90, zziz.b));
                                                    p16 += i90;
                                                }
                                                unsafe13.putInt(t2, j4, i10);
                                                i44 = p16;
                                                break;
                                            }
                                            i44 = i35;
                                            break;
                                        case 60:
                                            i37 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 2) {
                                                Object s2 = s(t2, i10, i69);
                                                j = zzhi.j(s2, Q(i69), bArr, i37, i2, zzhlVar2);
                                                y(t2, i10, i69, s2);
                                                i44 = j;
                                                i21 = i69;
                                                i35 = i37;
                                                break;
                                            }
                                            i21 = i69;
                                            i35 = i37;
                                            i44 = i35;
                                            break;
                                        case 61:
                                            i37 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 2) {
                                                k2 = zzhi.k(bArr, i37, zzhlVar2);
                                                unsafe13.putObject(t2, j2, zzhlVar2.c);
                                                unsafe13.putInt(t2, j4, i10);
                                                i21 = i69;
                                                i44 = k2;
                                                i35 = i37;
                                                break;
                                            }
                                            i21 = i69;
                                            i35 = i37;
                                            i44 = i35;
                                            break;
                                        case 63:
                                            i37 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 0) {
                                                k2 = zzhi.p(bArr, i37, zzhlVar2);
                                                int i91 = zzhlVar2.a;
                                                zzje P2 = P(i69);
                                                if (P2 != null && !P2.u(i91)) {
                                                    R(t2).e(i49, Long.valueOf(i91));
                                                } else {
                                                    unsafe13.putObject(t2, j2, Integer.valueOf(i91));
                                                    unsafe13.putInt(t2, j4, i10);
                                                }
                                                i21 = i69;
                                                i44 = k2;
                                                i35 = i37;
                                                break;
                                            }
                                            i21 = i69;
                                            i35 = i37;
                                            i44 = i35;
                                            break;
                                        case 66:
                                            i37 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 0) {
                                                k2 = zzhi.p(bArr, i37, zzhlVar2);
                                                unsafe13.putObject(t2, j2, Integer.valueOf(zzib.l(zzhlVar2.a)));
                                                unsafe13.putInt(t2, j4, i10);
                                                i21 = i69;
                                                i44 = k2;
                                                i35 = i37;
                                                break;
                                            }
                                            i21 = i69;
                                            i35 = i37;
                                            i44 = i35;
                                            break;
                                        case 67:
                                            i37 = i89;
                                            zzhlVar2 = zzhlVar;
                                            if (i54 == 0) {
                                                k2 = zzhi.q(bArr, i37, zzhlVar2);
                                                unsafe13.putObject(t2, j2, Long.valueOf(zzib.c(zzhlVar2.b)));
                                                unsafe13.putInt(t2, j4, i10);
                                                i21 = i69;
                                                i44 = k2;
                                                i35 = i37;
                                                break;
                                            }
                                            i21 = i69;
                                            i35 = i37;
                                            i44 = i35;
                                            break;
                                        case 68:
                                            if (i54 == 3) {
                                                Object s3 = s(t2, i10, i69);
                                                i37 = i89;
                                                j = zzhi.i(s3, Q(i69), bArr, i37, i2, (i49 & (-8)) | 4, zzhlVar);
                                                zzhlVar2 = zzhlVar;
                                                y(t2, i10, i69, s3);
                                                i44 = j;
                                                i21 = i69;
                                                i35 = i37;
                                                break;
                                            }
                                        default:
                                            i21 = i69;
                                            i35 = i89;
                                            zzhlVar2 = zzhlVar;
                                            i44 = i35;
                                            break;
                                    }
                                    i4 = i3;
                                    if (i44 != i35) {
                                        bArr7 = bArr;
                                        i42 = i2;
                                        zzhlVar10 = zzhlVar;
                                        t6 = t2;
                                        i45 = i10;
                                        i48 = i8;
                                        unsafe4 = unsafe;
                                        i46 = i21;
                                        i47 = i7;
                                    }
                                    i9 = i21;
                                } else if (i54 == 2) {
                                    Unsafe unsafe14 = s;
                                    Object T = T(i69);
                                    Object object = unsafe14.getObject(t2, j2);
                                    if (this.q.e(object)) {
                                        Object c2 = this.q.c(T);
                                        this.q.g(c2, object);
                                        unsafe14.putObject(t2, j2, c2);
                                        object = c2;
                                    }
                                    zzke<?, ?> b = this.q.b(T);
                                    Map<?, ?> h = this.q.h(object);
                                    int p17 = zzhi.p(bArr4, i89, zzhlVar12);
                                    int i92 = zzhlVar12.a;
                                    if (i92 >= 0 && i92 <= i2 - p17) {
                                        int i93 = p17 + i92;
                                        Object obj = b.b;
                                        Object obj2 = b.d;
                                        while (true) {
                                            Object obj3 = obj;
                                            while (p17 < i93) {
                                                i38 = p17 + 1;
                                                int i94 = bArr4[p17];
                                                if (i94 < 0) {
                                                    i38 = zzhi.e(i94, bArr4, i38, zzhlVar12);
                                                    i94 = zzhlVar12.a;
                                                }
                                                int i95 = i89;
                                                int i96 = i94 >>> 3;
                                                int i97 = i94 & 7;
                                                int i98 = i69;
                                                if (i96 == 1) {
                                                    zzhlVar9 = zzhlVar12;
                                                    i39 = i95;
                                                    i40 = i98;
                                                    if (i97 == b.a.a()) {
                                                        break;
                                                    }
                                                } else if (i96 == 2) {
                                                    if (i97 == b.c.a()) {
                                                        zzhl zzhlVar13 = zzhlVar12;
                                                        i40 = i98;
                                                        p17 = o(bArr, i38, i2, b.c, b.d.getClass(), zzhlVar13);
                                                        obj2 = zzhlVar13.c;
                                                        zzhlVar12 = zzhlVar13;
                                                        i89 = i95;
                                                        bArr4 = bArr;
                                                        i69 = i40;
                                                    } else {
                                                        zzhlVar9 = zzhlVar12;
                                                        i39 = i95;
                                                        i40 = i98;
                                                    }
                                                } else {
                                                    bArr4 = bArr;
                                                    i41 = i2;
                                                    zzhlVar9 = zzhlVar12;
                                                    i39 = i95;
                                                    i40 = i98;
                                                    p17 = zzhi.b(i94, bArr4, i38, i41, zzhlVar9);
                                                    int i99 = i39;
                                                    zzhlVar12 = zzhlVar9;
                                                    i89 = i99;
                                                    i69 = i40;
                                                }
                                                bArr4 = bArr;
                                                i41 = i2;
                                                p17 = zzhi.b(i94, bArr4, i38, i41, zzhlVar9);
                                                int i992 = i39;
                                                zzhlVar12 = zzhlVar9;
                                                i89 = i992;
                                                i69 = i40;
                                            }
                                            zzhl zzhlVar14 = zzhlVar12;
                                            int i100 = i89;
                                            i9 = i69;
                                            if (p17 == i93) {
                                                h.put(obj3, obj2);
                                                if (i93 == i100) {
                                                    i4 = i3;
                                                    zzhlVar2 = zzhlVar14;
                                                    i44 = i93;
                                                } else {
                                                    zzhlVar10 = zzhlVar14;
                                                    i42 = i2;
                                                    i44 = i93;
                                                    i45 = i10;
                                                    i48 = i8;
                                                    unsafe4 = unsafe;
                                                    i47 = i7;
                                                    i43 = -1;
                                                    bArr7 = bArr4;
                                                    t6 = t2;
                                                    i46 = i9;
                                                }
                                            } else {
                                                throw zzji.g();
                                            }
                                            p17 = o(bArr, i38, i2, b.a, null, zzhlVar9);
                                            bArr4 = bArr;
                                            obj = zzhlVar9.c;
                                            zzhlVar12 = zzhlVar9;
                                            i89 = i39;
                                            i69 = i40;
                                            obj2 = obj2;
                                        }
                                    }
                                } else {
                                    i20 = i89;
                                    zzhlVar6 = zzhlVar12;
                                }
                            }
                        } else if (i54 == 2) {
                            zzjf zzjfVar4 = (zzjf) unsafe10.getObject(t18, j2);
                            if (!zzjfVar4.c()) {
                                int size2 = zzjfVar4.size();
                                zzjfVar4 = zzjfVar4.u(size2 != 0 ? size2 << 1 : 10);
                                unsafe10.putObject(t18, j2, zzjfVar4);
                            }
                            zzlb Q2 = Q(i69);
                            bArr7 = bArr;
                            int f2 = zzhi.f(Q2, i49, bArr7, i52, i2, zzjfVar4, zzhlVar);
                            i42 = i2;
                            zzhlVar10 = zzhlVar;
                            i44 = f2;
                            t6 = t;
                            i46 = i69;
                            unsafe4 = unsafe10;
                            i43 = -1;
                            i49 = i49;
                            i45 = i13;
                        } else {
                            unsafe = unsafe10;
                            i7 = i47;
                            i8 = i48;
                            i10 = i13;
                            bArr4 = bArr;
                            i20 = i52;
                            t2 = t18;
                            zzhlVar6 = zzhlVar;
                        }
                        i9 = i69;
                        i4 = i3;
                        i44 = i20;
                        zzhlVar2 = zzhlVar6;
                    }
                    i43 = -1;
                }
                if (i49 != i4 || i4 == 0) {
                    if (this.f && (zzikVar = zzhlVar2.d) != zzik.e) {
                        if (zzikVar.b(this.e, i10) == null) {
                            i42 = i2;
                            i44 = zzhi.d(i49, bArr, i44, i42, R(t2), zzhlVar2);
                            bArr7 = bArr;
                            zzhlVar10 = zzhlVar;
                        } else {
                            zzix.zzd zzdVar = (zzix.zzd) t2;
                            zzdVar.F();
                            zziq<zzix.zzc> zziqVar = zzdVar.zzc;
                            throw new NoSuchMethodError();
                        }
                    } else {
                        int i101 = i49;
                        i42 = i2;
                        zzhlVar10 = zzhlVar;
                        i44 = zzhi.d(i101, bArr, i44, i42, R(t2), zzhlVar10);
                        bArr7 = bArr;
                        i49 = i101;
                    }
                    t6 = t2;
                    i46 = i9;
                    i45 = i10;
                    i48 = i8;
                    unsafe4 = unsafe;
                    i47 = i7;
                    i43 = -1;
                } else {
                    i5 = i2;
                    unsafe4 = unsafe;
                    i6 = i44;
                    i48 = i8;
                    i47 = i7;
                }
            } else {
                i4 = i3;
                t2 = t6;
                i5 = i42;
                i6 = i44;
            }
        }
    }

    public final <K, V, UT, UB> UB q(int i, int i2, Map<K, V> map, zzje zzjeVar, UB ub, zzma<UT, UB> zzmaVar, Object obj) {
        zzke<?, ?> b = this.q.b(T(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjeVar.u(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmaVar.o(obj);
                }
                zzhv F = zzhm.F(zzkb.a(b, next.getKey(), next.getValue()));
                try {
                    zzkb.b(F.b(), b, next.getKey(), next.getValue());
                    zzmaVar.f(ub, i2, F.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(T t, int i) {
        zzlb Q = Q(i);
        long J = J(i) & C3833Oi1.t;
        if (!L(t, i)) {
            return Q.a();
        }
        Object object = s.getObject(t, J);
        if (W(object)) {
            return object;
        }
        Object a = Q.a();
        if (object != null) {
            Q.g(a, object);
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object s(T t, int i, int i2) {
        zzlb Q = Q(i2);
        if (!M(t, i, i2)) {
            return Q.a();
        }
        Object object = s.getObject(t, J(i2) & C3833Oi1.t);
        if (W(object)) {
            return object;
        }
        Object a = Q.a();
        if (object != null) {
            Q.g(a, object);
        }
        return a;
    }

    public final <UT, UB> UB t(Object obj, int i, UB ub, zzma<UT, UB> zzmaVar, Object obj2) {
        zzje P;
        int i2 = this.a[i];
        Object B = zzmg.B(obj, J(i) & C3833Oi1.t);
        if (B == null || (P = P(i)) == null) {
            return ub;
        }
        return (UB) q(i, i2, this.q.h(B), P, ub, zzmaVar, obj2);
    }

    public final <K, V> void x(zzmw zzmwVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzmwVar.L(i, this.q.b(T(i2)), this.q.d(obj));
        }
    }

    public final void y(T t, int i, int i2, Object obj) {
        s.putObject(t, J(i2) & C3833Oi1.t, obj);
        H(t, i, i2);
    }

    public final void z(Object obj, int i, zzlc zzlcVar) throws IOException {
        if (V(i)) {
            zzmg.j(obj, i & C3833Oi1.t, zzlcVar.x());
        } else if (this.g) {
            zzmg.j(obj, i & C3833Oi1.t, zzlcVar.r());
        } else {
            zzmg.j(obj, i & C3833Oi1.t, zzlcVar.o());
        }
    }
}
