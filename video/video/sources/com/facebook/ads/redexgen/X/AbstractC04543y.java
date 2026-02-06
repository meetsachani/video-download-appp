package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.facebook.ads.redexgen.X.3y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC04543y {
    public static byte[] A00;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T A01(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T A02(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T A03(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{54, 17, C8077mf.E, C8077mf.D, 7, 69, 95, 90, C8077mf.E, 81, 95, C3307Iz.d0, C8077mf.m, C8077mf.H, 13, C8077mf.m, 69, 95, 90, C8077mf.E, 81, 95, 51, C8077mf.z, C8077mf.u, C8077mf.z, C8077mf.m, 69, 95, 90, C8077mf.E};
    }

    @Pure
    public static int A00(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException(String.format(A04(0, 31, 117), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        return i;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static String A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @Pure
    public static void A07(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @Pure
    public static void A08(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    @Pure
    public static void A09(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @Pure
    public static void A0A(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
