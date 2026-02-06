package o;

import java.util.NoSuchElementException;

/* renamed from: o.tv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9850tv0 {
    public long[] a;
    public float[] b;
    public long[] c;
    public int d;
    public int e;

    public /* synthetic */ AbstractC9850tv0(C9516sY c9516sY) {
        this();
    }

    public static /* synthetic */ String L(AbstractC9850tv0 abstractC9850tv0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = C6566gU0.h;
            }
            if ((i2 & 2) != 0) {
                charSequence2 = "";
            }
            if ((i2 & 4) != 0) {
                charSequence3 = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence5 = charSequence4;
            CharSequence charSequence6 = charSequence3;
            return abstractC9850tv0.E(charSequence, charSequence2, charSequence6, i, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public static /* synthetic */ String M(AbstractC9850tv0 abstractC9850tv0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, VA0 va0, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        long[] jArr;
        long[] jArr2;
        int i4;
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence5 = C6566gU0.h;
            } else {
                charSequence5 = charSequence;
            }
            CharSequence charSequence8 = "";
            if ((i2 & 2) != 0) {
                charSequence6 = "";
            } else {
                charSequence6 = charSequence2;
            }
            if ((i2 & 4) == 0) {
                charSequence8 = charSequence3;
            }
            if ((i2 & 8) != 0) {
                i3 = -1;
            } else {
                i3 = i;
            }
            if ((i2 & 16) != 0) {
                charSequence7 = "...";
            } else {
                charSequence7 = charSequence4;
            }
            C6562gT0.p(charSequence5, "separator");
            C6562gT0.p(charSequence6, "prefix");
            C6562gT0.p(charSequence8, "postfix");
            C6562gT0.p(charSequence7, "truncated");
            C6562gT0.p(va0, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence6);
            float[] fArr = abstractC9850tv0.b;
            long[] jArr3 = abstractC9850tv0.c;
            long[] jArr4 = abstractC9850tv0.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                int i6 = 0;
                loop0: while (true) {
                    long j = jArr4[i5];
                    int i7 = i5;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j & 255) < 128) {
                                int i11 = (i7 << 3) + i10;
                                float f = fArr[i11];
                                long j2 = jArr3[i11];
                                if (i6 == i3) {
                                    sb.append(charSequence7);
                                    break loop0;
                                }
                                if (i6 != 0) {
                                    sb.append(charSequence5);
                                }
                                i4 = i8;
                                jArr2 = jArr4;
                                sb.append((CharSequence) va0.i(Float.valueOf(f), Long.valueOf(j2)));
                                i6++;
                            } else {
                                jArr2 = jArr4;
                                i4 = i8;
                            }
                            j >>= i4;
                            i10++;
                            i8 = i4;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        if (i9 != i8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i5 = i7 + 1;
                    jArr4 = jArr;
                }
                String sb2 = sb.toString();
                C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            sb.append(charSequence8);
            String sb22 = sb.toString();
            C6562gT0.o(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String A(CharSequence charSequence) {
        C6562gT0.p(charSequence, "separator");
        return L(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String B(CharSequence charSequence, CharSequence charSequence2) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        return L(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String C(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return L(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String D(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        return L(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final String E(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        long j;
        int i2;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j2 & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            i2 = i5;
                            float f = fArr[i8];
                            j = j2;
                            long j3 = jArr[i8];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(f);
                            sb.append('=');
                            sb.append(j3);
                            i4++;
                        } else {
                            j = j2;
                            i2 = i5;
                        }
                        j2 = j >> i2;
                        i7++;
                        i5 = i2;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String F(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, VA0<? super Float, ? super Long, ? extends CharSequence> va0) {
        CharSequence charSequence5 = charSequence;
        C6562gT0.p(charSequence5, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            float f = fArr[i7];
                            long j2 = jArr[i7];
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence5);
                            }
                            sb.append(va0.i(Float.valueOf(f), Long.valueOf(j2)));
                            i3++;
                        }
                        j >>= 8;
                        i6++;
                        charSequence5 = charSequence;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                charSequence5 = charSequence;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String G(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, VA0<? super Float, ? super Long, ? extends CharSequence> va0) {
        int i2;
        CharSequence charSequence4 = charSequence;
        C6562gT0.p(charSequence4, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            float f = fArr[i8];
                            long j2 = jArr[i8];
                            i2 = i5;
                            if (i4 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence4);
                            }
                            sb.append(va0.i(Float.valueOf(f), Long.valueOf(j2)));
                            i4++;
                        } else {
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        charSequence4 = charSequence;
                        i5 = i2;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                charSequence4 = charSequence;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String H(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, VA0<? super Float, ? super Long, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            long j2 = jArr[i7];
                            i = i4;
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(va0.i(Float.valueOf(f), Long.valueOf(j2)));
                            i3++;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String I(CharSequence charSequence, CharSequence charSequence2, VA0<? super Float, ? super Long, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            long j2 = jArr[i7];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            i = i4;
                            sb.append(va0.i(Float.valueOf(f), Long.valueOf(j2)));
                            i3++;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        C6562gT0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String J(CharSequence charSequence, VA0<? super Float, ? super Long, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            long j2 = jArr[i7];
                            i = i4;
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(va0.i(Float.valueOf(f), Long.valueOf(j2)));
                            i3++;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        C6562gT0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String K(VA0<? super Float, ? super Long, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            long j2 = jArr[i7];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append((CharSequence) C6566gU0.h);
                            }
                            Float valueOf = Float.valueOf(f);
                            i = i4;
                            sb.append(va0.i(valueOf, Long.valueOf(j2)));
                            i3++;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean N() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final boolean a(VA0<? super Float, ? super Long, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!va0.i(Float.valueOf(fArr[i4]), Long.valueOf(jArr[i4])).booleanValue()) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean b() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final boolean c(VA0<? super Float, ? super Long, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (va0.i(Float.valueOf(fArr[i4]), Long.valueOf(jArr[i4])).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean d(float f) {
        if (i(f) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean e(float f) {
        if (i(f) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9850tv0)) {
            return false;
        }
        AbstractC9850tv0 abstractC9850tv0 = (AbstractC9850tv0) obj;
        if (abstractC9850tv0.t() != t()) {
            return false;
        }
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (jArr[i4] != abstractC9850tv0.n(fArr[i4])) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean f(long j) {
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr2[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128 && j == jArr[(i << 3) + i3]) {
                            return true;
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int g() {
        return t();
    }

    public final int h(VA0<? super Float, ? super Long, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (va0.i(Float.valueOf(fArr[i5]), Long.valueOf(jArr[i5])).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i2;
            }
        }
    }

    public int hashCode() {
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        i2 += Float.hashCode(fArr[i5]) ^ Long.hashCode(jArr[i5]);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i2;
            }
        }
    }

    public final int i(float f) {
        int hashCode = Float.hashCode(f) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (i2 * YX1.k) ^ j;
            for (long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.b[numberOfTrailingZeros] == f) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void j(VA0<? super Float, ? super Long, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            va0.i(Float.valueOf(fArr[i4]), Long.valueOf(jArr[i4]));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(HA0<? super Integer, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ha0.invoke(Integer.valueOf((i << 3) + i3));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void l(HA0<? super Float, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ha0.invoke(Float.valueOf(fArr[(i << 3) + i3]));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void m(HA0<? super Long, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ha0.invoke(Long.valueOf(jArr[(i << 3) + i3]));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long n(float f) {
        int i = i(f);
        if (i >= 0) {
            return this.c[i];
        }
        throw new NoSuchElementException("Cannot find value for key " + f);
    }

    public final int o() {
        return this.d;
    }

    public final long r(float f, long j) {
        int i = i(f);
        if (i >= 0) {
            return this.c[i];
        }
        return j;
    }

    public final long s(float f, FA0<Long> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        int i = i(f);
        if (i < 0) {
            return fa0.invoke().longValue();
        }
        return this.c[i];
    }

    public final int t() {
        return this.e;
    }

    public String toString() {
        int i;
        int i2;
        if (x()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        float[] fArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            float f = fArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            sb.append(f);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "s.append('}').toString()");
        return sb2;
    }

    public final boolean x() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    public AbstractC9850tv0() {
        this.a = YX1.e;
        this.b = C2795Dv0.g();
        this.c = C5242b51.b();
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }
}
