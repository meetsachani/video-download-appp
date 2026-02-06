package o;

import android.os.Build;

/* renamed from: o.ei  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6117ei {
    @Deprecated
    public static final boolean q;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        q = z;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i);
}
