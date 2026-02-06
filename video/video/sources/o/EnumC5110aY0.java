package o;

import android.os.Build;

/* renamed from: o.aY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5110aY0 {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    /* renamed from: o.aY0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5110aY0.values().length];
            a = iArr;
            try {
                iArr[EnumC5110aY0.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC5110aY0.MULTIPLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC5110aY0.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC5110aY0.OVERLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC5110aY0.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC5110aY0.LIGHTEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[EnumC5110aY0.ADD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[EnumC5110aY0.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[EnumC5110aY0.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[EnumC5110aY0.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC5110aY0.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[EnumC5110aY0.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[EnumC5110aY0.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[EnumC5110aY0.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[EnumC5110aY0.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[EnumC5110aY0.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[EnumC5110aY0.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[EnumC5110aY0.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public EnumC8600oo g() {
        switch (a.a[ordinal()]) {
            case 2:
                if (Build.VERSION.SDK_INT >= 29) {
                    return EnumC8600oo.MULTIPLY;
                }
                return EnumC8600oo.MODULATE;
            case 3:
                return EnumC8600oo.SCREEN;
            case 4:
                return EnumC8600oo.OVERLAY;
            case 5:
                return EnumC8600oo.DARKEN;
            case 6:
                return EnumC8600oo.LIGHTEN;
            case 7:
                return EnumC8600oo.PLUS;
            default:
                return null;
        }
    }
}
