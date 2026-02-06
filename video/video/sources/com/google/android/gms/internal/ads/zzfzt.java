package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfzt extends zzfyf {
    public static final zzfyf b1 = new zzfzt(null, new Object[0], 0);
    public final transient Object Y0;
    public final transient Object[] Z0;
    public final transient int a1;

    public zzfzt(Object obj, Object[] objArr, int i) {
        this.Y0 = obj;
        this.Z0 = objArr;
        this.a1 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfzt k(int i, Object[] objArr, zzfye zzfyeVar) {
        char c;
        int i2;
        char c2;
        int[] iArr;
        char c3;
        short[] sArr;
        char c4;
        int i3;
        boolean z;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (zzfzt) b1;
        }
        Object obj = null;
        char c5 = 0;
        int i5 = 1;
        if (i4 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzfwz.b(obj2, obj3);
            return new zzfzt(null, objArr2, 1);
        }
        zzfvc.b(i4, objArr2.length >> 1, "index");
        int l = zzfyh.l(i4);
        char c6 = 2;
        if (i4 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzfwz.b(obj4, obj5);
            c = 0;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = l - 1;
            if (l <= 128) {
                byte[] bArr = new byte[l];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj6 = objArr2[i10];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i10 ^ i5];
                    Objects.requireNonNull(obj7);
                    zzfwz.b(obj6, obj7);
                    int a = zzfxu.a(obj6.hashCode());
                    while (true) {
                        int i11 = a & i6;
                        c4 = c5;
                        i3 = i5;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = obj6;
                                objArr2[i9 ^ 1] = obj7;
                            }
                            i8++;
                        } else if (obj6.equals(objArr2[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj8 = objArr2[i13];
                            Objects.requireNonNull(obj8);
                            zzfyd zzfydVar = new zzfyd(obj6, obj7, obj8);
                            objArr2[i13] = obj7;
                            obj = zzfydVar;
                            break;
                        } else {
                            a = i11 + 1;
                            c5 = c4;
                            i5 = i3;
                        }
                    }
                    i7++;
                    c5 = c4;
                    i5 = i3;
                }
                c = c5;
                i2 = i5;
                if (i8 == i4) {
                    obj = bArr;
                } else {
                    sArr = new Object[3];
                    sArr[c] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = obj;
                    obj = sArr;
                }
            } else {
                c = 0;
                i2 = 1;
                if (l <= 32768) {
                    sArr = new short[l];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj9 = objArr2[i17];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr2[i17 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfwz.b(obj9, obj10);
                        int a2 = zzfxu.a(obj9.hashCode());
                        while (true) {
                            int i18 = a2 & i6;
                            char c7 = (char) sArr[i18];
                            if (c7 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArr2[i16] = obj9;
                                    objArr2[i16 ^ 1] = obj10;
                                }
                                i14++;
                            } else if (obj9.equals(objArr2[c7])) {
                                int i19 = c7 ^ 1;
                                Object obj11 = objArr2[i19];
                                Objects.requireNonNull(obj11);
                                zzfyd zzfydVar2 = new zzfyd(obj9, obj10, obj11);
                                objArr2[i19] = obj10;
                                obj = zzfydVar2;
                                break;
                            } else {
                                a2 = i18 + 1;
                            }
                        }
                    }
                    if (i14 != i4) {
                        obj = new Object[]{sArr, Integer.valueOf(i14), obj};
                    }
                    obj = sArr;
                } else {
                    int[] iArr2 = new int[l];
                    Arrays.fill(iArr2, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj12 = objArr2[i23];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i23 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzfwz.b(obj12, obj13);
                        int a3 = zzfxu.a(obj12.hashCode());
                        while (true) {
                            int i24 = a3 & i6;
                            int i25 = iArr2[i24];
                            if (i25 == -1) {
                                iArr2[i24] = i22;
                                if (i21 < i20) {
                                    objArr2[i22] = obj12;
                                    objArr2[i22 ^ 1] = obj13;
                                }
                                i21++;
                                c3 = c6;
                            } else {
                                c3 = c6;
                                if (obj12.equals(objArr2[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj14 = objArr2[i26];
                                    Objects.requireNonNull(obj14);
                                    zzfyd zzfydVar3 = new zzfyd(obj12, obj13, obj14);
                                    objArr2[i26] = obj13;
                                    obj = zzfydVar3;
                                    break;
                                }
                                a3 = i24 + 1;
                                c6 = c3;
                            }
                        }
                        i20++;
                        c6 = c3;
                    }
                    c2 = c6;
                    if (i21 == i4) {
                        iArr = iArr2;
                    } else {
                        ?? r5 = new Object[3];
                        r5[0] = iArr2;
                        r5[1] = Integer.valueOf(i21);
                        r5[c2] = obj;
                        iArr = r5;
                    }
                    z = iArr instanceof Object[];
                    int[] iArr3 = iArr;
                    if (z) {
                        Object[] objArr3 = (Object[]) iArr;
                        zzfyd zzfydVar4 = (zzfyd) objArr3[c2];
                        if (zzfyeVar != null) {
                            zzfyeVar.c = zzfydVar4;
                            Object obj15 = objArr3[c];
                            int intValue = ((Integer) objArr3[i2]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                            iArr3 = obj15;
                            i4 = intValue;
                        } else {
                            throw zzfydVar4.a();
                        }
                    }
                    return new zzfzt(iArr3, objArr2, i4);
                }
            }
        }
        c2 = 2;
        iArr = obj;
        z = iArr instanceof Object[];
        int[] iArr32 = iArr;
        if (z) {
        }
        return new zzfzt(iArr32, objArr2, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzfyf
    public final zzfxx a() {
        return new zzfzs(this.Z0, 1, this.a1);
    }

    @Override // com.google.android.gms.internal.ads.zzfyf
    public final zzfyh f() {
        return new zzfzq(this, this.Z0, 0, this.a1);
    }

    @Override // com.google.android.gms.internal.ads.zzfyf
    public final zzfyh g() {
        return new zzfzr(this, new zzfzs(this.Z0, 0, this.a1));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfyf, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.a1;
            Object[] objArr = this.Z0;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.Y0;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int a = zzfxu.a(obj.hashCode());
                        while (true) {
                            int i2 = a & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            } else if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            } else {
                                a = i2 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int a2 = zzfxu.a(obj.hashCode());
                        while (true) {
                            int i4 = a2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            } else if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            } else {
                                a2 = i4 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int a3 = zzfxu.a(obj.hashCode());
                        while (true) {
                            int i5 = a3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            } else if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            } else {
                                a3 = i5 + 1;
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.a1;
    }
}
