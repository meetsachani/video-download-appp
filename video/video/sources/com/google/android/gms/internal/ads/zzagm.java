package com.google.android.gms.internal.ads;

import o.C9642t32;
import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public class zzagm implements zzau {
    public final String a;
    public final String b;

    public zzagm(String str, String str2) {
        this.a = zzfui.b(str);
        this.b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzau
    public final void a(zzar zzarVar) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals(C9642t32.N)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals(C9642t32.W)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
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
                zzarVar.O(this.b);
                return;
            case 1:
                zzarVar.B(this.b);
                return;
            case 2:
                zzarVar.A(this.b);
                return;
            case 3:
                zzarVar.z(this.b);
                return;
            case 4:
                Integer g = zzgbf.g(this.b, 10);
                if (g != null) {
                    zzarVar.R(g);
                    return;
                }
                return;
            case 5:
                Integer g2 = zzgbf.g(this.b, 10);
                if (g2 != null) {
                    zzarVar.Q(g2);
                    return;
                }
                return;
            case 6:
                Integer g3 = zzgbf.g(this.b, 10);
                if (g3 != null) {
                    zzarVar.F(g3);
                    return;
                }
                return;
            case 7:
                Integer g4 = zzgbf.g(this.b, 10);
                if (g4 != null) {
                    zzarVar.P(g4);
                    return;
                }
                return;
            case '\b':
                zzarVar.G(this.b);
                return;
            case '\t':
                zzarVar.E(this.b);
                return;
            default:
                return;
        }
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (this.a.equals(zzagmVar.a) && this.b.equals(zzagmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
