package com.google.android.gms.internal.ads;

import o.C10079ur2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzxe {
    public static final zzxe d = new zzxe(new zzbm[0]);
    public final int a;
    public final zzfyc b;
    public int c;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
    }

    public zzxe(zzbm... zzbmVarArr) {
        this.b = zzfyc.D(zzbmVarArr);
        this.a = zzbmVarArr.length;
        int i = 0;
        while (i < this.b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.b.size(); i3++) {
                if (((zzbm) this.b.get(i)).equals(this.b.get(i3))) {
                    zzdx.d(C10079ur2.Y0, "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final int a(zzbm zzbmVar) {
        int indexOf = this.b.indexOf(zzbmVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzbm b(int i) {
        return (zzbm) this.b.get(i);
    }

    public final zzfyc c() {
        return zzfyc.B(zzfys.b(this.b, new zzfur() { // from class: com.google.android.gms.internal.ads.zzxd
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                zzxe zzxeVar = zzxe.d;
                return Integer.valueOf(((zzbm) obj).c);
            }
        }));
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxe.class == obj.getClass()) {
            zzxe zzxeVar = (zzxe) obj;
            if (this.a == zzxeVar.a && this.b.equals(zzxeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
