package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,826:1\n13547#2,3:827\n13547#2,3:830\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n762#1:827,3\n779#1:830,3\n*E\n"})
/* renamed from: o.Zk */
/* loaded from: classes3.dex */
public final class C4919Zk {
    @NotNull
    public static final byte[] a;
    @NotNull
    public static final int[] b;
    @NotNull
    public static final byte[] c;
    @NotNull
    public static final int[] d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, QC1.w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, C3307Iz.c0, 47};
        a = bArr;
        int[] iArr = new int[256];
        C4788Ye.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, QC1.w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, C3307Iz.e0, 95};
        c = bArr2;
        int[] iArr2 = new int[256];
        C4788Ye.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i4 = 0;
        while (i < length2) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        d = iArr2;
    }

    public static final /* synthetic */ int[] a() {
        return b;
    }

    public static final /* synthetic */ byte[] b() {
        return a;
    }

    public static final /* synthetic */ int[] c() {
        return d;
    }

    public static final /* synthetic */ byte[] d() {
        return c;
    }

    @InterfaceC3147Hi0
    @InterfaceC6480g82(version = "1.8")
    public static final boolean g(int i) {
        if (i >= 0) {
            int[] iArr = b;
            if (i < iArr.length && iArr[i] != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @InterfaceC3147Hi0
    public static /* synthetic */ void e() {
    }

    @InterfaceC3147Hi0
    public static /* synthetic */ void f() {
    }
}
