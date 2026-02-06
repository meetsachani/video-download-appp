package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(id = 2)
    public final String X;
    @SafeParcelable.Field(id = 3)
    public final int Y;
    @SafeParcelable.Field(id = 5)
    public final boolean Y0;
    @SafeParcelable.Field(id = 4)
    public final int Z;
    @SafeParcelable.Field(id = 6)
    public final int Z0;
    @SafeParcelable.Field(id = 7)
    public final int a1;
    @SafeParcelable.Field(id = 8)
    public final zzr[] b1;
    @SafeParcelable.Field(id = 9)
    public final boolean c1;
    @SafeParcelable.Field(id = 10)
    public final boolean d1;
    @SafeParcelable.Field(id = 11)
    public boolean e1;
    @SafeParcelable.Field(id = 12)
    public boolean f1;
    @SafeParcelable.Field(id = 13)
    public boolean g1;
    @SafeParcelable.Field(id = 14)
    public boolean h1;
    @SafeParcelable.Field(id = 15)
    public boolean i1;
    @SafeParcelable.Field(id = 16)
    public boolean j1;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzr B0() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzr E0() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzr G0() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int H0(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        if (i <= 720) {
            return 50;
        }
        return 90;
    }

    public static int m0(DisplayMetrics displayMetrics) {
        return (int) (H0(displayMetrics) * displayMetrics.density);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, str, false);
        SafeParcelWriter.F(parcel, 3, this.Y);
        SafeParcelWriter.F(parcel, 4, this.Z);
        SafeParcelWriter.g(parcel, 5, this.Y0);
        SafeParcelWriter.F(parcel, 6, this.Z0);
        SafeParcelWriter.F(parcel, 7, this.a1);
        SafeParcelWriter.c0(parcel, 8, this.b1, i, false);
        SafeParcelWriter.g(parcel, 9, this.c1);
        SafeParcelWriter.g(parcel, 10, this.d1);
        SafeParcelWriter.g(parcel, 11, this.e1);
        SafeParcelWriter.g(parcel, 12, this.f1);
        SafeParcelWriter.g(parcel, 13, this.g1);
        SafeParcelWriter.g(parcel, 14, this.h1);
        SafeParcelWriter.g(parcel, 15, this.i1);
        SafeParcelWriter.g(parcel, 16, this.j1);
        SafeParcelWriter.b(parcel, a);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(Context context, AdSize[] adSizeArr) {
        int c;
        int i;
        int i2;
        String str;
        int i3;
        double d;
        DisplayMetrics displayMetrics;
        AdSize adSize = adSizeArr[0];
        this.Y0 = false;
        boolean m = adSize.m();
        this.d1 = m;
        this.h1 = com.google.android.gms.ads.zzc.f(adSize);
        this.i1 = com.google.android.gms.ads.zzc.g(adSize);
        boolean h = com.google.android.gms.ads.zzc.h(adSize);
        this.j1 = h;
        if (m) {
            AdSize adSize2 = AdSize.k;
            this.Z0 = adSize2.j();
            c = adSize2.c();
            this.Y = c;
        } else if (this.i1) {
            this.Z0 = adSize.j();
            c = com.google.android.gms.ads.zzc.a(adSize);
            this.Y = c;
        } else if (h) {
            this.Z0 = adSize.j();
            c = com.google.android.gms.ads.zzc.b(adSize);
            this.Y = c;
        } else {
            this.Z0 = adSize.j();
            c = adSize.c();
            this.Y = c;
        }
        boolean z = this.Z0 == -1;
        boolean z2 = c == -2;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        if (z) {
            zzbb.b();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (displayMetrics.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzbb.b();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i4 = displayMetrics3.heightPixels;
                        int i5 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i6 = displayMetrics3.heightPixels;
                        int i7 = displayMetrics3.widthPixels;
                        if (i6 == i4 && i7 == i5) {
                            int i8 = displayMetrics2.widthPixels;
                            zzbb.b();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i3 = i8 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.a1 = i3;
                            d = i3 / displayMetrics2.density;
                            i = (int) d;
                            if (d - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i3 = displayMetrics2.widthPixels;
            this.a1 = i3;
            d = i3 / displayMetrics2.density;
            i = (int) d;
            if (d - i >= 0.01d) {
            }
        } else {
            i = this.Z0;
            zzbb.b();
            this.a1 = com.google.android.gms.ads.internal.util.client.zzf.v(displayMetrics2, this.Z0);
        }
        if (z2) {
            i2 = H0(displayMetrics2);
        } else {
            i2 = this.Y;
        }
        zzbb.b();
        this.Z = com.google.android.gms.ads.internal.util.client.zzf.v(displayMetrics2, i2);
        if (z || z2) {
            this.X = i + "x" + i2 + "_as";
        } else {
            if (this.i1 || this.j1) {
                str = this.Z0 + "x" + this.Y + "_as";
            } else if (m) {
                str = "320x50_mb";
            } else {
                this.X = adSize.toString();
            }
            this.X = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.b1 = new zzr[length];
            for (int i9 = 0; i9 < adSizeArr.length; i9++) {
                this.b1[i9] = new zzr(context, adSizeArr[i9]);
            }
        } else {
            this.b1 = null;
        }
        this.c1 = false;
        this.e1 = false;
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzr[] zzrVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @SafeParcelable.Param(id = 13) boolean z6, @SafeParcelable.Param(id = 14) boolean z7, @SafeParcelable.Param(id = 15) boolean z8, @SafeParcelable.Param(id = 16) boolean z9) {
        this.X = str;
        this.Y = i;
        this.Z = i2;
        this.Y0 = z;
        this.Z0 = i3;
        this.a1 = i4;
        this.b1 = zzrVarArr;
        this.c1 = z2;
        this.d1 = z3;
        this.e1 = z4;
        this.f1 = z5;
        this.g1 = z6;
        this.h1 = z7;
        this.i1 = z8;
        this.j1 = z9;
    }
}
