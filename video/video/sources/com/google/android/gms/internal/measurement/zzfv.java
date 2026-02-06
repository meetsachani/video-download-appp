package com.google.android.gms.internal.measurement;

import android.content.Context;
import o.AbstractC4468Uv1;
import o.InterfaceC10571ws1;
import o.InterfaceC8331nh2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfv extends zzgu {
    public final Context a;
    @InterfaceC10571ws1
    public final InterfaceC8331nh2<AbstractC4468Uv1<zzgh>> b;

    public zzfv(Context context, @InterfaceC10571ws1 InterfaceC8331nh2<AbstractC4468Uv1<zzgh>> interfaceC8331nh2) {
        if (context != null) {
            this.a = context;
            this.b = interfaceC8331nh2;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // com.google.android.gms.internal.measurement.zzgu
    public final Context a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzgu
    @InterfaceC10571ws1
    public final InterfaceC8331nh2<AbstractC4468Uv1<zzgh>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        InterfaceC8331nh2<AbstractC4468Uv1<zzgh>> interfaceC8331nh2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj;
            if (this.a.equals(zzguVar.a()) && ((interfaceC8331nh2 = this.b) != null ? interfaceC8331nh2.equals(zzguVar.b()) : zzguVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        InterfaceC8331nh2<AbstractC4468Uv1<zzgh>> interfaceC8331nh2 = this.b;
        if (interfaceC8331nh2 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC8331nh2.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
