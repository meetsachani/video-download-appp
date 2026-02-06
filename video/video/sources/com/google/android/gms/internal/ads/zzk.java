package com.google.android.gms.internal.ads;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import java.util.Locale;
import o.C6566gU0;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC8800pd0;
import o.JK1;

/* loaded from: classes2.dex */
public final class zzk {
    public static final zzk h;
    public final int a;
    public final int b;
    public final int c;
    @InterfaceC11300zs1
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        zzi zziVar = new zzi();
        zziVar.c(1);
        zziVar.b(2);
        zziVar.d(3);
        h = zziVar.g();
        zzi zziVar2 = new zzi();
        zziVar2.c(1);
        zziVar2.b(1);
        zziVar2.d(2);
        zziVar2.g();
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzk(int i, int i2, int i3, byte[] bArr, int i4, int i5, zzj zzjVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    @JK1
    public static int a(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @JK1
    public static int b(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i != 16) {
                        if (i != 18) {
                            return (i == 6 || i == 7) ? 3 : -1;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    @InterfaceC8800pd0(expression = {"#1"}, result = false)
    public static boolean g(@InterfaceC11300zs1 zzk zzkVar) {
        if (zzkVar == null) {
            return true;
        }
        int i = zzkVar.a;
        if (i == -1 || i == 1 || i == 2) {
            int i2 = zzkVar.b;
            if (i2 == -1 || i2 == 2) {
                int i3 = zzkVar.c;
                if ((i3 == -1 || i3 == 3) && zzkVar.d == null) {
                    int i4 = zzkVar.f;
                    if (i4 == -1 || i4 == 8) {
                        int i5 = zzkVar.e;
                        return i5 == -1 || i5 == 8;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String h(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return "Undefined color range " + i;
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String i(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return "Undefined color space " + i;
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String j(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return "Undefined color transfer " + i;
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public final zzi c() {
        return new zzi(this, null);
    }

    public final String d() {
        String str;
        String str2;
        if (f()) {
            Object[] objArr = {i(this.a), h(this.b), j(this.c)};
            String str3 = zzeu.a;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (e()) {
            str2 = this.e + RemoteSettings.i + this.f;
        } else {
            str2 = "NA/NA";
        }
        return str + RemoteSettings.i + str2;
    }

    public final boolean e() {
        return (this.e == -1 || this.f == -1) ? false : true;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzk.class == obj.getClass()) {
            zzk zzkVar = (zzk) obj;
            if (this.a == zzkVar.a && this.b == zzkVar.b && this.c == zzkVar.c && Arrays.equals(this.d, zzkVar.d) && this.e == zzkVar.e && this.f == zzkVar.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.g;
        if (i == 0) {
            int hashCode = ((((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + this.e) * 31) + this.f;
            this.g = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String str;
        boolean z;
        int i = this.e;
        int i2 = this.c;
        int i3 = this.b;
        String i4 = i(this.a);
        String h2 = h(i3);
        String j = j(i2);
        String str2 = "NA";
        if (i == -1) {
            str = "NA";
        } else {
            str = i + "bit Luma";
        }
        int i5 = this.f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        return "ColorInfo(" + i4 + C6566gU0.h + h2 + C6566gU0.h + j + C6566gU0.h + z + C6566gU0.h + str + C6566gU0.h + str2 + C9811tl1.d;
    }
}
