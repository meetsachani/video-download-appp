package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzewb {
    public final zzbvl a;
    public final int b;

    public zzewb(zzbvl zzbvlVar, int i) {
        this.a = zzbvlVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int b() {
        boolean z;
        Bundle bundle = this.a.X.getBundle("extras");
        if (bundle == null || bundle.isEmpty()) {
            return -1;
        }
        String string = bundle.getString("query_info_type", "");
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        switch (z) {
            case false:
                return 0;
            case true:
                return 1;
            case true:
                return 2;
            case true:
                return 3;
            case true:
                return 4;
            case true:
                return 5;
            case true:
                return 6;
            case true:
                return 7;
            case true:
                return 8;
            default:
                return -1;
        }
    }

    public final int c() {
        return this.a.j1;
    }

    @InterfaceC11300zs1
    public final PackageInfo d() {
        return this.a.a1;
    }

    public final String e() {
        return this.a.Y0;
    }

    public final String f() {
        return zzfvt.c(this.a.X.getString("ms"));
    }

    public final String g() {
        return this.a.c1;
    }

    public final List h() {
        return this.a.Z0;
    }

    public final boolean i() {
        return this.a.g1;
    }

    public final boolean j() {
        return this.a.X.getBoolean("is_gbid");
    }

    public final boolean k() {
        return this.a.f1;
    }
}
