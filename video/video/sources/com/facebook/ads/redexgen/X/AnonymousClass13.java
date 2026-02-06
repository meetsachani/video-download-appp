package com.facebook.ads.redexgen.X;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import o.C8077mf;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "T", "", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", RemoteConfigConstants.ResponseFieldKey.h0, "", "<init>", "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Enum;", "contains", "", "element", "(Ljava/lang/Enum;)Z", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.13  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass13<T extends Enum<T>> extends AbstractC03991r<T> implements InterfaceC0600Ac<T>, Serializable {
    public static byte[] A01;
    public static String[] A02 = {"AVZQJd0UEEpCfQYexpiIPdV6nKB0YzQ", "QqlKW", "LWUEIKmYT4jP0BQzvTVCB9TDfmAcQ", "J57H", "dmSyAydKU", "OjmNHHLSPz5X5IKUnklYZThClhBJ6", "SQG9TvtavaoImfrEhtlqecs", "bZpI3MN8M6FoE67UndtxHFSVy2"};
    public final T[] A00;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[1] = "sc7yo";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
            i4++;
        }
    }

    public static void A04() {
        A01 = new byte[]{28, C8077mf.y, 28, C8077mf.x, 28, C8077mf.A, 13, 2, 9, 19, C8077mf.y, C8077mf.p, 2, C8077mf.x};
    }

    static {
        A04();
    }

    public AnonymousClass13(T[] tArr) {
        C2256qY.A09(tArr, A03(7, 7, 113));
        this.A00 = tArr;
    }

    private final int A00(T t) {
        C2256qY.A09(t, A03(0, 7, 111));
        int ordinal = t.ordinal();
        if (((Enum) AnonymousClass15.A00(this.A00, ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    private final int A01(T t) {
        C2256qY.A09(t, A03(0, 7, 111));
        return indexOf(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03991r, java.util.List
    /* renamed from: A02 */
    public final T get(int i) {
        AbstractC03991r.A02.A03(i, this.A00.length);
        return this.A00[i];
    }

    private final boolean A05(T t) {
        C2256qY.A09(t, A03(0, 7, 111));
        Enum target = (Enum) AnonymousClass15.A00(this.A00, t.ordinal());
        return target == t;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0606Ai
    public final int A0C() {
        return this.A00.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC0606Ai, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return A05((Enum) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC03991r, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return A00((Enum) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC03991r, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return A01((Enum) obj);
        }
        return -1;
    }
}
