package o;

import android.graphics.Color;
import android.graphics.ColorSpace;

/* renamed from: o.bG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5284bG {
    public static final float A(long j) {
        float luminance;
        luminance = Color.luminance(j);
        return luminance;
    }

    public static final float B(long j) {
        float red;
        red = Color.red(j);
        return red;
    }

    public static final int C(int i) {
        return (i >> 16) & 255;
    }

    public static final boolean D(long j) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j);
        return isSrgb;
    }

    public static final boolean E(long j) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j);
        return isWideGamut;
    }

    public static final Color F(Color color, Color color2) {
        return C9205rG.w(color2, color);
    }

    public static final Color G(int i) {
        Color valueOf;
        valueOf = Color.valueOf(i);
        return valueOf;
    }

    public static final Color H(long j) {
        Color valueOf;
        valueOf = Color.valueOf(j);
        return valueOf;
    }

    public static final int I(long j) {
        int argb;
        argb = Color.toArgb(j);
        return argb;
    }

    public static final int J(String str) {
        return Color.parseColor(str);
    }

    public static final long K(int i) {
        long pack;
        pack = Color.pack(i);
        return pack;
    }

    public static final float a(long j) {
        float red;
        red = Color.red(j);
        return red;
    }

    public static final float b(Color color) {
        float component;
        component = color.getComponent(0);
        return component;
    }

    public static final int c(int i) {
        return (i >> 24) & 255;
    }

    public static final float d(long j) {
        float green;
        green = Color.green(j);
        return green;
    }

    public static final float e(Color color) {
        float component;
        component = color.getComponent(1);
        return component;
    }

    public static final int f(int i) {
        return (i >> 16) & 255;
    }

    public static final float g(long j) {
        float blue;
        blue = Color.blue(j);
        return blue;
    }

    public static final float h(Color color) {
        float component;
        component = color.getComponent(2);
        return component;
    }

    public static final int i(int i) {
        return (i >> 8) & 255;
    }

    public static final float j(long j) {
        float alpha;
        alpha = Color.alpha(j);
        return alpha;
    }

    public static final float k(Color color) {
        float component;
        component = color.getComponent(3);
        return component;
    }

    public static final int l(int i) {
        return i & 255;
    }

    public static final long m(int i, ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(i, colorSpace);
        return convert;
    }

    public static final long n(int i, ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(i, colorSpace);
        return convert;
    }

    public static final long o(long j, ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(j, colorSpace);
        return convert;
    }

    public static final long p(long j, ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(j, colorSpace);
        return convert;
    }

    public static final Color q(Color color, ColorSpace.Named named) {
        ColorSpace colorSpace;
        Color convert;
        colorSpace = ColorSpace.get(named);
        convert = color.convert(colorSpace);
        return convert;
    }

    public static final Color r(Color color, ColorSpace colorSpace) {
        Color convert;
        convert = color.convert(colorSpace);
        return convert;
    }

    public static final float s(long j) {
        float alpha;
        alpha = Color.alpha(j);
        return alpha;
    }

    public static final int t(int i) {
        return (i >> 24) & 255;
    }

    public static final float u(long j) {
        float blue;
        blue = Color.blue(j);
        return blue;
    }

    public static final int v(int i) {
        return i & 255;
    }

    public static final ColorSpace w(long j) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j);
        return colorSpace;
    }

    public static final float x(long j) {
        float green;
        green = Color.green(j);
        return green;
    }

    public static final int y(int i) {
        return (i >> 8) & 255;
    }

    public static final float z(int i) {
        return Color.luminance(i);
    }
}
