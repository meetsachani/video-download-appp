package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import o.C3307Iz;
import o.C8077mf;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "<init>", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.1o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC03961o<R> implements AY<R>, Serializable {
    public static byte[] A01;
    public final int A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{60, C3307Iz.c0, 32, 42, C3307Iz.c0, 60, 2, 47, 35, C3307Iz.d0, 42, 47, C8077mf.D, C3307Iz.V, C8077mf.G, 58, 60, C3307Iz.Z, 32, C3307Iz.a0, 102, 96, 96, 96, 103};
    }

    public AbstractC03961o(int i) {
        this.A00 = i;
    }

    public final String toString() {
        String A012 = AbstractC2255qX.A01(this);
        C2256qY.A08(A012, A01(0, 25, 61));
        return A012;
    }
}
