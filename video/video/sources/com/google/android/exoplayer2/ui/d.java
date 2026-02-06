package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.ui.g;
import java.util.Locale;
import o.C10323vs;
import o.C10833xx0;
import o.C4128Rj1;
import o.C9542sf;
import o.InterfaceC10322vr2;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public class d implements InterfaceC10322vr2 {
    public final Resources a;

    public d(Resources resources) {
        this.a = (Resources) C9542sf.g(resources);
    }

    public static int i(C10833xx0 c10833xx0) {
        int l = C4128Rj1.l(c10833xx0.g1);
        if (l != -1) {
            return l;
        }
        if (C4128Rj1.o(c10833xx0.d1) != null) {
            return 2;
        }
        if (C4128Rj1.c(c10833xx0.d1) != null) {
            return 1;
        }
        if (c10833xx0.l1 != -1 || c10833xx0.m1 != -1) {
            return 2;
        }
        if (c10833xx0.t1 == -1 && c10833xx0.u1 == -1) {
            return -1;
        }
        return 1;
    }

    @Override // o.InterfaceC10322vr2
    public String a(C10833xx0 c10833xx0) {
        String e;
        int i = i(c10833xx0);
        if (i == 2) {
            e = j(h(c10833xx0), g(c10833xx0), c(c10833xx0));
        } else if (i == 1) {
            e = j(e(c10833xx0), b(c10833xx0), c(c10833xx0));
        } else {
            e = e(c10833xx0);
        }
        if (e.length() == 0) {
            return this.a.getString(g.k.R);
        }
        return e;
    }

    public final String b(C10833xx0 c10833xx0) {
        int i = c10833xx0.t1;
        if (i != -1 && i >= 1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 6 && i != 7) {
                        if (i != 8) {
                            return this.a.getString(g.k.O);
                        }
                        return this.a.getString(g.k.Q);
                    }
                    return this.a.getString(g.k.P);
                }
                return this.a.getString(g.k.N);
            }
            return this.a.getString(g.k.C);
        }
        return "";
    }

    public final String c(C10833xx0 c10833xx0) {
        int i = c10833xx0.c1;
        if (i == -1) {
            return "";
        }
        return this.a.getString(g.k.B, Float.valueOf(i / 1000000.0f));
    }

    public final String d(C10833xx0 c10833xx0) {
        if (TextUtils.isEmpty(c10833xx0.Y)) {
            return "";
        }
        return c10833xx0.Y;
    }

    public final String e(C10833xx0 c10833xx0) {
        String j = j(f(c10833xx0), h(c10833xx0));
        if (TextUtils.isEmpty(j)) {
            return d(c10833xx0);
        }
        return j;
    }

    public final String f(C10833xx0 c10833xx0) {
        Locale locale;
        String str = c10833xx0.Z;
        if (TextUtils.isEmpty(str) || C10323vs.g1.equals(str)) {
            return "";
        }
        if (TD2.a >= 21) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = new Locale(str);
        }
        Locale f0 = TD2.f0();
        String displayName = locale.getDisplayName(f0);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(f0) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String g(C10833xx0 c10833xx0) {
        int i = c10833xx0.l1;
        int i2 = c10833xx0.m1;
        if (i != -1 && i2 != -1) {
            return this.a.getString(g.k.D, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return "";
    }

    public final String h(C10833xx0 c10833xx0) {
        String str;
        if ((c10833xx0.Z0 & 2) != 0) {
            str = this.a.getString(g.k.E);
        } else {
            str = "";
        }
        if ((c10833xx0.Z0 & 4) != 0) {
            str = j(str, this.a.getString(g.k.H));
        }
        if ((c10833xx0.Z0 & 8) != 0) {
            str = j(str, this.a.getString(g.k.G));
        }
        if ((c10833xx0.Z0 & 1088) != 0) {
            return j(str, this.a.getString(g.k.F));
        }
        return str;
    }

    public final String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.a.getString(g.k.A, str, str2);
                }
            }
        }
        return str;
    }
}
