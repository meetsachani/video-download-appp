package o;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class BE extends AbstractC9608sv1 {
    public static final int[][] a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    public static final float b = 0.25f;
    public static final float c = 0.7f;
    public static final int d = 98;
    public static final int e = 99;
    public static final int f = 100;
    public static final int g = 101;
    public static final int h = 102;
    public static final int i = 97;
    public static final int j = 96;
    public static final int k = 101;
    public static final int l = 100;
    public static final int m = 103;
    public static final int n = 104;

    /* renamed from: o  reason: collision with root package name */
    public static final int f416o = 105;
    public static final int p = 106;

    public static int h(C10792xn c10792xn, int[] iArr, int i2) throws C9349rr1 {
        AbstractC9608sv1.f(c10792xn, i2, iArr);
        float f2 = 0.25f;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[][] iArr2 = a;
            if (i4 >= iArr2.length) {
                break;
            }
            float e2 = AbstractC9608sv1.e(iArr, iArr2[i4], 0.7f);
            if (e2 < f2) {
                i3 = i4;
                f2 = e2;
            }
            i4++;
        }
        if (i3 >= 0) {
            return i3;
        }
        throw C9349rr1.a();
    }

    public static int[] i(C10792xn c10792xn) throws C9349rr1 {
        int m2 = c10792xn.m();
        int k2 = c10792xn.k(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i2 = 0;
        int i3 = k2;
        while (k2 < m2) {
            if (c10792xn.i(k2) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 == 5) {
                    int i4 = -1;
                    float f2 = 0.25f;
                    for (int i5 = 103; i5 <= 105; i5++) {
                        float e2 = AbstractC9608sv1.e(iArr, a[i5], 0.7f);
                        if (e2 < f2) {
                            i4 = i5;
                            f2 = e2;
                        }
                    }
                    if (i4 >= 0 && c10792xn.o(Math.max(0, i3 - ((k2 - i3) / 2)), i3, false)) {
                        return new int[]{i3, k2, i4};
                    }
                    i3 += iArr[0] + iArr[1];
                    int i6 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i6);
                    iArr[i6] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr[i2] = 1;
                z = !z;
            }
            k2++;
        }
        throw C9349rr1.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r9 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
        if (r9 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[PHI: r3 r9 r17 r21 
      PHI: (r3v7 boolean) = (r3v1 boolean), (r3v1 boolean), (r3v1 boolean), (r3v1 boolean), (r3v1 boolean), (r3v1 boolean), (r3v1 boolean), (r3v12 boolean), (r3v1 boolean), (r3v1 boolean), (r3v1 boolean), (r3v1 boolean) binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 boolean) = (r9v3 boolean), (r9v3 boolean), (r9v3 boolean), (r9v3 boolean), (r9v3 boolean), (r9v3 boolean), (r9v11 boolean), (r9v12 boolean), (r9v3 boolean), (r9v3 boolean), (r9v3 boolean), (r9v3 boolean) binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v2 boolean) = (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v5 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean) binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r21v3 boolean) = (r21v2 boolean), (r21v9 boolean), (r21v9 boolean), (r21v9 boolean), (r21v9 boolean), (r21v11 boolean), (r21v14 boolean), (r21v17 boolean), (r21v18 boolean), (r21v18 boolean), (r21v18 boolean), (r21v18 boolean) binds: [B:27:0x008b, B:70:0x0114, B:72:0x0118, B:76:0x0125, B:75:0x0120, B:62:0x00f9, B:57:0x00e3, B:34:0x00a2, B:44:0x00c0, B:46:0x00c4, B:50:0x00d0, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed A[PHI: r21 
      PHI: (r21v12 boolean) = (r21v9 boolean), (r21v18 boolean) binds: [B:70:0x0114, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.AbstractC9608sv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QT1 a(int i2, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, C2605Bx0, UB {
        boolean z;
        char c2;
        char c3;
        boolean z2;
        boolean z3 = false;
        if (map != null && map.containsKey(XV.ASSUME_GS1)) {
            z = true;
        } else {
            z = false;
        }
        int[] i3 = i(c10792xn);
        int i4 = i3[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i4));
        switch (i4) {
            case 103:
                c2 = 'e';
                break;
            case 104:
                c2 = 'd';
                break;
            case 105:
                c2 = 'c';
                break;
            default:
                throw C2605Bx0.a();
        }
        StringBuilder sb = new StringBuilder(20);
        int i5 = 6;
        int[] iArr = new int[6];
        char c4 = c2;
        int i6 = i3[0];
        int i7 = i3[1];
        char c5 = c4;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = true;
        int i10 = 0;
        while (!z5) {
            int h2 = h(c10792xn, iArr, i7);
            arrayList.add(Byte.valueOf((byte) h2));
            if (h2 != 106) {
                z7 = true;
            }
            if (h2 != 106) {
                i9++;
                i4 += i9 * h2;
            }
            int i11 = i7;
            for (int i12 = 0; i12 < i5; i12++) {
                i11 += iArr[i12];
            }
            switch (h2) {
                case 103:
                case 104:
                case 105:
                    throw C2605Bx0.a();
                default:
                    switch (c5) {
                        case 'c':
                            c3 = 'd';
                            if (h2 < 100) {
                                if (h2 < 10) {
                                    sb.append(C3599Ly1.j);
                                }
                                sb.append(h2);
                            } else {
                                if (h2 != 106) {
                                    z7 = false;
                                }
                                if (h2 != 106) {
                                    switch (h2) {
                                        case 100:
                                            c5 = 'd';
                                            break;
                                        case 101:
                                            z2 = false;
                                            c5 = 'e';
                                            break;
                                        case 102:
                                            if (z) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                    break;
                                                } else {
                                                    sb.append(C5588cW.f706o);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    z5 = true;
                                }
                            }
                            z2 = false;
                            break;
                        case 'd':
                            if (h2 < 96) {
                                if (z4 == z3) {
                                    sb.append((char) (h2 + 32));
                                } else {
                                    sb.append((char) (h2 + 160));
                                }
                                z4 = false;
                                c3 = 'd';
                                z2 = false;
                                break;
                            } else {
                                if (h2 != 106) {
                                    z7 = false;
                                }
                                if (h2 != 106) {
                                    switch (h2) {
                                        case 96:
                                        case 97:
                                        default:
                                            c3 = 'd';
                                            z2 = false;
                                            break;
                                        case 98:
                                            z2 = true;
                                            c3 = 'd';
                                            c5 = 'e';
                                            break;
                                        case 99:
                                            c3 = 'd';
                                            z2 = false;
                                            c5 = 'c';
                                            break;
                                        case 100:
                                            if (z3 || !z4) {
                                                if (z3) {
                                                }
                                                z4 = true;
                                                c3 = 'd';
                                                z2 = false;
                                                break;
                                            }
                                            z3 = true;
                                            z4 = false;
                                            c3 = 'd';
                                            z2 = false;
                                            break;
                                        case 101:
                                            c3 = 'd';
                                            z2 = false;
                                            c5 = 'e';
                                            break;
                                        case 102:
                                            if (z) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append(C5588cW.f706o);
                                                }
                                            }
                                            c3 = 'd';
                                            z2 = false;
                                            break;
                                    }
                                }
                                z5 = true;
                                c3 = 'd';
                                z2 = false;
                            }
                            break;
                        case 'e':
                            if (h2 < 64) {
                                if (z4 == z3) {
                                    sb.append((char) (h2 + 32));
                                } else {
                                    sb.append((char) (h2 + 160));
                                }
                            } else if (h2 < 96) {
                                if (z4 == z3) {
                                    sb.append((char) (h2 - 64));
                                } else {
                                    sb.append((char) (h2 + 64));
                                }
                            } else {
                                if (h2 != 106) {
                                    z7 = false;
                                }
                                if (h2 != 106) {
                                    switch (h2) {
                                        case 98:
                                            z2 = true;
                                            c3 = 'd';
                                            c5 = 'd';
                                            break;
                                        case 100:
                                            c3 = 'd';
                                            z2 = false;
                                            c5 = 'd';
                                            break;
                                        case 101:
                                            if (z3 || !z4) {
                                                if (z3) {
                                                }
                                                z4 = true;
                                                c3 = 'd';
                                                z2 = false;
                                                break;
                                            }
                                            z3 = true;
                                            break;
                                        case 102:
                                            if (z) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append(C5588cW.f706o);
                                                }
                                            }
                                            c3 = 'd';
                                            z2 = false;
                                            break;
                                    }
                                }
                                z5 = true;
                                c3 = 'd';
                                z2 = false;
                            }
                            z4 = false;
                            c3 = 'd';
                            z2 = false;
                            break;
                    }
                    if (z6) {
                        if (c5 == 'e') {
                            c5 = c3;
                        } else {
                            c5 = 'e';
                        }
                    }
                    int i13 = i8;
                    i8 = h2;
                    i10 = i13;
                    i6 = i7;
                    z6 = z2;
                    i7 = i11;
                    i5 = 6;
                    break;
            }
        }
        int i14 = i7 - i6;
        int l2 = c10792xn.l(i7);
        if (c10792xn.o(l2, Math.min(c10792xn.m(), ((l2 - i6) / 2) + l2), false)) {
            if ((i4 - (i9 * i10)) % 103 == i10) {
                int length = sb.length();
                if (length != 0) {
                    if (length > 0 && z7) {
                        if (c5 == 'c') {
                            sb.delete(length - 2, length);
                        } else {
                            sb.delete(length - 1, length);
                        }
                    }
                    float f2 = (i3[1] + i3[0]) / 2.0f;
                    float f3 = i6 + (i14 / 2.0f);
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        bArr[i15] = ((Byte) arrayList.get(i15)).byteValue();
                    }
                    float f4 = i2;
                    return new QT1(sb.toString(), bArr, new UT1[]{new UT1(f2, f4), new UT1(f3, f4)}, EnumC3839Ok.CODE_128);
                }
                throw C9349rr1.a();
            }
            throw UB.a();
        }
        throw C9349rr1.a();
    }
}
