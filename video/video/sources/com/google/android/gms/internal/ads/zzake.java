package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzake implements zzakj {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakj
    public final int a(zzz zzzVar) {
        char c;
        String str = zzzVar.f301o;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(C4128Rj1.K0)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals(C4128Rj1.G0)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals(C4128Rj1.C0)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals(C4128Rj1.m0)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals(C4128Rj1.B0)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals(C4128Rj1.n0)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1157994102:
                    if (str.equals(C4128Rj1.F0)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals(C4128Rj1.z0)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals(C4128Rj1.A0)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                case 5:
                case 6:
                case 7:
                    return 2;
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakj
    public final zzakl b(zzz zzzVar) {
        char c;
        String str = zzzVar.f301o;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(C4128Rj1.K0)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    if (str.equals(C4128Rj1.G0)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals(C4128Rj1.C0)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals(C4128Rj1.m0)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals(C4128Rj1.B0)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals(C4128Rj1.n0)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1157994102:
                    if (str.equals(C4128Rj1.F0)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals(C4128Rj1.z0)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals(C4128Rj1.A0)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new zzalb(zzzVar.r);
                case 1:
                    return new zzame();
                case 2:
                    return new zzalt();
                case 3:
                    return new zzalf();
                case 4:
                    return new zzalq(zzzVar.r);
                case 5:
                    return new zzakz();
                case 6:
                    return new zzals(zzzVar.r);
                case 7:
                    return new zzakx(zzzVar.r);
                case '\b':
                    return new zzall();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final boolean c(zzz zzzVar) {
        String str = zzzVar.f301o;
        if (!Objects.equals(str, C4128Rj1.n0) && !Objects.equals(str, C4128Rj1.m0) && !Objects.equals(str, C4128Rj1.C0) && !Objects.equals(str, C4128Rj1.z0) && !Objects.equals(str, C4128Rj1.B0) && !Objects.equals(str, C4128Rj1.G0) && !Objects.equals(str, C4128Rj1.F0) && !Objects.equals(str, C4128Rj1.K0) && !Objects.equals(str, C4128Rj1.A0)) {
            return false;
        }
        return true;
    }
}
