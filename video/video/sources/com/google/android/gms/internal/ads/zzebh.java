package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzebh extends zzebl {
    @InterfaceC11300zs1
    public final String a;
    public final String b;
    @InterfaceC11300zs1
    public final Drawable c;

    public zzebh(@InterfaceC11300zs1 String str, String str2, @InterfaceC11300zs1 Drawable drawable) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            this.c = drawable;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    @InterfaceC11300zs1
    public final Drawable a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    @InterfaceC11300zs1
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebl) {
            zzebl zzeblVar = (zzebl) obj;
            String str = this.a;
            if (str != null ? str.equals(zzeblVar.b()) : zzeblVar.b() == null) {
                if (this.b.equals(zzeblVar.c()) && ((drawable = this.c) != null ? drawable.equals(zzeblVar.a()) : zzeblVar.a() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return (hashCode2 * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return "OfflineAdAssets{advertiserName=" + this.a + ", imageUrl=" + this.b + ", icon=" + valueOf + "}";
    }
}
