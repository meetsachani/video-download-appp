package com.google.android.gms.ads.internal.util.client;

/* loaded from: classes2.dex */
final class zzm extends zzw {
    public final int a;
    public final int b;
    public final boolean c;

    public zzm(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int b() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.a == zzwVar.b() && this.b == zzwVar.a() && this.c == zzwVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.a + ", clickPrerequisite=" + this.b + ", notificationFlowEnabled=" + this.c + "}";
    }
}
