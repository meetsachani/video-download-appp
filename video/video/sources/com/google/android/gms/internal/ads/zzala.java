package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.C10015ub2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzala {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public zzala(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @InterfaceC11300zs1
    public static zzala a(String str) {
        boolean z;
        zzdc.d(str.startsWith(C10015ub2.v));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i < length) {
                String a = zzfui.a(split[i].trim());
                switch (a.hashCode()) {
                    case 100571:
                        if (a.equals("end")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case 3556653:
                        if (a.equals("text")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    case 109757538:
                        if (a.equals("start")) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case 109780401:
                        if (a.equals("style")) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
                if (z) {
                    if (!z) {
                        if (!z) {
                            if (z) {
                                i5 = i;
                            }
                        } else {
                            i4 = i;
                        }
                    } else {
                        i3 = i;
                    }
                } else {
                    i2 = i;
                }
                i++;
            } else if (i2 != -1 && i3 != -1 && i5 != -1) {
                return new zzala(i2, i3, i4, i5, length);
            } else {
                return null;
            }
        }
    }
}
