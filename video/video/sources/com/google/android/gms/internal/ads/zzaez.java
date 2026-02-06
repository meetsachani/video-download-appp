package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.C8241nJ2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaez {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    @InterfaceC11300zs1
    public static zzav b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzeu.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzdx.f(C8241nJ2.a, "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagl.b(new zzek(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzdx.g(C8241nJ2.a, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahi(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzav(arrayList);
    }

    public static zzaew c(zzek zzekVar, boolean z, boolean z2) throws zzaz {
        if (z) {
            d(3, zzekVar, false);
        }
        String b = zzekVar.b((int) zzekVar.M(), StandardCharsets.UTF_8);
        int length = b.length();
        long M = zzekVar.M();
        String[] strArr = new String[(int) M];
        int i = length + 15;
        for (int i2 = 0; i2 < M; i2++) {
            String b2 = zzekVar.b((int) zzekVar.M(), StandardCharsets.UTF_8);
            strArr[i2] = b2;
            i = i + 4 + b2.length();
        }
        if (z2 && (zzekVar.G() & 1) == 0) {
            throw zzaz.a("framing bit expected to be set", null);
        }
        return new zzaew(b, strArr, i + 1);
    }

    public static boolean d(int i, zzek zzekVar, boolean z) throws zzaz {
        if (zzekVar.u() < 7) {
            if (z) {
                return false;
            }
            int u = zzekVar.u();
            throw zzaz.a("too short header: " + u, null);
        } else if (zzekVar.G() != i) {
            if (z) {
                return false;
            }
            throw zzaz.a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (zzekVar.G() == 118 && zzekVar.G() == 111 && zzekVar.G() == 114 && zzekVar.G() == 98 && zzekVar.G() == 105 && zzekVar.G() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzaz.a("expected characters 'vorbis'", null);
        }
    }
}
