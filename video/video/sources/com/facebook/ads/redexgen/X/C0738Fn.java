package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import o.C10997yd1;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.Fn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0738Fn {
    public static Constructor<?> A00;
    public static Constructor<?> A01;
    public static Method A02;
    public static Method A03;
    public static Method A04;
    public static byte[] A05;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{85, 66, 94, 91, 83, 84, 88, 90, C8077mf.C, 81, 86, 84, 82, 85, 88, 88, 92, C8077mf.C, 86, 83, 68, C8077mf.C, 86, 89, 83, 69, 88, 94, 83, 79, C8077mf.C, 90, 82, 83, 94, 86, 4, C8077mf.C, 82, 79, 88, 71, 91, 86, 78, 82, 69, C8077mf.C, 82, 81, 81, 82, 84, 67, C8077mf.C, 115, 82, 81, 86, 66, 91, 67, 97, 94, 83, 82, 88, 113, 69, 86, 90, 82, 103, 69, 88, 84, 82, 68, 68, 88, 69, 19, 113, 86, 84, 67, 88, 69, 78, 19, 117, 66, 94, 91, 83, 82, 69, 118, 122, QC1.w, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 116, 113, 102, 59, 116, 123, 113, 103, 122, 124, 113, 109, 59, QC1.w, 112, 113, 124, 116, C3307Iz.Y, 59, 112, 109, 122, 101, 121, 116, 108, 112, 103, 59, 112, 115, 115, 112, 118, 97, 59, 70, 118, 116, 121, 112, 84, 123, 113, 71, 122, 97, 116, 97, 112, 65, 103, 116, 123, 102, 115, 122, 103, QC1.w, 116, 97, 124, 122, 123, 49, 87, 96, 124, 121, 113, 112, 103, 59, C3307Iz.e0, 60, C8077mf.D, C3307Iz.Z, 60, C3307Iz.a0, 60, C3307Iz.V, C3307Iz.Z, C3307Iz.Y, C8077mf.n, C3307Iz.e0, 47, 58, C3307Iz.e0, C3307Iz.e0, 59};
    }

    public static C4H A00(float f) throws Exception {
        A04();
        Object newInstance = A00.newInstance(new Object[0]);
        A04.invoke(newInstance, Float.valueOf(f));
        Object builder = A02.invoke(newInstance, new Object[0]);
        AbstractC04543y.A01(builder);
        return null;
    }

    public static C5E A01() throws Exception {
        A04();
        Object builder = A03.invoke(A01.newInstance(new Object[0]), new Object[0]);
        AbstractC04543y.A01(builder);
        return null;
    }

    @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
    public static void A04() throws Exception {
        Constructor<?> constructor = A00;
        String A022 = A02(0, 5, 30);
        if (constructor == null || A04 == null || A02 == null) {
            Class<?> cls = Class.forName(A02(97, 86, 60));
            A00 = cls.getConstructor(new Class[0]);
            Class<?> scaleAndRotateTransformationBuilderClass = Float.TYPE;
            A04 = cls.getMethod(A02(C10997yd1.n2, 18, 97), scaleAndRotateTransformationBuilderClass);
            A02 = cls.getMethod(A022, new Class[0]);
        }
        if (A01 == null || A03 == null) {
            Class<?> cls2 = Class.forName(A02(5, 92, 30));
            A01 = cls2.getConstructor(new Class[0]);
            A03 = cls2.getMethod(A022, new Class[0]);
        }
    }
}
