package o;

/* renamed from: o.wv0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10582wv0<V> {
    public long[] a;
    public float[] b;
    public Object[] c;
    public int d;
    public int e;

    public /* synthetic */ AbstractC10582wv0(C9516sY c9516sY) {
        this();
    }

    public static /* synthetic */ String L(AbstractC10582wv0 abstractC10582wv0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
            return abstractC10582wv0.E(charSequence, charSequence2, charSequence6, i, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public static /* synthetic */ String M(AbstractC10582wv0 abstractC10582wv0, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, VA0 va0, int i2, Object obj) {
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
            float[] fArr = abstractC10582wv0.b;
            Object[] objArr = abstractC10582wv0.c;
            long[] jArr3 = abstractC10582wv0.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                int i6 = 0;
                loop0: while (true) {
                    long j = jArr3[i5];
                    int i7 = i5;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j & 255) < 128) {
                                int i11 = (i7 << 3) + i10;
                                float f = fArr[i11];
                                i4 = i8;
                                Object obj2 = objArr[i11];
                                if (i6 == i3) {
                                    sb.append(charSequence7);
                                    break loop0;
                                }
                                if (i6 != 0) {
                                    sb.append(charSequence5);
                                }
                                jArr2 = jArr3;
                                sb.append((CharSequence) va0.i(Float.valueOf(f), obj2));
                                i6++;
                            } else {
                                jArr2 = jArr3;
                                i4 = i8;
                            }
                            j >>= i4;
                            i10++;
                            i8 = i4;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i9 != i8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i5 = i7 + 1;
                    jArr3 = jArr;
                }
            }
            sb.append(charSequence8);
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
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
        float[] fArr;
        float[] fArr2;
        int i2;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr3 = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            i2 = i5;
                            float f = fArr3[i8];
                            Object obj = objArr[i8];
                            fArr2 = fArr3;
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(f);
                            sb.append('=');
                            sb.append(obj);
                            i4++;
                        } else {
                            fArr2 = fArr3;
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        fArr3 = fArr2;
                        i5 = i2;
                    }
                    fArr = fArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                fArr3 = fArr;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String F(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, VA0<? super Float, ? super V, ? extends CharSequence> va0) {
        float[] fArr;
        float[] fArr2;
        CharSequence charSequence5 = charSequence;
        C6562gT0.p(charSequence5, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(charSequence4, "truncated");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr3 = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            float f = fArr3[i7];
                            Object obj = objArr[i7];
                            fArr2 = fArr3;
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence5);
                            }
                            sb.append(va0.i(Float.valueOf(f), obj));
                            i3++;
                        } else {
                            fArr2 = fArr3;
                        }
                        j >>= 8;
                        i6++;
                        charSequence5 = charSequence;
                        fArr3 = fArr2;
                    }
                    fArr = fArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                charSequence5 = charSequence;
                fArr3 = fArr;
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append(charSequence3);
        String sb22 = sb.toString();
        C6562gT0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String G(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, VA0<? super Float, ? super V, ? extends CharSequence> va0) {
        int i2;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            float f = fArr[i8];
                            i2 = i5;
                            Object obj = objArr[i8];
                            if (i4 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(va0.i(Float.valueOf(f), obj));
                            i4++;
                        } else {
                            i2 = i5;
                        }
                        j >>= i2;
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

    public final String H(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, VA0<? super Float, ? super V, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(charSequence3, "postfix");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            i = i4;
                            Object obj = objArr[i7];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(va0.i(Float.valueOf(f), obj));
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

    public final String I(CharSequence charSequence, CharSequence charSequence2, VA0<? super Float, ? super V, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(charSequence2, "prefix");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            Object obj = objArr[i7];
                            i = i4;
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(va0.i(Float.valueOf(f), obj));
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

    public final String J(CharSequence charSequence, VA0<? super Float, ? super V, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(charSequence, "separator");
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            i = i4;
                            Object obj = objArr[i7];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(va0.i(Float.valueOf(f), obj));
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

    public final String K(VA0<? super Float, ? super V, ? extends CharSequence> va0) {
        int i;
        C6562gT0.p(va0, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            float f = fArr[i7];
                            Object obj = objArr[i7];
                            i = i4;
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append((CharSequence) C6566gU0.h);
                            }
                            sb.append(va0.i(Float.valueOf(f), obj));
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

    public final boolean a(VA0<? super Float, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        float[] fArr = this.b;
        Object[] objArr = this.c;
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
                            int i4 = (i << 3) + i3;
                            if (!va0.i(Float.valueOf(fArr[i4]), objArr[i4]).booleanValue()) {
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

    public final boolean c(VA0<? super Float, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        float[] fArr = this.b;
        Object[] objArr = this.c;
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
                            int i4 = (i << 3) + i3;
                            if (va0.i(Float.valueOf(fArr[i4]), objArr[i4]).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[i] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[i] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10582wv0)) {
            return false;
        }
        AbstractC10582wv0 abstractC10582wv0 = (AbstractC10582wv0) obj;
        if (abstractC10582wv0.t() != t()) {
            return false;
        }
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            float f = fArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (abstractC10582wv0.n(f) != null || !abstractC10582wv0.e(f)) {
                                    break loop0;
                                }
                            } else if (!C6562gT0.g(obj2, abstractC10582wv0.n(f))) {
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
            return false;
        }
        return true;
    }

    public final boolean f(V v) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && C6562gT0.g(v, objArr[(i << 3) + i3])) {
                            return true;
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

    public final int g() {
        return t();
    }

    public final int h(VA0<? super Float, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (va0.i(Float.valueOf(fArr[i5]), objArr[i5]).booleanValue()) {
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
        int i;
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        float f = fArr[i6];
                        Object obj = objArr[i6];
                        int hashCode = Float.hashCode(f);
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i3 += i ^ hashCode;
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return i3;
                }
            }
            if (i2 != length) {
                i2++;
            } else {
                return i3;
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

    public final void j(VA0<? super Float, ? super V, C7458kA2> va0) {
        C6562gT0.p(va0, "block");
        float[] fArr = this.b;
        Object[] objArr = this.c;
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
                            int i4 = (i << 3) + i3;
                            va0.i(Float.valueOf(fArr[i4]), objArr[i4]);
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

    public final void m(HA0<? super V, C7458kA2> ha0) {
        C6562gT0.p(ha0, "block");
        Object[] objArr = this.c;
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
                            ha0.invoke(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V n(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[i] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return (V) this.c[i];
        }
        return null;
    }

    public final int o() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V r(float f, V v) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[i] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return (V) this.c[i];
        }
        return v;
    }

    public final V s(float f, FA0<? extends V> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        V n = n(f);
        if (n == null) {
            return fa0.invoke();
        }
        return n;
    }

    public final int t() {
        return this.e;
    }

    public String toString() {
        if (x()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        float[] fArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            float f = fArr[i5];
                            Object obj = objArr[i5];
                            sb.append(f);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
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

    public AbstractC10582wv0() {
        this.a = YX1.e;
        this.b = C2795Dv0.g();
        this.c = BL.c;
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
