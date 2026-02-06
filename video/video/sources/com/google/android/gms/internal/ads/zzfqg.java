package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfqg extends zzfqn {
    public final String b;
    public final int c;
    public final int d;

    public /* synthetic */ zzfqg(String str, boolean z, int i, zzfqc zzfqcVar, zzfqd zzfqdVar, int i2, zzfqf zzfqfVar) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final zzfqc a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final zzfqd b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqn) {
            zzfqn zzfqnVar = (zzfqn) obj;
            if (this.b.equals(zzfqnVar.c())) {
                zzfqnVar.d();
                int i = this.c;
                int e = zzfqnVar.e();
                if (i != 0) {
                    if (i == e) {
                        zzfqnVar.a();
                        zzfqnVar.b();
                        int i2 = this.d;
                        int f = zzfqnVar.f();
                        if (i2 != 0) {
                            if (f == 1) {
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        int i = this.c;
        if (i != 0) {
            int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
            if (this.d != 0) {
                return (i2 * 583896283) ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.c;
        String str2 = "null";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "NO_CHECKS";
                    }
                } else {
                    str = "SKIP_SECURITY_CHECK";
                }
            } else {
                str = "SKIP_COMPLIANCE_CHECK";
            }
        } else {
            str = "ALL_CHECKS";
        }
        if (this.d == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.b;
        return "FileComplianceOptions{fileOwner=" + str3 + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }
}
