package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbs extends zzhbr {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhbr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        int k;
        int j;
        int j2;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            int i5 = ~(i >> 8);
            if (b2 < -16) {
                byte b3 = (byte) i5;
                if (b3 == 0) {
                    int i6 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i6 >= i3) {
                        j2 = zzhbu.j(b2, b4);
                        return j2;
                    }
                    i2 = i6;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            byte b5 = (byte) i5;
            if (b5 == 0) {
                int i7 = i2 + 1;
                b5 = bArr[i2];
                if (i7 >= i3) {
                    j = zzhbu.j(b2, b5);
                    return j;
                }
                i2 = i7;
                b = 0;
            } else {
                b = i >> 16;
            }
            if (b == 0) {
                int i8 = i2 + 1;
                byte b6 = bArr[i2];
                if (i8 >= i3) {
                    k = zzhbu.k(b2, b5, b6);
                    return k;
                }
                i2 = i8;
                b = b6;
            }
            if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                i4 = i2 + 1;
            }
            return -1;
            i2 = i4;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i9 = i2 + 1;
            byte b7 = bArr[i2];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i9 >= i3) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i2 += 2;
                        if (bArr[i9] > -65) {
                        }
                    }
                    return -1;
                } else if (b7 < -16) {
                    if (i9 >= i3 - 1) {
                        return zzhbu.c(bArr, i9, i3);
                    }
                    int i10 = i2 + 2;
                    byte b8 = bArr[i9];
                    if (b8 > -65 || (b7 == -32 && b8 < -96)) {
                        return -1;
                    }
                    if (b7 == -19 && b8 >= -96) {
                        return -1;
                    }
                    i2 += 3;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (i9 >= i3 - 2) {
                    return zzhbu.c(bArr, i9, i3);
                } else {
                    int i11 = i2 + 2;
                    byte b9 = bArr[i9];
                    if (b9 <= -65 && (((b7 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i12 = i2 + 3;
                        if (bArr[i11] <= -65) {
                            i2 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            } else {
                i2 = i9;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String b(byte[] bArr, int i, int i2) throws zzgzh {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b = bArr[i];
                if (!zzhbq.d(b)) {
                    break;
                }
                i++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i < i4) {
                int i7 = i + 1;
                byte b2 = bArr[i];
                if (zzhbq.d(b2)) {
                    cArr[i6] = (char) b2;
                    i6++;
                    i = i7;
                    while (i < i4) {
                        byte b3 = bArr[i];
                        if (zzhbq.d(b3)) {
                            i++;
                            cArr[i6] = (char) b3;
                            i6++;
                        }
                    }
                } else {
                    if (zzhbq.f(b2)) {
                        if (i7 < i4) {
                            i3 = i6 + 1;
                            i += 2;
                            zzhbq.c(b2, bArr[i7], cArr, i6);
                        } else {
                            throw new zzgzh("Protocol message had invalid UTF-8.");
                        }
                    } else if (zzhbq.e(b2)) {
                        if (i7 < i4 - 1) {
                            i3 = i6 + 1;
                            int i8 = i + 2;
                            i += 3;
                            zzhbq.b(b2, bArr[i7], bArr[i8], cArr, i6);
                        } else {
                            throw new zzgzh("Protocol message had invalid UTF-8.");
                        }
                    } else if (i7 < i4 - 2) {
                        int i9 = i + 3;
                        i += 4;
                        zzhbq.a(b2, bArr[i7], bArr[i + 2], bArr[i9], cArr, i6);
                        i6 += 2;
                    } else {
                        throw new zzgzh("Protocol message had invalid UTF-8.");
                    }
                    i6 = i3;
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
